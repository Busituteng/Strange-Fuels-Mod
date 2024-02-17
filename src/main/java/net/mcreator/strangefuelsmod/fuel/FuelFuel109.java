
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel109 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel109(ElementsStrangeFuelsMod instance) {
		super(instance, 109);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.TIPPED_ARROW, (int) (1)).getItem())
			return 200;
		return 0;
	}
}
