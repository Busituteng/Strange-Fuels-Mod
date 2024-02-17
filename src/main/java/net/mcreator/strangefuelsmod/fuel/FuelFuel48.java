
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel48 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel48(ElementsStrangeFuelsMod instance) {
		super(instance, 48);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.TNT, (int) (1)).getItem())
			return 1600;
		return 0;
	}
}
