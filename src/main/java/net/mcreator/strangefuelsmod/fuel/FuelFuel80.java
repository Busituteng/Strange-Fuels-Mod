
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel80 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel80(ElementsStrangeFuelsMod instance) {
		super(instance, 80);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.DRAGON_EGG, (int) (1)).getItem())
			return 25600;
		return 0;
	}
}
