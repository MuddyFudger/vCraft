package vCraft.common.items;

import java.util.Random;

import vCraft.common.lib.Reference;



import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;

public class largeChunkItems extends Item {
	
	public static String[] largeChunkNames = {
		"Large Sodium Chunk",
		"Large Calcium Chunk",
		"Large Magnesium Chunk",
		"Large Aluminium Chunk",
		"Large Zinc Chunk",
		"Large Lead Chunk",
		"Large Magnetite Chunk",
		"Large Titanium Chunk",
		"Large Chromium Chunk",
		"Large Cobalt Chunk",
		"Large Nickel Chunk",
		"Large Platinum Chunk",
		"Large Mercury Chunk",
		"Large Lithium Chunk",
		"Large Plutonium Chunk",
		"Large Arsenic Chunk",
	};
	
	public largeChunkItems(int i) {
		super(i);
	    setTextureFile(Reference.ITEM_SPRITE_SHEET);
	    setCreativeTab(CreativeTabs.tabMaterials);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
    public int getIconFromDamage(int par1)
    {
        return this.iconIndex = par1+48;
    }
    
    public String getItemNameIS(ItemStack par1ItemStack)
    {
        int var2 = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return super.getItemName() + "." + largeChunkNames[var2];
    }
}
