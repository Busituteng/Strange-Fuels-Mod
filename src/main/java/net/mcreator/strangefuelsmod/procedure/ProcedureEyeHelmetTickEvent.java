package net.mcreator.strangefuelsmod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.strangefuelsmod.item.ItemEye;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureEyeHelmetTickEvent extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureEyeHelmetTickEvent(ElementsStrangeFuelsMod instance) {
		super(instance, 477);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EyeHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemEye.helmet, (int) (1)).getItem()) && (entity instanceof EntityPlayer))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 1200, (int) 1));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 400, (int) 3));
		}
	}
}
