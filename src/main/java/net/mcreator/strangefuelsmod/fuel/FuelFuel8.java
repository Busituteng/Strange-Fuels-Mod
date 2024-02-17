
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel8 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel8(ElementsStrangeFuelsMod instance) {
		super(instance, 8);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.MAGMA, (int) (1)).getItem())
			return 6400;
		return 0;
	}
}
