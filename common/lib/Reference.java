package vCraft.common.lib;

import vCraft.common.*;

import net.minecraft.src.CreativeTabs;

public class Reference {

    /* Debug Mode On-Off */
    public static final boolean DEBUG_MODE = false;
    
    /* Custom Creative Tab */
    public static final CreativeTabs CREATIVE_TAB_ID = vCraft.vCraftTab;
    public static final String CREATIVE_TAB_NAME = "vCraft Mod Items";
    
    /* General Mod related constants */
    public static final String MOD_ID = "vCraft";
    public static final String MOD_NAME = "vCraft";
    public static final String VERSION = "Beta 1.0";
    public static final String CHANNEL_NAME = MOD_ID;
    public static final int SECOND_IN_TICKS = 20;
    public static final int SHIFTED_ID_RANGE_CORRECTION = 256;
    
    public static final String SERVER_PROXY_CLASS = "vCraft.common.core.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "vCraft.client.core.ClientProxy";

    /* Texture related constants */
    public static final String SPRITE_SHEET_LOCATION = "/vCraft/resources/vCraft/textures/sprites/";
    public static final String ARMOR_SHEET_LOCATION = "/vCraft/resources/vCraft/textures/armor/";
    public static final String GUI_SHEET_LOCATION = "/vCraft/resources/vCraft/textures/gui/";
    public static final String ITEM_SPRITE_SHEET = "/vCraft/resources/vCraft/textures/items.png";
    public static final String BLOCK_SPRITE_SHEET = "/vCraft/resources/vCraft/textures/blocks.png";
    public static final String ORE_SPRITE_SHEET = "/vCraft/resources/vCraft/textures/ores.png";
}