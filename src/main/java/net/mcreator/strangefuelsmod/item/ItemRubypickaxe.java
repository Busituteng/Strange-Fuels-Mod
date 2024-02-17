
package net.mcreator.strangefuelsmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.strangefuelsmod.creativetab.TabStrangeFuelsMod;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

import java.util.Set;
import java.util.HashMap;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ItemRubypickaxe extends ElementsStrangeFuelsMod.ModElement {
	@GameRegistry.ObjectHolder("strangefuelsmod:rubypickaxe")
	public static final Item block = null;
	public ItemRubypickaxe(ElementsStrangeFuelsMod instance) {
		super(instance, 390);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("RUBYPICKAXE", 8, 5000, 8f, 8f, 8)) {
			{
				this.attackSpeed = -2.7f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 8);
				return ret.keySet();
			}
		}.setUnlocalizedName("rubypickaxe").setRegistryName("rubypickaxe").setCreativeTab(TabStrangeFuelsMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("strangefuelsmod:rubypickaxe", "inventory"));
	}
}
