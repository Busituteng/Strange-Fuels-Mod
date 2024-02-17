
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel77 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel77(ElementsStrangeFuelsMod instance) {
		super(instance, 77);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.END_ROD, (int) (1)).getItem())
			return 2400;
		return 0;
	}
}
