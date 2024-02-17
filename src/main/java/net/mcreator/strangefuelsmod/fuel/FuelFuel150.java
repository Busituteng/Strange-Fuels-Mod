
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel150 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel150(ElementsStrangeFuelsMod instance) {
		super(instance, 150);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.POTATO, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
