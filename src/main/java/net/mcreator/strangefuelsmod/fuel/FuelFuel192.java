
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel192 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel192(ElementsStrangeFuelsMod instance) {
		super(instance, 192);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.BEETROOT_SEEDS, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
