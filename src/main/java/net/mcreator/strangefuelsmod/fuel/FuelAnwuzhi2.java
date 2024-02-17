
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemAnwuzhi;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelAnwuzhi2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelAnwuzhi2(ElementsStrangeFuelsMod instance) {
		super(instance, 248);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemAnwuzhi.block, (int) (1)).getItem())
			return 934400;
		return 0;
	}
}
