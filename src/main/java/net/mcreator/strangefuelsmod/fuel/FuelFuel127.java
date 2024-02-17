
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel127 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel127(ElementsStrangeFuelsMod instance) {
		super(instance, 127);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DIAMOND_HELMET, (int) (1)).getItem())
			return 64000;
		return 0;
	}
}
