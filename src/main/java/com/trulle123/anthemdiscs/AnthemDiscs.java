package com.trulle123.anthemdiscs;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trulle123.anthemdiscs.item.ModItems;

public class AnthemDiscs implements ModInitializer {
	public static final String MOD_ID = "anthemdiscs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}