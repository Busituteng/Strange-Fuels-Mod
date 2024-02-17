
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemFud;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFud2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFud2(ElementsStrangeFuelsMod instance) {
		super(instance, 373);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemFud.block, (int) (1)).getItem())
			return 160000;
		return 0;
	}
}
