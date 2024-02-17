
package net.mcreator.strangefuelsmod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.strangefuelsmod.item.ItemMeifen;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class OreDictOD extends ElementsStrangeFuelsMod.ModElement {
	public OreDictOD(ElementsStrangeFuelsMod instance) {
		super(instance, 281);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("dustCoal", new ItemStack(ItemMeifen.block, (int) (1)));
	}
}
