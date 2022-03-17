package net.mcreator.sustanabilityproject.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.0-beta.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcar<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sustanability_project", "modelcar"), "main");
	public final ModelPart bb_main;

	public Modelcar(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(3, 168).addBox(-14.0F, 5.75F, 20.475F, 28.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -27.5F, 13.5F, -2.7925F, 0.0F, 3.1416F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 61).addBox(-14.0F, -22.0F, 31.0F, 28.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 74)
						.addBox(-14.0F, -22.0F, -27.0F, 28.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 90)
						.addBox(-14.0F, -22.0F, 10.0F, 28.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -21.5F, 8.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(-10.0F, -24.5F, 7.0F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 74)
						.addBox(-14.0F, -25.0F, -8.0F, 28.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(61, 61)
						.addBox(-14.0F, -15.0F, -5.0F, 28.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(113, 0)
						.addBox(-14.0F, -22.0F, -26.0F, 28.0F, 10.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(-15.0F, -22.0F, -27.0F, 1.0F, 14.0F, 59.0F, new CubeDeformation(0.0F)).texOffs(61, 75)
						.addBox(14.0F, -22.0F, -27.0F, 1.0F, 14.0F, 59.0F, new CubeDeformation(0.0F)).texOffs(113, 28)
						.addBox(-14.0F, -22.0F, 13.0F, 28.0F, 10.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(15.0F, -14.0F, -24.0F, 2.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(16, 12)
						.addBox(15.0F, -14.0F, 10.0F, 2.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-17.0F, -14.0F, -24.0F, 2.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-14.0F, -12.0F, -26.0F, 28.0F, 4.0F, 57.0F, new CubeDeformation(0.0F)).texOffs(0, 88)
						.addBox(-17.0F, -14.0F, 10.0F, 2.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 4).addBox(-9.0F, -19.5F, 3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 4)
						.addBox(-5.0F, -19.5F, 3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, 2.6616F, 0.0F, -3.1416F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
