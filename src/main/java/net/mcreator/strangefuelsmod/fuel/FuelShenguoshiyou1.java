
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemShenguoshiyou;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelShenguoshiyou1 extends ElementsStrangeFuelsMod.ModElement {
	public FuelShenguoshiyou1(ElementsStrangeFuelsMod instance) {
		super(instance, 451);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemShenguoshiyou.block, (int) (1)).getItem())
			return 100000;
		return 0;
	}
}
