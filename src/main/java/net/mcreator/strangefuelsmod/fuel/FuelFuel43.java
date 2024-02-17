
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel43 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel43(ElementsStrangeFuelsMod instance) {
		super(instance, 43);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.BROWN_MUSHROOM, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
