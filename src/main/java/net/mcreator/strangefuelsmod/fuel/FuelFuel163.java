
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel163 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel163(ElementsStrangeFuelsMod instance) {
		super(instance, 163);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.COOKIE, (int) (1)).getItem())
			return 200;
		return 0;
	}
}
