
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel181 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel181(ElementsStrangeFuelsMod instance) {
		super(instance, 181);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.RABBIT_HIDE, (int) (1)).getItem())
			return 50;
		return 0;
	}
}
