package sheenrox82.RioV.src.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.world.feature.WorldGenCherryBlossomTree;
import sheenrox82.RioV.src.world.feature.WorldGenShrine;
import sheenrox82.RioV.src.world.mineable.WorldGenBalance;
import sheenrox82.RioV.src.world.mineable.WorldGenEndMineable;
import sheenrox82.RioV.src.world.mineable.WorldGenNetherMineable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator 
{

	public int i;
	public int Xcoord;
	public int Ycoord;
	public int Zcoord;

	public WorldGen() 
	{

	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId)
		{
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random rand, int blockX, int blockZ) 
	{
		for (int i = 0; i < 8; i++) 
		{
			int Xcoord = blockX + rand.nextInt(16);
			int YcoordEnd = rand.nextInt(56);
			int Zcoord = blockZ + rand.nextInt(16);
			(new WorldGenEndMineable(RioVBlocks.dragonOre, 3)).generate(world, rand, Xcoord, YcoordEnd, Zcoord);
		}
	}

	private void generateSurface(World world, Random rand, int blockX, int blockZ) 
	{
		int d, y;
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(blockX, blockZ);
		WorldGenCherryBlossomTree tree = new WorldGenCherryBlossomTree(false);
		WorldGenShrine shrine = new WorldGenShrine();

		for (int i = 0; i < 8; i++) 
		{
			int Xcoord = blockX + rand.nextInt(16);
			int YcoordSurface1 = rand.nextInt(50);
			int YcoordSurface2 = rand.nextInt(40);
			int YcoordSurface3 = rand.nextInt(30);
			int YcoordSurface4 = rand.nextInt(20);
			int YcoordSurface5 = rand.nextInt(10);
			int Zcoord = blockZ + rand.nextInt(16);
			(new WorldGenMinable(RioVBlocks.onyxOre, 4)).generate(world, rand, Xcoord, YcoordSurface2, Zcoord);
			(new WorldGenMinable(RioVBlocks.garnetOre, 3)).generate(world, rand, Xcoord, YcoordSurface3, Zcoord);
			(new WorldGenMinable(RioVBlocks.nironiteOre, 3)).generate(world, rand, Xcoord, YcoordSurface4, Zcoord);
			(new WorldGenMinable(RioVBlocks.amethystOre, 4)).generate(world, rand, Xcoord, YcoordSurface2, Zcoord);
			(new WorldGenMinable(RioVBlocks.slate, 8)).generate(world, rand, Xcoord, YcoordSurface3, Zcoord);
		}

		/**for(int var5 = 0; var5 < 1; ++var5)
		{
			int var6 = blockX + rand.nextInt(16);
			int var7 = world.getHeightValue(blockX, blockZ);
			int var8 = blockZ + rand.nextInt(16);

			new WorldGenFlowers(RioVBlocks.blackDuriiPlant).generate(world, rand, var6, var7, var8);
			new WorldGenFlowers(RioVBlocks.tomatoPlant).generate(world, rand, var6, var7, var8);
			new WorldGenFlowers(RioVBlocks.grapePlant).generate(world, rand, var6, var7, var8);
			new WorldGenFlowers(RioVBlocks.pepperPlant).generate(world, rand, var6, var7, var8);
			new WorldGenFlowers(RioVBlocks.blueFlower).generate(world, rand, var6, var7, var8);
			new WorldGenFlowers(RioVBlocks.blueBerryBush).generate(world, rand, var6, var7, var8);
			new WorldGenFlowers(RioVBlocks.blackBerryBush).generate(world, rand, var6, var7, var8);
			new WorldGenFlowers(RioVBlocks.raspBerryBush).generate(world, rand, var6, var7, var8);
			new WorldGenFlowers(RioVBlocks.strawberryBush).generate(world, rand, var6, var7, var8);
		}**/

		if((biome instanceof BiomeGenForest)) 
		{
			for(int x = 0; x < 2; x++)
			{
				int i = blockX + rand.nextInt(16);
				int k = blockZ + rand.nextInt(16);
				int j = world.getHeightValue(i, k);
				tree.generate(world, rand, i, j, k);
			}
		}

		if((biome instanceof BiomeGenPlains)) 
		{
			for(int x = 0; x < 2; x++)
			{
				int i = blockX + rand.nextInt(16);
				int k = blockZ + rand.nextInt(16);
				int j = world.getHeightValue(i, k);
				tree.generate(world, rand, i, j, k);
			}
		}

		if((biome instanceof BiomeGenForest)) 
		{
			for(int x = 0; x < 1; x++)
			{
				int i = blockX + rand.nextInt(16);
				int k = blockZ + rand.nextInt(16);
				int j = world.getHeightValue(i, k);
				//shrine.generate(world, rand, i, j, k);
			}
		}
	}

	private void generateNether(World world, Random rand, int blockX, int blockZ) 
	{
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(blockX, blockZ);

		for (int i = 0; i < 8; i++) 
		{
			int Xcoord = blockX + rand.nextInt(16);
			int YcoordNether1 = rand.nextInt(128);
			int YcoordNether2 = rand.nextInt(100);
			int Zcoord = blockZ + rand.nextInt(16);
			(new WorldGenNetherMineable(RioVBlocks.netherCrystal, 9)).generate(world, rand, Xcoord, YcoordNether1, Zcoord);
			(new WorldGenNetherMineable(RioVBlocks.bloodRock, 20)).generate(world, rand, Xcoord, YcoordNether2, Zcoord);
		}	
	}
}
