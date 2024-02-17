package net.mcreator.strangefuelsmod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.strangefuelsmod.item.ItemYen;
import net.mcreator.strangefuelsmod.item.ItemReimuspants;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

@ElementsStrangeFuelsMod.ModElement.Tag
public class ProcedureTrade4 extends ElementsStrangeFuelsMod.ModElement {
	public ProcedureTrade4(ElementsStrangeFuelsMod instance) {
		super(instance, 376);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Trade4!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemYen.block, (int) (1)).getItem(), -1, (int) 64, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemYen.block, (int) (1)).getItem(), -1, (int) 64, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemYen.block, (int) (1)).getItem(), -1, (int) 64, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemYen.block, (int) (1)).getItem(), -1, (int) 64, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemYen.block, (int) (1)).getItem(), -1, (int) 64, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemYen.block, (int) (1)).getItem(), -1, (int) 64, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemYen.block, (int) (1)).getItem(), -1, (int) 64, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemYen.block, (int) (1)).getItem(), -1, (int) 64, null);
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemReimuspants.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
