
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemFub;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFub2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFub2(ElementsStrangeFuelsMod instance) {
		super(instance, 366);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemFub.block, (int) (1)).getItem())
			return 4000;
		return 0;
	}
}
