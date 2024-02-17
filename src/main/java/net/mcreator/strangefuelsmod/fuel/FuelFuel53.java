
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel53 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel53(ElementsStrangeFuelsMod instance) {
		super(instance, 53);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.SPRUCE_DOOR, (int) (1)).getItem())
			return 600;
		return 0;
	}
}
