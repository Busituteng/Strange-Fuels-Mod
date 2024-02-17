
package net.mcreator.strangefuelsmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.block.BlockPetroleum;
import net.mcreator.strangefuelsmod.block.BlockGasoline;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class RecipeGasoline1 extends ElementsStrangeFuelsMod.ModElement {
	public RecipeGasoline1(ElementsStrangeFuelsMod instance) {
		super(instance, 446);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockPetroleum.block, (int) (1)), new ItemStack(BlockGasoline.block, (int) (1)), 0F);
	}
}
