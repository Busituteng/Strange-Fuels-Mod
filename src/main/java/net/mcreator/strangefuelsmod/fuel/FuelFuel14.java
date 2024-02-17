
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel14 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel14(ElementsStrangeFuelsMod instance) {
		super(instance, 14);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.SPONGE, (int) (1), 0).getItem()
				&& fuel.getMetadata() == new ItemStack(Blocks.SPONGE, (int) (1), 0).getMetadata())
			return 800;
		return 0;
	}
}
