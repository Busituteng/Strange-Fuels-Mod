
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel158 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel158(ElementsStrangeFuelsMod instance) {
		super(instance, 158);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.SADDLE, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
