
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemGensokyo;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel217 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel217(ElementsStrangeFuelsMod instance) {
		super(instance, 341);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemGensokyo.block, (int) (1)).getItem())
			return 180000;
		return 0;
	}
}
