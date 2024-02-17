
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel23 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel23(ElementsStrangeFuelsMod instance) {
		super(instance, 23);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.TALLGRASS, (int) (1)).getItem())
			return 50;
		return 0;
	}
}
