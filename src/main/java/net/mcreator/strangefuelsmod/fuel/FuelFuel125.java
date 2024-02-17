
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel125 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel125(ElementsStrangeFuelsMod instance) {
		super(instance, 125);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.LEATHER_LEGGINGS, (int) (1)).getItem())
			return 700;
		return 0;
	}
}
