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


    public static final Item MUSIC_DISC_ANDORRA = registerItem(
        "music_disc_andorra",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ANDORRA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ARMENIA = registerItem(
        "music_disc_armenia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ARMENIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_AUSTRIA = registerItem(
        "music_disc_austria",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.AUSTRIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_AZERBAIJAN = registerItem(
        "music_disc_azerbaijan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.AZERBAIJAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BELARUS = registerItem(
        "music_disc_belarus",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BELARUS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BELGIUM = registerItem(
        "music_disc_belgium",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BELGIUM_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BOSNIA = registerItem(
        "music_disc_bosnia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BOSNIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BULGARIA = registerItem(
        "music_disc_bulgaria",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BULGARIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CROATIA = registerItem(
        "music_disc_croatia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CROATIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CZECHIA = registerItem(
        "music_disc_czechia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CZECHIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_DENMARK = registerItem(
        "music_disc_denmark",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.DENMARK_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_FINLAND = registerItem(
        "music_disc_finland",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.FINLAND_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_FRANCE = registerItem(
        "music_disc_france",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.FRANCE_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GEORGIA = registerItem(
        "music_disc_georgia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GEORGIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GERMANY = registerItem(
        "music_disc_germany",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GERMANY_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GIBRALTAR = registerItem(
        "music_disc_gibraltar",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GIBRALTAR_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GREECE = registerItem(
        "music_disc_greece",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GREECE_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GUERNSEY = registerItem(
        "music_disc_guernsey",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GUERNSEY_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_HUNGARY = registerItem(
        "music_disc_hungary",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.HUNGARY_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ICELAND = registerItem(
        "music_disc_iceland",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ICELAND_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_IRELAND = registerItem(
        "music_disc_ireland",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.IRELAND_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ISLE_OF_MAN = registerItem(
        "music_disc_isle_of_man",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ISLE_OF_MAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ITALY = registerItem(
        "music_disc_italy",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ITALY_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_JERSEY = registerItem(
        "music_disc_jersey",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.JERSEY_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_LATVIA = registerItem(
        "music_disc_latvia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.LATVIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_LITHUANIA = registerItem(
        "music_disc_lithuania",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.LITHUANIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_LUXEMBOURG = registerItem(
        "music_disc_luxembourg",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.LUXEMBOURG_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MACEDONIA = registerItem(
        "music_disc_macedonia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MACEDONIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MALTA = registerItem(
        "music_disc_malta",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MALTA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MOLDOVA = registerItem(
        "music_disc_moldova",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MOLDOVA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MONACO = registerItem(
        "music_disc_monaco",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MONACO_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MONTENEGRO = registerItem(
        "music_disc_montenegro",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MONTENEGRO_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_NETHERLANDS = registerItem(
        "music_disc_netherlands",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.NETHERLANDS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_NORWAY = registerItem(
        "music_disc_norway",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.NORWAY_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_POLAND = registerItem(
        "music_disc_poland",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.POLAND_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_PORTUGAL = registerItem(
        "music_disc_portugal",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.PORTUGAL_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ROMANIA = registerItem(
        "music_disc_romania",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ROMANIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_RUSSIA = registerItem(
        "music_disc_russia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.RUSSIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SAN_MARINO = registerItem(
        "music_disc_san_marino",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SAN_MARINO_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SERBIA = registerItem(
        "music_disc_serbia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SERBIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SLOVAKIA = registerItem(
        "music_disc_slovakia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SLOVAKIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SLOVENIA = registerItem(
        "music_disc_slovenia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SLOVENIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SPAIN = registerItem(
        "music_disc_spain",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SPAIN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SWEDEN = registerItem(
        "music_disc_sweden",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SWEDEN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SWITZERLAND = registerItem(
        "music_disc_switzerland",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SWITZERLAND_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_TURKEY = registerItem(
        "music_disc_turkey",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.TURKEY_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_UK = registerItem(
        "music_disc_uk",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.UK_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_UKRAINE = registerItem(
        "music_disc_ukraine",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.UKRAINE_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_VATICAN = registerItem(
        "music_disc_vatican",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.VATICAN_KEY).maxCount(1)
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