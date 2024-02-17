
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel189 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel189(ElementsStrangeFuelsMod instance) {
		super(instance, 189);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.CHORUS_FRUIT, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
