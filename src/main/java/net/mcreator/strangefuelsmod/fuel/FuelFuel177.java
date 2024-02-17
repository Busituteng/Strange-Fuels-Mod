
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel177 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel177(ElementsStrangeFuelsMod instance) {
		super(instance, 177);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.COOKED_CHICKEN, (int) (1)).getItem())
			return 150;
		return 0;
	}
}
