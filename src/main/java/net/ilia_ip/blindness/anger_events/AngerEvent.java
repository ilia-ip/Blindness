package net.ilia_ip.blindness.anger_events;

import net.minecraft.world.World;
import net.minecraft.server.*;

public interface AngerEvent {
  abstract void play(World world, MinecraftServer server);
}
