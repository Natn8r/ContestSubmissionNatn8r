package net.mcreator.sustanabilityproject.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.sustanabilityproject.network.SustanabilityProjectModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ShowCarbonGuide2Procedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity.level);
		}
	}

	public static boolean execute(LevelAccessor world) {
		return execute(null, world);
	}

	private static boolean execute(@Nullable Event event, LevelAccessor world) {
		if (SustanabilityProjectModVariables.MapVariables.get(world).waterlevel <= 300
				&& SustanabilityProjectModVariables.MapVariables.get(world).waterlevel > 200) {
			return true;
		}
		return false;
	}
}
