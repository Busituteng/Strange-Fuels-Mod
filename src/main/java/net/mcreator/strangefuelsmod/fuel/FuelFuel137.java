
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel137 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel137(ElementsStrangeFuelsMod instance) {
		super(instance, 137);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.OAK_DOOR, (int) (1)).getItem())
			return 600;
		return 0;
	}
}
