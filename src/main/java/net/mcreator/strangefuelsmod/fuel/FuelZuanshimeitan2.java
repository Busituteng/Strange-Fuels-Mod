
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemZuanshimeitan;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelZuanshimeitan2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelZuanshimeitan2(ElementsStrangeFuelsMod instance) {
		super(instance, 235);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemZuanshimeitan.block, (int) (1)).getItem())
			return 1846400;
		return 0;
	}
}
