
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel2(ElementsStrangeFuelsMod instance) {
		super(instance, 2);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 1).getItem()
				&& fuel.getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 1).getMetadata())
			return 200;
		return 0;
	}
}
