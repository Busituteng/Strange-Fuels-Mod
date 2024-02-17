
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel117 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel117(ElementsStrangeFuelsMod instance) {
		super(instance, 117);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.SHIELD, (int) (1)).getItem())
			return 1800;
		return 0;
	}
}
