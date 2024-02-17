
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemMobiwusiranliao;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelMobiwusiranliao2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelMobiwusiranliao2(ElementsStrangeFuelsMod instance) {
		super(instance, 242);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemMobiwusiranliao.block, (int) (1)).getItem())
			return 25600;
		return 0;
	}
}
