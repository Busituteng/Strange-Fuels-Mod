
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel89 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel89(ElementsStrangeFuelsMod instance) {
		super(instance, 89);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DYE, (int) (1), 0).getItem()
				&& fuel.getMetadata() == new ItemStack(Items.DYE, (int) (1), 0).getMetadata())
			return 50;
		return 0;
	}
}
