
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemYonghengranliao;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelYonghengranliao2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelYonghengranliao2(ElementsStrangeFuelsMod instance) {
		super(instance, 245);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemYonghengranliao.block, (int) (1)).getItem())
			return 102400;
		return 0;
	}
}
