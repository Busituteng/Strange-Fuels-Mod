
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel147 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel147(ElementsStrangeFuelsMod instance) {
		super(instance, 147);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.WHEAT_SEEDS, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
