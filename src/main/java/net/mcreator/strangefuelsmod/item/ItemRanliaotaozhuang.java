
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

import net.mcreator.strangefuelsmod.procedure.ProcedureRanliaotaozhuangBodyTickEvent;
import net.mcreator.strangefuelsmod.creativetab.TabStrangeFuelsMod;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ItemRanliaotaozhuang extends ElementsStrangeFuelsMod.ModElement {
	@GameRegistry.ObjectHolder("strangefuelsmod:ranliaotaozhuanghelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("strangefuelsmod:ranliaotaozhuangbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("strangefuelsmod:ranliaotaozhuanglegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("strangefuelsmod:ranliaotaozhuangboots")
	public static final Item boots = null;
	public ItemRanliaotaozhuang(ElementsStrangeFuelsMod instance) {
		super(instance, 295);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("RANLIAOTAOZHUANG", "strangefuelsmod:taozhuang_", 64, new int[]{16, 16, 16, 16},
				16, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.armorstand.break")),
				3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ranliaotaozhuanghelmet")
				.setRegistryName("ranliaotaozhuanghelmet").setCreativeTab(TabStrangeFuelsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureRanliaotaozhuangBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("ranliaotaozhuangbody").setRegistryName("ranliaotaozhuangbody").setCreativeTab(TabStrangeFuelsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("ranliaotaozhuanglegs")
				.setRegistryName("ranliaotaozhuanglegs").setCreativeTab(TabStrangeFuelsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ranliaotaozhuangboots")
				.setRegistryName("ranliaotaozhuangboots").setCreativeTab(TabStrangeFuelsMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("strangefuelsmod:ranliaotaozhuanghelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("strangefuelsmod:ranliaotaozhuangbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("strangefuelsmod:ranliaotaozhuanglegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("strangefuelsmod:ranliaotaozhuangboots", "inventory"));
	}
}
