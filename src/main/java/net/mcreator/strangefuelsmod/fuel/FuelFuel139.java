
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel139 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel139(ElementsStrangeFuelsMod instance) {
		super(instance, 139);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.APPLE, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
