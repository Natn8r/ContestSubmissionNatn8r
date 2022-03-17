
package net.mcreator.sustanabilityproject.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.sustanabilityproject.procedures.BatteryItemIsCraftedsmeltedProcedure;
import net.mcreator.sustanabilityproject.init.SustanabilityProjectModTabs;

import java.util.List;

public class BatteryItem extends Item {
	public BatteryItem() {
		super(new Item.Properties().tab(SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB).durability(20000).rarity(Rarity.COMMON));
		setRegistryName("battery");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Can hold up to 20000 Energy Points"));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		BatteryItemIsCraftedsmeltedProcedure.execute(itemstack);
	}
}
