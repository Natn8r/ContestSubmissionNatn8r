package net.mcreator.sustanabilityproject.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.sustanabilityproject.network.SustanabilityProjectModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AddingToGlobalWarmingProcedure {
	@SubscribeEvent
	public static void onItemSmelted(PlayerEvent.ItemSmeltedEvent event) {
		Entity entity = event.getPlayer();
		execute(event, entity.level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		SustanabilityProjectModVariables.MapVariables.get(world).waterlevel = SustanabilityProjectModVariables.MapVariables.get(world).waterlevel + 5;
		SustanabilityProjectModVariables.MapVariables.get(world).syncData(world);
	}
}
