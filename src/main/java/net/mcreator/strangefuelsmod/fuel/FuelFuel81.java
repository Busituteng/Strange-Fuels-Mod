
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel81 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel81(ElementsStrangeFuelsMod instance) {
		super(instance, 81);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.COCOA, (int) (1)).getItem())
			return 200;
		return 0;
	}
}
