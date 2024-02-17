
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemErchongyasuogaojimeitan;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelErchongyasuogaojimeitan2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelErchongyasuogaojimeitan2(ElementsStrangeFuelsMod instance) {
		super(instance, 232);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemErchongyasuogaojimeitan.block, (int) (1)).getItem())
			return 924800;
		return 0;
	}
}
