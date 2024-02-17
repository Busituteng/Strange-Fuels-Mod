
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel99 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel99(ElementsStrangeFuelsMod instance) {
		super(instance, 99);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DYE, (int) (1), 11).getItem()
				&& fuel.getMetadata() == new ItemStack(Items.DYE, (int) (1), 11).getMetadata())
			return 50;
		return 0;
	}
}
