
package net.mcreator.sustanabilityproject.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.sustanabilityproject.world.inventory.Gui1Menu;
import net.mcreator.sustanabilityproject.network.Gui1ButtonMessage;
import net.mcreator.sustanabilityproject.SustanabilityProjectMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Gui1Screen extends AbstractContainerScreen<Gui1Menu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Gui1Screen(Gui1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 414;
		this.imageHeight = 226;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("sustanability_project:textures/gui_1.png");

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
		this.font.draw(poseStack, "Welcome to", 89, 10, -12829636);
		this.font.draw(poseStack, "Environmentally Aware", 152, 10, -16777012);
		this.font.draw(poseStack, "Minecraft!", 269, 10, -12829636);
		this.font.draw(poseStack, "In this verison of Minecraft, you have to be very careful about your ", 35, 37, -12829636);
		this.font.draw(poseStack, "surroundings. Everything you do in the real world affects our environment,", 17, 55, -12829636);
		this.font.draw(poseStack, "so everything you do in this game affects your environment as well.", 26, 73, -12829636);
		this.font.draw(poseStack, "Everything you do from lighting a fire to killing a cow can cause Carbon", 17, 109, -12829636);
		this.font.draw(poseStack, " Dioxide Gas to leak into the atmosphere, keeping heat from the sun", 26, 127, -12829636);
		this.font.draw(poseStack, " inside the world's atmosphere, causing the world's ice caps to melt", 26, 145, -12829636);
		this.font.draw(poseStack, "and in turn raising the sea level for the world.", 71, 163, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 341, this.topPos + 181, 46, 20, new TextComponent("Next"), e -> {
			if (true) {
				SustanabilityProjectMod.PACKET_HANDLER.sendToServer(new Gui1ButtonMessage(0, x, y, z));
				Gui1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
