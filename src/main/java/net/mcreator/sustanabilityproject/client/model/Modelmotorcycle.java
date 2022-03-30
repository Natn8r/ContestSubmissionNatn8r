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
public class Modelmotorcycle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sustanability_project", "modelmotorcycle"),
			"main");
	public final ModelPart bb_main;

	public Modelmotorcycle(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(23, 15).addBox(-2.0F, -14.0F, -21.0F, 4.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -14.0F, 4.0F, 4.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(23, 0)
						.addBox(-3.0F, -18.7983F, 7.6455F, 6.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(50, 52)
						.addBox(-2.0F, -19.4695F, -16.1535F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(65, 16)
						.addBox(-2.5F, -11.0F, 7.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(25, 64)
						.addBox(-2.5F, -11.0F, -18.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 29).addBox(-3.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2518F, -28.941F, -7.9834F, -0.2686F, -0.4265F, 0.1367F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 34).addBox(-4.5F, -26.0F, -0.5F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.1378F, -4.8591F, -14.3512F, -0.2446F, 0.4726F, -0.1114F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(46, 16).addBox(-4.5F, -26.0F, -0.5F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -5.0F, -15.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(52, 67).addBox(-2.0F, -0.75F, -1.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.7126F, -21.5351F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(46, 0).addBox(-3.0F, 1.25F, -7.0F, 6.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -20.8467F, -1.704F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(65, 33).addBox(-3.0F, 2.5F, -0.675F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.7762F, 1.7441F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(29, 47).addBox(3.5F, -2.5F, -28.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-2.5F, -2.5F, -28.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(4.5F, -1.5F, -19.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(42, 26).addBox(-1.5F, -1.5F, -19.0F, 2.0F,
								2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -6.5F, 13.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -22.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-0.5F, -17.0F, -0.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 69)
						.addBox(3.5F, -17.0F, -0.5F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 69).addBox(-2.5F, -17.0F, -0.5F, 2.0F,
								18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -7.0F, -14.5F, -0.2182F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
