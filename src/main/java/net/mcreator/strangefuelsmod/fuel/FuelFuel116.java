
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel116 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel116(ElementsStrangeFuelsMod instance) {
		super(instance, 116);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.NAME_TAG, (int) (1)).getItem())
			return 200;
		return 0;
	}
}
