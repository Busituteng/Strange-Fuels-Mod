
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemStarfuel;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelStarfuel2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelStarfuel2(ElementsStrangeFuelsMod instance) {
		super(instance, 258);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemStarfuel.block, (int) (1)).getItem())
			return 123033600;
		return 0;
	}
}
