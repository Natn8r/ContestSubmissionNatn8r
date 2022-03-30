package net.mcreator.sustanabilityproject.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.sustanabilityproject.init.SustanabilityProjectModItems;
import net.mcreator.sustanabilityproject.entity.PlaneEntity;
import net.mcreator.sustanabilityproject.entity.MotorcycleEntity;
import net.mcreator.sustanabilityproject.entity.CarEntity;

import java.util.stream.Collectors;
import java.util.function.Supplier;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class CarRefuelProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof CarEntity || entityiterator instanceof MotorcycleEntity || entityiterator instanceof PlaneEntity) {
					if (SustanabilityProjectModItems.SMALL_BATTERY == (entity instanceof ServerPlayer _plrSlotItem
							&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
									? ((Slot) _slt.get(0)).getItem()
									: ItemStack.EMPTY).getItem()) {
						while (!(1999 == ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).getDamageValue())) {
							((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY))
											.setDamageValue((int) (((entity instanceof ServerPlayer _plrSlotItem
													&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
															? ((Slot) _slt.get(0)).getItem()
															: ItemStack.EMPTY)).getDamageValue()
													+ 1));
							entityiterator.getPersistentData().putDouble("energy1", (entityiterator.getPersistentData().getDouble("energy1") + 1));
						}
					}
					if (SustanabilityProjectModItems.BATTERY == (entity instanceof ServerPlayer _plrSlotItem
							&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
									? ((Slot) _slt.get(0)).getItem()
									: ItemStack.EMPTY).getItem()) {
						while (!(19999 == ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).getDamageValue())) {
							((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY))
											.setDamageValue((int) (((entity instanceof ServerPlayer _plrSlotItem
													&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
															? ((Slot) _slt.get(0)).getItem()
															: ItemStack.EMPTY)).getDamageValue()
													+ 1));
							entityiterator.getPersistentData().putDouble("energy1", (entityiterator.getPersistentData().getDouble("energy1") + 1));
						}
					}
					if (SustanabilityProjectModItems.INDUSTRIAL_BATTERY == (entity instanceof ServerPlayer _plrSlotItem
							&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
									? ((Slot) _slt.get(0)).getItem()
									: ItemStack.EMPTY).getItem()) {
						while (!(99999 == ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).getDamageValue())) {
							((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY))
											.setDamageValue((int) (((entity instanceof ServerPlayer _plrSlotItem
													&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
															? ((Slot) _slt.get(0)).getItem()
															: ItemStack.EMPTY)).getDamageValue()
													+ 1));
							entityiterator.getPersistentData().putDouble("energy1", (entityiterator.getPersistentData().getDouble("energy1") + 1));
						}
					}
					if (SustanabilityProjectModItems.JERRY_CAN == (entity instanceof ServerPlayer _plrSlotItem
							&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
									? ((Slot) _slt.get(0)).getItem()
									: ItemStack.EMPTY).getItem()) {
						entityiterator.getPersistentData().putDouble("energy1", (entityiterator.getPersistentData().getDouble("energy1") + 500));
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get()instanceof Map _slots) {
							((Slot) _slots.get(0)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
			}
		}
	}
}
