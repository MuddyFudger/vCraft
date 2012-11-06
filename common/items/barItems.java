package vCraft.common.items;

import java.util.Random;

import vCraft.common.lib.Reference;



import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModLoader;

public class barItems extends Item {
	
	public static String[] blockNames = {
		"Sodium Ingot",
		"Calcium Ingot",
		"Magnesium Ingot",
		"Aluminium Ingot",
		"Zinc Ingot",
		"Lead Ingot",
		"Magnetite Ingot",
		"Titanium Ingot",
		"Chromium Ingot",
		"Cobalt Ingot",
		"Nickel Ingot",
		"Platinum Ingot",
		"Mercury Ingot",
		"Lithium Ingot",
		"Plutonium Ingot",
		"Arsenic Ingot"
	};
	
	public barItems(int i) {
		super(i);
	    setTextureFile(Reference.ITEM_SPRITE_SHEET);
	    setCreativeTab(CreativeTabs.tabMaterials);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
    public int getIconFromDamage(int par1)
    {
        return this.iconIndex = par1+16;
    }
    
    public String getItemNameIS(ItemStack par1ItemStack)
    {
        int var2 = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return super.getItemName() + "." + blockNames[var2];
    }
 }
