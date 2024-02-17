
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel144 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel144(ElementsStrangeFuelsMod instance) {
		super(instance, 144);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.STRING, (int) (1)).getItem())
			return 50;
		return 0;
	}
}
