package net.mcreator.sustanabilityproject.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sustanabilityproject.entity.CarEntity;
import net.mcreator.sustanabilityproject.client.model.Modelcar;

public class CarRenderer extends MobRenderer<CarEntity, Modelcar<CarEntity>> {
	public CarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcar(context.bakeLayer(Modelcar.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(CarEntity entity) {
		return new ResourceLocation("sustanability_project:textures/car.png");
	}
}
