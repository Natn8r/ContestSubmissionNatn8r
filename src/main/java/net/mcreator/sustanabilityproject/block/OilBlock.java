
package net.mcreator.sustanabilityproject.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.sustanabilityproject.init.SustanabilityProjectModFluids;

public class OilBlock extends LiquidBlock {
	public OilBlock() {
		super(SustanabilityProjectModFluids.OIL, BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_BLACK).strength(100f)

		);
		setRegistryName("oil");
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 30;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
