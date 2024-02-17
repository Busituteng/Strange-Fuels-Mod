
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel10 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel10(ElementsStrangeFuelsMod instance) {
		super(instance, 10);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.DIAMOND_ORE, (int) (1)).getItem())
			return 12800;
		return 0;
	}
}
