
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel47 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel47(ElementsStrangeFuelsMod instance) {
		super(instance, 47);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
