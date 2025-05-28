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

    
    public static final Item MUSIC_DISC_ALGERIA = registerItem(
        "music_disc_algeria",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ALGERIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ANGOLA = registerItem(
        "music_disc_angola",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ANGOLA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BENIN = registerItem(
        "music_disc_benin",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BENIN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BOTSWANA = registerItem(
        "music_disc_botswana",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BOTSWANA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BURKINA_FASO = registerItem(
        "music_disc_burkina_faso",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BURKINA_FASO_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BURUNDI = registerItem(
        "music_disc_burundi",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BURUNDI_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CAMEROON = registerItem(
        "music_disc_cameroon",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CAMEROON_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CAPEVERDE = registerItem(
        "music_disc_capeverde",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CAPEVERDE_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CENTRAL_AFRICAN_REPUBLIC = registerItem(
        "music_disc_central_african_republic",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CENTRAL_AFRICAN_REPUBLIC_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CHAD = registerItem(
        "music_disc_chad",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CHAD_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_COMOROS = registerItem(
        "music_disc_comoros",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.COMOROS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CONGOREP = registerItem(
        "music_disc_congorep",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CONGOREP_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_DEMOCRATIC_REPUBLIC_OF_THE_CONGO = registerItem(
        "music_disc_democratic_republic_of_the_congo",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.DEMOCRATIC_REPUBLIC_OF_THE_CONGO_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_DJIBOUTI = registerItem(
        "music_disc_djibouti",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.DJIBOUTI_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_EGYPT = registerItem(
        "music_disc_egypt",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.EGYPT_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_EQUATORIAL_GUINEA = registerItem(
        "music_disc_equatorial_guinea",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.EQUATORIAL_GUINEA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ERITREA = registerItem(
        "music_disc_eritrea",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ERITREA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ESWATINI = registerItem(
        "music_disc_eswatini",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ESWATINI_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ETHIOPIA = registerItem(
        "music_disc_ethiopia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ETHIOPIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GABON = registerItem(
        "music_disc_gabon",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GABON_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GAMBIA = registerItem(
        "music_disc_gambia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GAMBIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GHANA = registerItem(
        "music_disc_ghana",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GHANA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GUINEA = registerItem(
        "music_disc_guinea",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GUINEA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GUINEA_BISSAU = registerItem(
        "music_disc_guinea_bissau",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GUINEA_BISSAU_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_IVORY_COAST = registerItem(
        "music_disc_ivory_coast",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.IVORY_COAST_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_KENYA = registerItem(
        "music_disc_kenya",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.KENYA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_LESOTHO = registerItem(
        "music_disc_lesotho",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.LESOTHO_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_LIBERIA = registerItem(
        "music_disc_liberia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.LIBERIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_LIBYA = registerItem(
        "music_disc_libya",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.LIBYA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MADAGASCAR = registerItem(
        "music_disc_madagascar",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MADAGASCAR_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MALAWI = registerItem(
        "music_disc_malawi",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MALAWI_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MALI = registerItem(
        "music_disc_mali",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MALI_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MAURITANIA = registerItem(
        "music_disc_mauritania",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MAURITANIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MAURITIUS = registerItem(
        "music_disc_mauritius",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MAURITIUS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MOROCCO = registerItem(
        "music_disc_morocco",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MOROCCO_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MOZAMBIQUE = registerItem(
        "music_disc_mozambique",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MOZAMBIQUE_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_NAMIBIA = registerItem(
        "music_disc_namibia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.NAMIBIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_NIGER = registerItem(
        "music_disc_niger",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.NIGER_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_NIGERIA = registerItem(
        "music_disc_nigeria",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.NIGERIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_RWANDA = registerItem(
        "music_disc_rwanda",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.RWANDA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SAOTOME = registerItem(
        "music_disc_saotome",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SAOTOME_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SENEGAL = registerItem(
        "music_disc_senegal",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SENEGAL_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SEYCHELLES = registerItem(
        "music_disc_seychelles",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SEYCHELLES_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SIERRA_LEONE = registerItem(
        "music_disc_sierra_leone",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SIERRA_LEONE_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SOMALIA = registerItem(
        "music_disc_somalia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SOMALIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SOUTH_AFRICA = registerItem(
        "music_disc_south_africa",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SOUTH_AFRICA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SOUTH_SUDAN = registerItem(
        "music_disc_south_sudan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SOUTH_SUDAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_STHELENA = registerItem(
        "music_disc_sthelena",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.STHELENA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SUDAN = registerItem(
        "music_disc_sudan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SUDAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_TANZANIA = registerItem(
        "music_disc_tanzania",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.TANZANIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_TOGO = registerItem(
        "music_disc_togo",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.TOGO_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_TUNISIA = registerItem(
        "music_disc_tunisia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.TUNISIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_UGANDA = registerItem(
        "music_disc_uganda",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.UGANDA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ZAMBIA = registerItem(
        "music_disc_zambia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ZAMBIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ZIMBABWE = registerItem(
        "music_disc_zimbabwe",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ZIMBABWE_KEY).maxCount(1)
    );

    
    public static final Item MUSIC_DISC_AFGHANISTAN = registerItem(
        "music_disc_afghanistan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.AFGHANISTAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BAHRAIN = registerItem(
        "music_disc_bahrain",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BAHRAIN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BANGLADESH = registerItem(
        "music_disc_bangladesh",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BANGLADESH_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BHUTAN = registerItem(
        "music_disc_bhutan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BHUTAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BRUNEI = registerItem(
        "music_disc_brunei",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BRUNEI_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CAMBODIA = registerItem(
        "music_disc_cambodia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CAMBODIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CHINA = registerItem(
        "music_disc_china",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CHINA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_INDIA = registerItem(
        "music_disc_india",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.INDIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_INDONESIA = registerItem(
        "music_disc_indonesia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.INDONESIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_IRAN = registerItem(
        "music_disc_iran",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.IRAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_IRAQ = registerItem(
        "music_disc_iraq",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.IRAQ_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ISRAEL = registerItem(
        "music_disc_israel",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ISRAEL_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_JAPAN = registerItem(
        "music_disc_japan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.JAPAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_JORDAN = registerItem(
        "music_disc_jordan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.JORDAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_KAZAKHSTAN = registerItem(
        "music_disc_kazakhstan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.KAZAKHSTAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_KUWAIT = registerItem(
        "music_disc_kuwait",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.KUWAIT_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_KYRGYZSTAN = registerItem(
        "music_disc_kyrgyzstan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.KYRGYZSTAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_LAOS = registerItem(
        "music_disc_laos",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.LAOS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_LEBANON = registerItem(
        "music_disc_lebanon",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.LEBANON_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MALAYSIA = registerItem(
        "music_disc_malaysia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MALAYSIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MALDIVES = registerItem(
        "music_disc_maldives",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MALDIVES_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MONGOLIA = registerItem(
        "music_disc_mongolia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MONGOLIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MYANMAR = registerItem(
        "music_disc_myanmar",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MYANMAR_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_NEPAL = registerItem(
        "music_disc_nepal",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.NEPAL_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_NORTH_KOREA = registerItem(
        "music_disc_north_korea",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.NORTH_KOREA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_OMAN = registerItem(
        "music_disc_oman",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.OMAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_PAKISTAN = registerItem(
        "music_disc_pakistan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.PAKISTAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_PHILIPPINES = registerItem(
        "music_disc_philippines",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.PHILIPPINES_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_QATAR = registerItem(
        "music_disc_qatar",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.QATAR_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SAUDIARABIA = registerItem(
        "music_disc_saudiarabia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SAUDIARABIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SINGAPORE = registerItem(
        "music_disc_singapore",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SINGAPORE_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SOUTH_KOREA = registerItem(
        "music_disc_south_korea",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SOUTH_KOREA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SRILANKA = registerItem(
        "music_disc_srilanka",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SRILANKA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SYRIA = registerItem(
        "music_disc_syria",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SYRIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_TAJIKISTAN = registerItem(
        "music_disc_tajikistan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.TAJIKISTAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_THAILAND = registerItem(
        "music_disc_thailand",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.THAILAND_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_TIMORLESTE = registerItem(
        "music_disc_timorleste",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.TIMORLESTE_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_TURKMENISTAN = registerItem(
        "music_disc_turkmenistan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.TURKMENISTAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_UAE = registerItem(
        "music_disc_uae",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.UAE_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_UZBEKISTAN = registerItem(
        "music_disc_uzbekistan",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.UZBEKISTAN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_VIETNAM = registerItem(
        "music_disc_vietnam",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.VIETNAM_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_YEMEN = registerItem(
        "music_disc_yemen",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.YEMEN_KEY).maxCount(1)
    );

    
    public static final Item MUSIC_DISC_AMERICAN_SAMOA = registerItem(
        "music_disc_american_samoa",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.AMERICAN_SAMOA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_AUSTRALIA = registerItem(
        "music_disc_australia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.AUSTRALIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_COOK_ISLANDS = registerItem(
        "music_disc_cook_islands",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.COOK_ISLANDS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_FIJI = registerItem(
        "music_disc_fiji",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.FIJI_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GUAM = registerItem(
        "music_disc_guam",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GUAM_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_KIRIBATI = registerItem(
        "music_disc_kiribati",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.KIRIBATI_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MARSHALL_ISLANDS = registerItem(
        "music_disc_marshall_islands",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MARSHALL_ISLANDS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MICRONESIA = registerItem(
        "music_disc_micronesia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MICRONESIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_NAURU = registerItem(
        "music_disc_nauru",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.NAURU_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_NEW_ZEALAND = registerItem(
        "music_disc_new_zealand",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.NEW_ZEALAND_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_NIUE = registerItem(
        "music_disc_niue",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.NIUE_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_NORTHERN_MARIANAS = registerItem(
        "music_disc_northern_marianas",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.NORTHERN_MARIANAS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_PALAU = registerItem(
        "music_disc_palau",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.PALAU_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_PAPUA_NEW_GUINEA = registerItem(
        "music_disc_papua_new_guinea",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.PAPUA_NEW_GUINEA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_PITCAIRN = registerItem(
        "music_disc_pitcairn",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.PITCAIRN_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SAMOA = registerItem(
        "music_disc_samoa",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SAMOA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SOLOMON_ISLANDS = registerItem(
        "music_disc_solomon_islands",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SOLOMON_ISLANDS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_TOKELAU = registerItem(
        "music_disc_tokelau",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.TOKELAU_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_TONGA = registerItem(
        "music_disc_tonga",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.TONGA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_TUVALU = registerItem(
        "music_disc_tuvalu",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.TUVALU_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_VANUATU = registerItem(
        "music_disc_vanuatu",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.VANUATU_KEY).maxCount(1)
    );

    
    public static final Item MUSIC_DISC_ANGUILLA = registerItem(
        "music_disc_anguilla",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ANGUILLA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ANTIGUA_AND_BARBUDA = registerItem(
        "music_disc_antigua_and_barbuda",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ANTIGUA_AND_BARBUDA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ARGENTINA = registerItem(
        "music_disc_argentina",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ARGENTINA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BAHAMAS = registerItem(
        "music_disc_bahamas",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BAHAMAS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BARBADOS = registerItem(
        "music_disc_barbados",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BARBADOS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BELIZE = registerItem(
        "music_disc_belize",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BELIZE_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BERMUDA = registerItem(
        "music_disc_bermuda",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BERMUDA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BOLIVIA = registerItem(
        "music_disc_bolivia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BOLIVIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BRAZIL = registerItem(
        "music_disc_brazil",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BRAZIL_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_BRITISH_VIRGIN_ISLANDS = registerItem(
        "music_disc_british_virgin_islands",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.BRITISH_VIRGIN_ISLANDS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CANADA = registerItem(
        "music_disc_canada",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CANADA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CAYMAN_ISLANDS = registerItem(
        "music_disc_cayman_islands",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CAYMAN_ISLANDS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CHILE = registerItem(
        "music_disc_chile",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CHILE_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_COLOMBIA = registerItem(
        "music_disc_colombia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.COLOMBIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_COSTA_RICA = registerItem(
        "music_disc_costa_rica",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.COSTA_RICA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_CUBA = registerItem(
        "music_disc_cuba",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.CUBA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_DOMINICA = registerItem(
        "music_disc_dominica",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.DOMINICA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_DOMINICAN_REPUBLIC = registerItem(
        "music_disc_dominican_republic",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.DOMINICAN_REPUBLIC_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ECUADOR = registerItem(
        "music_disc_ecuador",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ECUADOR_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_EL_SALVADOR = registerItem(
        "music_disc_el_salvador",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.EL_SALVADOR_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_FALKLAND_ISLANDS = registerItem(
        "music_disc_falkland_islands",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.FALKLAND_ISLANDS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GRENADA = registerItem(
        "music_disc_grenada",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GRENADA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GUATEMALA = registerItem(
        "music_disc_guatemala",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GUATEMALA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_GUYANA = registerItem(
        "music_disc_guyana",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.GUYANA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_HAITI = registerItem(
        "music_disc_haiti",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.HAITI_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_HONDURAS = registerItem(
        "music_disc_honduras",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.HONDURAS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_JAMAICA = registerItem(
        "music_disc_jamaica",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.JAMAICA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MEXICO = registerItem(
        "music_disc_mexico",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MEXICO_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_MONTSERRAT = registerItem(
        "music_disc_montserrat",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.MONTSERRAT_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_NICARAGUA = registerItem(
        "music_disc_nicaragua",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.NICARAGUA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_PANAMA = registerItem(
        "music_disc_panama",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.PANAMA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_PARAGUAY = registerItem(
        "music_disc_paraguay",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.PARAGUAY_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_PERU = registerItem(
        "music_disc_peru",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.PERU_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_PUERTO_RICO = registerItem(
        "music_disc_puerto_rico",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.PUERTO_RICO_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ST_KITTS_AND_NEVIS = registerItem(
        "music_disc_st_kitts_and_nevis",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ST_KITTS_AND_NEVIS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ST_LUCIA = registerItem(
        "music_disc_st_lucia",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ST_LUCIA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_ST_VINCENT = registerItem(
        "music_disc_st_vincent",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.ST_VINCENT_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_SURINAME = registerItem(
        "music_disc_suriname",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.SURINAME_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_TRINIDAD_AND_TOBAGO = registerItem(
        "music_disc_trinidad_and_tobago",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.TRINIDAD_AND_TOBAGO_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_TURKS_AND_CAICOS_ISLANDS = registerItem(
        "music_disc_turks_and_caicos_islands",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.TURKS_AND_CAICOS_ISLANDS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_UNITED_STATES_OF_AMERICA = registerItem(
        "music_disc_united_states_of_america",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.UNITED_STATES_OF_AMERICA_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_URUGUAY = registerItem(
        "music_disc_uruguay",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.URUGUAY_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_US_VIRGIN_ISLANDS = registerItem(
        "music_disc_us_virgin_islands",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.US_VIRGIN_ISLANDS_KEY).maxCount(1)
    );


    public static final Item MUSIC_DISC_VENEZUELA = registerItem(
        "music_disc_venezuela",
         new Item.Settings().rarity(net.minecraft.util.Rarity.RARE)
            .jukeboxPlayable(ModSounds.VENEZUELA_KEY).maxCount(1)
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