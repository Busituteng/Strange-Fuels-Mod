
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemYasuogaojimeitan;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelYasuogaojimeitan1 extends ElementsStrangeFuelsMod.ModElement {
	public FuelYasuogaojimeitan1(ElementsStrangeFuelsMod instance) {
		super(instance, 228);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemYasuogaojimeitan.block, (int) (1)).getItem())
			return 231200;
		return 0;
	}
}
