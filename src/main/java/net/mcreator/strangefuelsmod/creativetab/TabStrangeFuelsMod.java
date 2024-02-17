
package net.mcreator.strangefuelsmod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.strangefuelsmod.item.ItemGaojimeitan;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class TabStrangeFuelsMod extends ElementsStrangeFuelsMod.ModElement {
	public TabStrangeFuelsMod(ElementsStrangeFuelsMod instance) {
		super(instance, 222);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabstrangefuelsmod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemGaojimeitan.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
