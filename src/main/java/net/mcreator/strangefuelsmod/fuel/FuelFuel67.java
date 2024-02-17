
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel67 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel67(ElementsStrangeFuelsMod instance) {
		super(instance, 67);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.JUKEBOX, (int) (1)).getItem())
			return 2400;
		return 0;
	}
}
