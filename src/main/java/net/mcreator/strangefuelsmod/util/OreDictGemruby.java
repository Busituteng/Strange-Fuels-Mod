
package net.mcreator.strangefuelsmod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemRuby;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class OreDictGemruby extends ElementsStrangeFuelsMod.ModElement {
	public OreDictGemruby(ElementsStrangeFuelsMod instance) {
		super(instance, 505);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("gemRuby", new ItemStack(ItemRuby.block, (int) (1)));
	}
}
