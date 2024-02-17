
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel188 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel188(ElementsStrangeFuelsMod instance) {
		super(instance, 188);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.END_CRYSTAL, (int) (1)).getItem())
			return 3200;
		return 0;
	}
}
