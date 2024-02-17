
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel63 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel63(ElementsStrangeFuelsMod instance) {
		super(instance, 63);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.TRIPWIRE_HOOK, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
