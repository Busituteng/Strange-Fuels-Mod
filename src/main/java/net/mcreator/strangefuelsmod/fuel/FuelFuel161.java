
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel161 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel161(ElementsStrangeFuelsMod instance) {
		super(instance, 161);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.EGG, (int) (1)).getItem())
			return 200;
		return 0;
	}
}
