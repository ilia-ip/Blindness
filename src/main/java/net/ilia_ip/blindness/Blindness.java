package net.ilia_ip.blindness;

import net.ilia_ip.blindness.anger_events.*;
import net.ilia_ip.blindness.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import org.slf4j.Logger;
import net.fabricmc.fabric.api.event.*;
import net.fabricmc.fabric.api.event.player.*;
import org.slf4j.LoggerFactory;
import net.minecraft.entity.damage.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.*;
import net.minecraft.block.*;
import net.minecraft.server.*;
import net.minecraft.world.*;

public class Blindness implements ModInitializer {
	public static final String MOD_ID = "blindness";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
	    Events.initClasses();
      ServerTickEvents.END_SERVER_TICK.register((server) -> {
      StateSaverAndLoader serverState = StateSaverAndLoader.getServerState(server);
      LOGGER.info("AngerLevel {}", serverState.roundedAngerLevel);
      Events.low_anger(server.getWorld(World.OVERWORLD), server);
      StateSaverAndLoader.roundedAngerLevel += 0.000041;
    });
    LOGGER.info("Hello Fabric world!");
	}
}
