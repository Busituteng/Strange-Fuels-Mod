
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel51 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel51(ElementsStrangeFuelsMod instance) {
		super(instance, 51);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.STANDING_SIGN, (int) (1)).getItem())
			return 1900;
		return 0;
	}
}
