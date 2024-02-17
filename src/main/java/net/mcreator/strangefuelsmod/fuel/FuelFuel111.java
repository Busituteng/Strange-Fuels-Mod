
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel111 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel111(ElementsStrangeFuelsMod instance) {
		super(instance, 111);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.CARROT_ON_A_STICK, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
