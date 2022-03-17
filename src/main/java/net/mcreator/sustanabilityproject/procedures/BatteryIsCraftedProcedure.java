package net.mcreator.sustanabilityproject.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.sustanabilityproject.init.SustanabilityProjectModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BatteryIsCraftedProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		Entity entity = event.getPlayer();
		execute(event, event.getCrafting());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (itemstack.getItem() == SustanabilityProjectModItems.BATTERY) {
			(itemstack).setDamageValue((int) ((itemstack).getMaxDamage() - 1));
		}
		if (itemstack.getItem() == SustanabilityProjectModItems.INDUSTRIAL_BATTERY) {
			(itemstack).setDamageValue((int) ((itemstack).getMaxDamage() - 1));
		}
	}
}
