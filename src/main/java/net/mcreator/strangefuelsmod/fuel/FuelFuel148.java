
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel148 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel148(ElementsStrangeFuelsMod instance) {
		super(instance, 148);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.WHEAT, (int) (1)).getItem())
			return 200;
		return 0;
	}
}
