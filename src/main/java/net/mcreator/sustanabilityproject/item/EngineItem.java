
package net.mcreator.sustanabilityproject.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.sustanabilityproject.init.SustanabilityProjectModTabs;

public class EngineItem extends Item {
	public EngineItem() {
		super(new Item.Properties().tab(SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("engine");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
