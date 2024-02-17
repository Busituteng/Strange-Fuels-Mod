
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel122 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel122(ElementsStrangeFuelsMod instance) {
		super(instance, 122);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DIAMOND_HOE, (int) (1)).getItem())
			return 25600;
		return 0;
	}
}
