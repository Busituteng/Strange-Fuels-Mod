
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel182 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel182(ElementsStrangeFuelsMod instance) {
		super(instance, 182);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.RABBIT_STEW, (int) (1)).getItem())
			return 600;
		return 0;
	}
}
