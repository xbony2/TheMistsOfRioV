package sheenrox82.RioV.src.base;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config
{
	public static Configuration config;
	public static int enchantmentID = 80;
	public static int entityID = 8200;
	
	public static int blindOasisID;
	public static int vaerynID;
	public static int flamonorID;
	public static int sanctuatiteID;
	public static int blindOasisBiomeID;
	public static int glimmerwoodBiomeID;
	public static int snowyMountainsBiomeID;
	public static int savannahBiomeID;
	public static int flamonorBiomeID;
	public static int sanctuatiteBiomeID;
	public static int canopyOasisBiomeID;
	
	public static boolean EOS;
	public static boolean Helmet;
	public static boolean showToolInfo;
	public static boolean allowBreathing;
	public static boolean deadBodies;
	public static boolean runCapes;
	public static boolean mobNametags;
	public static boolean dev;
	public static int hudPosX;
	public static int hudPosY;
	
	public static void initialize(FMLPreInitializationEvent event)
	{
		config = new Configuration(event.getSuggestedConfigurationFile());
		
		blindOasisID = config.get("Dimension IDs", "Blind Oasis Dimension ID", 11).getInt();
		vaerynID = config.get("Dimension IDs", "Vaeryn Dimension ID", 12).getInt();
		flamonorID = config.get("Dimension IDs", "Flamonor Dimension ID", 13).getInt();
		sanctuatiteID = config.get("Dimension IDs", "Sanctuatite Dimension ID", 14).getInt();
		blindOasisBiomeID = config.get("Biome IDs", "Blind Oasis Biome ID (Blind Oasis Dimension)", 40).getInt(blindOasisBiomeID);
		glimmerwoodBiomeID = config.get("Biome IDs", "Glimmerwood Biome ID (Vaeryn Dimension)", 41).getInt(glimmerwoodBiomeID);
		snowyMountainsBiomeID = config.get("Biome IDs", "Snowy Mountains Biome ID (Overworld Dimension)", 42).getInt(snowyMountainsBiomeID);
		savannahBiomeID = config.get("Biome IDs", "Savannah Biome ID (Overworld Dimension)", 43).getInt(savannahBiomeID);
		flamonorBiomeID = config.get("Biome IDs", "Flamonor Biome ID (Flamonor Dimension)", 44).getInt(flamonorBiomeID);
		sanctuatiteBiomeID = config.get("Biome IDs", "Sanctuatite Biome ID (Sanctuatite Dimension)", 45).getInt(sanctuatiteBiomeID);
		canopyOasisBiomeID = config.get("Biome IDs", "Canopy Oasis Biome ID (Overworld Dimension)", 46).getInt(canopyOasisBiomeID);

		config.load();
	}

	public static int addEnchantment(String name)
	{
		enchantmentID++;

		return config.get("Enchantments", name, enchantmentID).getInt();
	}

	public static int addEntity(String name)
	{
		entityID++;

		return config.get("Entities", name, entityID).getInt() - 1;
	}
	
	public static void initPost()
	{
		config.save();
	}
}