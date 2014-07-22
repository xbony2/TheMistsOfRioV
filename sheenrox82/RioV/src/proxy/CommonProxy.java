package sheenrox82.RioV.src.proxy;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.client.FMLClientHandler;

public class CommonProxy
{	
	public static int addArmor(String armorName)
	{
		return 0;
	}

	public void init()
	{	

	}

	public void cape()
	{

	}

	public void registerItemRenderers()
	{

	}

	public ModelBiped getArmorModel(int id)
	{
		return null;
	}
	
	private static final Map<String, NBTTagCompound> entityPlayerData = new HashMap<String, NBTTagCompound>();

	public static void storeEntityData(String name, NBTTagCompound compound)
	{
		entityPlayerData.put(name, compound);
	}

	public static NBTTagCompound getEntityData(String name)
	{
		return entityPlayerData.remove(name);
	}
}