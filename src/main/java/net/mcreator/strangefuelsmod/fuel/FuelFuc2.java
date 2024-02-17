
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemFuc;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuc2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuc2(ElementsStrangeFuelsMod instance) {
		super(instance, 369);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemFuc.block, (int) (1)).getItem())
			return 4500;
		return 0;
	}
}
