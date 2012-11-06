package vCraft.common.items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import vCraft.common.lib.Reference;

public class CobbleChunkItem extends Item {
	public CobbleChunkItem(int i) {
		super(i);
	    setTextureFile(Reference.ITEM_SPRITE_SHEET);
	    setIconIndex(66);
	}
}
