package net.mcreator.strangefuelsmod.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureEvilauthorItIsStruckByLightning extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureEvilauthorItIsStruckByLightning(ElementsStrangeFuelsMod instance) {
		super(instance, 423);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString(
						"\u8FD9\u662F\u96F7\u7535\u7684\u529B\u91CF\uFF0C\u54C8\u54C8\u54C8\uFF01\u66B4\u98CE\u96E8\u6765\u7684\u66F4\u731B\u70C8\u4E9B\u5427\uFF01\u6211\u4E0D\u6015\uFF01\u54C8\u54C8\uFF01\uFF01\uFF01"));
		}
	}
}
