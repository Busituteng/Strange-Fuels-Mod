
package net.mcreator.strangefuelsmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class RecipeMutan extends ElementsStrangeFuelsMod.ModElement {
	public RecipeMutan(ElementsStrangeFuelsMod instance) {
		super(instance, 236);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Blocks.PLANKS, (int) (1)), new ItemStack(Items.COAL, (int) (1), 1), 0F);
	}
}
