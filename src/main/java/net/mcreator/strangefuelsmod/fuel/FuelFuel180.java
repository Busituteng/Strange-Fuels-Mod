
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel180 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel180(ElementsStrangeFuelsMod instance) {
		super(instance, 180);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.RABBIT_FOOT, (int) (1)).getItem())
			return 150;
		return 0;
	}
}
