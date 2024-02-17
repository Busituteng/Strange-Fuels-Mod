
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemZunshat;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelZunshat2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelZunshat2(ElementsStrangeFuelsMod instance) {
		super(instance, 322);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemZunshat.helmet, (int) (1)).getItem())
			return 3200;
		return 0;
	}
}
