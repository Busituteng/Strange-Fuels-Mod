
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel64 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel64(ElementsStrangeFuelsMod instance) {
		super(instance, 64);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.DAYLIGHT_DETECTOR, (int) (1)).getItem())
			return 900;
		return 0;
	}
}
