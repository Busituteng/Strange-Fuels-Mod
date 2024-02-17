
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemYen;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelYen2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelYen2(ElementsStrangeFuelsMod instance) {
		super(instance, 363);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemYen.block, (int) (1)).getItem())
			return 1000;
		return 0;
	}
}
