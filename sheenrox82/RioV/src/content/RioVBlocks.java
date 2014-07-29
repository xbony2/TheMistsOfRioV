package sheenrox82.RioV.src.content;

import net.minecraft.block.Block;
import sheenrox82.RioV.src.api.block.BlockCoreOne;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
import sheenrox82.RioV.src.block.BlockAnvil;
import sheenrox82.RioV.src.block.BlockBlackFire;
import sheenrox82.RioV.src.block.BlockBlackQuartz;
import sheenrox82.RioV.src.block.BlockBlindOasisPortal;
import sheenrox82.RioV.src.block.BlockBloodGrass;
import sheenrox82.RioV.src.block.BlockBloodLog;
import sheenrox82.RioV.src.block.BlockBloodRock;
import sheenrox82.RioV.src.block.BlockBricks;
import sheenrox82.RioV.src.block.BlockBush;
import sheenrox82.RioV.src.block.BlockCherryLog;
import sheenrox82.RioV.src.block.BlockCloudPlant;
import sheenrox82.RioV.src.block.BlockDirt;
import sheenrox82.RioV.src.block.BlockFlamonorPortal;
import sheenrox82.RioV.src.block.BlockGlimmerGrass;
import sheenrox82.RioV.src.block.BlockGlimmerwoodLog;
import sheenrox82.RioV.src.block.BlockInfuser;
import sheenrox82.RioV.src.block.BlockJaerinFlag;
import sheenrox82.RioV.src.block.BlockNoFactionFlag;
import sheenrox82.RioV.src.block.BlockPlanks;
import sheenrox82.RioV.src.block.BlockPlanks2;
import sheenrox82.RioV.src.block.BlockPlantCore;
import sheenrox82.RioV.src.block.BlockRaetiinFlag;
import sheenrox82.RioV.src.block.BlockRedFire;
import sheenrox82.RioV.src.block.BlockRioVCake;
import sheenrox82.RioV.src.block.BlockRioVDoor;
import sheenrox82.RioV.src.block.BlockRioVFence;
import sheenrox82.RioV.src.block.BlockRioVFenceGate;
import sheenrox82.RioV.src.block.BlockRioVLadder;
import sheenrox82.RioV.src.block.BlockRioVLeaf;
import sheenrox82.RioV.src.block.BlockRioVSapling;
import sheenrox82.RioV.src.block.BlockRioVTrapDoor;
import sheenrox82.RioV.src.block.BlockRioVWorkbench;
import sheenrox82.RioV.src.block.BlockSanctuatiteFire;
import sheenrox82.RioV.src.block.BlockSanctuatiteFlowing;
import sheenrox82.RioV.src.block.BlockSanctuatiteGrass;
import sheenrox82.RioV.src.block.BlockSanctuatitePortal;
import sheenrox82.RioV.src.block.BlockSancuatiteStill;
import sheenrox82.RioV.src.block.BlockSkycloud;
import sheenrox82.RioV.src.block.BlockSkywoodLog;
import sheenrox82.RioV.src.block.BlockStainedGlass;
import sheenrox82.RioV.src.block.BlockVaerynPortal;
import sheenrox82.RioV.src.block.BlockVoidFlowing;
import sheenrox82.RioV.src.block.BlockVoidStill;
import sheenrox82.RioV.src.block.BlockWhiteFire;
import sheenrox82.RioV.src.item.ItemBricks;
import sheenrox82.RioV.src.item.ItemPlanksColored;
import sheenrox82.RioV.src.item.ItemStainedGlass;
import cpw.mods.fml.common.registry.GameRegistry;

public class RioVBlocks 
{
	public static Block onyxOre = new BlockCoreOne().setBlockName("onyxOre");
	public static Block garnetOre = new BlockCoreOne().setBlockName("garnetOre");
	public static Block infuser = new BlockInfuser(true).setHardness(1.0F).setBlockName("infuser");
	public static Block slate = new BlockCoreOne().setBlockName("slate");
	public static Block nironiteOre = new BlockCoreOne().setBlockName("nironiteOre");
	public static Block dragonOre = new BlockCoreOne().setBlockName("dragonOre");
	public static Block netherCrystal = new BlockCoreOne().setBlockName("netherCrystal");
	public static Block bloodRock = new BlockBloodRock().setHardness(3F).setBlockName("bloodRock");
	public static Block blackDuriiPlant = new BlockPlantCore().setHardness(0.2F).setBlockName("blackDuriiPlant");
	public static Block tomatoPlant = new BlockPlantCore().setHardness(0.3F).setBlockName("tomatoPlant");
	public static Block grapePlant = new BlockPlantCore().setHardness(0.3F).setBlockName("grapePlant");
	public static Block onyxBlock = new BlockCoreOne().setBlockName("onyxBlock");
	public static Block amethystBlock = new BlockCoreOne().setBlockName("amethystBlock");
	public static Block garnetBlock = new BlockCoreOne().setBlockName("garnetBlock");
	public static Block nironiteBlock = new BlockCoreOne().setBlockName("nironiteBlock");
	public static Block dragonBlock = new BlockCoreOne().setBlockName("dragonBlock");
	public static Block plankColored = new BlockPlanks().setBlockName("plankColored");
	public static Block glimmerwoodPlanks = new BlockPlanks2().setBlockName("glimmerwoodPlanks");
	public static Block cherryPlanks = new BlockPlanks2().setBlockName("cherryPlanks");
	public static Block skywoodPlanks = new BlockPlanks2().setBlockName("skywoodPlanks");
	public static Block bloodPlanks = new BlockPlanks2().setBlockName("bloodPlanks");
	public static Block pepperPlant = new BlockPlantCore().setHardness(0.2F).setBlockName("pepperPlant");
	public static Block amethystOre = new BlockCoreOne().setBlockName("amethystOre");
	public static Block lamp = new BlockCoreOne().setLightLevel(0.7F).setBlockName("lamp");
	public static Block blackQuartz = new BlockBlackQuartz().setHardness(3F).setBlockName("blackQuartz");
	public static Block blueFlower = new BlockPlantCore().setBlockName("blueFlower");
	public static Block blindOasisPortal = new BlockBlindOasisPortal().setHardness(Float.MAX_VALUE).setBlockName("blindOasisPortal");
	public static Block blackFire = new BlockBlackFire().setBlockName("blackFire");
	public static Block blindoniteOre = new BlockCoreOne().setLightLevel(1.0F).setBlockName("blindoniteOre");
	public static Block blackRock = new BlockCoreOne().setBlockName("blackRock");
	public static Block whiteStone = new BlockCoreOne().setBlockName("whiteStone");
	public static Block blindoniteBlock = new BlockCoreOne().setBlockName("blindoniteBlock");
	public static Block glimmerwoodLeaf = new BlockRioVLeaf().setBlockName("glimmerwoodLeaf");
	public static Block glimmerwoodLog = new BlockGlimmerwoodLog().setHardness(3F).setBlockName("glimmerwoodLog");
	public static Block glimmerwoodSapling = new BlockRioVSapling().setBlockName("glimmerwoodSapling");
	public static Block glimmerGrass = new BlockGlimmerGrass().setHardness(0.5F).setBlockName("glimmerGrass");
	public static Block glimmerDirt = new BlockDirt().setStepSound(Block.soundTypeGrass).setBlockName("glimmerDirt");
	public static Block vaerynPortal = new BlockVaerynPortal().setHardness(Float.MAX_VALUE).setBlockName("vaerynPortal");
	public static Block whiteFire = new BlockWhiteFire().setBlockName("whiteFire");
	public static Block glimmerwoodWorkbench = new BlockRioVWorkbench().setHardness(1.5F).setBlockName("glimmerwoodWorkbench");
	public static Block vraviniteOre = new BlockCoreOne().setHardness(16.5F).setBlockName("vraviniteOre");
	public static Block glimmerwoodFence = new BlockRioVFence("glimmerwoodPlanks").setHardness(1.5F).setBlockName("glimmerwoodFence");
	public static Block glimmerwoodFenceGate = new BlockRioVFenceGate().setHardness(1.5F).setBlockName("glimmerwoodFenceGate");
	public static Block glimmerRock = new BlockCoreOne().setBlockName("glimmerRock");
	public static Block glimmerwoodDoor = new BlockRioVDoor().setHardness(3F).setBlockName("glimmerwoodDoor");
	public static Block glimmerwoodLadder = new BlockRioVLadder().setHardness(3F).setBlockName("glimmerwoodLadder");
	public static Block glimmerwoodTrapdoor = new BlockRioVTrapDoor().setHardness(1.5F).setBlockName("glimmerwoodTrapdoor");
	public static Block bloodGrass = new BlockBloodGrass().setHardness(0.5F).setBlockName("bloodGrass");
	public static Block bloodDirt = new BlockDirt().setHardness(0.3F).setStepSound(Block.soundTypeGrass).setBlockName("bloodDirt");
	public static Block flamonorPortal = new BlockFlamonorPortal().setBlockName("flamonorPortal");
	public static Block flamonorRock = new BlockCoreOne().setHardness(2.5F).setBlockName("flamonorRock");
	public static Block redFire = new BlockRedFire().setBlockName("redFire");
	public static Block drakiuzOre = new BlockCoreOne().setHardness(20.8F).setBlockName("drakiuzOre");
	public static Block slateCobble = new BlockCoreOne().setBlockName("slateCobble");
	public static Block slateBricks = new BlockCoreOne().setBlockName("slateBricks");
	public static Block cherryLeaf = new BlockRioVLeaf().setHardness(0.3F).setBlockName("cherryLeaf");
	public static Block cherryLog = new BlockCherryLog().setHardness(3F).setBlockName("cherryLog");
	public static Block cherryBlossomSapling = new BlockRioVSapling().setBlockName("cherryBlossomSapling");
	public static Block cherryWorkbench = new BlockRioVWorkbench().setHardness(3F).setBlockName("cherryWorkbench");
	public static Block cherryBlossomFence = new BlockRioVFence("cherryPlanks").setHardness(3F).setBlockName("cherryBlossomFence");
	public static Block cherryBlossomFenceGate = new BlockRioVFenceGate().setHardness(3F).setHardness(1.5F).setBlockName("cherryBlossomFenceGate");
	public static Block cherryBlossomDoor = new BlockRioVDoor().setHardness(3F).setHardness(1.5F).setBlockName("cherryBlossomDoor");
	public static Block cherryBlossomLadder = new BlockRioVLadder().setHardness(3F).setBlockName("cherryBlossomLadder");
	public static Block cherryBlossomTrapdoor = new BlockRioVTrapDoor().setHardness(3F).setBlockName("cherryBlossomTrapdoor");
	public static Block paleLeaf = new BlockRioVLeaf().setHardness(0.3F).setBlockName("paleLeaf");
	public static Block bloodLog = new BlockBloodLog().setHardness(3F).setBlockName("bloodLog");
	public static Block bloodSapling = new BlockRioVSapling().setBlockName("bloodSapling");
	public static Block sanctuatiteMoving = new BlockSanctuatiteFlowing().setBlockName("sanctuatiteMoving");
	public static Block sanctuatiteStill = new BlockSancuatiteStill().setBlockName("sanctuatiteStill");
	public static Block sanctuatitePortal = new BlockSanctuatitePortal().setBlockName("sanctuatitePortal");
	public static Block sanctuatiteFire = new BlockSanctuatiteFire().setBlockName("sanctuatiteFire");
	public static Block sanctuatiteGrass = new BlockSanctuatiteGrass().setBlockName("sanctuatiteGrass");
	public static Block sanctuatiteDirt = new BlockDirt().setHardness(0.3f).setStepSound(Block.soundTypeGrass).setBlockName("sanctuatiteDirt");
	public static Block sanctuaryStone = new BlockCoreOne().setBlockName("sanctuaryStone");
	public static Block skycloud = new BlockSkycloud().setBlockName("skycloud");
	public static Block skywoodLog = new BlockSkywoodLog().setHardness(3F).setBlockName("skywoodLog");
	public static Block skywoodSapling = new BlockRioVSapling().setBlockName("sanctuaryTreeSapling");
	public static Block bloodWorkbench = new BlockRioVWorkbench().setHardness(1.5F).setBlockName("bloodWorkbench");
	public static Block bloodFence = new BlockRioVFence("bloodPlanks").setHardness(1.5F).setBlockName("bloodFence");
	public static Block bloodFenceGate = new BlockRioVFenceGate().setHardness(1.5F).setBlockName("bloodFenceGate");
	public static Block bloodDoor = new BlockRioVDoor().setHardness(3F).setBlockName("bloodDoor");
	public static Block bloodLadder = new BlockRioVLadder().setHardness(3F).setBlockName("bloodLadder");
	public static Block bloodTrapdoor = new BlockRioVTrapDoor().setHardness(3F).setBlockName("bloodTrapdoor");
	public static Block skywoodWorkbench = new BlockRioVWorkbench().setHardness(3F).setBlockName("skywoodWorkbench");
	public static Block skywoodFence = new BlockRioVFence("skywoodPlanks").setHardness(3F).setBlockName("skywoodFence");
	public static Block skywoodFenceGate = new BlockRioVFenceGate().setHardness(3F).setBlockName("skywoodFenceGate");
	public static Block skywoodDoor = new BlockRioVDoor().setHardness(3F).setBlockName("skywoodDoor");
	public static Block skywoodLadder = new BlockRioVLadder().setHardness(3F).setBlockName("skywoodLadder");
	public static Block skywoodTrapdoor = new BlockRioVTrapDoor().setHardness(3F).setBlockName("skywoodTrapdoor");
	public static Block alerisOre = new BlockCoreOne().setHardness(26.5F).setBlockName("alerisOre");
	public static Block anvil = new BlockAnvil().setHardness(3F).setBlockName("anvil");
	public static Block voidMoving = new BlockVoidFlowing().setBlockName("voidMoving");
	public static Block voidStill = new BlockVoidStill().setBlockName("voidStill");
	public static Block blueBerryBush = new BlockBush().setBlockName("blueBerryBush");
	public static Block raspBerryBush = new BlockBush().setBlockName("raspberryBush");
	public static Block blackBerryBush = new BlockBush().setBlockName("blackBerryBush");
	public static Block strawberryBush = new BlockBush().setBlockName("strawberryBush");
	public static Block bush = new BlockBush().setBlockName("bush");
	public static Block bloodBerryBush = new BlockBush().setBlockName("bloodBerryBush");
	public static Block jaavikOre = new BlockCoreOne().setHardness(10.5F).setBlockName("jaavikOre");
	public static Block jaavikBlock = new BlockCoreOne().setBlockName("jaavikBlock");
	public static Block steamingBloodDeposit = new BlockBloodRock().setHardness(1.5F).setBlockName("steamingBloodDeposit");
	public static Block alerisBlock = new BlockCoreOne().setBlockName("alerisBlock");
	public static Block drakiuzBlock = new BlockCoreOne().setBlockName("drakiuzBlock");
	public static Block crackedSlateBricks = new BlockCoreOne().setHardness(1.5F).setBlockName("crackedSlateBricks");
	public static Block bricks = new BlockBricks().setHardness(1.5F).setBlockName("bricks");
	public static Block vraviniteBlock = new BlockCoreOne().setBlockName("vraviniteBlock");
	public static Block stainedGlass = new BlockStainedGlass().setHardness(3F).setBlockName("stainedGlass");
	public static Block bloodFlower = new BlockPlantCore().setBlockName("bloodFlower");
	public static Block paleBush = new BlockBush().setBlockName("paleBush");
	public static Block chocolateCake = new BlockRioVCake().setHardness(0.5F).setBlockName("chocolateCake");
	public static Block glimmerTallGrass = new BlockPlantCore().setBlockName("glimmerTallGrass");
	public static Block sanctuatiteTallGrass = new BlockPlantCore().setBlockName("sanctuatiteTallGrass");
	public static Block bloodTallGrass = new BlockPlantCore().setBlockName("bloodTallGrass");
	public static Block fakeBloodBerryBush = new BlockBush().setBlockName("fakeBloodBerryBush");
	public static Block glimmerBush = new BlockBush().setBlockName("glimmerBush");
	public static Block glimmerBerryBush = new BlockBush().setBlockName("glimmerBerryBush");
	public static Block elderBerryPlant = new BlockPlantCore().setBlockName("elderBerryPlant");
	public static Block sanctuatiteBush = new BlockBush().setBlockName("sanctuatiteBush");
	public static Block sanctuatiteBerryBush = new BlockBush().setBlockName("sanctuatiteBerryBush");
	public static Block cloudBerryPlant = new BlockCloudPlant().setBlockName("cloudBerryPlant");
	public static Block enderBerryPlant = new BlockPlantCore().setBlockName("enderBerryPlant");
	public static Block fireBush = new BlockBush().setBlockName("fireBush");
	public static Block fireBerryBush = new BlockBush().setBlockName("fireBerryBush");
	public static Block noFacFlag = new BlockNoFactionFlag().setHardness(3F).setBlockName("noFactionFlag");
	public static Block raetiinFlag = new BlockRaetiinFlag().setHardness(3F).setBlockName("raetiinFlag");
	public static Block jaerinFlag = new BlockJaerinFlag().setHardness(3F).setBlockName("jaerinFlag");

	public static void add()
	{	
		RioVAPIUtil.registerBlock(noFacFlag, "No Faction Flag");
		RioVAPIUtil.registerBlock(raetiinFlag, "Raetiin Flag");
		RioVAPIUtil.registerBlock(jaerinFlag, "Jaerin Flag");
		RioVAPIUtil.registerBlock(fireBerryBush, "Fireberry Bush");
		RioVAPIUtil.registerBlock(fireBush, "Fire Bush");
		RioVAPIUtil.registerBlock(enderBerryPlant, "Enderberry Plant");
		RioVAPIUtil.registerBlock(fakeBloodBerryBush, "Fake Bloodberry Bush");
		RioVAPIUtil.registerBlock(cloudBerryPlant, "Cloudberry Plant");
		RioVAPIUtil.registerBlock(sanctuatiteBush, "Sanctuatite Bush");
		RioVAPIUtil.registerBlock(sanctuatiteBerryBush, "Sanctuatite Berry Bush");
		RioVAPIUtil.registerBlock(elderBerryPlant, "Elderberry Plant");
		RioVAPIUtil.registerBlock(glimmerBush, "Glimmer Bush");
		RioVAPIUtil.registerBlock(glimmerBerryBush, "Glimmer Berry Bush");
		RioVAPIUtil.registerBlock(glimmerTallGrass, "Glimmer Tall Grass");
		RioVAPIUtil.registerBlock(sanctuatiteTallGrass, "Sanctuatite Tall Grass");
		RioVAPIUtil.registerBlock(bloodTallGrass, "Blood Tall Grass");
		RioVAPIUtil.registerBlock(blackQuartz, "Black Quartz Block");
		GameRegistry.registerBlock(stainedGlass, ItemStainedGlass.class, RioVAPIUtil.getName(stainedGlass.getUnlocalizedName()));	
		GameRegistry.registerBlock(bricks, ItemBricks.class, RioVAPIUtil.getName(bricks.getUnlocalizedName()));		
		GameRegistry.registerBlock(plankColored, ItemPlanksColored.class, RioVAPIUtil.getName(plankColored.getUnlocalizedName()));		
		RioVAPIUtil.registerBlock(steamingBloodDeposit, "Steaming Blood Deposit");
		RioVAPIUtil.registerBlock(bloodBerryBush, "Blood Berry Bush");
		RioVAPIUtil.registerBlock(bloodFlower, "Blood Flower");
		RioVAPIUtil.registerBlock(chocolateCake, "Chocolate Cake");
		RioVAPIUtil.registerBlock(paleBush, "Pale Bush");
		RioVAPIUtil.registerBlock(drakiuzBlock, "Drakiuz Block");
		RioVAPIUtil.registerBlock(vraviniteBlock, "Vravinite Block");
		RioVAPIUtil.registerBlock(crackedSlateBricks, "Cracked Slate Bricks");
		RioVAPIUtil.registerBlock(alerisBlock, "Aleris Block");
		RioVAPIUtil.registerBlock(glimmerwoodPlanks, "Glimmerwood Planks");
		RioVAPIUtil.registerBlock(cherryPlanks, "Cherry Blossom Planks");
		RioVAPIUtil.registerBlock(skywoodPlanks, "Skywood Planks");
		RioVAPIUtil.registerBlock(bloodPlanks, "Blood Planks");
		RioVAPIUtil.registerBlock(bush, "Bush");
		RioVAPIUtil.registerBlock(blueBerryBush, "Blueberry Bush");
		RioVAPIUtil.registerBlock(raspBerryBush, "Raspberry Bush");
		RioVAPIUtil.registerBlock(blackBerryBush, "Blackberry Bush");
		RioVAPIUtil.registerBlock(strawberryBush, "Strawberry Bush");
		RioVAPIUtil.registerBlock(jaavikBlock, "Jaavik Block");
		RioVAPIUtil.registerBlock(jaavikOre, "Jaavik Ore");
		RioVAPIUtil.registerBlock(voidMoving, "Void Liquid Moving");
		RioVAPIUtil.registerBlock(voidStill, "Void Liquid Still");
		RioVAPIUtil.registerBlock(anvil, "Anvil");
		RioVAPIUtil.registerBlock(alerisOre, "Aleris Ore");
		RioVAPIUtil.registerBlock(bloodLadder, "Blood Ladder");
		RioVAPIUtil.registerBlock(bloodTrapdoor, "Blood Trapdoor");
		RioVAPIUtil.registerBlock(bloodFence, "Blood Fence");
		RioVAPIUtil.registerBlock(bloodFenceGate, "Blood Fence Gate");
		RioVAPIUtil.registerBlock(bloodWorkbench, "Blood Workbench");
		RioVAPIUtil.registerBlock(skywoodLadder, "Skywood Ladder");
		RioVAPIUtil.registerBlock(skywoodTrapdoor, "Skywood Trapdoor");
		RioVAPIUtil.registerBlock(skywoodFence, "Skywood Fence");
		RioVAPIUtil.registerBlock(skywoodFenceGate, "Skywood Fence Gate");
		RioVAPIUtil.registerBlock(skywoodWorkbench, "Skywood Workbench");
		RioVAPIUtil.registerBlock(skycloud, "Skycloud");
		RioVAPIUtil.registerBlock(skywoodLog, "Skywood Log");
		RioVAPIUtil.registerBlock(skywoodSapling, "Skywood Sapling");
		RioVAPIUtil.registerBlock(sanctuaryStone, "Sanctuary Stone");
		RioVAPIUtil.registerBlock(sanctuatitePortal, "Sanctuatite Portal");
		RioVAPIUtil.registerBlock(sanctuatiteGrass, "Sanctuatite Grass");
		RioVAPIUtil.registerBlock(sanctuatiteDirt, "Sanctuatite Dirt");
		RioVAPIUtil.registerBlock(sanctuatiteFire, "Fire of Flamonor");
		RioVAPIUtil.registerBlock(sanctuatiteMoving, "Sancuatite Moving");
		RioVAPIUtil.registerBlock(sanctuatiteStill, "Sancuatite Still");
		RioVAPIUtil.registerBlock(paleLeaf, "Pale Leaf");
		RioVAPIUtil.registerBlock(bloodLog, "Blood Log");
		RioVAPIUtil.registerBlock(bloodDoor, "Blood Door (Block)");
		RioVAPIUtil.registerBlock(glimmerwoodDoor, "Glimmerwood Door (Block)");
		RioVAPIUtil.registerBlock(cherryBlossomDoor, "Cherry Blossom Door (Block)");
		RioVAPIUtil.registerBlock(skywoodDoor, "Skywood Door (Block)");
		RioVAPIUtil.registerBlock(bloodSapling, "Blood Sapling");
		RioVAPIUtil.registerBlock(cherryBlossomLadder, "Cherry Blossom Ladder");
		RioVAPIUtil.registerBlock(cherryBlossomTrapdoor, "Cherry Blossom Trapdoor");
		RioVAPIUtil.registerBlock(cherryBlossomFence, "Cherry Blossom Fence");
		RioVAPIUtil.registerBlock(cherryBlossomFenceGate, "Cherry Blossom Fence Gate");
		RioVAPIUtil.registerBlock(cherryWorkbench, "Cherry Blossom Workbench");
		RioVAPIUtil.registerBlock(cherryBlossomSapling, "Cherry Blossom Sapling");
		RioVAPIUtil.registerBlock(cherryLog, "Cherry Blossom Log");
		RioVAPIUtil.registerBlock(cherryLeaf, "Cherry Blossom Leaf");
		RioVAPIUtil.registerBlock(slateBricks, "Slate Bricks");
		RioVAPIUtil.registerBlock(slateCobble, "Cobbleslate");
		RioVAPIUtil.registerBlock(drakiuzOre, "Drakiuz Ore");
		RioVAPIUtil.registerBlock(flamonorRock, "Flamonor Rock");
		RioVAPIUtil.registerBlock(flamonorPortal, "Flamonor Portal");
		RioVAPIUtil.registerBlock(bloodGrass, "Blood Grass");
		RioVAPIUtil.registerBlock(bloodDirt, "Blood Dirt");
		RioVAPIUtil.registerBlock(glimmerwoodTrapdoor, "Glimmerwood Trapdoor");
		RioVAPIUtil.registerBlock(glimmerwoodLadder, "Glimmerwood Ladder");
		RioVAPIUtil.registerBlock(glimmerRock, "Glimmer Rock");
		RioVAPIUtil.registerBlock(glimmerwoodFenceGate, "Glimmerwood Fence Gate");
		RioVAPIUtil.registerBlock(glimmerwoodFence, "Glimmerwood Fence");
		RioVAPIUtil.registerBlock(vraviniteOre, "Vravinite Ore");
		RioVAPIUtil.registerBlock(glimmerwoodWorkbench, "Glimmerwood Workbench");
		RioVAPIUtil.registerBlock(vaerynPortal, "Vaeryn Portal");
		RioVAPIUtil.registerBlock(whiteFire, "White Fire");
		RioVAPIUtil.registerBlock(redFire, "Red Fire");
		RioVAPIUtil.registerBlock(glimmerGrass, "Glimmer Grass");
		RioVAPIUtil.registerBlock(glimmerDirt, "Glimmer Dirt");
		RioVAPIUtil.registerBlock(glimmerwoodLeaf, "Glimmerwood Leaf");
		RioVAPIUtil.registerBlock(glimmerwoodLog, "Glimmerwood Log");
		RioVAPIUtil.registerBlock(glimmerwoodSapling, "Glimmerwood Sapling");
		RioVAPIUtil.registerBlock(blindoniteBlock, "Blindonite Block");
		RioVAPIUtil.registerBlock(infuser, "Infuser");
		RioVAPIUtil.registerBlock(blindoniteOre, "Blindonite Ore");
		RioVAPIUtil.registerBlock(blackFire, "Black Fire");
		RioVAPIUtil.registerBlock(blindOasisPortal, "Blind Oasis Portal");
		RioVAPIUtil.registerBlock(blackRock, "Black Stone");
		RioVAPIUtil.registerBlock(blueFlower, "Blue Flower");
		RioVAPIUtil.registerBlock(lamp, "Lamp");
		RioVAPIUtil.registerBlock(amethystOre, "Amethyst Ore");
		RioVAPIUtil.registerBlock(pepperPlant, "Pepper Plant");
		RioVAPIUtil.registerBlock(grapePlant, "Grape Plant");
		RioVAPIUtil.registerBlock(tomatoPlant, "Tomato Plant");
		RioVAPIUtil.registerBlock(onyxOre, "Onyx Ore");
		RioVAPIUtil.registerBlock(blackDuriiPlant, "Black Durii Plant");
		RioVAPIUtil.registerBlock(garnetOre, "Garnet Ore");
		RioVAPIUtil.registerBlock(slate, "Slate");
		RioVAPIUtil.registerBlock(nironiteOre, "Nironite Ore");
		RioVAPIUtil.registerBlock(dragonOre, "Dragon Ore");
		RioVAPIUtil.registerBlock(whiteStone, "White Stone");
		RioVAPIUtil.registerBlock(netherCrystal, "Black Quartz Ore");
		RioVAPIUtil.registerBlock(bloodRock, "Blood Rock");
		RioVAPIUtil.registerBlock(onyxBlock, "Onyx Block");
		RioVAPIUtil.registerBlock(amethystBlock, "Amethyst Block");
		RioVAPIUtil.registerBlock(garnetBlock, "Garnet Block");
		RioVAPIUtil.registerBlock(nironiteBlock, "Nironite Block");
		RioVAPIUtil.registerBlock(dragonBlock, "Dragon Soul Block");
	}
}
