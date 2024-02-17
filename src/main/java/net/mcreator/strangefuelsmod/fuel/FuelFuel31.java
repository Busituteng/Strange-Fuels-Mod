
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel31 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel31(ElementsStrangeFuelsMod instance) {
		super(instance, 31);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 4).getItem()
				&& fuel.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 4).getMetadata())
			return 50;
		return 0;
	}
}
