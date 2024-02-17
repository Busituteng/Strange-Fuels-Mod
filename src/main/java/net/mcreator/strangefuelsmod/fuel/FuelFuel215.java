
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.block.BlockPowerstoneblock;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel215 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel215(ElementsStrangeFuelsMod instance) {
		super(instance, 339);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockPowerstoneblock.block, (int) (1)).getItem())
			return 180000;
		return 0;
	}
}
