
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel110 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel110(ElementsStrangeFuelsMod instance) {
		super(instance, 110);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.FISHING_ROD, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
