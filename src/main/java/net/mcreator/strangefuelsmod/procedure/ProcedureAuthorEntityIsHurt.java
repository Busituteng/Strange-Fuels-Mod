package net.mcreator.strangefuelsmod.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureAuthorEntityIsHurt extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureAuthorEntityIsHurt(ElementsStrangeFuelsMod instance) {
		super(instance, 425);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AuthorEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u4E0B\u624B\u8F7B\u70B9\uFF0C\u5F88\u75BC\u7684~"));
		}
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 100, (int) 2));
	}
}
