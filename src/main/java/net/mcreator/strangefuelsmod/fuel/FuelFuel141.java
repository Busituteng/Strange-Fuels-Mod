
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel141 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel141(ElementsStrangeFuelsMod instance) {
		super(instance, 141);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.GOLDEN_APPLE, (int) (1), 1).getItem()
				&& fuel.getMetadata() == new ItemStack(Items.GOLDEN_APPLE, (int) (1), 1).getMetadata())
			return 576000;
		return 0;
	}
}
