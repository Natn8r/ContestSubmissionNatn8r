package net.mcreator.sustanabilityproject.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sustanabilityproject.entity.PlaneEntity;
import net.mcreator.sustanabilityproject.client.model.ModelPlane;

public class PlaneRenderer extends MobRenderer<PlaneEntity, ModelPlane<PlaneEntity>> {
	public PlaneRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPlane(context.bakeLayer(ModelPlane.LAYER_LOCATION)), 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(PlaneEntity entity) {
		return new ResourceLocation("sustanability_project:textures/plane.png");
	}
}
