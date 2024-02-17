
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel44 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel44(ElementsStrangeFuelsMod instance) {
		super(instance, 44);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.RED_MUSHROOM, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
