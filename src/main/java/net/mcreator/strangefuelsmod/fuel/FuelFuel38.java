
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel38 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel38(ElementsStrangeFuelsMod instance) {
		super(instance, 38);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 1).getItem()
				&& fuel.getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 1).getMetadata())
			return 50;
		return 0;
	}
}
