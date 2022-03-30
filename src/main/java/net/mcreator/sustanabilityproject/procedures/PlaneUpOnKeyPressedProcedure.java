package net.mcreator.sustanabilityproject.procedures;

import net.minecraft.world.entity.Entity;

public class PlaneUpOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("wpressed", (true));
	}
}
