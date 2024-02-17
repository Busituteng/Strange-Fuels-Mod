
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel135 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel135(ElementsStrangeFuelsMod instance) {
		super(instance, 135);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.ITEM_FRAME, (int) (1)).getItem())
			return 200;
		return 0;
	}
}
