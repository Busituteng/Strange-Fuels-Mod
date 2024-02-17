
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel69 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel69(ElementsStrangeFuelsMod instance) {
		super(instance, 69);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.NETHER_WART, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
