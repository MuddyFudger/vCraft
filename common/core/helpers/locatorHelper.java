package vCraft.common.core.helpers;

import vCraft.common.vCraft;
import vCraft.common.lib.GuiIds;
import vCraft.common.lib.ItemIds;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;

public class locatorHelper {

	public static boolean locatorAction(World world, EntityPlayer player, ItemStack itemStack) {
  		player.openGui(vCraft.instance, GuiIds.LOCATOR_DEFAULT, world, (int)player.posX, (int)player.posY, (int)player.posZ);
		return false;
	}
	
}
