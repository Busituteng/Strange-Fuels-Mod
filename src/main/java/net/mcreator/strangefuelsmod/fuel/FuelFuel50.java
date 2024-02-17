
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel50 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel50(ElementsStrangeFuelsMod instance) {
		super(instance, 50);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.WHEAT, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
