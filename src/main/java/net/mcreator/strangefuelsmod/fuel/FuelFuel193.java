
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel193 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel193(ElementsStrangeFuelsMod instance) {
		super(instance, 193);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.BEETROOT_SOUP, (int) (1)).getItem())
			return 900;
		return 0;
	}
}
