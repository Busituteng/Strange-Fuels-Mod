
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel197 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel197(ElementsStrangeFuelsMod instance) {
		super(instance, 197);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.FERMENTED_SPIDER_EYE, (int) (1)).getItem())
			return 450;
		return 0;
	}
}
