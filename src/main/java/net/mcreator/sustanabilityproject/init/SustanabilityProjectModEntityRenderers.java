
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sustanabilityproject.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sustanabilityproject.client.renderer.PlaneRenderer;
import net.mcreator.sustanabilityproject.client.renderer.MotorcycleRenderer;
import net.mcreator.sustanabilityproject.client.renderer.CarRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SustanabilityProjectModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SustanabilityProjectModEntities.CAR, CarRenderer::new);
		event.registerEntityRenderer(SustanabilityProjectModEntities.MOTORCYCLE, MotorcycleRenderer::new);
		event.registerEntityRenderer(SustanabilityProjectModEntities.PLANE, PlaneRenderer::new);
	}
}
