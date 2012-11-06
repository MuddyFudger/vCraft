package vCraft.client.core;


import vCraft.common.core.CommonProxy;
import vCraft.common.items.Items;
import vCraft.common.lib.Recipes;
import vCraft.common.lib.Smelting;
import net.minecraft.client.Minecraft;
import net.minecraft.src.EnumRarity;
import net.minecraftforge.client.EnumHelperClient;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ClientProxy extends CommonProxy {
		
	public ClientProxy() {
		
        Textures.init();
        
	}
	
}