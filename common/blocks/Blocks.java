package vCraft.common.blocks;


import vCraft.common.*;
import vCraft.common.core.*;
import vCraft.common.items.*;
import vCraft.common.blocks.*;
import vCraft.common.lib.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;

public class Blocks {
	// ORES
	public static Block Blocks = (new OreBlocks(BlockIds.BLOCKS_DEFAULT)).setBlockName("OreArray").setCreativeTab(Reference.CREATIVE_TAB_ID);

	// MACHINE BLOCK
	public static Block machineBlock = (new MachineBlock(BlockIds.MACHINE_BLOCK_DEFAULT)).setBlockName("MachineBlock").setCreativeTab(Reference.CREATIVE_TAB_ID);

	// CHUNK LOADER
	public static Block chunkLoaderBlock = (new chunkLoaderBlock(BlockIds.CHUNKLOADER_BLOCK_DEFAULT)).setBlockName("chunkLoaderBlock").setCreativeTab(Reference.CREATIVE_TAB_ID);
	
	public static void init() {
		// Ore Generation
		GameRegistry.registerBlock(Blocks, OreItems.class);
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 0), "Sodium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 1), "Calcium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 2), "Magnesium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 3), "Aluminium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 4), "Zinc Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 5), "Lead Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 6), "Magnetite Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 7), "Titanium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 8), "Chromium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 9), "Cobalt Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 10), "Nickel Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 11), "Platinum Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 12), "Mercury Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 13), "Lithium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 14), "Plutonium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 15), "Arsenic Ore");
		
		GameRegistry.registerBlock(machineBlock);
		LanguageRegistry.addName(machineBlock, "Machine Block");
		
		GameRegistry.registerBlock(chunkLoaderBlock);
		LanguageRegistry.addName(chunkLoaderBlock, "Chunk Loader");

	}
}
