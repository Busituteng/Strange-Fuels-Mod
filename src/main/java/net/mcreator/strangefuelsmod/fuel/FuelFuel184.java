
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel184 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel184(ElementsStrangeFuelsMod instance) {
		super(instance, 184);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.COOKED_MUTTON, (int) (1)).getItem())
			return 150;
		return 0;
	}
}
