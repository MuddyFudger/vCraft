package vCraft.common.world;


import java.util.Random;

import vCraft.common.*;
import vCraft.common.blocks.*;
import vCraft.common.core.*;
import vCraft.common.items.*;
import vCraft.common.lib.*;

import cpw.mods.fml.common.IWorldGenerator;


import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;

public class worldgen implements IWorldGenerator {
	public worldgen() {
		super();
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		if( !world.provider.isHellWorld ) {
			
			generateSurface(world, random, chunkX*16, chunkZ*16);
			
		}
				
	}
	
	public void generateSurface(World world, Random random, int blockX, int blockZ) {
		int x = blockX + random.nextInt(16);
		int z = blockZ + random.nextInt(16);

		int y0 = random.nextInt(25);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 0, 16)).generate(world, random, x, y0, z);
		int y1 = random.nextInt(128);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 1, 12)).generate(world, random, x, y1, z);
		int y2 = random.nextInt(128);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 2, 12)).generate(world, random, x, y2, z);
		int y3 = random.nextInt(64);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 3, 15)).generate(world, random, x, y3, z);
		int y4 = random.nextInt(64);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 4, 8)).generate(world, random, x, y4, z);
		int y5 = random.nextInt(64);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 5, 4)).generate(world, random, x, y5, z);
		int y6 = random.nextInt(8);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 6, 2)).generate(world, random, x, y6, z);
		int y7 = random.nextInt(5);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 7, 1)).generate(world, random, x, y7, z);
		int y8 = random.nextInt(10);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 8, 12)).generate(world, random, x, y8, z);
		int y9 = random.nextInt(16);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 9, 8)).generate(world, random, x, y9, z);
		int y10 = random.nextInt(16);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 10, 8)).generate(world, random, x, y10, z);
		int y11 = random.nextInt(16);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 11, 1)).generate(world, random, x, y11, z);
		int y12 = random.nextInt(16);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 12, 4)).generate(world, random, x, y12, z);
		int y13 = random.nextInt(128);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 13, 2)).generate(world, random, x, y13, z);
		int y14 = random.nextInt(5);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 14, 1)).generate(world, random, x, y14, z);
		int y15 = random.nextInt(12);
		(new WorldGenMinable(BlockIds.BLOCKS_DEFAULT, 15, 3)).generate(world, random, x, y15, z);
	}
}
