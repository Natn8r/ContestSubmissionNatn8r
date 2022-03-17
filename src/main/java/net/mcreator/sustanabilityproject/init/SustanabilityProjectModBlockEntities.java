
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sustanabilityproject.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.sustanabilityproject.block.entity.Oldwindmilltop4BlockEntity;
import net.mcreator.sustanabilityproject.block.entity.Oldwindmilltop2BlockEntity;
import net.mcreator.sustanabilityproject.block.entity.Oldwindmilltop1BlockEntity;
import net.mcreator.sustanabilityproject.block.entity.OldwindmillbottomBlockEntity;
import net.mcreator.sustanabilityproject.block.entity.OldWindmilltop3BlockEntity;
import net.mcreator.sustanabilityproject.block.entity.ModernWindmillTopBlockEntity;
import net.mcreator.sustanabilityproject.block.entity.ModernWindmillBaseBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SustanabilityProjectModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> MODERN_WINDMILL_TOP = register("sustanability_project:modern_windmill_top",
			SustanabilityProjectModBlocks.MODERN_WINDMILL_TOP, ModernWindmillTopBlockEntity::new);
	public static final BlockEntityType<?> MODERN_WINDMILL_BASE = register("sustanability_project:modern_windmill_base",
			SustanabilityProjectModBlocks.MODERN_WINDMILL_BASE, ModernWindmillBaseBlockEntity::new);
	public static final BlockEntityType<?> OLDWINDMILLTOP_1 = register("sustanability_project:oldwindmilltop_1",
			SustanabilityProjectModBlocks.OLDWINDMILLTOP_1, Oldwindmilltop1BlockEntity::new);
	public static final BlockEntityType<?> OLDWINDMILLBOTTOM = register("sustanability_project:oldwindmillbottom",
			SustanabilityProjectModBlocks.OLDWINDMILLBOTTOM, OldwindmillbottomBlockEntity::new);
	public static final BlockEntityType<?> OLDWINDMILLTOP_2 = register("sustanability_project:oldwindmilltop_2",
			SustanabilityProjectModBlocks.OLDWINDMILLTOP_2, Oldwindmilltop2BlockEntity::new);
	public static final BlockEntityType<?> OLD_WINDMILLTOP_3 = register("sustanability_project:old_windmilltop_3",
			SustanabilityProjectModBlocks.OLD_WINDMILLTOP_3, OldWindmilltop3BlockEntity::new);
	public static final BlockEntityType<?> OLDWINDMILLTOP_4 = register("sustanability_project:oldwindmilltop_4",
			SustanabilityProjectModBlocks.OLDWINDMILLTOP_4, Oldwindmilltop4BlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
