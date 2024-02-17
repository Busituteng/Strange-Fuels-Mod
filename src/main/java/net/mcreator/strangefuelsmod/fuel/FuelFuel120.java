
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel120 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel120(ElementsStrangeFuelsMod instance) {
		super(instance, 120);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DIAMOND_PICKAXE, (int) (1)).getItem())
			return 38400;
		return 0;
	}
}
