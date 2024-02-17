
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel7 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel7(ElementsStrangeFuelsMod instance) {
		super(instance, 7);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.REEDS, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
