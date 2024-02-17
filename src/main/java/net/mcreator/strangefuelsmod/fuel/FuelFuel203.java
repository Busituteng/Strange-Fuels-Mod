
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel203 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel203(ElementsStrangeFuelsMod instance) {
		super(instance, 203);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.FIRE_CHARGE, (int) (1)).getItem())
			return 900;
		return 0;
	}
}
