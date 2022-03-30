package net.mcreator.sustanabilityproject.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PlaneOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		double Yaw = 0;
		entity.getPersistentData().putDouble("ping", (entity.getPersistentData().getDouble("ping") + 1));
		if (0 == entity.getPersistentData().getDouble("energy1")) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 100, (false), (false)));
		} else if (entity.isVehicle()) {
			entity.getPersistentData().putDouble("energy1", (entity.getPersistentData().getDouble("energy1") - 0.5));
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (entity.getPersistentData().getDouble("ping") % 60 == 0) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sustanability_project:motorcycle-idle-loop")),
										SoundSource.NEUTRAL, (float) 0.7, 1);
							} else {
								_level.playLocalSound(x, y, z,
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sustanability_project:motorcycle-idle-loop")),
										SoundSource.NEUTRAL, (float) 0.7, 1, false);
							}
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 25);
		}
		if (entity.isVehicle()) {
			if (false == entity.getPersistentData().getBoolean("ridden")) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sustanability_project:car-ignition")),
								SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sustanability_project:car-ignition")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			entity.getPersistentData().putBoolean("ridden", (true));
		} else {
			entity.getPersistentData().putBoolean("ridden", (false));
		}
		if (0 <= entity.getPersistentData().getDouble("energy1")) {
			if (!entity.isOnGround() && entity.isVehicle()) {
				speed = 1;
				Yaw = entity.getYRot();
				entity.setDeltaMovement((speed * Math.cos((Yaw + 90) * Math.PI / 180)), (entity.getDeltaMovement().y()),
						(speed * Math.sin((Yaw + 90) * Math.PI / 180)));
			}
		}
		if (!entity.isOnGround() && !entity.isVehicle()) {
			entity.setDeltaMovement(0, (-0.5), 0);
		}
	}
}
