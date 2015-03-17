package sheenrox82.RioV.src.content;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sheenrox82.RioV.src.api.base.RioVAPI;
import cpw.mods.fml.common.registry.GameRegistry;

public class Crafting{
	public static String[] helmet = new String[] {"XXX", "X X"};
	public static String[] chestplate = new String[] {"X X", "XXX", "XXX"};
	public static String[] leggings = new String[] {"XXX", "X X", "X X"};
	public static String[] boots = new String[] {"X X", "X X"};
	public static String[] bricks = new String[] {"XX"};
	
	public static String[] pickaxe = new String[] {"XXX", " ! ", " ! ", " ! "};
	public static String[] sword = new String[] {" X ", " X ", "XXX", " ! ",};
	public static String[] shovel = new String[] {"X", "!", "!", "!"};
	public static String[] axe = new String[] {"XX", "X!", " !", " !"};
	public static String[] bowOfWurTun = new String[] {" I*", "IB*", " I*"};
	public static String[] bow = new String[] {" I*", "I *", " I*"};
	public static String[] riovhelmet = new String[] {"XXX", "X X"};
	public static String[] riovchestplate = new String[] {"X X", "XXX", "XXX"};
	public static String[] riovleggings = new String[] {"XXX", "X X", "X X"};
	public static String[] riovboots = new String[] {"X X", "X X"};
	public static String[] flag = new String[] {"XXX", "XXX", "XXX", " ! "};
	
	public static void add(){
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.infuser, 1), "XXX", "XAX", "XXX", 'X', Blocks.obsidian, 'A', RioVItems.orb);
		GameRegistry.addRecipe(new ItemStack(RioVItems.terronCrystal, 1), "XZX", "ZAZ", "XZX", 'X', RioVItems.onyx, 'A', RioVItems.baseCrystal, 'Z',
				RioVItems.blindonite);
		GameRegistry.addRecipe(new ItemStack(RioVItems.demonAngelCrystal, 1), "XZX", "ZAZ", "XZX", 'X', RioVItems.onyx, 'A', RioVItems.baseCrystal,
				'Z', RioVItems.nironite);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.onyxBlock, 1), "XXX", "XXX", "XXX", 'X', RioVItems.onyx);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.amethystBlock, 1), "XXX", "XXX", "XXX", 'X', RioVItems.amethyst);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 0), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 1), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 14)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 2), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 13)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 3), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 12)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 4), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 5), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 10)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 6), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 9)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 7), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 8)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 8), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 7)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 9), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 6)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 10), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 5)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 11), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 12), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 13), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 14), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.plankColored, 1, 15), new Object[] {Blocks.planks, new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.blackQuartz, 1, 1), "XXX", "XXX", "XXX", 'X', RioVItems.burnedQuartz);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.nironiteBlock, 1), "XXX", "XXX", "XXX", 'X', RioVItems.nironite);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.dragonBlock, 1), "XXX", "XXX", "XXX", 'X', RioVItems.dragonSoul);
		GameRegistry.addSmelting(RioVItems.horseMeat, new ItemStack(RioVItems.cookedHorseMeat, 1), 1F);
		GameRegistry.addRecipe(new ItemStack(RioVItems.wineGlass, 1), "X X", " X ", "XXX", 'X', Blocks.glass);
		GameRegistry.addRecipe(new ItemStack(RioVItems.potionGlass, 1), " X ", "X X", "XXX", 'X', Blocks.glass);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVItems.wine, 1), new Object[] {RioVItems.grapes, RioVItems.wineGlass});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVItems.pepperSpices, 1), new Object[] {RioVItems.pepper});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVItems.spicedWine, 1), new Object[] {RioVItems.pepperSpices, RioVItems.wine});
		GameRegistry.addRecipe(new ItemStack(RioVItems.onyx, 9), "X", 'X', RioVBlocks.onyxBlock);
		GameRegistry.addRecipe(new ItemStack(RioVItems.amethyst, 9), "X", 'X', RioVBlocks.amethystBlock);
		GameRegistry.addRecipe(new ItemStack(RioVItems.burnedQuartz, 9), "X", 'X', new ItemStack(RioVBlocks.blackQuartz, 1, 1));
		GameRegistry.addRecipe(new ItemStack(RioVItems.nironite, 9), "X", 'X', RioVBlocks.nironiteBlock);
		GameRegistry.addRecipe(new ItemStack(RioVItems.dragonSoul, 9), "X", 'X', RioVBlocks.dragonBlock);
		GameRegistry.addRecipe(new ItemStack(RioVItems.theDarknessCrystal, 1), "XZX", "ZAZ", "XZX", 'X', RioVItems.onyx, 'A', RioVItems.baseCrystal,
				'Z', RioVItems.vulron);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.lamp, 1), "XZX", "ZAZ", "XZX", 'X', Blocks.planks, 'A', Blocks.torch, 'Z', Blocks.glass);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVItems.purpleFeather, 1), new Object[] {Items.feather, new ItemStack(Items.dye, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(RioVItems.darknessArrow, 5), "  *", " D ", "X  ", '*', RioVItems.ingotOfFlame, 'D', RioVItems.blackBone,
				'X', RioVItems.purpleFeather);
		GameRegistry.addRecipe(new ItemStack(RioVItems.blindOasisActivator, 1), "  *", " X ", "*  ", '*', RioVItems.onyx, 'X', new ItemStack(
				RioVBlocks.blackQuartz, 1, 1));
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.blindoniteBlock, 1), "XX", "XX", 'X', RioVItems.blindonite);
		GameRegistry.addRecipe(new ItemStack(RioVItems.vaerynActivator, 1), "  *", " X ", "*  ", '*', RioVItems.blindonite, 'X',
				RioVBlocks.blindoniteBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.glimmerwoodPlanks, 4), new Object[] {RioVBlocks.glimmerwoodLog});
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.glimmerwoodWorkbench, 1), "XX", "XX", 'X', RioVBlocks.glimmerwoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.glimmerwoodSticks, 4), "X", "X", 'X', RioVBlocks.glimmerwoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.glimmerwoodFence, 2), "XXX", "XXX", 'X', RioVItems.glimmerwoodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.glimmerwoodFenceGate, 1), "XOX", "XOX", 'X', RioVItems.glimmerwoodSticks, 'O',
				RioVBlocks.glimmerwoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.glimmerwoodDoorItem, 1), "XX", "XX", "XX", 'X', RioVBlocks.glimmerwoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.glimmerwoodTrapdoor, 2), "XXX", "XXX", 'X', RioVBlocks.glimmerwoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.glimmerwoodLadder, 3), "X X", "XXX", "X X", 'X', RioVItems.glimmerwoodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.flamonorActivator, 1), "  *", " X ", "*  ", '*', RioVItems.onyx, 'X', RioVBlocks.bloodRock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.slateBricks, 4), "XX", "XX", 'X', RioVBlocks.slate);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.slate, 1), "XXX", "XXX", "XXX", 'X', RioVItems.slateFragment);
		GameRegistry.addSmelting(RioVBlocks.slateCobble, new ItemStack(RioVBlocks.slate, 1), 1F);
		GameRegistry.addSmelting(RioVBlocks.slateBricks, new ItemStack(RioVItems.slateFragment, 1), 0.1F);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.cherryPlanks, 4), "X", 'X', RioVBlocks.cherryLog);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.cherryWorkbench, 1), "XX", "XX", 'X', RioVBlocks.cherryPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.cherryBlossomDoorItem, 1), "XX", "XX", "XX", 'X', RioVBlocks.cherryPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.cherryBlossomTrapdoor, 2), "XXX", "XXX", 'X', RioVBlocks.cherryPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.cherryBlossomLadder, 3), "X X", "XXX", "X X", 'X', RioVItems.cherryBlossomSticks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.cherryBlossomFenceGate, 1), "XOX", "XOX", 'O', RioVBlocks.cherryPlanks, 'X',
				RioVItems.cherryBlossomSticks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.cherryBlossomSticks, 4), "X", "X", 'X', RioVBlocks.cherryPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.cherryBlossomFence, 2), "XXX", "XXX", 'X', RioVItems.cherryBlossomSticks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.sanctuatiteActivator, 1), "  *", " X ", "*  ", '*', RioVItems.drakiuz, 'X',
				RioVBlocks.blindoniteBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.skywoodPlanks, 4), "X", 'X', RioVBlocks.skywoodLog);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.skywoodWorkbench, 1), "XX", "XX", 'X', RioVBlocks.skywoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.skywoodDoorItem, 1), "XX", "XX", "XX", 'X', RioVBlocks.skywoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.skywoodTrapdoor, 2), "XXX", "XXX", 'X', RioVBlocks.skywoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.skywoodLadder, 3), "X X", "XXX", "X X", 'X', RioVItems.skywoodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.skywoodFenceGate, 1), "XOX", "XOX", 'O', RioVBlocks.skywoodPlanks, 'X',
				RioVItems.skywoodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.skywoodSticks, 4), "X", "X", 'X', RioVBlocks.skywoodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.skywoodFence, 2), "XXX", "XXX", 'X', RioVItems.skywoodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bloodPlanks, 4), "X", 'X', RioVBlocks.bloodLog);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bloodWorkbench, 1), "XX", "XX", 'X', RioVBlocks.bloodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.bloodDoorItem, 1), "XX", "XX", "XX", 'X', RioVBlocks.bloodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bloodTrapdoor, 2), "XXX", "XXX", 'X', RioVBlocks.bloodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bloodLadder, 3), "X X", "XXX", "X X", 'X', RioVItems.bloodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bloodFenceGate, 1), "XOX", "XOX", 'O', RioVBlocks.bloodPlanks, 'X', RioVItems.bloodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVItems.bloodSticks, 4), "X", "X", 'X', RioVBlocks.bloodPlanks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bloodFence, 2), "XXX", "XXX", 'X', RioVItems.bloodSticks);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.anvil, 1), "XOX", "XXX", 'X', RioVBlocks.slateBricks, 'O', new ItemStack(Blocks.wool, 1, 14));
		GameRegistry.addRecipe(new ItemStack(RioVItems.voidHolder, 1), "X X", " X ", 'X', RioVItems.onyx);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.jaavikBlock, 1), "XXX", "XXX", "XXX", 'X', RioVItems.jaavik);
		GameRegistry.addRecipe(new ItemStack(RioVItems.jaavik, 9), "X", 'X', RioVBlocks.jaavikBlock);
		GameRegistry.addRecipe(new ItemStack(RioVItems.blindonite, 4), "X", 'X', RioVBlocks.blindoniteBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVItems.chain, 3), new Object[] {Items.iron_ingot, Items.iron_ingot, Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet, 1), new Object[] {helmet, 'X', RioVItems.chain});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate, 1), new Object[] {chestplate, 'X', RioVItems.chain});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings, 1), new Object[] {leggings, 'X', RioVItems.chain});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots, 1), new Object[] {boots, 'X', RioVItems.chain});
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.alerisBlock, 1), "XXX", "XXX", "XXX", 'X', RioVItems.aleris);
		GameRegistry.addRecipe(new ItemStack(RioVItems.aleris, 9), "X", 'X', RioVBlocks.alerisBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 0), bricks, 'X', RioVBlocks.amethystBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 1), bricks, 'X', RioVBlocks.onyxBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 2), bricks, 'X', RioVBlocks.blindoniteBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 3), bricks, 'X', RioVBlocks.dragonBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 4), bricks, 'X', RioVBlocks.vraviniteBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 5), bricks, 'X', RioVBlocks.alerisBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 6), bricks, 'X', RioVBlocks.jaavikBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 7), bricks, 'X', RioVBlocks.nironiteBlock);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.bricks, 2, 8), bricks, 'X', RioVBlocks.drakiuzBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.stainedGlass, 1, 0), new Object[] {new ItemStack(Items.dye, 1, 6),
				new ItemStack(Items.dye, 1, 10), new ItemStack(Items.dye, 1, 11), Blocks.glass});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.stainedGlass, 1, 1), new Object[] {new ItemStack(Items.dye, 1, 1),
				new ItemStack(Items.dye, 1, 5), new ItemStack(Items.dye, 1, 12), new ItemStack(Items.dye, 1, 10), Blocks.glass});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.stainedGlass, 1, 2), new Object[] {new ItemStack(Items.dye, 1, 13),
				new ItemStack(Items.dye, 1, 14), new ItemStack(Items.dye, 1, 11), new ItemStack(Items.dye, 1, 12), new ItemStack(Items.dye, 1, 1),
				Blocks.glass});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVBlocks.stainedGlass, 1, 3), new Object[] {new ItemStack(Items.dye, 1, 0),
				new ItemStack(Items.dye, 1, 1), Blocks.glass});
		GameRegistry.addRecipe(new ItemStack(RioVItems.smallBag, 1), "XXX", "X X", "XXX", 'X', Items.leather);
		GameRegistry.addRecipe(new ItemStack(RioVItems.mediumBag, 1), "XXX", "XOX", "XXX", 'X', Items.leather, 'O', RioVItems.smallBag);
		GameRegistry.addRecipe(new ItemStack(RioVItems.largeBag, 1), "XXX", "XOX", "XXX", 'X', Items.leather, 'O', RioVItems.mediumBag);
		GameRegistry.addRecipe(new ItemStack(RioVItems.sheenBag, 1), "XXX", "XOX", "XXX", 'X', Items.leather, 'O', RioVItems.largeBag);
		GameRegistry.addRecipe(new ItemStack(RioVItems.auntunSummoner, 1), "XTX", "TOT", "XTX", 'O', RioVItems.onyx, 'X', RioVItems.darkMatter, 'T',
				RioVBlocks.skycloud);
		GameRegistry.addRecipe(new ItemStack(RioVBlocks.chocolateCake, 1), "XXX", "XOX", "XXX", 'O', Items.cake, 'X', new ItemStack(Items.dye, 1, 4));
		GameRegistry.addRecipe(new ItemStack(Items.stone_pickaxe, 5), "***", " I ", " I ", '*', Blocks.stone, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.stone_axe, 5), "** ", "*I ", " I ", '*', Blocks.stone, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.stone_shovel, 5), " * ", " I ", " I ", '*', Blocks.stone, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.stone_sword, 5), " * ", " * ", " I ", '*', Blocks.stone, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.stone_hoe, 5), "** ", " I ", " I ", '*', Blocks.stone, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.stone_pickaxe, 5), "***", " I ", " I ", '*', Blocks.mossy_cobblestone, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.stone_axe, 5), "** ", "*I ", " I ", '*', Blocks.mossy_cobblestone, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.stone_shovel, 5), " * ", " I ", " I ", '*', Blocks.mossy_cobblestone, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.stone_sword, 5), " * ", " * ", " I ", '*', Blocks.mossy_cobblestone, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.stone_hoe, 5), "** ", " I ", " I ", '*', Blocks.mossy_cobblestone, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(RioVItems.woodElfKingCrystal, 1), "XXX", "XAX", "XXX", 'X', RioVItems.blindonite, 'A',
				RioVItems.baseCrystal);
		GameRegistry.addRecipe(new ItemStack(RioVItems.altruCrystal, 1), "XMX", "MAM", "XMX", 'X', RioVItems.blindonite, 'A', RioVItems.baseCrystal,
				'M', RioVItems.elfCrystal);
		GameRegistry.addRecipe(new ItemStack(RioVItems.tiTunSummoner, 1), "XMX", "MAM", "XMX", 'X', RioVItems.blindonite, 'A', RioVItems.baseCrystal,
				'M', RioVItems.altruSoul);
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 8), "*", '*', Items.iron_chestplate);
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 5), "*", '*', Items.iron_helmet);
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 4), "*", '*', Items.iron_boots);
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 7), "*", '*', Items.iron_leggings);
		GameRegistry.addRecipe(new ItemStack(Items.gold_ingot, 8), "*", '*', Items.golden_chestplate);
		GameRegistry.addRecipe(new ItemStack(Items.gold_ingot, 5), "*", '*', Items.golden_helmet);
		GameRegistry.addRecipe(new ItemStack(Items.gold_ingot, 4), "*", '*', Items.golden_boots);
		GameRegistry.addRecipe(new ItemStack(Items.gold_ingot, 7), "*", '*', Items.golden_leggings);
		GameRegistry.addRecipe(new ItemStack(Items.diamond, 8), "*", '*', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(Items.diamond, 5), "*", '*', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(Items.diamond, 4), "*", '*', Items.diamond_boots);
		GameRegistry.addRecipe(new ItemStack(Items.diamond, 7), "*", '*', Items.diamond_leggings);
		GameRegistry.addRecipe(new ItemStack(RioVItems.amethyst, 8), "*", '*', RioVItems.amethystChestplate);
		GameRegistry.addRecipe(new ItemStack(RioVItems.amethyst, 5), "*", '*', RioVItems.amethystHelmet);
		GameRegistry.addRecipe(new ItemStack(RioVItems.amethyst, 4), "*", '*', RioVItems.amethystBoots);
		GameRegistry.addRecipe(new ItemStack(RioVItems.amethyst, 7), "*", '*', RioVItems.amethystLeggings);
		GameRegistry.addRecipe(new ItemStack(RioVItems.onyx, 8), "*", '*', RioVItems.onyxChestplate);
		GameRegistry.addRecipe(new ItemStack(RioVItems.onyx, 5), "*", '*', RioVItems.onyxHelmet);
		GameRegistry.addRecipe(new ItemStack(RioVItems.onyx, 4), "*", '*', RioVItems.onyxBoots);
		GameRegistry.addRecipe(new ItemStack(RioVItems.onyx, 7), "*", '*', RioVItems.onyxLeggings);
		GameRegistry.addRecipe(new ItemStack(RioVItems.dragonSoul, 8), "*", '*', RioVItems.dragonChestplate);
		GameRegistry.addRecipe(new ItemStack(RioVItems.dragonSoul, 5), "*", '*', RioVItems.dragonHelmet);
		GameRegistry.addRecipe(new ItemStack(RioVItems.dragonSoul, 4), "*", '*', RioVItems.dragonBoots);
		GameRegistry.addRecipe(new ItemStack(RioVItems.dragonSoul, 7), "*", '*', RioVItems.dragonLeggings);
		GameRegistry.addRecipe(new ItemStack(RioVItems.ingotOfFlame, 8), "*", '*', RioVItems.chestplateOfFlame);
		GameRegistry.addRecipe(new ItemStack(RioVItems.ingotOfFlame, 5), "*", '*', RioVItems.helmetOfFlame);
		GameRegistry.addRecipe(new ItemStack(RioVItems.ingotOfFlame, 4), "*", '*', RioVItems.bootsOfFlame);
		GameRegistry.addRecipe(new ItemStack(RioVItems.ingotOfFlame, 7), "*", '*', RioVItems.leggingsOfFlame);
		GameRegistry.addRecipe(new ItemStack(RioVItems.aleris, 8), "*", '*', RioVItems.alerisChestplate);
		GameRegistry.addRecipe(new ItemStack(RioVItems.aleris, 5), "*", '*', RioVItems.alerisHelmet);
		GameRegistry.addRecipe(new ItemStack(RioVItems.aleris, 4), "*", '*', RioVItems.alerisBoots);
		GameRegistry.addRecipe(new ItemStack(RioVItems.aleris, 7), "*", '*', RioVItems.alerisLeggings);
		GameRegistry.addRecipe(new ItemStack(RioVItems.vravinite, 8), "*", '*', RioVItems.vraviniteChestplate);
		GameRegistry.addRecipe(new ItemStack(RioVItems.vravinite, 5), "*", '*', RioVItems.vraviniteHelmet);
		GameRegistry.addRecipe(new ItemStack(RioVItems.vravinite, 4), "*", '*', RioVItems.vraviniteBoots);
		GameRegistry.addRecipe(new ItemStack(RioVItems.vravinite, 7), "*", '*', RioVItems.vraviniteLeggings);
		GameRegistry.addShapelessRecipe(new ItemStack(RioVItems.guideBook), new Object[] {Items.book, RioVItems.berry, RioVItems.amethyst});
		GameRegistry.addShapelessRecipe(new ItemStack(RioVItems.bonyiumIngot), new Object[] {RioVItems.blackBone, Items.iron_ingot});
		
		// ANVIL CRAFTING
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.amethystPickaxe, 1),
						new Object[] {pickaxe, Character.valueOf('X'), RioVItems.amethyst, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.amethystSword, 1),
						new Object[] {sword, Character.valueOf('X'), RioVItems.amethyst, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.amethystShovel, 1),
						new Object[] {shovel, Character.valueOf('X'), RioVItems.amethyst, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.amethystAxe, 1),
						new Object[] {axe, Character.valueOf('X'), RioVItems.amethyst, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.onyxPickaxe, 1),
						new Object[] {pickaxe, Character.valueOf('X'), RioVItems.onyx, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.onyxSword, 1),
						new Object[] {sword, Character.valueOf('X'), RioVItems.onyx, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.onyxShovel, 1),
						new Object[] {shovel, Character.valueOf('X'), RioVItems.onyx, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.onyxAxe, 1),
						new Object[] {axe, Character.valueOf('X'), RioVItems.onyx, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.dragonPickaxe, 1),
						new Object[] {pickaxe, Character.valueOf('X'), RioVItems.dragonSoul, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.dragonSword, 1),
						new Object[] {sword, Character.valueOf('X'), RioVItems.dragonSoul, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.dragonShovel, 1),
						new Object[] {shovel, Character.valueOf('X'), RioVItems.dragonSoul, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.dragonAxe, 1),
						new Object[] {axe, Character.valueOf('X'), RioVItems.dragonSoul, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.agonitePickaxe, 1),
						new Object[] {pickaxe, Character.valueOf('X'), RioVItems.agonite, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.vravinitePickaxe, 1),
						new Object[] {pickaxe, Character.valueOf('X'), RioVItems.vravinite, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.vraviniteSword, 1),
						new Object[] {sword, Character.valueOf('X'), RioVItems.vravinite, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.vraviniteShovel, 1),
						new Object[] {shovel, Character.valueOf('X'), RioVItems.vravinite, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.vraviniteAxe, 1),
						new Object[] {axe, Character.valueOf('X'), RioVItems.vravinite, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(
						new ItemStack(RioVItems.cherryBlossomPickaxe, 1),
						new Object[] {pickaxe, Character.valueOf('X'), RioVBlocks.cherryPlanks, Character.valueOf('!'), RioVItems.cherryBlossomSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.cherryBlossomSword, 1),
						new Object[] {sword, Character.valueOf('X'), RioVBlocks.cherryPlanks, Character.valueOf('!'), RioVItems.cherryBlossomSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.cherryBlossomShovel, 1),
						new Object[] {shovel, Character.valueOf('X'), RioVBlocks.cherryPlanks, Character.valueOf('!'), RioVItems.cherryBlossomSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.cherryBlossomAxe, 1),
						new Object[] {axe, Character.valueOf('X'), RioVBlocks.cherryPlanks, Character.valueOf('!'), RioVItems.cherryBlossomSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(
						new ItemStack(RioVItems.glimmerwoodPickaxe, 1),
						new Object[] {pickaxe, Character.valueOf('X'), RioVBlocks.glimmerwoodPlanks, Character.valueOf('!'),
								RioVItems.glimmerwoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(
						new ItemStack(RioVItems.glimmerwoodSword, 1),
						new Object[] {sword, Character.valueOf('X'), RioVBlocks.glimmerwoodPlanks, Character.valueOf('!'),
								RioVItems.glimmerwoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(
						new ItemStack(RioVItems.glimmerwoodShovel, 1),
						new Object[] {shovel, Character.valueOf('X'), RioVBlocks.glimmerwoodPlanks, Character.valueOf('!'),
								RioVItems.glimmerwoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.glimmerwoodAxe, 1),
						new Object[] {axe, Character.valueOf('X'), RioVBlocks.glimmerwoodPlanks, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.khuulisScythe, 1), "X  ", " Z ", "  X", Character.valueOf('X'), Items.iron_ingot,
						Character.valueOf('Z'), RioVItems.blackBone);
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.bowOfWurTun, 1), bowOfWurTun, Character.valueOf('I'), Items.gold_ingot, Character.valueOf('*'),
						Items.string, Character.valueOf('D'), RioVItems.blackBone);
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.enforcedBowOfWurTun, 1), " XC", "DOC", " XC", Character.valueOf('X'), Items.gold_ingot,
						Character.valueOf('C'), Items.string, Character.valueOf('D'), RioVItems.blackBone, Character.valueOf('O'),
						RioVItems.bowOfWurTun);
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.skywoodPickaxe, 1),
						new Object[] {pickaxe, Character.valueOf('X'), RioVBlocks.skywoodPlanks, Character.valueOf('!'), RioVItems.skywoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.skywoodSword, 1),
						new Object[] {sword, Character.valueOf('X'), RioVBlocks.skywoodPlanks, Character.valueOf('!'), RioVItems.skywoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.skywoodShovel, 1),
						new Object[] {shovel, Character.valueOf('X'), RioVBlocks.skywoodPlanks, Character.valueOf('!'), RioVItems.skywoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.skywoodAxe, 1),
						new Object[] {axe, Character.valueOf('X'), RioVBlocks.skywoodPlanks, Character.valueOf('!'), RioVItems.skywoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.bloodPickaxe, 1),
						new Object[] {pickaxe, Character.valueOf('X'), RioVBlocks.bloodPlanks, Character.valueOf('!'), RioVItems.bloodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.bloodSword, 1),
						new Object[] {sword, Character.valueOf('X'), RioVBlocks.bloodPlanks, Character.valueOf('!'), RioVItems.bloodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.bloodShovel, 1),
						new Object[] {shovel, Character.valueOf('X'), RioVBlocks.bloodPlanks, Character.valueOf('!'), RioVItems.bloodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.bloodAxe, 1),
						new Object[] {axe, Character.valueOf('X'), RioVBlocks.bloodPlanks, Character.valueOf('!'), RioVItems.bloodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.alerisPickaxe, 1),
						new Object[] {pickaxe, Character.valueOf('X'), RioVItems.aleris, Character.valueOf('!'), RioVItems.skywoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.alerisSword, 1),
						new Object[] {sword, Character.valueOf('X'), RioVItems.aleris, Character.valueOf('!'), RioVItems.skywoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.alerisShovel, 1),
						new Object[] {shovel, Character.valueOf('X'), RioVItems.aleris, Character.valueOf('!'), RioVItems.skywoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.alerisAxe, 1),
						new Object[] {axe, Character.valueOf('X'), RioVItems.aleris, Character.valueOf('!'), RioVItems.skywoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(
						new ItemStack(RioVItems.daetoriSword, 1),
						new Object[] {" X ", " X ", "!!!", " X ", Character.valueOf('X'), RioVItems.blackBone, Character.valueOf('!'),
								Items.iron_ingot});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.sorrowSword, 1),
						new Object[] {" X ", " X ", "XXX", " X ", Character.valueOf('X'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(
						new ItemStack(RioVItems.unfusedAxeOfAunTun, 1),
						new Object[] {"XOX", "X!X", " ! ", "*!*", Character.valueOf('X'), RioVItems.vulron, Character.valueOf('!'),
								RioVItems.blackBone, Character.valueOf('O'), RioVItems.darkMatter, Character.valueOf('*'), RioVItems.clothOfMagic});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.swordOfFlame, 1), "*", "*", "*", Character.valueOf('*'), RioVItems.ingotOfFlame);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.onyxHelmet, 1), new Object[] {riovhelmet, Character.valueOf('X'), RioVItems.onyx});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.onyxChestplate, 1), new Object[] {riovchestplate, Character.valueOf('X'), RioVItems.onyx});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.onyxLeggings, 1), new Object[] {riovleggings, Character.valueOf('X'), RioVItems.onyx});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.onyxBoots, 1), new Object[] {riovboots, Character.valueOf('X'), RioVItems.onyx});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.amethystHelmet, 1), new Object[] {riovhelmet, Character.valueOf('X'), RioVItems.amethyst});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.amethystChestplate, 1), new Object[] {riovchestplate, Character.valueOf('X'), RioVItems.amethyst});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.amethystLeggings, 1), new Object[] {riovleggings, Character.valueOf('X'), RioVItems.amethyst});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.amethystBoots, 1), new Object[] {riovboots, Character.valueOf('X'), RioVItems.amethyst});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.mythrilHelmet, 1), "XAX", "X*X", Character.valueOf('X'), RioVItems.mythrilIngot,
						Character.valueOf('A'), Items.iron_ingot, Character.valueOf('*'), RioVItems.darkMatter);
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.mythrilChestplate, 1), "X X", "XAX", "X*X", Character.valueOf('X'), RioVItems.mythrilIngot,
						Character.valueOf('A'), Items.iron_ingot, Character.valueOf('*'), RioVItems.darkMatter);
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.mythrilLeggings, 1), "X*X", "A A", "X X", Character.valueOf('X'), RioVItems.mythrilIngot,
						Character.valueOf('A'), Items.iron_ingot, Character.valueOf('*'), RioVItems.darkMatter);
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.mythrilBoots, 1), "A A", "X*X", Character.valueOf('X'), RioVItems.mythrilIngot,
						Character.valueOf('A'), Items.iron_ingot, Character.valueOf('*'), RioVItems.darkMatter);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.dragonHelmet, 1), new Object[] {riovhelmet, Character.valueOf('X'), RioVItems.dragonSoul});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.dragonChestplate, 1), new Object[] {riovchestplate, Character.valueOf('X'), RioVItems.dragonSoul});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.dragonLeggings, 1), new Object[] {riovleggings, Character.valueOf('X'), RioVItems.dragonSoul});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.dragonBoots, 1), new Object[] {riovboots, Character.valueOf('X'), RioVItems.dragonSoul});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.helmetOfFlame, 1), new Object[] {riovhelmet, Character.valueOf('X'), RioVItems.ingotOfFlame});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.chestplateOfFlame, 1),
						new Object[] {riovchestplate, Character.valueOf('X'), RioVItems.ingotOfFlame});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.leggingsOfFlame, 1), new Object[] {riovleggings, Character.valueOf('X'), RioVItems.ingotOfFlame});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.bootsOfFlame, 1), new Object[] {riovboots, Character.valueOf('X'), RioVItems.ingotOfFlame});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.vraviniteHelmet, 1), new Object[] {riovhelmet, Character.valueOf('X'), RioVItems.vravinite});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.vraviniteChestplate, 1),
						new Object[] {riovchestplate, Character.valueOf('X'), RioVItems.vravinite});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.vraviniteLeggings, 1), new Object[] {riovleggings, Character.valueOf('X'), RioVItems.vravinite});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.vraviniteBoots, 1), new Object[] {riovboots, Character.valueOf('X'), RioVItems.vravinite});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.magickaHelmet, 1), new Object[] {riovhelmet, Character.valueOf('X'), RioVItems.clothOfMagic});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.magickaChestplate, 1),
						new Object[] {riovchestplate, Character.valueOf('X'), RioVItems.clothOfMagic});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.magickaLeggings, 1), new Object[] {riovleggings, Character.valueOf('X'), RioVItems.clothOfMagic});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.magickaBoots, 1), new Object[] {riovboots, Character.valueOf('X'), RioVItems.clothOfMagic});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.alerisHelmet, 1), new Object[] {riovhelmet, Character.valueOf('X'), RioVItems.aleris});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.alerisChestplate, 1), new Object[] {riovchestplate, Character.valueOf('X'), RioVItems.aleris});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.alerisLeggings, 1), new Object[] {riovleggings, Character.valueOf('X'), RioVItems.aleris});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.alerisBoots, 1), new Object[] {riovboots, Character.valueOf('X'), RioVItems.aleris});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVBlocks.noFacFlag, 1),
						new Object[] {flag, Character.valueOf('X'), new ItemStack(Blocks.wool, 1, 0), Character.valueOf('!'), Items.stick});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVBlocks.jaerinFlag, 1),
						new Object[] {flag, Character.valueOf('X'), new ItemStack(Blocks.wool, 1, 13), Character.valueOf('!'), Items.stick});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVBlocks.raetiinFlag, 1),
						new Object[] {flag, Character.valueOf('X'), new ItemStack(Blocks.wool, 1, 15), Character.valueOf('!'), Items.stick});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.sanctuaryStonePickaxe, 1),
						new Object[] {pickaxe, Character.valueOf('X'), RioVBlocks.sanctuaryStone, Character.valueOf('!'), RioVItems.skywoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.sanctuaryStoneSword, 1),
						new Object[] {sword, Character.valueOf('X'), RioVBlocks.sanctuaryStone, Character.valueOf('!'), RioVItems.skywoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.sanctuaryStoneShovel, 1),
						new Object[] {shovel, Character.valueOf('X'), RioVBlocks.sanctuaryStone, Character.valueOf('!'), RioVItems.skywoodSticks});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.sanctuaryStoneAxe, 1),
						new Object[] {axe, Character.valueOf('X'), RioVBlocks.sanctuaryStone, Character.valueOf('!'), RioVItems.skywoodSticks});
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(Items.iron_ingot, 8), "*", Character.valueOf('*'), Items.iron_chestplate);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(Items.iron_ingot, 5), "*", Character.valueOf('*'), Items.iron_helmet);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(Items.iron_ingot, 4), "*", Character.valueOf('*'), Items.iron_boots);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(Items.iron_ingot, 7), "*", Character.valueOf('*'), Items.iron_leggings);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(Items.gold_ingot, 8), "*", Character.valueOf('*'), Items.golden_chestplate);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(Items.gold_ingot, 5), "*", Character.valueOf('*'), Items.golden_helmet);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(Items.gold_ingot, 4), "*", Character.valueOf('*'), Items.golden_boots);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(Items.gold_ingot, 7), "*", Character.valueOf('*'), Items.golden_leggings);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(Items.diamond, 8), "*", Character.valueOf('*'), Items.diamond_chestplate);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(Items.diamond, 5), "*", Character.valueOf('*'), Items.diamond_helmet);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(Items.diamond, 4), "*", Character.valueOf('*'), Items.diamond_boots);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(Items.diamond, 7), "*", Character.valueOf('*'), Items.diamond_leggings);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.amethyst, 8), "*", Character.valueOf('*'), RioVItems.amethystChestplate);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.amethyst, 5), "*", Character.valueOf('*'), RioVItems.amethystHelmet);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.amethyst, 4), "*", Character.valueOf('*'), RioVItems.amethystBoots);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.amethyst, 7), "*", Character.valueOf('*'), RioVItems.amethystLeggings);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(RioVItems.onyx, 8), "*", Character.valueOf('*'), RioVItems.onyxChestplate);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(RioVItems.onyx, 5), "*", Character.valueOf('*'), RioVItems.onyxHelmet);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(RioVItems.onyx, 4), "*", Character.valueOf('*'), RioVItems.onyxBoots);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(RioVItems.onyx, 7), "*", Character.valueOf('*'), RioVItems.onyxLeggings);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.dragonSoul, 8), "*", Character.valueOf('*'), RioVItems.dragonChestplate);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.dragonSoul, 5), "*", Character.valueOf('*'), RioVItems.dragonHelmet);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.dragonSoul, 4), "*", Character.valueOf('*'), RioVItems.dragonBoots);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.dragonSoul, 7), "*", Character.valueOf('*'), RioVItems.dragonLeggings);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.ingotOfFlame, 8), "*", Character.valueOf('*'), RioVItems.chestplateOfFlame);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.ingotOfFlame, 5), "*", Character.valueOf('*'), RioVItems.helmetOfFlame);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.ingotOfFlame, 4), "*", Character.valueOf('*'), RioVItems.bootsOfFlame);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.ingotOfFlame, 7), "*", Character.valueOf('*'), RioVItems.leggingsOfFlame);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.aleris, 8), "*", Character.valueOf('*'), RioVItems.alerisChestplate);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(RioVItems.aleris, 5), "*", Character.valueOf('*'), RioVItems.alerisHelmet);
		RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(RioVItems.aleris, 4), "*", Character.valueOf('*'), RioVItems.alerisBoots);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.aleris, 7), "*", Character.valueOf('*'), RioVItems.alerisLeggings);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.vravinite, 8), "*", Character.valueOf('*'), RioVItems.vraviniteChestplate);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.vravinite, 5), "*", Character.valueOf('*'), RioVItems.vraviniteHelmet);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.vravinite, 4), "*", Character.valueOf('*'), RioVItems.vraviniteBoots);
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.vravinite, 7), "*", Character.valueOf('*'), RioVItems.vraviniteLeggings);
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.shadowniteIngot, 7), "XXX", "XOX", "XOX", "XXX", Character.valueOf('X'), RioVItems.darkMatter,
						Character.valueOf('O'), RioVItems.onyx);
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.shadowniteHelmet, 1), new Object[] {riovhelmet, Character.valueOf('X'), RioVItems.shadowniteIngot});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.shadowniteChestplate, 1),
						new Object[] {riovchestplate, Character.valueOf('X'), RioVItems.shadowniteIngot});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.shadowniteLeggings, 1),
						new Object[] {riovleggings, Character.valueOf('X'), RioVItems.shadowniteIngot});
		RioVAPI.getInstance().getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.shadowniteBoots, 1), new Object[] {riovboots, Character.valueOf('X'), RioVItems.shadowniteIngot});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.shadownitePickaxe, 1),
						new Object[] {pickaxe, Character.valueOf('X'), RioVItems.shadowniteIngot, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.shadowniteSword, 1),
						new Object[] {sword, Character.valueOf('X'), RioVItems.shadowniteIngot, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.shadowniteShovel, 1),
						new Object[] {shovel, Character.valueOf('X'), RioVItems.shadowniteIngot, Character.valueOf('!'), RioVItems.blackBone});
		RioVAPI.getInstance()
				.getCraftingManager()
				.addRecipe(new ItemStack(RioVItems.shadowniteAxe, 1),
						new Object[] {axe, Character.valueOf('X'), RioVItems.shadowniteIngot, Character.valueOf('!'), RioVItems.blackBone});
		
		// INFUSER CRAFTING
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.amethystSword, new ItemStack(RioVItems.infusedAmethystSword, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.onyxSword, new ItemStack(RioVItems.infusedOnyxSword, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.amethystShovel, new ItemStack(RioVItems.infusedAmethystShovel, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.amethystPickaxe, new ItemStack(RioVItems.infusedAmethystPickaxe, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.amethystAxe, new ItemStack(RioVItems.infusedAmethystAxe, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.onyxShovel, new ItemStack(RioVItems.infusedOnyxShovel, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.onyxPickaxe, new ItemStack(RioVItems.infusedOnyxPickaxe, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.onyxAxe, new ItemStack(RioVItems.infusedOnyxAxe, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.amethystHelmet, new ItemStack(RioVItems.infusedAmethystHelmet, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.amethystChestplate, new ItemStack(RioVItems.infusedAmethystChestplate, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.amethystLeggings, new ItemStack(RioVItems.infusedAmethystLeggings, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.amethystBoots, new ItemStack(RioVItems.infusedAmethystBoots, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.onyxHelmet, new ItemStack(RioVItems.infusedOnyxHelmet, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.onyxChestplate, new ItemStack(RioVItems.infusedOnyxChestplate, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.onyxLeggings, new ItemStack(RioVItems.infusedOnyxLeggings, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.onyxBoots, new ItemStack(RioVItems.infusedOnyxBoots, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.unfusedAxeOfAunTun, new ItemStack(RioVItems.halfFusedAxeOfAunTun, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.halfFusedAxeOfAunTun, new ItemStack(RioVItems.axeOfAunTun, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.dragonHelmet, new ItemStack(RioVItems.infusedDragonHelmet, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.dragonChestplate, new ItemStack(RioVItems.infusedDragonChestplate, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.dragonLeggings, new ItemStack(RioVItems.infusedDragonLeggings, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.dragonBoots, new ItemStack(RioVItems.infusedDragonBoots, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.dragonPickaxe, new ItemStack(RioVItems.infusedDragonPickaxe, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.dragonAxe, new ItemStack(RioVItems.infusedDragonAxe, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.dragonShovel, new ItemStack(RioVItems.infusedDragonShovel, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.dragonSword, new ItemStack(RioVItems.infusedDragonSword, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(Items.apple, new ItemStack(RioVItems.blueMagicApple, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.vraviniteHelmet, new ItemStack(RioVItems.infusedVraviniteHelmet, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.vraviniteChestplate, new ItemStack(RioVItems.infusedVraviniteChestplate, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.vraviniteLeggings, new ItemStack(RioVItems.infusedVraviniteLeggings, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.vraviniteBoots, new ItemStack(RioVItems.infusedVraviniteBoots, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.vravinitePickaxe, new ItemStack(RioVItems.infusedVravinitePickaxe, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.vraviniteAxe, new ItemStack(RioVItems.infusedVraviniteAxe, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.vraviniteShovel, new ItemStack(RioVItems.infusedVraviniteShovel, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.vraviniteSword, new ItemStack(RioVItems.infusedVraviniteSword, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.alerisHelmet, new ItemStack(RioVItems.infusedAlerisHelmet, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.alerisChestplate, new ItemStack(RioVItems.infusedAlerisChestplate, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.alerisLeggings, new ItemStack(RioVItems.infusedAlerisLeggings, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.alerisBoots, new ItemStack(RioVItems.infusedAlerisBoots, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.alerisPickaxe, new ItemStack(RioVItems.infusedAlerisPickaxe, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.alerisAxe, new ItemStack(RioVItems.infusedAlerisAxe, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.alerisShovel, new ItemStack(RioVItems.infusedAlerisShovel, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.alerisSword, new ItemStack(RioVItems.infusedAlerisSword, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.shadowniteHelmet, new ItemStack(RioVItems.infusedShadowniteHelmet, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.shadowniteChestplate, new ItemStack(RioVItems.infusedShadowniteChestplate, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.shadowniteLeggings, new ItemStack(RioVItems.infusedShadowniteLeggings, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.shadowniteBoots, new ItemStack(RioVItems.infusedShadowniteBoots, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.shadownitePickaxe, new ItemStack(RioVItems.infusedShadownitePickaxe, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.shadowniteAxe, new ItemStack(RioVItems.infusedShadowniteAxe, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.shadowniteShovel, new ItemStack(RioVItems.infusedShadowniteShovel, 1));
		RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.shadowniteSword, new ItemStack(RioVItems.infusedShadowniteSword, 1));
		
		if(RioVAPI.getInstance().natura){
			try{
				Class<?> natura = Class.forName("mods.natura.common.NContent");
				
				RioVAPI.getInstance()
						.getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("bloodwoodPickaxe").get(null)),
								new ItemStack(RioVItems.infusedBloodwoodPickaxe, 1));
				RioVAPI.getInstance().getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("bloodwoodAxe").get(null)), new ItemStack(RioVItems.infusedBloodwoodAxe, 1));
				RioVAPI.getInstance()
						.getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("bloodwoodShovel").get(null)),
								new ItemStack(RioVItems.infusedBloodwoodShovel, 1));
				RioVAPI.getInstance().getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("bloodwoodSword").get(null)), new ItemStack(RioVItems.infusedBloodwoodSword, 1));
				RioVAPI.getInstance()
						.getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("ghostwoodPickaxe").get(null)),
								new ItemStack(RioVItems.infusedGhostwoodPickaxe, 1));
				RioVAPI.getInstance().getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("ghostwoodAxe").get(null)), new ItemStack(RioVItems.infusedGhostwoodAxe, 1));
				RioVAPI.getInstance()
						.getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("ghostwoodShovel").get(null)),
								new ItemStack(RioVItems.infusedGhostwoodShovel, 1));
				RioVAPI.getInstance().getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("ghostwoodSword").get(null)), new ItemStack(RioVItems.infusedGhostwoodSword, 1));
				RioVAPI.getInstance()
						.getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("darkwoodPickaxe").get(null)),
								new ItemStack(RioVItems.infusedDarkwoodPickaxe, 1));
				RioVAPI.getInstance().getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("darkwoodAxe").get(null)), new ItemStack(RioVItems.infusedDarkwoodAxe, 1));
				RioVAPI.getInstance().getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("darkwoodShovel").get(null)), new ItemStack(RioVItems.infusedDarkwoodShovel, 1));
				RioVAPI.getInstance().getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("darkwoodSword").get(null)), new ItemStack(RioVItems.infusedDarkwoodSword, 1));
				RioVAPI.getInstance()
						.getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("netherquartzPickaxe").get(null)),
								new ItemStack(RioVItems.infusedNetherquartzPickaxe, 1));
				RioVAPI.getInstance()
						.getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("netherquartzAxe").get(null)),
								new ItemStack(RioVItems.infusedNetherquartzAxe, 1));
				RioVAPI.getInstance()
						.getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("netherquartzShovel").get(null)),
								new ItemStack(RioVItems.infusedNetherquartzShovel, 1));
				RioVAPI.getInstance()
						.getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("netherquartzSword").get(null)),
								new ItemStack(RioVItems.infusedNetherquartzSword, 1));
				RioVAPI.getInstance()
						.getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("fusewoodPickaxe").get(null)),
								new ItemStack(RioVItems.infusedFusewoodPickaxe, 1));
				RioVAPI.getInstance().getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("fusewoodAxe").get(null)), new ItemStack(RioVItems.infusedFusewoodAxe, 1));
				RioVAPI.getInstance().getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("fusewoodShovel").get(null)), new ItemStack(RioVItems.infusedFusewoodShovel, 1));
				RioVAPI.getInstance().getInfuser()
						.addInfusion(((Item) natura.getDeclaredField("fusewoodSword").get(null)), new ItemStack(RioVItems.infusedFusewoodSword, 1));
			}catch(Exception e){
				
			}
		}
	}
}
