package net.ilia_ip.blindness.anger_events;

import net.minecraft.world.World;
import net.minecraft.server.*;
import net.minecraft.util.math.*;
import net.minecraft.sound.*;
import net.minecraft.entity.*;
import net.minecraft.server.network.*;
import net.minecraft.entity.effect.*;
import net.minecraft.util.*;


public class NightNoise implements AngerEvent {
  NightNoise() {
    
  }

  @Override
  public void play(World world, MinecraftServer server) {
    for (ServerPlayerEntity entity : server.getPlayerManager().getPlayerList()) {
      Vec3d pos = entity.getCameraEntity().getPos();
      LivingEntity livingEntity = (LivingEntity)entity.getCameraEntity();
      livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 2000, 1, false, false));
      world.playSound(null, new BlockPos((int)pos.x, (int)pos.y, (int)pos.z), SoundEvents.AMBIENT_CAVE.value(), SoundCategory.BLOCKS, 1f, 1f); 
    }
  }
}
