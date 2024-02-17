
package net.mcreator.strangefuelsmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemDoge;
import net.mcreator.strangefuelsmod.block.BlockDogeore;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class RecipeDogeore1 extends ElementsStrangeFuelsMod.ModElement {
	public RecipeDogeore1(ElementsStrangeFuelsMod instance) {
		super(instance, 275);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDogeore.block, (int) (1)), new ItemStack(ItemDoge.block, (int) (1)), 0.5F);
	}
}
