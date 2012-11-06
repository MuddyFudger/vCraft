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

public class chunkLoaderBlock extends Block {
	
    public chunkLoaderBlock(int i) {
		super(i, Material.rock);
	    this.setTextureFile(Reference.BLOCK_SPRITE_SHEET);
    }
    
	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
		switch(side) {
			default: return 4; // Bottom
			case 1: return 4;  // Top
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
    
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
	{
		if (world.isBlockIndirectlyGettingPowered(x, y + 1, z) && world.getBlockMetadata(z, y, z) == 0)
		{
			Chunk chunkInside = world.getChunkFromBlockCoords(x, z);
			int xPosMax = chunkInside.xPosition << 4;
			int zPosMax = chunkInside.zPosition << 4;
			
			String particle = "townaura";
			
           	for( int i = 0; i <=15; ++i ) {
           		for( int j = 0; j <= 15; ++j ) {
           			for( int k = -8; k <= 8; ++k) {
           				world.spawnParticle(particle, xPosMax + i + 0.5, y + k, zPosMax + j + 0.5, 0, 0, 0);
           			}
				}
           	}
		}
	}

	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityliving)
	{
		world.markBlockAsNeedsUpdate(x, y, z);
		world.updateAllLightTypes(x, y, z);
	}

}
