package vCraft.common.blocks;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import java.util.List;
import java.util.Random;

import vCraft.common.lib.Reference;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.Chunk;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Facing;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;

public class MachineBlock extends Block {
	
	public int topTexture = 4;
	
    public MachineBlock(int i) {
		super(i, Material.rock);
	    this.setTextureFile(Reference.BLOCK_SPRITE_SHEET);
    }
    
	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
		switch(side) {
			default: return 4; // Bottom
			case 1: return topTexture;  // Top
			case 2: return 4;  // Left
			case 3: return 4;  // Right
			case 4: return 4;  // Front
			case 5: return 4;  // Back
		}
	}
	
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public void randomDisplayTick(World world, int x, int y, int z, Random random) {
    	if( random.nextInt(16) == 0 ) {
    		if (world.getBlockId(x, y+1, z) == Block.glass.blockID) {
    			topTexture = 5;
    		}else{
    			topTexture = 4;
    		}
        }
	}

	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityliving)
	{
		world.markBlockAsNeedsUpdate(x, y, z);
		world.updateAllLightTypes(x, y, z);
	}

}
