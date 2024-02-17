
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel199 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel199(ElementsStrangeFuelsMod instance) {
		super(instance, 199);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.BLAZE_POWDER, (int) (1)).getItem())
			return 450;
		return 0;
	}
}
