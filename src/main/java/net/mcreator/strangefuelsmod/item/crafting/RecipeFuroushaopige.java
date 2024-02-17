
package net.mcreator.strangefuelsmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class RecipeFuroushaopige extends ElementsStrangeFuelsMod.ModElement {
	public RecipeFuroushaopige(ElementsStrangeFuelsMod instance) {
		super(instance, 218);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.ROTTEN_FLESH, (int) (1)), new ItemStack(Items.LEATHER, (int) (1)), 1F);
	}
}
