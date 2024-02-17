
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemPowerstone;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel214 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel214(ElementsStrangeFuelsMod instance) {
		super(instance, 338);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemPowerstone.block, (int) (1)).getItem())
			return 20000;
		return 0;
	}
}
