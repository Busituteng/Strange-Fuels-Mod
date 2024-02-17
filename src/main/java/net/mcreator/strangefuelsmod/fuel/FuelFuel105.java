
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel105 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel105(ElementsStrangeFuelsMod instance) {
		super(instance, 105);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.NETHER_STAR, (int) (1)).getItem())
			return 115200;
		return 0;
	}
}
