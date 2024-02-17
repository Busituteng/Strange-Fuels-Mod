
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel22 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel22(ElementsStrangeFuelsMod instance) {
		super(instance, 22);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.DEADBUSH, (int) (1)).getItem())
			return 50;
		return 0;
	}
}
