package sheenrox82.RioV.src.content;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.world.biome.BiomeGenBlindOasis;
import sheenrox82.RioV.src.world.biome.BiomeGenCanopyOasis;
import sheenrox82.RioV.src.world.biome.BiomeGenFlamonor;
import sheenrox82.RioV.src.world.biome.BiomeGenGlimmerwood;
import sheenrox82.RioV.src.world.biome.BiomeGenSanctuatite;
import sheenrox82.RioV.src.world.biome.BiomeGenSavannah;
import sheenrox82.RioV.src.world.biome.BiomeGenSnowyMountains;
import cpw.mods.fml.common.registry.GameRegistry;

public class Biomes 
{
	public static BiomeGenBase blindOasis = new BiomeGenBlindOasis(Config.blindOasisBiomeID);
	public static BiomeGenBase glimmerwood = new BiomeGenGlimmerwood(Config.glimmerwoodBiomeID);
	public static BiomeGenBase snowyMountains = new BiomeGenSnowyMountains(Config.snowyMountainsBiomeID).setBiomeName("Snowy Mountains");
	public static BiomeGenBase savannah = new BiomeGenSavannah(Config.savannahBiomeID).setColor(16421912).setBiomeName("Savannah").setDisableRain().setTemperatureRainfall(2.0F, 0.0F);
	public static BiomeGenBase flamonor = new BiomeGenFlamonor(Config.flamonorBiomeID);
	public static BiomeGenBase sanctuatite = new BiomeGenSanctuatite(Config.sanctuatiteBiomeID);
	public static BiomeGenBase canopyOasis = new BiomeGenCanopyOasis(Config.canopyOasisBiomeID).setColor(5470985);

	public static void add()
	{
		 BiomeDictionary.registerBiomeType(snowyMountains, Type.FROZEN);
         BiomeManager.addSpawnBiome(snowyMountains);
         BiomeDictionary.registerBiomeType(savannah, Type.DESERT);
         BiomeManager.addSpawnBiome(savannah);
         BiomeDictionary.registerBiomeType(canopyOasis, Type.FOREST);
         BiomeManager.addSpawnBiome(canopyOasis);
	}
}
