
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel124 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel124(ElementsStrangeFuelsMod instance) {
		super(instance, 124);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.LEATHER_CHESTPLATE, (int) (1)).getItem())
			return 800;
		return 0;
	}
}
