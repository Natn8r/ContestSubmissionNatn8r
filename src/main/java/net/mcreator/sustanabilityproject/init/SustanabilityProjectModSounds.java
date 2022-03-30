
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sustanabilityproject.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SustanabilityProjectModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("sustanability_project", "car-horn"),
				new SoundEvent(new ResourceLocation("sustanability_project", "car-horn")));
		REGISTRY.put(new ResourceLocation("sustanability_project", "failed-ignition"),
				new SoundEvent(new ResourceLocation("sustanability_project", "failed-ignition")));
		REGISTRY.put(new ResourceLocation("sustanability_project", "idle-car-loop"),
				new SoundEvent(new ResourceLocation("sustanability_project", "idle-car-loop")));
		REGISTRY.put(new ResourceLocation("sustanability_project", "car-ignition"),
				new SoundEvent(new ResourceLocation("sustanability_project", "car-ignition")));
		REGISTRY.put(new ResourceLocation("sustanability_project", "motorcycle-idle-loop"),
				new SoundEvent(new ResourceLocation("sustanability_project", "motorcycle-idle-loop")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
