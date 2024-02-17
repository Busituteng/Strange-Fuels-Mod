
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel205 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel205(ElementsStrangeFuelsMod instance) {
		super(instance, 205);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.WRITABLE_BOOK, (int) (1)).getItem())
			return 700;
		return 0;
	}
}
