package vCraft.common.items;

import java.util.Random;

import vCraft.common.lib.Reference;



import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;

public class vanillaDustItems extends Item {
	
	public static String[] dustNames = {
		"Diamond Powder",
		"Iron Powder",
		"Gold Powder",
		"Emerald Powder"
	};
	
	public vanillaDustItems(int i) {
		super(i);
	    setTextureFile(Reference.ITEM_SPRITE_SHEET);
	    setCreativeTab(CreativeTabs.tabMaterials);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
    public int getIconFromDamage(int par1)
    {
        return this.iconIndex = par1+76;
    }
    
    public String getItemNameIS(ItemStack par1ItemStack)
    {
        int var2 = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return super.getItemName() + "." + dustNames[var2];
    }
}
