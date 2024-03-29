package net.mcreator.strangefuelsmod.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.strangefuelsmod.entity.EntityEvilauthor;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureEvilauthor1 extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureEvilauthor1(ElementsStrangeFuelsMod instance) {
		super(instance, 427);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Evilauthor1!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Evilauthor1!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Evilauthor1!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Evilauthor1!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityEvilauthor.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
