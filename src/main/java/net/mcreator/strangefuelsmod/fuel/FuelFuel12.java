
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel12 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel12(ElementsStrangeFuelsMod instance) {
		super(instance, 12);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.SLIME_BLOCK, (int) (1)).getItem())
			return 3600;
		return 0;
	}
}
