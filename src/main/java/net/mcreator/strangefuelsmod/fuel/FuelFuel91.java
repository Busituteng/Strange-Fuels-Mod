
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel91 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel91(ElementsStrangeFuelsMod instance) {
		super(instance, 91);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DYE, (int) (1), 2).getItem()
				&& fuel.getMetadata() == new ItemStack(Items.DYE, (int) (1), 2).getMetadata())
			return 50;
		return 0;
	}
}
