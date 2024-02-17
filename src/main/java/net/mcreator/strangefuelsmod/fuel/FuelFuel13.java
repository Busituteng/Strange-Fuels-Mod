
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel13 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel13(ElementsStrangeFuelsMod instance) {
		super(instance, 13);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.LEAVES, (int) (1)).getItem())
			return 200;
		return 0;
	}
}
