
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel9 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel9(ElementsStrangeFuelsMod instance) {
		super(instance, 9);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.COAL_ORE, (int) (1)).getItem())
			return 1600;
		return 0;
	}
}
