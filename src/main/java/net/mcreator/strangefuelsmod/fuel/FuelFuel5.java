
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel5 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel5(ElementsStrangeFuelsMod instance) {
		super(instance, 5);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 4).getItem()
				&& fuel.getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 4).getMetadata())
			return 200;
		return 0;
	}
}
