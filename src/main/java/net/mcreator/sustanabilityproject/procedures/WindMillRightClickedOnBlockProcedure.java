package net.mcreator.sustanabilityproject.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.sustanabilityproject.init.SustanabilityProjectModBlocks;

public class WindMillRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), SustanabilityProjectModBlocks.MODERN_WINDMILL_BASE.defaultBlockState(), 3);
		world.setBlock(new BlockPos((int) x, (int) (y + 3), (int) z), SustanabilityProjectModBlocks.MODERN_WINDMILL_TOP.defaultBlockState(), 3);
		((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
	}
}
