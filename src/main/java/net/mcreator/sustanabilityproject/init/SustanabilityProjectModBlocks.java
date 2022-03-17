
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sustanabilityproject.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.sustanabilityproject.block.Oldwindmilltop4Block;
import net.mcreator.sustanabilityproject.block.Oldwindmilltop2Block;
import net.mcreator.sustanabilityproject.block.Oldwindmilltop1Block;
import net.mcreator.sustanabilityproject.block.OldwindmillbottomBlock;
import net.mcreator.sustanabilityproject.block.OldWindmilltop3Block;
import net.mcreator.sustanabilityproject.block.OldWindmillMiddleBlock;
import net.mcreator.sustanabilityproject.block.OilBlock;
import net.mcreator.sustanabilityproject.block.ModernWindmillTopBlock;
import net.mcreator.sustanabilityproject.block.ModernWindmillMiddleBlock;
import net.mcreator.sustanabilityproject.block.ModernWindmillBaseBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SustanabilityProjectModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block MODERN_WINDMILL_TOP = register(new ModernWindmillTopBlock());
	public static final Block OIL = register(new OilBlock());
	public static final Block OLDWINDMILLTOP_1 = register(new Oldwindmilltop1Block());
	public static final Block OLDWINDMILLTOP_2 = register(new Oldwindmilltop2Block());
	public static final Block OLD_WINDMILLTOP_3 = register(new OldWindmilltop3Block());
	public static final Block OLDWINDMILLTOP_4 = register(new Oldwindmilltop4Block());
	public static final Block OLDWINDMILLBOTTOM = register(new OldwindmillbottomBlock());
	public static final Block OLD_WINDMILL_MIDDLE = register(new OldWindmillMiddleBlock());
	public static final Block MODERN_WINDMILL_BASE = register(new ModernWindmillBaseBlock());
	public static final Block MODERN_WINDMILL_MIDDLE = register(new ModernWindmillMiddleBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ModernWindmillTopBlock.registerRenderLayer();
			Oldwindmilltop1Block.registerRenderLayer();
			Oldwindmilltop2Block.registerRenderLayer();
			OldWindmilltop3Block.registerRenderLayer();
			Oldwindmilltop4Block.registerRenderLayer();
			OldwindmillbottomBlock.registerRenderLayer();
			OldWindmillMiddleBlock.registerRenderLayer();
			ModernWindmillBaseBlock.registerRenderLayer();
			ModernWindmillMiddleBlock.registerRenderLayer();
		}
	}
}
