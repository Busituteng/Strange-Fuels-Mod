
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemGasolinebottle;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelGasoline2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelGasoline2(ElementsStrangeFuelsMod instance) {
		super(instance, 449);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemGasolinebottle.block, (int) (1)).getItem())
			return 20000;
		return 0;
	}
}
