
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel62 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel62(ElementsStrangeFuelsMod instance) {
		super(instance, 62);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.WOODEN_PRESSURE_PLATE, (int) (1)).getItem())
			return 600;
		return 0;
	}
}
