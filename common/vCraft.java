package vCraft.common;

import vCraft.client.core.Textures;
import vCraft.common.blocks.*;
import vCraft.common.core.*;
import vCraft.common.fx.*;
import vCraft.common.items.*;
import vCraft.common.lib.*;
import vCraft.common.world.*;
import net.minecraft.client.Minecraft;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ModLoader;
import net.minecraft.src.EntityPlayer;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.asm.SideOnly;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.World;



@Mod (modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, useMetadata = true)
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false)
public class vCraft {
	
    @Instance(Reference.MOD_ID)
    public static vCraft instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

   	public static CreativeTabs vCraftTab = new CreativeTabvCraft(CreativeTabs.getNextID(), Reference.CREATIVE_TAB_NAME);
	
	@PreInit
	public void preInit( FMLPreInitializationEvent event ) {		
		proxy.registerKeyBindingHandler();
        proxy.registerSoundHandler();
	}

	@Init
	public void load( FMLInitializationEvent event ) {
		NetworkRegistry.instance().registerGuiHandler(instance, proxy);
		
		Blocks.init();
		Items.init();
		Recipes.init();
		Smelting.init();
		
		proxy.initTileEntities();
		

		GameRegistry.registerWorldGenerator(new worldgen());
	}

}
