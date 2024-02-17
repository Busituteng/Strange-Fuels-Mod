
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemXiaohaomeitan;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelXiaohaomeitan3 extends ElementsStrangeFuelsMod.ModElement {
	public FuelXiaohaomeitan3(ElementsStrangeFuelsMod instance) {
		super(instance, 276);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemXiaohaomeitan.block, (int) (1)).getItem())
			return 200;
		return 0;
	}
}
