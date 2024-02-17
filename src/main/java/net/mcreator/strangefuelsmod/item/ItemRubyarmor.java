
package net.mcreator.strangefuelsmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.strangefuelsmod.procedure.ProcedureRubyarmorBodyTickEvent;
import net.mcreator.strangefuelsmod.creativetab.TabStrangeFuelsMod;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ItemRubyarmor extends ElementsStrangeFuelsMod.ModElement {
	@GameRegistry.ObjectHolder("strangefuelsmod:rubyarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("strangefuelsmod:rubyarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("strangefuelsmod:rubyarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("strangefuelsmod:rubyarmorboots")
	public static final Item boots = null;
	public ItemRubyarmor(ElementsStrangeFuelsMod instance) {
		super(instance, 461);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("RUBYARMOR", "strangefuelsmod:ruby_", 80, new int[]{20, 20, 20, 20}, 30,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.armorstand.hit")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("rubyarmorhelmet")
				.setRegistryName("rubyarmorhelmet").setCreativeTab(TabStrangeFuelsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureRubyarmorBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("rubyarmorbody").setRegistryName("rubyarmorbody").setCreativeTab(TabStrangeFuelsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("rubyarmorlegs")
				.setRegistryName("rubyarmorlegs").setCreativeTab(TabStrangeFuelsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("rubyarmorboots")
				.setRegistryName("rubyarmorboots").setCreativeTab(TabStrangeFuelsMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("strangefuelsmod:rubyarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("strangefuelsmod:rubyarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("strangefuelsmod:rubyarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("strangefuelsmod:rubyarmorboots", "inventory"));
	}
}
