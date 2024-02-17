
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel21 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel21(ElementsStrangeFuelsMod instance) {
		super(instance, 21);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.WEB, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
