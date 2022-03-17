
package net.mcreator.sustanabilityproject.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.sustanabilityproject.procedures.SmallBatteryItemIsCraftedsmeltedProcedure;
import net.mcreator.sustanabilityproject.init.SustanabilityProjectModTabs;

import java.util.List;

public class SmallBatteryItem extends Item {
	public SmallBatteryItem() {
		super(new Item.Properties().tab(SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB).durability(2000).rarity(Rarity.COMMON));
		setRegistryName("small_battery");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Can hold up to 2000 Energy Points"));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		SmallBatteryItemIsCraftedsmeltedProcedure.execute(itemstack);
	}
}
