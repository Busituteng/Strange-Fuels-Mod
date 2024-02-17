
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel76 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel76(ElementsStrangeFuelsMod instance) {
		super(instance, 76);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.BREWING_STAND, (int) (1)).getItem())
			return 2400;
		return 0;
	}
}
