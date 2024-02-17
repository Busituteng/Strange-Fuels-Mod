
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel56 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel56(ElementsStrangeFuelsMod instance) {
		super(instance, 56);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.ACACIA_DOOR, (int) (1)).getItem())
			return 600;
		return 0;
	}
}
