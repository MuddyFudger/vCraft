package vCraft.common.core.helpers;

import java.util.Random;

import vCraft.common.blocks.OreItems;
import vCraft.common.items.Items;
import vCraft.common.lib.BlockIds;
import vCraft.common.lib.ItemIds;

import net.minecraft.src.Block;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;


public class magnetHelper extends Block {

	public magnetHelper(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);
	}

	public static boolean magnetAction(World world, EntityPlayer player, ItemStack stack, int x, int y, int z) {
		int id = world.getBlockId(x, y, z);
		int meta = world.getBlockMetadata(x, y, z);

        if ( !world.isRemote ) {
	    	if( player.inventory.getCurrentItem().itemID == (ItemIds.MAGNET_DEFAULT+256) ) {
        		Random rn = new Random();
       			int r = rn.nextInt(2)+3;
       			int cr = rn.nextInt(2)+2;
        		if( id == BlockIds.BLOCKS_DEFAULT ) {
        			ItemStack item = new ItemStack(Items.Chunks, r, meta);
        			ItemStack item2 = new ItemStack(Items.CobbleChunk, cr, 0);

       	            float var6 = 0.7F;
       	            double var7 = (double)(world.rand.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
       	            double var9 = (double)(world.rand.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
       	            double var11 = (double)(world.rand.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
       				if( world.spawnEntityInWorld(new EntityItem(world, (double)x +var7, (double)y +var9, (double)z +var11, item)) ) {
           				if( world.spawnEntityInWorld(new EntityItem(world, (double)x +var7, (double)y +var9, (double)z +var11, item2)) ) {
           					world.setBlockWithNotify(x, y, z, 0);
           					world.playSoundAtEntity(player, "random.fizz", 0.4F, 2.0F + world.rand.nextFloat() * 0.4F);
           					damageItem(player.getCurrentEquippedItem());
           				}
       				}
   	        		   	        		
        			return true;
	        	}
        	}else{
        		return false;
        	}
        }
		return false;
	}
	
    public static void damageItem(ItemStack is) {
    	EntityPlayer player = ModLoader.getMinecraftInstance().thePlayer;
    	is.damageItem(1, player);
    }

}
