
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel123 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel123(ElementsStrangeFuelsMod instance) {
		super(instance, 123);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.LEATHER_HELMET, (int) (1)).getItem())
			return 500;
		return 0;
	}
}
