
package net.mcreator.sustanabilityproject.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.sustanabilityproject.init.SustanabilityProjectModTabs;
import net.mcreator.sustanabilityproject.init.SustanabilityProjectModFluids;

public class OilItem extends BucketItem {
	public OilItem() {
		super(() -> SustanabilityProjectModFluids.OIL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON)
				.tab(SustanabilityProjectModTabs.TAB_EVIRONMENTAL_MOD_TAB));
		setRegistryName("oil_bucket");
	}
}
