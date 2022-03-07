
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

import net.mcreator.sustanabilityproject.block.OilBlock;
import net.mcreator.sustanabilityproject.block.ModernWindmillTopBlock;
import net.mcreator.sustanabilityproject.block.ModernWindmillBaseBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SustanabilityProjectModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block MODERN_WINDMILL_BASE = register(new ModernWindmillBaseBlock());
	public static final Block MODERN_WINDMILL_TOP = register(new ModernWindmillTopBlock());
	public static final Block OIL = register(new OilBlock());

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
			ModernWindmillBaseBlock.registerRenderLayer();
			ModernWindmillTopBlock.registerRenderLayer();
		}
	}
}
