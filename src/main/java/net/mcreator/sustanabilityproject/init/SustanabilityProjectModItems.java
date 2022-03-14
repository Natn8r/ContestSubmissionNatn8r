
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sustanabilityproject.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.sustanabilityproject.item.WindMillItem;
import net.mcreator.sustanabilityproject.item.OldWindMillItemItem;
import net.mcreator.sustanabilityproject.item.OilItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SustanabilityProjectModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MODERN_WINDMILL_BASE = register(SustanabilityProjectModBlocks.MODERN_WINDMILL_BASE, null);
	public static final Item WIND_MILL = register(new WindMillItem());
	public static final Item MODERN_WINDMILL_TOP = register(SustanabilityProjectModBlocks.MODERN_WINDMILL_TOP, null);
	public static final Item OIL_BUCKET = register(new OilItem());
	public static final Item OLDWINDMILLTOP_1 = register(SustanabilityProjectModBlocks.OLDWINDMILLTOP_1, null);
	public static final Item OLDWINDMILLTOP_2 = register(SustanabilityProjectModBlocks.OLDWINDMILLTOP_2, null);
	public static final Item OLD_WINDMILLTOP_3 = register(SustanabilityProjectModBlocks.OLD_WINDMILLTOP_3, null);
	public static final Item OLDWINDMILLTOP_4 = register(SustanabilityProjectModBlocks.OLDWINDMILLTOP_4, null);
	public static final Item OLDWINDMILLBOTTOM = register(SustanabilityProjectModBlocks.OLDWINDMILLBOTTOM,
			SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB);
	public static final Item OLD_WIND_MILL_ITEM = register(new OldWindMillItemItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
