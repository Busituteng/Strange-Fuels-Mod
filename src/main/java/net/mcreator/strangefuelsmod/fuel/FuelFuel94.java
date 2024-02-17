
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel94 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel94(ElementsStrangeFuelsMod instance) {
		super(instance, 94);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DYE, (int) (1), 6).getItem()
				&& fuel.getMetadata() == new ItemStack(Items.DYE, (int) (1), 6).getMetadata())
			return 50;
		return 0;
	}
}
