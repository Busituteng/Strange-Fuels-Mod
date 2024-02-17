
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.block.BlockBambooplant;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel218 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel218(ElementsStrangeFuelsMod instance) {
		super(instance, 342);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockBambooplant.block, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
