
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel207 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel207(ElementsStrangeFuelsMod instance) {
		super(instance, 207);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.ENCHANTED_BOOK, (int) (1)).getItem())
			return 1000;
		return 0;
	}
}
