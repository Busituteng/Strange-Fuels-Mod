
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel209 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel209(ElementsStrangeFuelsMod instance) {
		super(instance, 209);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.FIREWORKS, (int) (1)).getItem())
			return 500;
		return 0;
	}
}
