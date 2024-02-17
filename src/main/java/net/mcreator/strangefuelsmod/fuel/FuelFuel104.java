
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel104 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel104(ElementsStrangeFuelsMod instance) {
		super(instance, 104);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DIAMOND, (int) (1)).getItem())
			return 12800;
		return 0;
	}
}
