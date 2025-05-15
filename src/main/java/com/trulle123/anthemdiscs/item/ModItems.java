package com.trulle123.anthemdiscs.item;

import com.trulle123.anthemdiscs.AnthemDiscs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MUSIC_DISC_EMPTY = registerItem("music_disc_empty", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AnthemDiscs.MOD_ID, name),item );
    }


    public static void registerModItems() {
        AnthemDiscs.LOGGER.info("Registering Mod Items for " + AnthemDiscs.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MUSIC_DISC_EMPTY);
        });
    }
}
