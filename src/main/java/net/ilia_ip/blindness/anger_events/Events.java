package net.ilia_ip.blindness.anger_events;

import net.ilia_ip.blindness.anger_events.*;
import net.minecraft.server.*;
import net.minecraft.server.network.*;
import java.util.Random;
import net.minecraft.world.*;
import net.minecraft.world.World.*;
import net.minecraft.util.math.*;
import net.minecraft.sound.*;
import net.minecraft.entity.*;
import java.util.HashMap;
import java.lang.Class;

public class Events {

  public static HashMap<Integer, AngerEvent> GLOBAL_ANGER_EVENTS_LOW = new HashMap<Integer, AngerEvent>();

  public static void initClasses() {
    GLOBAL_ANGER_EVENTS_LOW.put(0, new NightNoise());
  }

  public static void low_anger(World world, MinecraftServer server) {
    int num = new Random().nextInt(40);
    if (num == 20) {      
      GLOBAL_ANGER_EVENTS_LOW.get(0).play(world, server);
    }
  }
}
