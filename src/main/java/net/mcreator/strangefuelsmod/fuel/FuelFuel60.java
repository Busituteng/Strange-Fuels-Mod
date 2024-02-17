
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel60 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel60(ElementsStrangeFuelsMod instance) {
		super(instance, 60);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.LEVER, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
