
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel121 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel121(ElementsStrangeFuelsMod instance) {
		super(instance, 121);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DIAMOND_AXE, (int) (1)).getItem())
			return 38400;
		return 0;
	}
}
