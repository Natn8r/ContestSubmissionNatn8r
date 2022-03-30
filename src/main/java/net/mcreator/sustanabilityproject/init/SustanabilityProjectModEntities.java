
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sustanabilityproject.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.sustanabilityproject.entity.PlaneEntity;
import net.mcreator.sustanabilityproject.entity.MotorcycleEntity;
import net.mcreator.sustanabilityproject.entity.CarEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SustanabilityProjectModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<CarEntity> CAR = register("car", EntityType.Builder.<CarEntity>of(CarEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CarEntity::new).sized(3f, 1.8f));
	public static final EntityType<MotorcycleEntity> MOTORCYCLE = register("motorcycle",
			EntityType.Builder.<MotorcycleEntity>of(MotorcycleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MotorcycleEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<PlaneEntity> PLANE = register("plane", EntityType.Builder.<PlaneEntity>of(PlaneEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlaneEntity::new).sized(3f, 3f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CarEntity.init();
			MotorcycleEntity.init();
			PlaneEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CAR, CarEntity.createAttributes().build());
		event.put(MOTORCYCLE, MotorcycleEntity.createAttributes().build());
		event.put(PLANE, PlaneEntity.createAttributes().build());
	}
}
