package vCraft.client.core;

import cpw.mods.fml.common.Side;
import vCraft.common.lib.BlockIds;
import vCraft.common.lib.Reference;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;

public class Textures {

	public static void init() {
		MinecraftForgeClient.preloadTexture(Reference.BLOCK_SPRITE_SHEET);
		MinecraftForgeClient.preloadTexture(Reference.ITEM_SPRITE_SHEET);

	}
	
}
