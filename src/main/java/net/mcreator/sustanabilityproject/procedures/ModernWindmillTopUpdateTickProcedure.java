package net.mcreator.sustanabilityproject.procedures;

import net.minecraftforge.fmllegacy.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.BlockPos;
import net.minecraft.Util;

import net.mcreator.sustanabilityproject.init.SustanabilityProjectModBlocks;

public class ModernWindmillTopUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().broadcastMessage(new TextComponent("updatetop"), ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (SustanabilityProjectModBlocks.MODERN_WINDMILL_BASE == (world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock()) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
	}
}
