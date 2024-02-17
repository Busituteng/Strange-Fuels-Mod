
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel210 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel210(ElementsStrangeFuelsMod instance) {
		super(instance, 210);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.EXPERIENCE_BOTTLE, (int) (1)).getItem())
			return 1000;
		return 0;
	}
}
