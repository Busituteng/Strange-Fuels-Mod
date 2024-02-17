
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel18 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel18(ElementsStrangeFuelsMod instance) {
		super(instance, 18);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.DETECTOR_RAIL, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
