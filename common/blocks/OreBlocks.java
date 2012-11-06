package vCraft.common.blocks;

import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import vCraft.common.vCraft;
import vCraft.common.items.ItemMagnet;
import vCraft.common.lib.ItemIds;
import vCraft.common.lib.Reference;


import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;

public class OreBlocks extends Block {
	
	public OreBlocks(int i) {
		super(i, Material.rock);
	    setTextureFile(Reference.ORE_SPRITE_SHEET);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(5.0F);
		this.setHardness(3.0F);
	}
	
	public int idDropped(int metadata, Random random) {
		return blockID;
	}
	
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
    	return false;
    }
	
	public int damageDropped(int metadata) {
		return metadata;
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
		return metadata;
	}

}
