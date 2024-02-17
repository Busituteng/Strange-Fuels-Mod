
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel133 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel133(ElementsStrangeFuelsMod instance) {
		super(instance, 133);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DIAMOND_HORSE_ARMOR, (int) (1)).getItem())
			return 76800;
		return 0;
	}
}
