package vCraft.common.items;

import java.util.Iterator;

import org.lwjgl.opengl.GL11;

import vCraft.common.core.helpers.locatorHelper;
import vCraft.common.lib.Reference;



import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemMapBase;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MapData;
import net.minecraft.src.RenderEngine;
import net.minecraft.src.Tessellator;
import net.minecraft.src.World;

public class ItemLocator extends ItemMapBase {
	public ItemLocator(int par1) {
		super(par1);
		this.setMaxStackSize(1);
        this.setTextureFile(Reference.ITEM_SPRITE_SHEET);
	    this.setIconIndex(65);
        this.setHasSubtypes(true);
	}
	
	@Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		locatorHelper.locatorAction(world, entityPlayer, itemStack);
		return itemStack;
    }
}
