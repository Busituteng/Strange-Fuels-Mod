
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemFua;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFua2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFua2(ElementsStrangeFuelsMod instance) {
		super(instance, 361);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemFua.block, (int) (1)).getItem())
			return 1000;
		return 0;
	}
}
