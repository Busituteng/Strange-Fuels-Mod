
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

import net.mcreator.strangefuelsmod.procedure.ProcedureReimusbfHelmetTickEvent;
import net.mcreator.strangefuelsmod.creativetab.TabStrangeFuelsMod;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ItemReimusbf extends ElementsStrangeFuelsMod.ModElement {
	@GameRegistry.ObjectHolder("strangefuelsmod:reimusbfhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("strangefuelsmod:reimusbfbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("strangefuelsmod:reimusbflegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("strangefuelsmod:reimusbfboots")
	public static final Item boots = null;
	public ItemReimusbf(ElementsStrangeFuelsMod instance) {
		super(instance, 459);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("REIMUSBF", "strangefuelsmod:reimubf_", 32, new int[]{0, 0, 0, 10}, 16,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.armorstand.hit")),
				2.4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureReimusbfHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("reimusbfhelmet").setRegistryName("reimusbfhelmet").setCreativeTab(TabStrangeFuelsMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("strangefuelsmod:reimusbfhelmet", "inventory"));
	}
}
