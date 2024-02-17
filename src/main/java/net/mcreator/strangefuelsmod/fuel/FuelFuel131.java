
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel131 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel131(ElementsStrangeFuelsMod instance) {
		super(instance, 131);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.ELYTRA, (int) (1)).getItem())
			return 650;
		return 0;
	}
}
