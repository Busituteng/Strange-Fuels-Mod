
package net.mcreator.strangefuelsmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.item.ItemYanjiangmeitanhunhewu;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class RecipeZuanshi extends ElementsStrangeFuelsMod.ModElement {
	public RecipeZuanshi(ElementsStrangeFuelsMod instance) {
		super(instance, 224);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemYanjiangmeitanhunhewu.block, (int) (1)), new ItemStack(Items.DIAMOND, (int) (1)), 1F);
	}
}
