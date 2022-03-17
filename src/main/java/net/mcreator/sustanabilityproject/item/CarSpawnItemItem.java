
package net.mcreator.sustanabilityproject.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.sustanabilityproject.procedures.CarSpawnItemRightClickedInAirProcedure;
import net.mcreator.sustanabilityproject.init.SustanabilityProjectModTabs;

public class CarSpawnItemItem extends Item {
	public CarSpawnItemItem() {
		super(new Item.Properties().tab(SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("car_spawn_item");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CarSpawnItemRightClickedInAirProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
