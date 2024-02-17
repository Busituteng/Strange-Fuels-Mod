
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel198 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel198(ElementsStrangeFuelsMod instance) {
		super(instance, 198);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.BLAZE_ROD, (int) (1)).getItem())
			return 900;
		return 0;
	}
}
