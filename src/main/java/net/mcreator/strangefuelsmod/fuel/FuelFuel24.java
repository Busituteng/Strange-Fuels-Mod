
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel24 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel24(ElementsStrangeFuelsMod instance) {
		super(instance, 24);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.PISTON, (int) (1)).getItem())
			return 900;
		return 0;
	}
}
