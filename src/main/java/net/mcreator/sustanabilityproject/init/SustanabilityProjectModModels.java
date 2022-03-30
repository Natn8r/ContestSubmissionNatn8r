
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sustanabilityproject.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sustanabilityproject.client.model.Modelmotorcycle;
import net.mcreator.sustanabilityproject.client.model.Modelcar;
import net.mcreator.sustanabilityproject.client.model.ModelPlane;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SustanabilityProjectModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmotorcycle.LAYER_LOCATION, Modelmotorcycle::createBodyLayer);
		event.registerLayerDefinition(ModelPlane.LAYER_LOCATION, ModelPlane::createBodyLayer);
		event.registerLayerDefinition(Modelcar.LAYER_LOCATION, Modelcar::createBodyLayer);
	}
}
