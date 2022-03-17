package net.mcreator.sustanabilityproject.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.sustanabilityproject.init.SustanabilityProjectModItems;

import java.util.function.Supplier;
import java.util.Map;

public class CarRefuelProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (SustanabilityProjectModItems.SMALL_BATTERY == (entity instanceof ServerPlayer _plrSlotItem
				&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
						? ((Slot) _slt.get(0)).getItem()
						: ItemStack.EMPTY).getItem()) {
			while (!(1 == ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).getDamageValue())) {
				((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).setDamageValue(
								(int) (((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
										&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).getDamageValue() + 1));
			}
		}
		if (SustanabilityProjectModItems.BATTERY == (entity instanceof ServerPlayer _plrSlotItem
				&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
						? ((Slot) _slt.get(0)).getItem()
						: ItemStack.EMPTY).getItem()) {
			while (!(1 == ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).getDamageValue())) {
				((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).setDamageValue(
								(int) (((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
										&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).getDamageValue() + 1));
			}
		}
		if (SustanabilityProjectModItems.INDUSTRIAL_BATTERY == (entity instanceof ServerPlayer _plrSlotItem
				&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
						? ((Slot) _slt.get(0)).getItem()
						: ItemStack.EMPTY).getItem()) {
			while (!(1 == ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).getDamageValue())) {
				((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).setDamageValue(
								(int) (((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
										&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).getDamageValue() + 1));
			}
		}
	}
}
