
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel11 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel11(ElementsStrangeFuelsMod instance) {
		super(instance, 11);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.SLIME_BALL, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
