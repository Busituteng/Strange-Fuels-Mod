
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel113 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel113(ElementsStrangeFuelsMod instance) {
		super(instance, 113);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.FILLED_MAP, (int) (1)).getItem())
			return 800;
		return 0;
	}
}
