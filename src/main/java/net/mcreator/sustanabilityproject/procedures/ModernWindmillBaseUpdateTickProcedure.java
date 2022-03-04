package net.mcreator.sustanabilityproject.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.sustanabilityproject.init.SustanabilityProjectModBlocks;

public class ModernWindmillBaseUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(SustanabilityProjectModBlocks.MODERN_WINDMILL_TOP == (world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock())) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
		}
	}
}
