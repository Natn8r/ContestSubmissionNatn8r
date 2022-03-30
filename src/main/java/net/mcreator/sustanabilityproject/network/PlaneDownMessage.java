
package net.mcreator.sustanabilityproject.network;

import net.minecraftforge.fmllegacy.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.sustanabilityproject.procedures.PlaneDownOnKeyReleasedProcedure;
import net.mcreator.sustanabilityproject.procedures.PlaneDownOnKeyPressedProcedure;
import net.mcreator.sustanabilityproject.SustanabilityProjectMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PlaneDownMessage {
	int type, pressedms;

	public PlaneDownMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public PlaneDownMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(PlaneDownMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(PlaneDownMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			PlaneDownOnKeyPressedProcedure.execute(entity);
		}
		if (type == 1) {

			PlaneDownOnKeyReleasedProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		SustanabilityProjectMod.addNetworkMessage(PlaneDownMessage.class, PlaneDownMessage::buffer, PlaneDownMessage::new, PlaneDownMessage::handler);
	}
}
