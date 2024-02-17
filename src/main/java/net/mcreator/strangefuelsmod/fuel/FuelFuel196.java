
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel196 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel196(ElementsStrangeFuelsMod instance) {
		super(instance, 196);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.SPIDER_EYE, (int) (1)).getItem())
			return 150;
		return 0;
	}
}
