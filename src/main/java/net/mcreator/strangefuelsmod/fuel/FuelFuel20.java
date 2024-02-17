
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel20 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel20(ElementsStrangeFuelsMod instance) {
		super(instance, 20);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.BED, (int) (1)).getItem())
			return 1200;
		return 0;
	}
}
