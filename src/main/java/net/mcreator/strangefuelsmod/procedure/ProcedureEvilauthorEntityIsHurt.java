package net.mcreator.strangefuelsmod.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;

import net.mcreator.strangefuelsmod.entity.EntityMoonman;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureEvilauthorEntityIsHurt extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureEvilauthorEntityIsHurt(ElementsStrangeFuelsMod instance) {
		super(instance, 421);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EvilauthorEntityIsHurt!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EvilauthorEntityIsHurt!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EvilauthorEntityIsHurt!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EvilauthorEntityIsHurt!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString(
						"\u51E1\u4EBA\uFF0C\u653E\u5F03\u5427\uFF0C\u4F60\u662F\u4F24\u5BB3\u4E0D\u5230\u6211\u7684\uFF0C\u6211\u662F\u65E0\u654C\u7684\u5B58\u5728\uFF01"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString(
						"\u53BB\u5427\uFF0C\u6211\u7684\u519B\u56E2\uFF01\u65E0\u654C\u7684\u519B\u56E2\uFF01\u6495\u788E\u4F60\u9762\u524D\u90A3\u4E2A\u5F31\u5C0F\u7684\u51E1\u4EBA\u5427\uFF01"));
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoonman.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoonman.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoonman.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoonman.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
