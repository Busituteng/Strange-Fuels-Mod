
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel172 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel172(ElementsStrangeFuelsMod instance) {
		super(instance, 172);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.PORKCHOP, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
