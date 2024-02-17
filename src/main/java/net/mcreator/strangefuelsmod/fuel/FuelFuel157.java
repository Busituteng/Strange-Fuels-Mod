
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel157 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel157(ElementsStrangeFuelsMod instance) {
		super(instance, 157);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.LEATHER, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
