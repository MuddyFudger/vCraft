package vCraft.common.core;

import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.World;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy implements IGuiHandler {
		
    public void registerKeyBindingHandler() {}

    public void setKeyBinding(String name, int value) {}

    public void registerSoundHandler() {}

    public void initCustomRarityTypes() {}

    public EnumRarity getCustomRarityType(String customRarity) {
        return null;
    }
    
    public void initRenderingAndTextures() {}
    
    public void initTileEntities() {
    }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {        
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    	return null;
    }

}