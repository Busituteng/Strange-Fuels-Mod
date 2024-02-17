
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemNinethfuel;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelNinethfuel2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelNinethfuel2(ElementsStrangeFuelsMod instance) {
		super(instance, 408);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemNinethfuel.block, (int) (1)).getItem())
			return 199800;
		return 0;
	}
}
