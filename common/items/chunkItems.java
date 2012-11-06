package vCraft.common.items;

import java.util.Random;

import vCraft.common.lib.Reference;



import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;

public class chunkItems extends Item {
	
	public static String[] chunkNames = {
		"Sodium Chunk",
		"Calcium Chunk",
		"Magnesium Chunk",
		"Aluminium Chunk",
		"Zinc Chunk",
		"Lead Chunk",
		"Magnetite Chunk",
		"Titanium Chunk",
		"Chromium Chunk",
		"Cobalt Chunk",
		"Nickel Chunk",
		"Platinum Chunk",
		"Mercury Chunk",
		"Lithium Chunk",
		"Plutonium Chunk",
		"Arsenic Chunk",
	};
	
	public chunkItems(int i) {
		super(i);
	    setTextureFile(Reference.ITEM_SPRITE_SHEET);
	    setCreativeTab(CreativeTabs.tabMaterials);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
    public int getIconFromDamage(int par1)
    {
        return this.iconIndex = par1+32;
    }
    
    public String getItemNameIS(ItemStack par1ItemStack)
    {
        int var2 = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return super.getItemName() + "." + chunkNames[var2];
    }
}
