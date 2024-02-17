
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel114 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel114(ElementsStrangeFuelsMod instance) {
		super(instance, 114);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.TOTEM_OF_UNDYING, (int) (1)).getItem())
			return 57600;
		return 0;
	}
}
