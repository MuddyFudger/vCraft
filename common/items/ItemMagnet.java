package vCraft.common.items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import vCraft.common.core.helpers.magnetHelper;
import vCraft.common.lib.Reference;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class ItemMagnet extends Item {
    public ItemMagnet(int par1) {
        super(par1);
        setMaxStackSize(1);
	    setTextureFile(Reference.ITEM_SPRITE_SHEET);
	    setIconIndex(64);
        setMaxDamage(16);
    }
  
    @SideOnly(Side.CLIENT)
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int l, float f1, float f2, float f3) {
    		return magnetHelper.magnetAction(world, entityPlayer, itemStack, x, y, z);
    }
	
    public boolean isDamageable() {
        return true;
    }
}
