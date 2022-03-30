
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sustanabilityproject.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.sustanabilityproject.client.gui.WindmillGuiScreen;
import net.mcreator.sustanabilityproject.client.gui.VehicleGuiScreen;
import net.mcreator.sustanabilityproject.client.gui.OilGuiScreen;
import net.mcreator.sustanabilityproject.client.gui.Gui2Screen;
import net.mcreator.sustanabilityproject.client.gui.Gui1Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SustanabilityProjectModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SustanabilityProjectModMenus.GUI_1, Gui1Screen::new);
			MenuScreens.register(SustanabilityProjectModMenus.GUI_2, Gui2Screen::new);
			MenuScreens.register(SustanabilityProjectModMenus.WINDMILL_GUI, WindmillGuiScreen::new);
			MenuScreens.register(SustanabilityProjectModMenus.VEHICLE_GUI, VehicleGuiScreen::new);
			MenuScreens.register(SustanabilityProjectModMenus.OIL_GUI, OilGuiScreen::new);
		});
	}
}
