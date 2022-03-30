package net.mcreator.sustanabilityproject.procedures;

import net.minecraft.world.entity.Entity;

public class PlaneDownOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("spressed", (true));
	}
}
