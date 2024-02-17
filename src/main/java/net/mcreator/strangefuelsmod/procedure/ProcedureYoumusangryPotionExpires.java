package net.mcreator.strangefuelsmod.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureYoumusangryPotionExpires extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureYoumusangryPotionExpires(ElementsStrangeFuelsMod instance) {
		super(instance, 439);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure YoumusangryPotionExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).addExperienceLevel(-((int) 1));
	}
}
