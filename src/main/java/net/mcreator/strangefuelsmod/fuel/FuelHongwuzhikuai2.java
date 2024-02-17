
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.block.BlockHongwuzhikuai;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelHongwuzhikuai2 extends ElementsStrangeFuelsMod.ModElement {
	public FuelHongwuzhikuai2(ElementsStrangeFuelsMod instance) {
		super(instance, 254);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockHongwuzhikuai.block, (int) (1)).getItem())
			return 13670400;
		return 0;
	}
}
