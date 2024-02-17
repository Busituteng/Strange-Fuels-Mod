
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemHongwuzhi;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelHongwuzhi2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelHongwuzhi2(ElementsStrangeFuelsMod instance) {
		super(instance, 251);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemHongwuzhi.block, (int) (1)).getItem())
			return 3417600;
		return 0;
	}
}
