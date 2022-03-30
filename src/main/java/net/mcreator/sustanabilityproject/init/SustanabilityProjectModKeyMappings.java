
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sustanabilityproject.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fmlclient.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.sustanabilityproject.network.PlaneUpMessage;
import net.mcreator.sustanabilityproject.network.PlaneDownMessage;
import net.mcreator.sustanabilityproject.network.MotorcycleJumpMessage;
import net.mcreator.sustanabilityproject.SustanabilityProjectMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SustanabilityProjectModKeyMappings {
	public static final KeyMapping MOTORCYCLE_JUMP = new KeyMapping("key.sustanability_project.motorcycle_jump", GLFW.GLFW_KEY_SPACE,
			"key.categories.movement");
	public static final KeyMapping PLANE_DOWN = new KeyMapping("key.sustanability_project.plane_down", GLFW.GLFW_KEY_N, "key.categories.movement");
	public static final KeyMapping PLANE_UP = new KeyMapping("key.sustanability_project.plane_up", GLFW.GLFW_KEY_B, "key.categories.movement");
	private static long PLANE_DOWN_LASTPRESS = 0;
	private static long PLANE_UP_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(MOTORCYCLE_JUMP);
		ClientRegistry.registerKeyBinding(PLANE_DOWN);
		ClientRegistry.registerKeyBinding(PLANE_UP);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == MOTORCYCLE_JUMP.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						SustanabilityProjectMod.PACKET_HANDLER.sendToServer(new MotorcycleJumpMessage(0, 0));
						MotorcycleJumpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == PLANE_DOWN.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						SustanabilityProjectMod.PACKET_HANDLER.sendToServer(new PlaneDownMessage(0, 0));
						PlaneDownMessage.pressAction(Minecraft.getInstance().player, 0, 0);
						PLANE_DOWN_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - PLANE_DOWN_LASTPRESS);
						SustanabilityProjectMod.PACKET_HANDLER.sendToServer(new PlaneDownMessage(1, dt));
						PlaneDownMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == PLANE_UP.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						SustanabilityProjectMod.PACKET_HANDLER.sendToServer(new PlaneUpMessage(0, 0));
						PlaneUpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
						PLANE_UP_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - PLANE_UP_LASTPRESS);
						SustanabilityProjectMod.PACKET_HANDLER.sendToServer(new PlaneUpMessage(1, dt));
						PlaneUpMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
			}
		}
	}
}
