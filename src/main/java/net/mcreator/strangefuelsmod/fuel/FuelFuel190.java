
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel190 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel190(ElementsStrangeFuelsMod instance) {
		super(instance, 190);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.CHORUS_FRUIT_POPPED, (int) (1)).getItem())
			return 150;
		return 0;
	}
}
