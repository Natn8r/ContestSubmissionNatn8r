
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

import net.mcreator.sustanabilityproject.item.SmallBatteryItem;
import net.mcreator.sustanabilityproject.item.OilItem;
import net.mcreator.sustanabilityproject.item.IndustrialBatteryItem;
import net.mcreator.sustanabilityproject.item.DrillItem;
import net.mcreator.sustanabilityproject.item.CarSpawnItemItem;
import net.mcreator.sustanabilityproject.item.BatteryItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SustanabilityProjectModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MODERN_WINDMILL_TOP = register(SustanabilityProjectModBlocks.MODERN_WINDMILL_TOP,
			SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB);
	public static final Item MODERN_WINDMILL_BASE = register(SustanabilityProjectModBlocks.MODERN_WINDMILL_BASE,
			SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB);
	public static final Item MODERN_WINDMILL_MIDDLE = register(SustanabilityProjectModBlocks.MODERN_WINDMILL_MIDDLE,
			SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB);
	public static final Item OLDWINDMILLTOP_1 = register(SustanabilityProjectModBlocks.OLDWINDMILLTOP_1,
			SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB);
	public static final Item OLDWINDMILLBOTTOM = register(SustanabilityProjectModBlocks.OLDWINDMILLBOTTOM,
			SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB);
	public static final Item OLD_WINDMILL_MIDDLE = register(SustanabilityProjectModBlocks.OLD_WINDMILL_MIDDLE,
			SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB);
	public static final Item OIL_BUCKET = register(new OilItem());
	public static final Item SMALL_BATTERY = register(new SmallBatteryItem());
	public static final Item BATTERY = register(new BatteryItem());
	public static final Item INDUSTRIAL_BATTERY = register(new IndustrialBatteryItem());
	public static final Item DRILL = register(new DrillItem());
	public static final Item CAR_SPAWN_ITEM = register(new CarSpawnItemItem());
	public static final Item OLDWINDMILLTOP_2 = register(SustanabilityProjectModBlocks.OLDWINDMILLTOP_2, null);
	public static final Item OLD_WINDMILLTOP_3 = register(SustanabilityProjectModBlocks.OLD_WINDMILLTOP_3, null);
	public static final Item OLDWINDMILLTOP_4 = register(SustanabilityProjectModBlocks.OLDWINDMILLTOP_4, null);

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
