package sheenrox82.RioV.src.util;

import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.nei.AnvilNEI;
import codechicken.nei.api.API;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;

public class ExpansionChecker 
{
	public static void check()
	{
		try
		{
			Class.forName("optifine.OptiFineClassTransformer");
			FMLLog.info("Optifine detected! Disabling RioV capes for safety measures!");
			RioVAPI.getInstance().optifine = true;
		}
		catch (Throwable var11)
		{
			FMLLog.info("Optifine not detected! RioV Capes is activating using DeveloperCapes by Jadar.");
			RioVAPI.getInstance().optifine = false;
		}

		if(Loader.isModLoaded("Natura"))
		{
			FMLLog.info("Natura detected! You get the Natura Expansion for RioV! :)");
			RioVAPI.getInstance().natura = true;
			if(RioVAPI.getInstance().natura)
			{
				RioVItems.addNatura();
			}
		}
		else
		{
			FMLLog.info("Natura wasn't detected... No Natura Expansion for you. :(");
			RioVAPI.getInstance().natura = false;
		}

		if(Loader.isModLoaded("Baubles"))
		{
			FMLLog.info("Baubles detected! You get the Baubles Expansion for RioV! :)");
			RioVAPI.getInstance().baubles = true;
			if(RioVAPI.getInstance().baubles)
			{
				RioVItems.addBaubles();
			}
		}
		else
		{
			FMLLog.info("Baubles wasn't detected... No Baubles Expansion for you. :(");
			RioVAPI.getInstance().baubles = false;
		}

		try
		{
			Class.forName("codechicken.nei.NEICompatibility");
			FMLLog.info("NEI detected! RioV NEI integration is being added!");
			RioVAPI.getInstance().getLogger().info("NEI detected! RioV NEI integration is being added!");
			RioVAPI.getInstance().nei = true;
			
			if(RioVAPI.getInstance().nei == true)
			{
				API.registerRecipeHandler(new AnvilNEI());
			}
		}
		catch (Throwable var11)
		{
			FMLLog.info("NEI was not detected, no RioV NEI integration for you. :(");
			RioVAPI.getInstance().getLogger().info("NEI was not detected, no RioV NEI integration for you. :(");
			RioVAPI.getInstance().nei = false;
		}
	}
}
