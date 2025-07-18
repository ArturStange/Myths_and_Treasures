package net.stange.mtmod;

import net.fabricmc.api.ModInitializer;

import net.stange.mtmod.item.ModItemGroups;
import net.stange.mtmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MythsAndTreasures implements ModInitializer {
	public static final String MOD_ID = "myths_and_treasures";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItens();
		LOGGER.info("Hello Fabric world!");
	}
}