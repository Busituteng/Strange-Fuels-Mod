package net.mcreator.strangefuelsmod.procedure;

import net.minecraft.world.World;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureTNT extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureTNT(ElementsStrangeFuelsMod instance) {
		super(instance, 319);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure TNT!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure TNT!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure TNT!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TNT!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((FurnaceRecipes.instance().getSmeltingResult(new ItemStack(Blocks.TNT, (int) (1))) != ItemStack.EMPTY)) {
			if (!world.isRemote) {
				world.createExplosion(null, (int) x, (int) y, (int) z, (float) 6, true);
			}
		}
	}
}
