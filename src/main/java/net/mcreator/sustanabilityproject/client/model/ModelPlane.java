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
public class ModelPlane<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sustanability_project", "model_plane"),
			"main");
	public final ModelPart body;
	public final ModelPart prop;

	public ModelPlane(ModelPart root) {
		this.body = root.getChild("body");
		this.prop = root.getChild("prop");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 2.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -21.5F, -10.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(118, 166)
						.addBox(-8.0F, -28.0F, 5.0F, 16.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(63, 155)
						.addBox(-8.0F, -14.0F, -4.0F, 16.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(130, 32)
						.addBox(-9.0F, -5.0F, -13.0F, 18.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-8.0F, -10.0F, -24.0F, 16.0F, 2.0F, 42.0F, new CubeDeformation(0.0F)).texOffs(0, 135)
						.addBox(-9.0F, -26.0F, 7.0F, 18.0F, 22.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(124, 138)
						.addBox(-9.0F, -26.0F, -15.0F, 18.0F, 22.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 77)
						.addBox(9.0F, -26.0F, -15.0F, 2.0F, 22.0F, 35.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -5.0F, -3.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(22, 32)
						.addBox(-8.0F, -5.0F, -3.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 77)
						.addBox(-1.0F, -9.0F, 47.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(133, 118)
						.addBox(6.0F, -16.0F, 46.0F, 13.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(63, 135)
						.addBox(-19.0F, -16.0F, 46.0F, 13.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-1.0F, -39.0F, 44.0F, 2.0F, 18.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(79, 32)
						.addBox(-6.0F, -21.0F, 38.0F, 12.0F, 12.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(115, 71)
						.addBox(-9.0F, -24.0F, 20.0F, 18.0F, 18.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(75, 77)
						.addBox(-11.0F, -26.0F, -15.0F, 2.0F, 22.0F, 35.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-51.0F, -8.0F, -14.0F,
								102.0F, 3.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 15)
						.addBox(2.0F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 0).addBox(-2.0F, -0.25F, -0.5F, 4.0F,
								2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -23.0128F, -5.5451F, 0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(164, 159).addBox(-6.0F, -21.0F, -37.0F, 12.0F, 12.0F, 7.0F, new CubeDeformation(0.0F))
						.texOffs(40, 77).addBox(-9.0F, -24.0F, -30.0F, 18.0F, 18.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition prop = partdefinition.addOrReplaceChild("prop", CubeListBuilder.create(), PartPose.offset(0.0F, 7.3785F, -30.81F));
		PartDefinition cube_r4 = prop.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(130, 54).addBox(-18.0F, -1.0F, -0.5F, 36.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.0436F, 0.0F, 0.7854F));
		PartDefinition cube_r5 = prop.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(115, 108).addBox(-18.0F, -1.0F, -0.5F, 36.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, -0.0436F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		body.render(poseStack, buffer, packedLight, packedOverlay);
		prop.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.prop.zRot = ageInTicks;
	}
}
