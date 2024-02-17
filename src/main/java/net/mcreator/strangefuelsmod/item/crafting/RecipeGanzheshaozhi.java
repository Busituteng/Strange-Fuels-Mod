
package net.mcreator.strangefuelsmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class RecipeGanzheshaozhi extends ElementsStrangeFuelsMod.ModElement {
	public RecipeGanzheshaozhi(ElementsStrangeFuelsMod instance) {
		super(instance, 219);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.REEDS, (int) (1)), new ItemStack(Items.PAPER, (int) (1)), 1F);
	}
}
