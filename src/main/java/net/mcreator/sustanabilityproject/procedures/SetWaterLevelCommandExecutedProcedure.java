package net.mcreator.sustanabilityproject.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.sustanabilityproject.network.SustanabilityProjectModVariables;

import java.util.HashMap;

public class SetWaterLevelCommandExecutedProcedure {
	public static void execute(LevelAccessor world, HashMap cmdparams) {
		if (cmdparams == null)
			return;
		String param1 = "";
		param1 = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
		SustanabilityProjectModVariables.MapVariables.get(world).waterlevel = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(param1);
		SustanabilityProjectModVariables.MapVariables.get(world).syncData(world);
	}
}
