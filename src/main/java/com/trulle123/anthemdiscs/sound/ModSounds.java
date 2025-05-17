package com.trulle123.anthemdiscs.sound;

import com.trulle123.anthemdiscs.AnthemDiscs;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent I_AM_STEVE = registerSoundEvent("i_am_steve");

    public static final SoundEvent ALBANIA = registerSoundEvent("albania");
    public static final RegistryKey<JukeboxSong> ALBANIA_KEY = 
        RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(AnthemDiscs.MOD_ID, "albania"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(AnthemDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        AnthemDiscs.LOGGER.info("Regesitering Mod Sounds for " + AnthemDiscs.MOD_ID);
    }

}
