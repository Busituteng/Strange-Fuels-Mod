
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel142 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel142(ElementsStrangeFuelsMod instance) {
		super(instance, 142);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.MUSHROOM_STEW, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
