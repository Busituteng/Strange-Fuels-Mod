
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel168 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel168(ElementsStrangeFuelsMod instance) {
		super(instance, 168);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.FISH, (int) (1), 2).getItem()
				&& fuel.getMetadata() == new ItemStack(Items.FISH, (int) (1), 2).getMetadata())
			return 100;
		return 0;
	}
}
