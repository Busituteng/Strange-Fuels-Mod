
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel169 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel169(ElementsStrangeFuelsMod instance) {
		super(instance, 169);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.FISH, (int) (1), 3).getItem()
				&& fuel.getMetadata() == new ItemStack(Items.FISH, (int) (1), 3).getMetadata())
			return 100;
		return 0;
	}
}
