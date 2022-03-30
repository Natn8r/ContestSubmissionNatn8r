
package net.mcreator.sustanabilityproject.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sustanabilityproject.init.SustanabilityProjectModItems;
import net.mcreator.sustanabilityproject.init.SustanabilityProjectModFluids;
import net.mcreator.sustanabilityproject.init.SustanabilityProjectModBlocks;

public abstract class OilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> SustanabilityProjectModFluids.OIL,
			() -> SustanabilityProjectModFluids.FLOWING_OIL, FluidAttributes.builder(new ResourceLocation("sustanability_project:blocks/oilstand"),
					new ResourceLocation("sustanability_project:blocks/oilflow"))

	).explosionResistance(100f).canMultiply().tickRate(15)

			.bucket(() -> SustanabilityProjectModItems.OIL_BUCKET).block(() -> (LiquidBlock) SustanabilityProjectModBlocks.OIL);

	private OilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends OilFluid {
		public Source() {
			super();
			setRegistryName("oil");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends OilFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_oil");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
