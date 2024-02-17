
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel83 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel83(ElementsStrangeFuelsMod instance) {
		super(instance, 83);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.SKULL, (int) (1), 0).getItem()
				&& fuel.getMetadata() == new ItemStack(Blocks.SKULL, (int) (1), 0).getMetadata())
			return 200;
		return 0;
	}
}
