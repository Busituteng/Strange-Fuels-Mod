
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel136 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel136(ElementsStrangeFuelsMod instance) {
		super(instance, 136);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.SIGN, (int) (1)).getItem())
			return 1900;
		return 0;
	}
}
