
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel49 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel49(ElementsStrangeFuelsMod instance) {
		super(instance, 49);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.TORCH, (int) (1)).getItem())
			return 500;
		return 0;
	}
}
