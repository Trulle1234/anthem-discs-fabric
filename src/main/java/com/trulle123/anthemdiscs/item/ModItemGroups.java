package com.trulle123.anthemdiscs.item;

import com.trulle123.anthemdiscs.AnthemDiscs;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup EUROPE_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, 
    Identifier.of(AnthemDiscs.MOD_ID, "europe_item_group"), 
    FabricItemGroup.builder()
        .icon(() -> new ItemStack(ModItems.MUSIC_DISC_EMPTY))
        .displayName(Text.translatable("itemgroup.anthemdiscs.europe_item_group"))
        .entries((displayContext, entries) ->  {

            entries.add(ModItems.MUSIC_DISC_ALBANIA);    

            entries.add(ModItems.MUSIC_DISC_ANDORRA);    

            entries.add(ModItems.MUSIC_DISC_ARMENIA);    

            entries.add(ModItems.MUSIC_DISC_AUSTRIA);    

            entries.add(ModItems.MUSIC_DISC_AZERBAIJAN);    

            entries.add(ModItems.MUSIC_DISC_BELARUS);    

            entries.add(ModItems.MUSIC_DISC_BELGIUM);    

            entries.add(ModItems.MUSIC_DISC_BOSNIA);    

            entries.add(ModItems.MUSIC_DISC_BULGARIA);    

            entries.add(ModItems.MUSIC_DISC_CROATIA);    

            entries.add(ModItems.MUSIC_DISC_CZECHIA);    

            entries.add(ModItems.MUSIC_DISC_DENMARK);    

            entries.add(ModItems.MUSIC_DISC_FINLAND);    

            entries.add(ModItems.MUSIC_DISC_FRANCE);    

            entries.add(ModItems.MUSIC_DISC_GEORGIA);    

            entries.add(ModItems.MUSIC_DISC_GERMANY);    

            entries.add(ModItems.MUSIC_DISC_GIBRALTAR);    

            entries.add(ModItems.MUSIC_DISC_GREECE);    

            entries.add(ModItems.MUSIC_DISC_GUERNSEY);    

            entries.add(ModItems.MUSIC_DISC_HUNGARY);    

            entries.add(ModItems.MUSIC_DISC_ICELAND);    

            entries.add(ModItems.MUSIC_DISC_IRELAND);    

            entries.add(ModItems.MUSIC_DISC_ISLE_OF_MAN);    

            entries.add(ModItems.MUSIC_DISC_ITALY);    

            entries.add(ModItems.MUSIC_DISC_JERSEY);    

            entries.add(ModItems.MUSIC_DISC_LATVIA);    

            entries.add(ModItems.MUSIC_DISC_LITHUANIA);    

            entries.add(ModItems.MUSIC_DISC_LUXEMBOURG);    

            entries.add(ModItems.MUSIC_DISC_MACEDONIA);    

            entries.add(ModItems.MUSIC_DISC_MALTA);    

            entries.add(ModItems.MUSIC_DISC_MOLDOVA);    

            entries.add(ModItems.MUSIC_DISC_MONACO);    

            entries.add(ModItems.MUSIC_DISC_MONTENEGRO);    

            entries.add(ModItems.MUSIC_DISC_NETHERLANDS);    

            entries.add(ModItems.MUSIC_DISC_NORWAY);    

            entries.add(ModItems.MUSIC_DISC_POLAND);    

            entries.add(ModItems.MUSIC_DISC_PORTUGAL);    

            entries.add(ModItems.MUSIC_DISC_ROMANIA);    

            entries.add(ModItems.MUSIC_DISC_SAN_MARINO);    

            entries.add(ModItems.MUSIC_DISC_SERBIA);    

            entries.add(ModItems.MUSIC_DISC_SLOVAKIA);    

            entries.add(ModItems.MUSIC_DISC_SLOVENIA);    

            entries.add(ModItems.MUSIC_DISC_SPAIN);    

            entries.add(ModItems.MUSIC_DISC_SWEDEN);    

            entries.add(ModItems.MUSIC_DISC_SWITZERLAND);    

            entries.add(ModItems.MUSIC_DISC_TURKEY);    

            entries.add(ModItems.MUSIC_DISC_UK);    

            entries.add(ModItems.MUSIC_DISC_UKRAINE);    

            entries.add(ModItems.MUSIC_DISC_VATICAN);    

        })
        .build());
        
                public static final ItemGroup AFRICA_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, 
        Identifier.of(AnthemDiscs.MOD_ID, "africa_item_group"), 
        FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.MUSIC_DISC_EMPTY))
            .displayName(Text.translatable("itemgroup.anthemdiscs.africa_item_group"))
            .entries((displayContext, entries) ->  {
            
            entries.add(ModItems.MUSIC_DISC_ALGERIA);    

            entries.add(ModItems.MUSIC_DISC_ANGOLA);    

            entries.add(ModItems.MUSIC_DISC_BENIN);    

            entries.add(ModItems.MUSIC_DISC_BOTSWANA);    

            entries.add(ModItems.MUSIC_DISC_BURKINA_FASO);    

            entries.add(ModItems.MUSIC_DISC_BURUNDI);    

            entries.add(ModItems.MUSIC_DISC_CAMEROON);    

            entries.add(ModItems.MUSIC_DISC_CAPEVERDE);    

            entries.add(ModItems.MUSIC_DISC_CENTRAL_AFRICAN_REPUBLIC);    

            entries.add(ModItems.MUSIC_DISC_CHAD);    

            entries.add(ModItems.MUSIC_DISC_COMOROS);    

            entries.add(ModItems.MUSIC_DISC_CONGOREP);    

            entries.add(ModItems.MUSIC_DISC_DEMOCRATIC_REPUBLIC_OF_THE_CONGO);    

            entries.add(ModItems.MUSIC_DISC_DJIBOUTI);    

            entries.add(ModItems.MUSIC_DISC_EGYPT);    

            entries.add(ModItems.MUSIC_DISC_EQUATORIAL_GUINEA);    

            entries.add(ModItems.MUSIC_DISC_ERITREA);    

            entries.add(ModItems.MUSIC_DISC_ESWATINI);    

            entries.add(ModItems.MUSIC_DISC_ETHIOPIA);    

            entries.add(ModItems.MUSIC_DISC_GABON);    

            entries.add(ModItems.MUSIC_DISC_GAMBIA);    

            entries.add(ModItems.MUSIC_DISC_GHANA);    

            entries.add(ModItems.MUSIC_DISC_GUINEA);    

            entries.add(ModItems.MUSIC_DISC_GUINEA_BISSAU);    

            entries.add(ModItems.MUSIC_DISC_IVORY_COAST);    

            entries.add(ModItems.MUSIC_DISC_KENYA);    

            entries.add(ModItems.MUSIC_DISC_LESOTHO);    

            entries.add(ModItems.MUSIC_DISC_LIBERIA);    

            entries.add(ModItems.MUSIC_DISC_LIBYA);    

            entries.add(ModItems.MUSIC_DISC_MADAGASCAR);    

            entries.add(ModItems.MUSIC_DISC_MALAWI);    

            entries.add(ModItems.MUSIC_DISC_MALI);    

            entries.add(ModItems.MUSIC_DISC_MAURITANIA);    

            entries.add(ModItems.MUSIC_DISC_MAURITIUS);    

            entries.add(ModItems.MUSIC_DISC_MOROCCO);    

            entries.add(ModItems.MUSIC_DISC_MOZAMBIQUE);    

            entries.add(ModItems.MUSIC_DISC_NAMIBIA);    

            entries.add(ModItems.MUSIC_DISC_NIGER);    

            entries.add(ModItems.MUSIC_DISC_NIGERIA);    

            entries.add(ModItems.MUSIC_DISC_RWANDA);    

            entries.add(ModItems.MUSIC_DISC_SAOTOME);    

            entries.add(ModItems.MUSIC_DISC_SENEGAL);    

            entries.add(ModItems.MUSIC_DISC_SEYCHELLES);    

            entries.add(ModItems.MUSIC_DISC_SIERRA_LEONE);    

            entries.add(ModItems.MUSIC_DISC_SOMALIA);    

            entries.add(ModItems.MUSIC_DISC_SOUTH_AFRICA);    

            entries.add(ModItems.MUSIC_DISC_SOUTH_SUDAN);    

            entries.add(ModItems.MUSIC_DISC_STHELENA);    

            entries.add(ModItems.MUSIC_DISC_SUDAN);    

            entries.add(ModItems.MUSIC_DISC_TANZANIA);    

            entries.add(ModItems.MUSIC_DISC_TOGO);    

            entries.add(ModItems.MUSIC_DISC_TUNISIA);    

            entries.add(ModItems.MUSIC_DISC_UGANDA);    

            entries.add(ModItems.MUSIC_DISC_ZAMBIA);    

            entries.add(ModItems.MUSIC_DISC_ZIMBABWE);    
                
        })
        .build());

                public static final ItemGroup ASIA_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, 
        Identifier.of(AnthemDiscs.MOD_ID, "asia_item_group"), 
        FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.MUSIC_DISC_EMPTY))
            .displayName(Text.translatable("itemgroup.anthemdiscs.asia_item_group"))
            .entries((displayContext, entries) ->  {
            
            entries.add(ModItems.MUSIC_DISC_AFGHANISTAN);    

            entries.add(ModItems.MUSIC_DISC_BAHRAIN);    

            entries.add(ModItems.MUSIC_DISC_BANGLADESH);    

            entries.add(ModItems.MUSIC_DISC_BHUTAN);    

            entries.add(ModItems.MUSIC_DISC_BRUNEI);    

            entries.add(ModItems.MUSIC_DISC_CAMBODIA);    

            entries.add(ModItems.MUSIC_DISC_CHINA);    

            entries.add(ModItems.MUSIC_DISC_INDIA);    

            entries.add(ModItems.MUSIC_DISC_INDONESIA);    

            entries.add(ModItems.MUSIC_DISC_IRAN);    

            entries.add(ModItems.MUSIC_DISC_IRAQ);    

            entries.add(ModItems.MUSIC_DISC_ISRAEL);    

            entries.add(ModItems.MUSIC_DISC_JAPAN);    

            entries.add(ModItems.MUSIC_DISC_JORDAN);    

            entries.add(ModItems.MUSIC_DISC_KAZAKHSTAN);    

            entries.add(ModItems.MUSIC_DISC_KUWAIT);    

            entries.add(ModItems.MUSIC_DISC_KYRGYZSTAN);    

            entries.add(ModItems.MUSIC_DISC_LAOS);    

            entries.add(ModItems.MUSIC_DISC_LEBANON);    

            entries.add(ModItems.MUSIC_DISC_MALAYSIA);    

            entries.add(ModItems.MUSIC_DISC_MALDIVES);    

            entries.add(ModItems.MUSIC_DISC_MONGOLIA);    

            entries.add(ModItems.MUSIC_DISC_MYANMAR);    

            entries.add(ModItems.MUSIC_DISC_NEPAL);    

            entries.add(ModItems.MUSIC_DISC_NORTH_KOREA);    

            entries.add(ModItems.MUSIC_DISC_OMAN);    

            entries.add(ModItems.MUSIC_DISC_PAKISTAN);    

            entries.add(ModItems.MUSIC_DISC_PHILIPPINES);    

            entries.add(ModItems.MUSIC_DISC_QATAR);    

            entries.add(ModItems.MUSIC_DISC_SAUDIARABIA);    

            entries.add(ModItems.MUSIC_DISC_SINGAPORE);    

            entries.add(ModItems.MUSIC_DISC_SOUTH_KOREA);    

            entries.add(ModItems.MUSIC_DISC_SRILANKA);    

            entries.add(ModItems.MUSIC_DISC_SYRIA);    

            entries.add(ModItems.MUSIC_DISC_TAJIKISTAN);    

            entries.add(ModItems.MUSIC_DISC_THAILAND);    

            entries.add(ModItems.MUSIC_DISC_TIMORLESTE);    

            entries.add(ModItems.MUSIC_DISC_TURKMENISTAN);    

            entries.add(ModItems.MUSIC_DISC_UAE);    

            entries.add(ModItems.MUSIC_DISC_UZBEKISTAN);    

            entries.add(ModItems.MUSIC_DISC_VIETNAM);    

            entries.add(ModItems.MUSIC_DISC_YEMEN);    
        
        })
        .build());
                        public static final ItemGroup OCEANIA_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, 
        Identifier.of(AnthemDiscs.MOD_ID, "oceania_item_group"), 
        FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.MUSIC_DISC_EMPTY))
            .displayName(Text.translatable("itemgroup.anthemdiscs.oceania_item_group"))
            .entries((displayContext, entries) ->  {
                
            entries.add(ModItems.MUSIC_DISC_AMERICAN_SAMOA);    

            entries.add(ModItems.MUSIC_DISC_AUSTRALIA);    

            entries.add(ModItems.MUSIC_DISC_COOK_ISLANDS);    

            entries.add(ModItems.MUSIC_DISC_FIJI);    

            entries.add(ModItems.MUSIC_DISC_GUAM);    

            entries.add(ModItems.MUSIC_DISC_KIRIBATI);    

            entries.add(ModItems.MUSIC_DISC_MARSHALL_ISLANDS);    

            entries.add(ModItems.MUSIC_DISC_MICRONESIA);    

            entries.add(ModItems.MUSIC_DISC_NAURU);    

            entries.add(ModItems.MUSIC_DISC_NEW_ZEALAND);    

            entries.add(ModItems.MUSIC_DISC_NIUE);    

            entries.add(ModItems.MUSIC_DISC_NORTHERN_MARIANAS);    

            entries.add(ModItems.MUSIC_DISC_PALAU);    

            entries.add(ModItems.MUSIC_DISC_PAPUA_NEW_GUINEA);    

            entries.add(ModItems.MUSIC_DISC_PITCAIRN);    

            entries.add(ModItems.MUSIC_DISC_SAMOA);    

            entries.add(ModItems.MUSIC_DISC_SOLOMON_ISLANDS);    

            entries.add(ModItems.MUSIC_DISC_TOKELAU);    

            entries.add(ModItems.MUSIC_DISC_TONGA);    

            entries.add(ModItems.MUSIC_DISC_TUVALU);    

            entries.add(ModItems.MUSIC_DISC_VANUATU);    

        })
        .build());

                                public static final ItemGroup AMERICA_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, 
        Identifier.of(AnthemDiscs.MOD_ID, "america_item_group"), 
        FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.MUSIC_DISC_EMPTY))
            .displayName(Text.translatable("itemgroup.anthemdiscs.america_item_group"))
            .entries((displayContext, entries) ->  {

            entries.add(ModItems.MUSIC_DISC_ANGUILLA);    

            entries.add(ModItems.MUSIC_DISC_ANTIGUA_AND_BARBUDA);    

            entries.add(ModItems.MUSIC_DISC_ARGENTINA);    

            entries.add(ModItems.MUSIC_DISC_BAHAMAS);    

            entries.add(ModItems.MUSIC_DISC_BARBADOS);    

            entries.add(ModItems.MUSIC_DISC_BELIZE);    

            entries.add(ModItems.MUSIC_DISC_BERMUDA);    

            entries.add(ModItems.MUSIC_DISC_BOLIVIA);    

            entries.add(ModItems.MUSIC_DISC_BRAZIL);    

            entries.add(ModItems.MUSIC_DISC_BRITISH_VIRGIN_ISLANDS);    

            entries.add(ModItems.MUSIC_DISC_CANADA);    

            entries.add(ModItems.MUSIC_DISC_CAYMAN_ISLANDS);    

            entries.add(ModItems.MUSIC_DISC_CHILE);    

            entries.add(ModItems.MUSIC_DISC_COLOMBIA);    

            entries.add(ModItems.MUSIC_DISC_COSTA_RICA);    

            entries.add(ModItems.MUSIC_DISC_CUBA);    

            entries.add(ModItems.MUSIC_DISC_DOMINICA);    

            entries.add(ModItems.MUSIC_DISC_DOMINICAN_REPUBLIC);    

            entries.add(ModItems.MUSIC_DISC_ECUADOR);    

            entries.add(ModItems.MUSIC_DISC_EL_SALVADOR);    

            entries.add(ModItems.MUSIC_DISC_FALKLAND_ISLANDS);    

            entries.add(ModItems.MUSIC_DISC_GRENADA);    

            entries.add(ModItems.MUSIC_DISC_GUATEMALA);    

            entries.add(ModItems.MUSIC_DISC_GUYANA);    

            entries.add(ModItems.MUSIC_DISC_HAITI);    

            entries.add(ModItems.MUSIC_DISC_HONDURAS);    

            entries.add(ModItems.MUSIC_DISC_JAMAICA);    

            entries.add(ModItems.MUSIC_DISC_MEXICO);    

            entries.add(ModItems.MUSIC_DISC_MONTSERRAT);    

            entries.add(ModItems.MUSIC_DISC_NICARAGUA);    

            entries.add(ModItems.MUSIC_DISC_PANAMA);    

            entries.add(ModItems.MUSIC_DISC_PARAGUAY);    

            entries.add(ModItems.MUSIC_DISC_PERU);    

            entries.add(ModItems.MUSIC_DISC_PUERTO_RICO);    

            entries.add(ModItems.MUSIC_DISC_ST_KITTS_AND_NEVIS);    

            entries.add(ModItems.MUSIC_DISC_ST_LUCIA);    

            entries.add(ModItems.MUSIC_DISC_ST_VINCENT);    

            entries.add(ModItems.MUSIC_DISC_SURINAME);    

            entries.add(ModItems.MUSIC_DISC_TRINIDAD_AND_TOBAGO);    

            entries.add(ModItems.MUSIC_DISC_TURKS_AND_CAICOS_ISLANDS);    

            entries.add(ModItems.MUSIC_DISC_UNITED_STATES_OF_AMERICA);    

            entries.add(ModItems.MUSIC_DISC_URUGUAY);    

            entries.add(ModItems.MUSIC_DISC_US_VIRGIN_ISLANDS);    

            entries.add(ModItems.MUSIC_DISC_VENEZUELA);    

        })
        .build());

    public static void registerItemGroups() {
        AnthemDiscs.LOGGER.info("Registering Mod Item Groups for " + AnthemDiscs.MOD_ID);
    }

}
