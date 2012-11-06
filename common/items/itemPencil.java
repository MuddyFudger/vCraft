package vCraft.common.items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.server.MinecraftServer;
import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;
import vCraft.common.vCraft;
import vCraft.common.blocks.OreItems;
import vCraft.common.lib.Reference;

public class itemPencil extends Item {
	
	protected itemPencil(int par1) {
		super(par1);
        this.setTextureFile(Reference.ITEM_SPRITE_SHEET);
	    this.setIconIndex(67);
	}
	
    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }
    
    public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {

    	if( !world.isRemote ) {
       		Minecraft mc = Minecraft.getMinecraft();

       		if((mc.renderViewEntity.rayTrace(200, 1.0F) != null)){
    			int blockHitX = mc.renderViewEntity.rayTrace(200, 1.0F).blockX;
    			int blockHitY = mc.renderViewEntity.rayTrace(200, 1.0F).blockY;
    			int blockHitZ = mc.renderViewEntity.rayTrace(200, 1.0F).blockZ;
    			
    			if( world.getBlockId(blockHitX, blockHitY, blockHitZ) == 201 ) {
    				player.sendChatToPlayer("Machine Block");
    			}else if( world.getBlockId(blockHitX, blockHitY, blockHitZ) == 200 ) {
    				player.sendChatToPlayer("vCraft Ore '" + OreItems.blockNames[world.getBlockMetadata(blockHitX, blockHitY, blockHitZ)] + "' Found!");
    			}else{
    				player.sendChatToPlayer( "ID: " + world.getBlockId(blockHitX, blockHitY, blockHitZ) );
    			}
    		}
    	}
    	
		return is;
    }
    
}
