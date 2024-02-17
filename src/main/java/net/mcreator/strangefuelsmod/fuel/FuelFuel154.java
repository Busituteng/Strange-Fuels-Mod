
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel154 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel154(ElementsStrangeFuelsMod instance) {
		super(instance, 154);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.GOLDEN_CARROT, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
