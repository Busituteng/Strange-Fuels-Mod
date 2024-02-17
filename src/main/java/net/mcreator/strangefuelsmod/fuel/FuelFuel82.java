
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel82 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel82(ElementsStrangeFuelsMod instance) {
		super(instance, 82);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.HAY_BLOCK, (int) (1)).getItem())
			return 900;
		return 0;
	}
}
