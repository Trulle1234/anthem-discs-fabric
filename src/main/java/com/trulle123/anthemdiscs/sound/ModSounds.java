package com.trulle123.anthemdiscs.sound;

import com.trulle123.anthemdiscs.AnthemDiscs;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent I_AM_STEVE = registerSoundEvent("i_am_steve");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(AnthemDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        AnthemDiscs.LOGGER.info("Regesitering Mod Sounds for " + AnthemDiscs.MOD_ID);
    }

}
