package net.mcreator.strangefuelsmod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.strangefuelsmod.item.ItemRanliaotaozhuang;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureRanliaotaozhuangBodyTickEvent extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureRanliaotaozhuangBodyTickEvent(ElementsStrangeFuelsMod instance) {
		super(instance, 298);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RanliaotaozhuangBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemRanliaotaozhuang.body, (int) (1)).getItem()) && (entity instanceof EntityPlayer))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 1999980, (int) 2));
		}
	}
}
