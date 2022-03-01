
package net.mcreator.sustanabilityproject.client.gui;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.sustanabilityproject.procedures.ShowCarbonGuide6Procedure;
import net.mcreator.sustanabilityproject.procedures.ShowCarbonGuide5Procedure;
import net.mcreator.sustanabilityproject.procedures.ShowCarbonGuide4Procedure;
import net.mcreator.sustanabilityproject.procedures.ShowCarbonGuide3Procedure;
import net.mcreator.sustanabilityproject.procedures.ShowCarbonGuide2Procedure;
import net.mcreator.sustanabilityproject.procedures.ShowCarbonGuide1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class CarbonGuide1Overlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			Level _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.level;
				_x = entity.getX();
				_y = entity.getY();
				_z = entity.getZ();
			}
			Level world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.enableBlend();
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.setShaderColor(1, 1, 1, 1);
			if (true) {
				if (ShowCarbonGuide1Procedure.execute(world)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/level1.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 93, posY + 100, 0, 0, 16, 16, 16, 16);
				}
				if (ShowCarbonGuide2Procedure.execute(world)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/level2.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 93, posY + 99, 0, 0, 16, 16, 16, 16);
				}
				if (ShowCarbonGuide3Procedure.execute(world)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/level3.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 93, posY + 99, 0, 0, 16, 16, 16, 16);
				}
				if (ShowCarbonGuide4Procedure.execute(world)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/level4.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 93, posY + 99, 0, 0, 16, 16, 16, 16);
				}
				if (ShowCarbonGuide5Procedure.execute(world)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/level5.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 93, posY + 99, 0, 0, 16, 16, 16, 16);
				}
				if (ShowCarbonGuide6Procedure.execute(world)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("sustanability_project:textures/level6.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 93, posY + 99, 0, 0, 16, 16, 16, 16);
				}
			}
			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}
}
