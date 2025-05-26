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

            entries.add(ModItems.MUSIC_DISC_RUSSIA);    

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

    public static void registerItemGroups() {
        AnthemDiscs.LOGGER.info("Registering Mod Item Groups for " + AnthemDiscs.MOD_ID);
    }

}
