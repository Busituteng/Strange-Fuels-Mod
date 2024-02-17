package net.mcreator.strangefuelsmod.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureEvilauthorRightClickedOnEntity extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureEvilauthorRightClickedOnEntity(ElementsStrangeFuelsMod instance) {
		super(instance, 424);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString(
						"\u4F60\u53F3\u952E\u6211\u5E72\u4EC0\u4E48\uFF1F\u6211\u53C8\u4E0D\u662FNPC\uFF0C\u6211\u4E0D\u5356\u4E1C\u897F\uFF0C\u4F60\u4E5F\u4E0D\u914D\uFF01\uFF01\uFF01"));
		}
	}
}
