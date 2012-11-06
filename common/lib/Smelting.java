package vCraft.common.lib;

import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Smelting {
	public static void init() {
		GameRegistry.addSmelting(new ItemStack(BlockIds.BLOCKS_DEFAULT, 1, 6).itemID, new ItemStack(ItemIds.BARS_DEFAULT, 1, 6), 64f);
		GameRegistry.addSmelting(new ItemStack(ItemIds.LARGE_CHUNKS_DEFAULT, 1, 6).itemID, new ItemStack(ItemIds.BARS_DEFAULT, 1, 6), 64f);
	}
}
