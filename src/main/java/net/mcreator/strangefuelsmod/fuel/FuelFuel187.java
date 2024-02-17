
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel187 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel187(ElementsStrangeFuelsMod instance) {
		super(instance, 187);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.ENDER_EYE, (int) (1)).getItem())
			return 600;
		return 0;
	}
}
