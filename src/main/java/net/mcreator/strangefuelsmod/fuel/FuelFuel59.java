
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel59 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel59(ElementsStrangeFuelsMod instance) {
		super(instance, 59);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.LADDER, (int) (1)).getItem())
			return 700;
		return 0;
	}
}
