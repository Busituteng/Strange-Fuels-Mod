
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemLianjinmeitan;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelLianjinmeitan2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelLianjinmeitan2(ElementsStrangeFuelsMod instance) {
		super(instance, 239);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemLianjinmeitan.block, (int) (1)).getItem())
			return 6400;
		return 0;
	}
}
