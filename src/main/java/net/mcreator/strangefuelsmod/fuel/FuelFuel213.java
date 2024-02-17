
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemFuelsbread;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel213 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel213(ElementsStrangeFuelsMod instance) {
		super(instance, 337);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemFuelsbread.block, (int) (1)).getItem())
			return 1000;
		return 0;
	}
}
