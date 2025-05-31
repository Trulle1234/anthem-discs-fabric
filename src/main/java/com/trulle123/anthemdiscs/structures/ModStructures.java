package com.trulle123.anthemdiscs.structures;

import java.util.stream.Collectors;

import com.trulle123.anthemdiscs.AnthemDiscs;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.util.Identifier;
import net.minecraft.structure.StructureSet;                       // <- nytt paket!
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.StructureTerrainAdaptation;
import net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.gen.chunk.placement.StructurePlacement; // <- nytt paket!
import net.minecraft.world.gen.chunk.placement.SpreadType;         // enum med LINEAR/TRIANGULAR

import net.minecraft.world.gen.structure.Structure;               // oförändrat

public final class ModStructures {

    /* === Registry-nycklar ================================================= */

    public static final RegistryKey<Structure> TEST_HUSE =
            RegistryKey.of(RegistryKeys.STRUCTURE,
                           Identifier.of(AnthemDiscs.MOD_ID, "test_huse"));

    public static final RegistryKey<StructureSet> TEST_HUSE_SET =
            RegistryKey.of(RegistryKeys.STRUCTURE_SET,
                           Identifier.of(AnthemDiscs.MOD_ID, "test_huse"));

    private ModStructures() {}   // utility-klass

    /* === Bootstrap ======================================================== */

    public static void init() {

        // 1. Placering   (16 mellan-försök, 8 min-avstånd, salt 0x5EED)
        StructurePlacement placement = new RandomSpreadStructurePlacement(
                16,                 // spacing
                8,                  // separation
                SpreadType.LINEAR,  // LINEAR eller TRIANGULAR
                0x5EED              // salt
        );

        RegistryEntryList<Biome> overworldBiomes = RegistryEntryList.of(
                Registry.BIOME.iterateEntries(BiomeTags.IS_OVERWORLD)
                                .collect(Collectors.toList())       // -> List<RegistryEntry<Biome>>
        );

        Structure.Config config = new Structure.Config.Builder(
            RegistryEntryList.of(RegistryKeys.BIOME) // <-- rätt signatur
        )
        .step(GenerationStep.Feature.SURFACE_STRUCTURES)
        .terrainAdaptation(StructureTerrainAdaptation.NONE)
        .build();

        // 2. Konfigurerad instans av vår struktur
        TestHuse configured = new TestHuse(new Structure.Config(placement));
        Registry.register(Registries.STRUCTURE, TEST_HUSE.getValue(), configured);

        // 3. StructureSet – nya konstruktorn tar RegistryEntry + placement
        StructureSet set = new StructureSet(RegistryEntry.of(configured), placement);
        Registry.register(Registries.STRUCTURE_SET, TEST_HUSE_SET.getValue(), set);

        AnthemDiscs.LOGGER.info("Registrerade TestHuse-struktur + structure set");
    }
}