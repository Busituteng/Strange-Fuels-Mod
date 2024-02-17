
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel208 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel208(ElementsStrangeFuelsMod instance) {
		super(instance, 208);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.FIREWORK_CHARGE, (int) (1)).getItem())
			return 600;
		return 0;
	}
}
