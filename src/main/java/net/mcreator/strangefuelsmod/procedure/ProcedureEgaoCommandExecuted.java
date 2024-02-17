package net.mcreator.strangefuelsmod.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureEgaoCommandExecuted extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureEgaoCommandExecuted(ElementsStrangeFuelsMod instance) {
		super(instance, 471);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EgaoCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u6211\u5C31\u662F\u53EB\u7D2B\u5988\u600E\u4E48\u4E86\uFF1F"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString(
						"\u6211\u4E0D\u4EC5\u8981\u8FD9\u4E48\u53EB\uFF0C\u8FD8\u8981\u770B\u7D2B\u5988\u7684\u672C\u5B50\uFF01"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList()
						.sendMessage(new TextComponentString("\u6709\u672C\u4E8B\u7A81\u7136\u4ECE\u6211\u80CC\u540E\u51FA\u73B0\uFF0C"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u628A\u6211\u6254\u5230\u865A\u7A7A\u91CC\u53BB............"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("............"));
		}
		entity.setPositionAndUpdate(0, 0, 0);
	}
}
