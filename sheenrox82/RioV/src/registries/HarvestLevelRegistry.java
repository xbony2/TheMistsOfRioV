package sheenrox82.RioV.src.registries;

import net.minecraftforge.common.MinecraftForge;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;

public class HarvestLevelRegistry 
{
	public static void addHarvestLevels()
	{
		/**
		//0's
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.infuser, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.infuser, "pickaxe", 0);
		//0's

		//1's
		MinecraftForge.setToolClass(RioVItems.skywoodPickaxe, "pickaxe", 1);
		MinecraftForge.setToolClass(RioVItems.skywoodAxe, "axe", 1);
		MinecraftForge.setToolClass(RioVItems.skywoodShovel, "shovel", 1);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.slate, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.sanctuaryStone, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.flamonorRock, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.amethystOre, "pickaxe", 1);
		//1's

		//2's
		MinecraftForge.setToolClass(RioVItems.glimmerwoodPickaxe, "pickaxe", 2);
		MinecraftForge.setToolClass(RioVItems.glimmerwoodAxe, "axe", 2);
		MinecraftForge.setToolClass(RioVItems.glimmerwoodShovel, "shovel", 2);
		MinecraftForge.setToolClass(RioVItems.cherryBlossomPickaxe, "pickaxe", 2);
		MinecraftForge.setToolClass(RioVItems.cherryBlossomAxe, "axe", 2);
		MinecraftForge.setToolClass(RioVItems.cherryBlossomShovel, "shovel", 2);
		MinecraftForge.setToolClass(RioVItems.bloodPickaxe, "pickaxe", 2);
		MinecraftForge.setToolClass(RioVItems.bloodAxe, "axe", 2);
		MinecraftForge.setToolClass(RioVItems.bloodShovel, "shovel", 2);
		MinecraftForge.setToolClass(RioVItems.sanctuaryStonePickaxe, "pickaxe", 2);
		MinecraftForge.setToolClass(RioVItems.sanctuaryStoneAxe, "axe", 2);
		MinecraftForge.setToolClass(RioVItems.sanctuaryStoneShovel, "shovel", 2);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.onyxOre, "pickaxe", 2);
		//2's

		//3's
		MinecraftForge.setToolClass(RioVItems.amethystPickaxe, "pickaxe", 3);
		MinecraftForge.setToolClass(RioVItems.amethystAxe, "axe", 3);
		MinecraftForge.setToolClass(RioVItems.amethystShovel, "shovel", 3);
		MinecraftForge.setToolClass(RioVItems.onyxPickaxe, "pickaxe", 3);
		MinecraftForge.setToolClass(RioVItems.onyxAxe, "axe", 3);
		MinecraftForge.setToolClass(RioVItems.onyxShovel, "shovel", 3);
		MinecraftForge.setToolClass(RioVItems.infusedAmethystPickaxe, "pickaxe", 3);
		MinecraftForge.setToolClass(RioVItems.infusedAmethystAxe, "axe", 3);
		MinecraftForge.setToolClass(RioVItems.infusedAmethystShovel, "shovel", 3);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.garnetOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.bloodRock, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.blackRock, "pickaxe", 3);
		//3's

		//4's
		MinecraftForge.setToolClass(RioVItems.infusedOnyxPickaxe, "pickaxe", 4);
		MinecraftForge.setToolClass(RioVItems.infusedOnyxAxe, "axe", 4);
		MinecraftForge.setToolClass(RioVItems.infusedOnyxShovel, "shovel", 4);
		MinecraftForge.setToolClass(RioVItems.blindonitePickaxe, "pickaxe", 4);
		MinecraftForge.setToolClass(RioVItems.blindoniteAxe, "axe", 4);
		MinecraftForge.setToolClass(RioVItems.blindoniteShovel, "shovel", 4);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.blindoniteOre, "pickaxe", 4);
		//4's

		//5's
		MinecraftForge.setToolClass(RioVItems.infusedBlindonitePickaxe, "pickaxe", 5);
		MinecraftForge.setToolClass(RioVItems.infusedBlindoniteAxe, "axe", 5);
		MinecraftForge.setToolClass(RioVItems.infusedBlindoniteShovel, "shovel", 5);
		//5's

		//8's
		MinecraftForge.setToolClass(RioVItems.agonitePickaxe, "pickaxe", 8);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.nironiteOre, "pickaxe", 8);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.dragonOre, "pickaxe", 8);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.vraviniteOre, "pickaxe", 8);
		//8's

		//9's
		MinecraftForge.setToolClass(RioVItems.dragonPickaxe, "pickaxe", 9);
		MinecraftForge.setToolClass(RioVItems.dragonAxe, "axe", 9);
		MinecraftForge.setToolClass(RioVItems.dragonShovel, "shovel", 9);
		//9's

		//11's
		MinecraftForge.setToolClass(RioVItems.infusedDragonPickaxe, "pickaxe", 11);
		MinecraftForge.setToolClass(RioVItems.infusedDragonAxe, "axe", 11);
		MinecraftForge.setToolClass(RioVItems.infusedDragonShovel, "shovel", 11);
		//11's

		//12's
		MinecraftForge.setToolClass(RioVItems.vravinitePickaxe, "pickaxe", 12);
		MinecraftForge.setToolClass(RioVItems.vraviniteAxe, "axe", 12);
		MinecraftForge.setToolClass(RioVItems.vraviniteShovel, "shovel", 12);
		//12's

		//13's
		MinecraftForge.setToolClass(RioVItems.infusedVravinitePickaxe, "pickaxe", 13);
		MinecraftForge.setToolClass(RioVItems.infusedVraviniteAxe, "axe", 13);
		MinecraftForge.setToolClass(RioVItems.infusedVraviniteShovel, "shovel", 13);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.drakiuzOre, "pickaxe", 13);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.jaavikOre, "pickaxe", 13);
		//13's

		//14's
		MinecraftForge.setToolClass(RioVItems.alerisPickaxe, "pickaxe", 14);
		MinecraftForge.setToolClass(RioVItems.alerisAxe, "axe", 14);
		MinecraftForge.setToolClass(RioVItems.alerisShovel, "shovel", 14);
		MinecraftForge.setBlockHarvestLevel(RioVBlocks.alerisOre, "pickaxe", 13);
		//14's
		**/
	}
}
