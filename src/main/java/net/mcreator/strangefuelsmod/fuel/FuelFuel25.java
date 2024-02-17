
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel25 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel25(ElementsStrangeFuelsMod instance) {
		super(instance, 25);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.STICKY_PISTON, (int) (1)).getItem())
			return 1300;
		return 0;
	}
}
