package vCraft.common.core;

import vCraft.common.items.Items;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class CreativeTabvCraft extends CreativeTabs {

	public CreativeTabvCraft(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)

    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {
        return Items.ItemMagnet.shiftedIndex;
    }

}