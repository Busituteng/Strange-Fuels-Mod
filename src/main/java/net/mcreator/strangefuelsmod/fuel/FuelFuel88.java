
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel88 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel88(ElementsStrangeFuelsMod instance) {
		super(instance, 88);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.SKULL, (int) (1), 5).getItem()
				&& fuel.getMetadata() == new ItemStack(Blocks.SKULL, (int) (1), 5).getMetadata())
			return 400;
		return 0;
	}
}
