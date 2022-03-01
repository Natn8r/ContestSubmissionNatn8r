package net.mcreator.sustanabilityproject.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.sustanabilityproject.network.SustanabilityProjectModVariables;

import javax.annotation.Nullable;

import java.util.Calendar;

@Mod.EventBusSubscriber
public class GlobalWarmingFireDetectionProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double lastsecond = 0;
		boolean found = false;
		boolean killswitch = false;
		if (entity.getPersistentData().getBoolean("fireupdate") && 30 == Calendar.getInstance().get(Calendar.SECOND)) {
			sx = -50;
			found = false;
			for (int index0 = 0; index0 < (int) (100); index0++) {
				sy = -50;
				for (int index1 = 0; index1 < (int) (100); index1++) {
					sz = -50;
					for (int index2 = 0; index2 < (int) (100); index2++) {
						if ((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock() == Blocks.FIRE
								|| (world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
										.getBlock() == Blocks.CAMPFIRE) {
							found = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (found == true) {
				SustanabilityProjectModVariables.MapVariables.get(world).waterlevel = sx + 0.5;
				SustanabilityProjectModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
