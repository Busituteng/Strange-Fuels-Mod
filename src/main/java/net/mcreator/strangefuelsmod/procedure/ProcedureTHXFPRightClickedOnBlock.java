package net.mcreator.strangefuelsmod.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureTHXFPRightClickedOnBlock extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureTHXFPRightClickedOnBlock(ElementsStrangeFuelsMod instance) {
		super(instance, 433);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("---------------------------------------------------------------"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u5236\u4F5C\u8005\u540D\u5355\uFF1A"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u4F5C\u8005\uFF1ABunnimimiTotem"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u7F8E\u5DE5\uFF1ABunnimimiTotem"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u7B56\u5212\uFF1ABunnimimiTotem"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u7A0B\u5E8F\uFF1AMCr"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u4F5C\u8005\u7684\u8BDD\uFF1A"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString(
						"\u5F53\u4F60\u770B\u5230\u8FD9\u4E2A\u540D\u5355\u65F6\uFF0C\u5C31\u610F\u5473\u7740\u4F60\u5DF2\u7ECF\u901A\u5173\u4E86\u8FD9\u4E2A\u6A21\u7EC4\uFF0C\u51FB\u8D25\u4E86\u6700\u7EC8Boss\u3002"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u8FD9\u662F\u4E2A\u6F2B\u957F\u7684\u8FC7\u7A0B"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(
						new TextComponentString("\u4E00\u6B21\u6B21\u6316\u77FF\uFF0C\u6253\u602A\uFF0C\u6B7B\u4EA1\uFF0C\u91CD\u751F..."));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString(
						"\u5F53\u4F60\u770B\u5230\u8FD9\u6BB5\u8BDD\u65F6\uFF0C\u5C31\u610F\u5473\u7740\u8FD9\u4E2A\u6A21\u7EC4\u7684\u4E3B\u7EBF\u5192\u9669\u90E8\u5206\u5DF2\u7ECF\u5230\u5934\u4E86\uFF0C\u4E0D\u4F1A\u6709\u66F4\u591A\u7684\u5185\u5BB9\u4E86\u3002"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString(
						"\u611F\u8C22\u4F60\u6E38\u73A9\u672C\u6A21\u7EC4\u6216\u53C2\u4E0E\u672C\u6A21\u7EC4\u7684\u4FEE\u6B63\u3002"));
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u4F5C\u8005\uFF1ABunnimimiTotem"));
		}
	}
}
