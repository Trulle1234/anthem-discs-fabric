package com.trulle123.anthemdiscs.structures;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.trulle123.anthemdiscs.AnthemDiscs;

import net.minecraft.structure.pool.LegacySinglePoolElement;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.PoolStructurePiece;
import net.minecraft.structure.StructureLiquidSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.BlockRotation;   
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;

import java.util.Optional;

public class TestHuse extends Structure {
    // 1) Skapa ett MapCodec<TestHuse> med den nya fabriksmetoden (1.21+)
    public static final MapCodec<TestHuse> MAP_CODEC = Structure.createCodec(TestHuse::new);
    public static final Codec<TestHuse> CODEC = MAP_CODEC.codec();

    // 2) Konstruktor: tar emot en Structure.Config (nytt i 1.21+)
    public TestHuse(Structure.Config config) {
        super(config);
    }

    /**
     * 3) Override av den nya metoden getStructurePosition(...)
     */
    @Override
    protected Optional<Structure.StructurePosition> getStructurePosition(Structure.Context context) {
        // a) Beräkna X/Z i mitten av chunken
        int x = context.chunkPos().getStartX() + 8;
        int z = context.chunkPos().getStartZ() + 8;
        // b) Hämta Y med getHeightInGround(...)
        int y = context.chunkGenerator()
                       .getHeightInGround(
                           x, z,
                           Heightmap.Type.WORLD_SURFACE_WG,
                           context.world(),         // HeightLimitView (wmiljö)
                           context.noiseConfig()    // ny parameter i 1.21.x
                       );

        BlockPos startPos = new BlockPos(x, y, z);

        // c) Skapa Identifier med Identifier.of(...)
        Identifier structureId = Identifier.of(AnthemDiscs.MOD_ID, "test_huse");

        // 3d) Bygg ett LegacySinglePoolElement för din NBT-fil:
        //     ofLegacySingle(String) ger en Function<Projection, LegacySinglePoolElement>.
        LegacySinglePoolElement piece = StructurePoolElement
            .ofLegacySingle(AnthemDiscs.MOD_ID + ":test_huse")  // format: "modid:test_huse"
            .apply(StructurePool.Projection.RIGID);

        // e) Använd hjälparen getStructurePosition för att registrera "piece" i worldgen:
        return Structure.getStructurePosition(
            context,
            Heightmap.Type.WORLD_SURFACE_WG,  // sam­man yta för höjdberäkning
            (collector) -> {
                /*
                 * Här skapar vi ett PoolStructurePiece baserat på vårt LegacySinglePoolElement (piece).
                 * Konstruktor för PoolStructurePiece:
                 *   PoolStructurePiece(
                 *     StructureTemplateManager structureTemplateManager,
                 *     StructurePoolElement poolElement,
                 *     BlockPos pos,
                 *     int groundLevelDelta,
                 *     BlockRotation rotation,
                 *     BlockBox boundingBox,
                 *     StructureLiquidSettings liquidSettings
                 *   )
                 *
                 * groundLevelDelta kan sättas till 0 om vi inte har någon offset, rotation satt till NONE,
                 * boundingBox hämtas med piece.getBoundingBox(...),
                 * liquidSettings kan vara StructureLiquidSettings.NONE eller EMPTY.
                 */
                // d) Hämta bounding box för elementet
                BlockBox box = piece.getBoundingBox(
                    context.structureTemplateManager(),
                    startPos,
                    BlockRotation.NONE
                );

                // e) Skapa ett PoolStructurePiece och lägg det i collector
                PoolStructurePiece poolPiece = new PoolStructurePiece(
                    context.structureTemplateManager(), // StrukturTemplateManager
                    piece,                              // Vårt pool-element
                    startPos,                           // Start-position
                    0,                                  // groundLevelDelta
                    BlockRotation.NONE,                 // ingen rotation
                    box,                                // bounding box enligt NBT
                    StructureLiquidSettings.IGNORE_WATERLOGGING        // inga specialflytande block
                );

                collector.addPiece(poolPiece);
            }
        );
    }

    /** 4) Koppla tillbaka till din registrerade StructureType */
    @Override
    public StructureType<?> getType() {
        return AnthemDiscs.TEST_HUSE_TYPE;
    }
}