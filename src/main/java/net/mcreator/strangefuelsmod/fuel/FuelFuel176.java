
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel176 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel176(ElementsStrangeFuelsMod instance) {
		super(instance, 176);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.CHICKEN, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
