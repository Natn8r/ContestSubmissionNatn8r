package net.mcreator.sustanabilityproject.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.sustanabilityproject.network.SustanabilityProjectModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NaturalCarbonDegenerationProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (!(world instanceof Level _lvl ? _lvl.isDay() : false)) {
			SustanabilityProjectModVariables.MapVariables.get(world).waterlevel = SustanabilityProjectModVariables.MapVariables.get(world).waterlevel
					- 0.01;
			SustanabilityProjectModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
