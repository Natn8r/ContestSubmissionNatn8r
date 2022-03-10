
package net.mcreator.sustanabilityproject.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.sustanabilityproject.world.inventory.WindmillGuiMenu;
import net.mcreator.sustanabilityproject.procedures.WindmillGui7Procedure;
import net.mcreator.sustanabilityproject.procedures.WindmillGui6Procedure;
import net.mcreator.sustanabilityproject.procedures.WindmillGui5Procedure;
import net.mcreator.sustanabilityproject.procedures.WindmillGui4Procedure;
import net.mcreator.sustanabilityproject.procedures.WindmillGui3Procedure;
import net.mcreator.sustanabilityproject.procedures.WindmillGui2Procedure;
import net.mcreator.sustanabilityproject.procedures.WindmillGui1Procedure;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class WindmillGuiScreen extends AbstractContainerScreen<WindmillGuiMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public WindmillGuiScreen(WindmillGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("sustanability_project:textures/windmill_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (WindmillGui1Procedure.execute(world, entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/one.png"));
			this.blit(ms, this.leftPos + 15, this.topPos + 34, 0, 0, 32, 32, 32, 32);
		}
		if (WindmillGui2Procedure.execute(world, entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/two.png"));
			this.blit(ms, this.leftPos + 15, this.topPos + 34, 0, 0, 32, 32, 32, 32);
		}
		if (WindmillGui3Procedure.execute(world, entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/three.png"));
			this.blit(ms, this.leftPos + 15, this.topPos + 34, 0, 0, 32, 32, 32, 32);
		}
		if (WindmillGui4Procedure.execute(world, entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/four.png"));
			this.blit(ms, this.leftPos + 15, this.topPos + 34, 0, 0, 32, 32, 32, 32);
		}
		if (WindmillGui5Procedure.execute(world, entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/five.png"));
			this.blit(ms, this.leftPos + 15, this.topPos + 34, 0, 0, 32, 32, 32, 32);
		}
		if (WindmillGui6Procedure.execute(world, entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/six.png"));
			this.blit(ms, this.leftPos + 15, this.topPos + 34, 0, 0, 32, 32, 32, 32);
		}
		if (WindmillGui7Procedure.execute(world, entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/seven.png"));
			this.blit(ms, this.leftPos + 15, this.topPos + 34, 0, 0, 32, 32, 32, 32);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Energy:", 15, 16, -16616192);
		this.font.draw(poseStack, "Battery Refuel", 78, 16, -16023552);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
