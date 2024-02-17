
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel212 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel212(ElementsStrangeFuelsMod instance) {
		super(instance, 212);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.CAKE, (int) (1)).getItem())
			return 1200;
		return 0;
	}
}
