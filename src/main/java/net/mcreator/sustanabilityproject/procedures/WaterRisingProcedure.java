package net.mcreator.sustanabilityproject.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.sustanabilityproject.network.SustanabilityProjectModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WaterRisingProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity.level, entity.getX(), entity.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double z) {
		execute(null, world, x, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (SustanabilityProjectModVariables.MapVariables.get(world).waterlevel / 1000 > 1) {
			sx = -3;
			for (int index0 = 0; index0 < (int) (6); index0++) {
				sz = -3;
				for (int index1 = 0; index1 < (int) (6); index1++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) 64, (int) (z + sz)))).getBlock() == Blocks.AIR) {
						{
							BlockPos _bp = new BlockPos((int) (x + sx), (int) 64, (int) (z + sz));
							BlockState _bs = Blocks.WATER.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					}
					sz = sz + 1;
				}
				sx = sx + 1;
			}
		}
	}
}
