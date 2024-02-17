
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel138 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel138(ElementsStrangeFuelsMod instance) {
		super(instance, 138);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.BOAT, (int) (1)).getItem())
			return 1500;
		return 0;
	}
}
