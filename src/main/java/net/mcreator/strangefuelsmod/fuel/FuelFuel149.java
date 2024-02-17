
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel149 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel149(ElementsStrangeFuelsMod instance) {
		super(instance, 149);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.CARROT, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
