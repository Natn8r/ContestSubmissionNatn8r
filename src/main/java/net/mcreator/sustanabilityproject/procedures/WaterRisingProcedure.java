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
		if (SustanabilityProjectModVariables.MapVariables.get(world).waterlevel / 1000 >= 5) {
			sx = -50;
			for (int index0 = 0; index0 < (int) (100); index0++) {
				sz = -50;
				for (int index1 = 0; index1 < (int) (100); index1++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) 68, (int) (z + sz)))).getBlock() == Blocks.AIR) {
						{
							BlockPos _bp = new BlockPos((int) (x + sx), (int) 68, (int) (z + sz));
							BlockState _bs = Blocks.WATER.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					}
					sz = sz + 1;
				}
				sx = sx + 1;
			}
		} else if (SustanabilityProjectModVariables.MapVariables.get(world).waterlevel / 1000 >= 4) {
			sx = -50;
			for (int index2 = 0; index2 < (int) (100); index2++) {
				sz = -50;
				for (int index3 = 0; index3 < (int) (100); index3++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) 67, (int) (z + sz)))).getBlock() == Blocks.AIR) {
						{
							BlockPos _bp = new BlockPos((int) (x + sx), (int) 67, (int) (z + sz));
							BlockState _bs = Blocks.WATER.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					}
					sz = sz + 1;
				}
				sx = sx + 1;
			}
		} else if (SustanabilityProjectModVariables.MapVariables.get(world).waterlevel / 1000 >= 3) {
			sx = -50;
			for (int index4 = 0; index4 < (int) (100); index4++) {
				sz = -50;
				for (int index5 = 0; index5 < (int) (100); index5++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) 66, (int) (z + sz)))).getBlock() == Blocks.AIR) {
						{
							BlockPos _bp = new BlockPos((int) (x + sx), (int) 66, (int) (z + sz));
							BlockState _bs = Blocks.WATER.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					}
					sz = sz + 1;
				}
				sx = sx + 1;
			}
		} else if (SustanabilityProjectModVariables.MapVariables.get(world).waterlevel / 1000 >= 3) {
			sx = -50;
			for (int index6 = 0; index6 < (int) (100); index6++) {
				sz = -50;
				for (int index7 = 0; index7 < (int) (100); index7++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) 65, (int) (z + sz)))).getBlock() == Blocks.AIR) {
						{
							BlockPos _bp = new BlockPos((int) (x + sx), (int) 65, (int) (z + sz));
							BlockState _bs = Blocks.WATER.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					}
					sz = sz + 1;
				}
				sx = sx + 1;
			}
		} else if (SustanabilityProjectModVariables.MapVariables.get(world).waterlevel / 1000 >= 2) {
			sx = -50;
			for (int index8 = 0; index8 < (int) (100); index8++) {
				sz = -50;
				for (int index9 = 0; index9 < (int) (100); index9++) {
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
		} else if (SustanabilityProjectModVariables.MapVariables.get(world).waterlevel / 1000 >= 1) {
			sx = -50;
			for (int index10 = 0; index10 < (int) (100); index10++) {
				sz = -50;
				for (int index11 = 0; index11 < (int) (100); index11++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) 63, (int) (z + sz)))).getBlock() == Blocks.AIR) {
						{
							BlockPos _bp = new BlockPos((int) (x + sx), (int) 63, (int) (z + sz));
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
