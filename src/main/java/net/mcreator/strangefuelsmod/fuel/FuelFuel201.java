
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel201 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel201(ElementsStrangeFuelsMod instance) {
		super(instance, 201);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.BREWING_STAND, (int) (1)).getItem())
			return 900;
		return 0;
	}
}
