
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel75 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel75(ElementsStrangeFuelsMod instance) {
		super(instance, 75);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.WATERLILY, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
