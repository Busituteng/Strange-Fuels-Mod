
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel140 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel140(ElementsStrangeFuelsMod instance) {
		super(instance, 140);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.GOLDEN_APPLE, (int) (1), 0).getItem()
				&& fuel.getMetadata() == new ItemStack(Items.GOLDEN_APPLE, (int) (1), 0).getMetadata())
			return 64000;
		return 0;
	}
}
