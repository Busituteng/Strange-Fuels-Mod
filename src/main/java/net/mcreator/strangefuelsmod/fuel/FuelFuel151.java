
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel151 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel151(ElementsStrangeFuelsMod instance) {
		super(instance, 151);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.BAKED_POTATO, (int) (1)).getItem())
			return 150;
		return 0;
	}
}
