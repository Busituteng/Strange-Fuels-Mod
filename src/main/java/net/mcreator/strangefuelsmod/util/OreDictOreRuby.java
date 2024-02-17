
package net.mcreator.strangefuelsmod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.block.BlockRubyore;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class OreDictOreRuby extends ElementsStrangeFuelsMod.ModElement {
	public OreDictOreRuby(ElementsStrangeFuelsMod instance) {
		super(instance, 506);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("oreRuby", new ItemStack(BlockRubyore.block, (int) (1)));
	}
}
