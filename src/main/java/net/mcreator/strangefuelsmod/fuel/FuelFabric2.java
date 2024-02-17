
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemFabric;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFabric2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFabric2(ElementsStrangeFuelsMod instance) {
		super(instance, 317);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemFabric.block, (int) (1)).getItem())
			return 600;
		return 0;
	}
}
