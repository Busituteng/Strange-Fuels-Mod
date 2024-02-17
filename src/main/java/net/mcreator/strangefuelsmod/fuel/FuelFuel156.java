
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel156 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel156(ElementsStrangeFuelsMod instance) {
		super(instance, 156);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.PUMPKIN_SEEDS, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
