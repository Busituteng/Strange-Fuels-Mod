
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel58 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel58(ElementsStrangeFuelsMod instance) {
		super(instance, 58);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.TRAPDOOR, (int) (1)).getItem())
			return 1800;
		return 0;
	}
}
