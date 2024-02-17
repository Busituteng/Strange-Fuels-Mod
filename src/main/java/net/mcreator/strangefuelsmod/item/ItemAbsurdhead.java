
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

import net.mcreator.strangefuelsmod.procedure.ProcedureAbsurdheadBodyTickEvent;
import net.mcreator.strangefuelsmod.creativetab.TabStrangeFuelsMod;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ItemAbsurdhead extends ElementsStrangeFuelsMod.ModElement {
	@GameRegistry.ObjectHolder("strangefuelsmod:absurdheadhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("strangefuelsmod:absurdheadbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("strangefuelsmod:absurdheadlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("strangefuelsmod:absurdheadboots")
	public static final Item boots = null;
	public ItemAbsurdhead(ElementsStrangeFuelsMod instance) {
		super(instance, 455);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ABSURDHEAD", "strangefuelsmod:head_", 35, new int[]{0, 0, 0, 18}, 14,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.irongolem.hurt")),
				2.8000000000000003f);
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
					ProcedureAbsurdheadBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("absurdheadhelmet").setRegistryName("absurdheadhelmet").setCreativeTab(TabStrangeFuelsMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("strangefuelsmod:absurdheadhelmet", "inventory"));
	}
}
