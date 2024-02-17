
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel71 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel71(ElementsStrangeFuelsMod instance) {
		super(instance, 71);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.MELON_BLOCK, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
