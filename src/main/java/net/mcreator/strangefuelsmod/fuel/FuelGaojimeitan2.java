
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemGaojimeitan;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelGaojimeitan2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelGaojimeitan2(ElementsStrangeFuelsMod instance) {
		super(instance, 226);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemGaojimeitan.block, (int) (1)).getItem())
			return 57800;
		return 0;
	}
}
