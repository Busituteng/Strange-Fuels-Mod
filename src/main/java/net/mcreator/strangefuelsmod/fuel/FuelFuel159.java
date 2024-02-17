
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel159 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel159(ElementsStrangeFuelsMod instance) {
		super(instance, 159);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.REEDS, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
