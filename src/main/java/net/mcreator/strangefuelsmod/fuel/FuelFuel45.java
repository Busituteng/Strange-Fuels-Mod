
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel45 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel45(ElementsStrangeFuelsMod instance) {
		super(instance, 45);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.BROWN_MUSHROOM_BLOCK, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
