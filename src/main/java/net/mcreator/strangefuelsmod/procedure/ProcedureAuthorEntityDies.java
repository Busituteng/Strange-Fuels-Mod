package net.mcreator.strangefuelsmod.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureAuthorEntityDies extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureAuthorEntityDies(ElementsStrangeFuelsMod instance) {
		super(instance, 426);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList()
						.sendMessage(new TextComponentString("\u5624\u5624\u5624\uFF0C\u679C\u7136\u7537\u751F\u90FD\u4E0D\u8BB2\u4FE1\u7528..."));
		}
	}
}
