package net.mcreator.sustanabilityproject.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.sustanabilityproject.init.SustanabilityProjectModBlocks;

public class ModernWindmillBaseUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (SustanabilityProjectModBlocks.MODERN_WINDMILL_TOP == (world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock()) {
			if (SustanabilityProjectModBlocks.MODERN_WINDMILL_MIDDLE == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
					.getBlock()) {
				if (5000 >= new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "windenergy")) {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("windenergy", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "windenergy") + 2));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}
