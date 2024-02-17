
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel3 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel3(ElementsStrangeFuelsMod instance) {
		super(instance, 3);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 2).getItem()
				&& fuel.getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 2).getMetadata())
			return 200;
		return 0;
	}
}
