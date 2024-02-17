
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemOccultpearl;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel216 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel216(ElementsStrangeFuelsMod instance) {
		super(instance, 340);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemOccultpearl.block, (int) (1)).getItem())
			return 100000;
		return 0;
	}
}
