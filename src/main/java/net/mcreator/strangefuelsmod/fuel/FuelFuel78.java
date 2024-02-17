
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel78 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel78(ElementsStrangeFuelsMod instance) {
		super(instance, 78);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.CHORUS_PLANT, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
