
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel73 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel73(ElementsStrangeFuelsMod instance) {
		super(instance, 73);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.LIT_PUMPKIN, (int) (1)).getItem())
			return 600;
		return 0;
	}
}
