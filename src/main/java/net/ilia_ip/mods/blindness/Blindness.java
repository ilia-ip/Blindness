package net.ilia_ip.mods.blindness;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blindness implements ModInitializer {
	public static final String MOD_ID = "blindness";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
