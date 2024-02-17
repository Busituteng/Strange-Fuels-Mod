
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel195 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel195(ElementsStrangeFuelsMod instance) {
		super(instance, 195);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.DRAGON_BREATH, (int) (1)).getItem())
			return 800;
		return 0;
	}
}
