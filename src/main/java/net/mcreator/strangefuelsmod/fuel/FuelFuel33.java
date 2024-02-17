
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel33 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel33(ElementsStrangeFuelsMod instance) {
		super(instance, 33);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 6).getItem()
				&& fuel.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 6).getMetadata())
			return 50;
		return 0;
	}
}
