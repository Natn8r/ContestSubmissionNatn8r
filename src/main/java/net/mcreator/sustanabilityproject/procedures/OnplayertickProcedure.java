package net.mcreator.sustanabilityproject.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.sustanabilityproject.entity.PlaneEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnplayertickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getVehicle()) instanceof PlaneEntity && entity.isPassenger()) {
			if (0 <= (entity.getVehicle()).getPersistentData().getDouble("energy1")) {
				if ((entity.getVehicle()) instanceof PlaneEntity && true == entity.getPersistentData().getBoolean("wpressed")) {
					(entity.getVehicle()).setDeltaMovement(0, 0.25, 0);
				}
				if ((entity.getVehicle()) instanceof PlaneEntity && true == entity.getPersistentData().getBoolean("spressed")) {
					(entity.getVehicle()).setDeltaMovement(0, (-0.5), 0);
				}
			}
		}
	}
}
