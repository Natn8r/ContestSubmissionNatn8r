
package net.mcreator.sustanabilityproject.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.sustanabilityproject.procedures.IndustrialBatteryItemIsCraftedsmeltedProcedure;
import net.mcreator.sustanabilityproject.init.SustanabilityProjectModTabs;

import java.util.List;

public class IndustrialBatteryItem extends Item {
	public IndustrialBatteryItem() {
		super(new Item.Properties().tab(SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB).durability(100000).rarity(Rarity.COMMON));
		setRegistryName("industrial_battery");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Can hold up to 100000 Energy Points"));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		IndustrialBatteryItemIsCraftedsmeltedProcedure.execute(itemstack);
	}
}
