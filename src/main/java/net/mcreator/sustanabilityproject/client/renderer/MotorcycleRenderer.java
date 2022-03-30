package net.mcreator.sustanabilityproject.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sustanabilityproject.entity.MotorcycleEntity;
import net.mcreator.sustanabilityproject.client.model.Modelmotorcycle;

public class MotorcycleRenderer extends MobRenderer<MotorcycleEntity, Modelmotorcycle<MotorcycleEntity>> {
	public MotorcycleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmotorcycle(context.bakeLayer(Modelmotorcycle.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(MotorcycleEntity entity) {
		return new ResourceLocation("sustanability_project:textures/motorcycle.png");
	}
}
