package com.trulle123.anthemdiscs;

import net.fabricmc.api.ModInitializer;
import net.minecraft.world.gen.structure.StructureType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trulle123.anthemdiscs.item.ModItemGroups;
import com.trulle123.anthemdiscs.item.ModItems;
import com.trulle123.anthemdiscs.sound.ModSounds;
import com.trulle123.anthemdiscs.structures.TestHuse;
import com.trulle123.anthemdiscs.structures.ModStructures;

public class AnthemDiscs implements ModInitializer {
    public static final String MOD_ID = "anthemdiscs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // När vi gör Registry.register här så registreras ENBART StructureType<TestHuse>.
    // Vi använder samma nyckel ("anthemdiscs:test_huse") som du pekar på i TestHuse.getType().
    public static final StructureType<TestHuse> TEST_HUSE_TYPE =
        Registry.register(
            Registries.STRUCTURE_TYPE,
            MOD_ID + ":test_huse",
            () -> TestHuse.MAP_CODEC
        );

    @Override
    public void onInitialize() {
        // Registrera items, grupper och ljud som tidigare
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModSounds.registerSounds();

        // Anropa ModStructures.init() en gång – här registrerar vi enbart
        // den KONFIGURERADE strukturen, under Registries.CONFIGURED_STRUCTURE_FEATURE.
        ModStructures.init();
    }
}
