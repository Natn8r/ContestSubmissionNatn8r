
package net.mcreator.sustanabilityproject.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.sustanabilityproject.init.SustanabilityProjectModTabs;

import java.util.List;

public class JerryCanItem extends Item {
	public JerryCanItem() {
		super(new Item.Properties().tab(SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("jerry_can");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Can hold 100 oil energy points"));
	}
}
