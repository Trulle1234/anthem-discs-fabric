package com.trulle123.anthemdiscs.item;

import com.trulle123.anthemdiscs.AnthemDiscs;
import com.trulle123.anthemdiscs.sound.ModSounds;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MUSIC_DISC_EMPTY = registerItem(
        "music_disc_empty",
        new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
    );

        public static final Item MUSIC_DISC_ALBANIA = registerItem(
        "music_disc_albania",
        new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
        .jukeboxPlayable(ModSounds.ALBANIA_KEY).maxCount(1)
    );

    private static Item registerItem(String name, Item.Settings settings) {
        Identifier id = Identifier.of(AnthemDiscs.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings keyedSettings = settings.registryKey(key);
        Item item = new Item(keyedSettings);
        return Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModItems() {
        AnthemDiscs.LOGGER.info("Registering Mod Items for " + AnthemDiscs.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                       .register(entries -> entries.add(MUSIC_DISC_EMPTY));
    }
}