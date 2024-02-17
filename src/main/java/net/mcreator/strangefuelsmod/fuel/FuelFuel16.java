
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel16 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel16(ElementsStrangeFuelsMod instance) {
		super(instance, 16);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.RAIL, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
