
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel46 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel46(ElementsStrangeFuelsMod instance) {
		super(instance, 46);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.RED_MUSHROOM_BLOCK, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
