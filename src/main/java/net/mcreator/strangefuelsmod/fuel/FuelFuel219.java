
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemBarragecore;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel219 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel219(ElementsStrangeFuelsMod instance) {
		super(instance, 348);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemBarragecore.block, (int) (1)).getItem())
			return 350;
		return 0;
	}
}
