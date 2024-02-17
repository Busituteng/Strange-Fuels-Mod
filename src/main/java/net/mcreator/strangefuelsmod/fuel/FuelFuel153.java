
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel153 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel153(ElementsStrangeFuelsMod instance) {
		super(instance, 153);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.PUMPKIN_PIE, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
