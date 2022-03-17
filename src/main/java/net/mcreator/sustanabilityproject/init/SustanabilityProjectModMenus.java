
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sustanabilityproject.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.sustanabilityproject.world.inventory.WindmillGuiMenu;
import net.mcreator.sustanabilityproject.world.inventory.VehicleGuiMenu;
import net.mcreator.sustanabilityproject.world.inventory.Gui2Menu;
import net.mcreator.sustanabilityproject.world.inventory.Gui1Menu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SustanabilityProjectModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<Gui1Menu> GUI_1 = register("gui_1", (id, inv, extraData) -> new Gui1Menu(id, inv, extraData));
	public static final MenuType<Gui2Menu> GUI_2 = register("gui_2", (id, inv, extraData) -> new Gui2Menu(id, inv, extraData));
	public static final MenuType<WindmillGuiMenu> WINDMILL_GUI = register("windmill_gui",
			(id, inv, extraData) -> new WindmillGuiMenu(id, inv, extraData));
	public static final MenuType<VehicleGuiMenu> VEHICLE_GUI = register("vehicle_gui",
			(id, inv, extraData) -> new VehicleGuiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
