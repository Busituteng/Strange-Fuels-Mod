
package net.mcreator.strangefuelsmod.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class FuelFuel170 extends ElementsStrangeFuelsMod.ModElement {
	public FuelFuel170(ElementsStrangeFuelsMod instance) {
		super(instance, 170);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.COOKED_FISH, (int) (1), 0).getItem()
				&& fuel.getMetadata() == new ItemStack(Items.COOKED_FISH, (int) (1), 0).getMetadata())
			return 150;
		return 0;
	}
}
