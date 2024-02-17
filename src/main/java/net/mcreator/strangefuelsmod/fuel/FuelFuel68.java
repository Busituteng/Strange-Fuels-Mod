
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel68 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel68(ElementsStrangeFuelsMod instance) {
		super(instance, 68);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.OAK_FENCE, (int) (1)).getItem())
			return 150;
		return 0;
	}
}
