package net.mcreator.sustanabilityproject.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import java.util.Calendar;

@Mod.EventBusSubscriber
public class FiredetectionreverttickProcedure {
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
		if (Calendar.getInstance().get(Calendar.SECOND) == 32) {
			entity.getPersistentData().putBoolean("fireupdate", (true));
		} else {
			if (!entity.getPersistentData().getBoolean("fireupdate")) {
				entity.getPersistentData().putBoolean("fireupdate", (false));
			}
		}
	}
}
