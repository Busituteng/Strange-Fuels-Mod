
package net.mcreator.strangefuelsmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemRanliaohexin;
import net.mcreator.strangefuelsmod.block.BlockRanliaohexinkuangshi;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class RecipeRanliaohexinkuangshi1 extends ElementsStrangeFuelsMod.ModElement {
	public RecipeRanliaohexinkuangshi1(ElementsStrangeFuelsMod instance) {
		super(instance, 272);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockRanliaohexinkuangshi.block, (int) (1)), new ItemStack(ItemRanliaohexin.block, (int) (4)), 0.5F);
	}
}
