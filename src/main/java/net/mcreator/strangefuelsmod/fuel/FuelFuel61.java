
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel61 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel61(ElementsStrangeFuelsMod instance) {
		super(instance, 61);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.WOODEN_BUTTON, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
