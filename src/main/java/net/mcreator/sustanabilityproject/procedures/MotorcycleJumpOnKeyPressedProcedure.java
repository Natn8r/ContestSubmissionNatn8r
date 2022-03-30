package net.mcreator.sustanabilityproject.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.sustanabilityproject.entity.MotorcycleEntity;

public class MotorcycleJumpOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getVehicle()) instanceof MotorcycleEntity) {
			if ((entity.getVehicle()).isOnGround()) {
				entity.setDeltaMovement(0, 1, 0);
			}
		}
	}
}
