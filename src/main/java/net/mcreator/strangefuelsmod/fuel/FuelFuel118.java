
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel118 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel118(ElementsStrangeFuelsMod instance) {
		super(instance, 118);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DIAMOND_SWORD, (int) (1)).getItem())
			return 25600;
		return 0;
	}
}
