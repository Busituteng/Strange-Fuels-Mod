package net.mcreator.strangefuelsmod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.strangefuelsmod.item.ItemTHXFP;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureEvilauthorEntityDies extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureEvilauthorEntityDies(ElementsStrangeFuelsMod instance) {
		super(instance, 422);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EvilauthorEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString(
						"\u4E0D\uFF0C\u4E0D\u53EF\u80FD\uFF0C\u8FD9\u4E0D\u53EF\u80FD\uFF0C\u4F60\u662F\u600E\u4E48\u4F24\u5BB3\u6211\u7684\uFF1F\u8FD9\u4E0D\u53EF\u80FD\uFF01\uFF01\uFF01"));
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemTHXFP.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString(
						"\u5982\u679C\u6CA1\u6709\u6B63\u5E38\u83B7\u53D6\u5236\u4F5C\u8005\u540D\u5355\uFF0C\u8BF7\u8F93\u5165/credit\u6307\u4EE4\u83B7\u53D6\u3002"));
		}
	}
}
