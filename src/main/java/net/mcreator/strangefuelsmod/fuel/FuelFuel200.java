
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel200 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel200(ElementsStrangeFuelsMod instance) {
		super(instance, 200);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.MAGMA_CREAM, (int) (1)).getItem())
			return 600;
		return 0;
	}
}
