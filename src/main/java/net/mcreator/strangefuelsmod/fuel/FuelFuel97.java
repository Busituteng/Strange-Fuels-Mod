
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel97 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel97(ElementsStrangeFuelsMod instance) {
		super(instance, 97);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DYE, (int) (1), 9).getItem()
				&& fuel.getMetadata() == new ItemStack(Items.DYE, (int) (1), 9).getMetadata())
			return 50;
		return 0;
	}
}
