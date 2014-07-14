package sheenrox82.RioV.src.util;

import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVItems;
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
			TheMistsOfRioV.getInstance().optifine = true;
		}
		catch (Throwable var11)
		{
			FMLLog.info("Optifine not detected! RioV Capes is activating using DeveloperCapes by Jadar.");
			TheMistsOfRioV.getInstance().optifine = false;
		}

		if(Loader.isModLoaded("Natura"))
		{
			FMLLog.info("Natura detected! You get the Natura Expansion for RioV! :)");
			TheMistsOfRioV.getInstance().natura = true;
			if(TheMistsOfRioV.getInstance().natura)
			{
				RioVItems.addNatura();
			}
		}
		else
		{
			FMLLog.info("Natura wasn't detected... No Natura Expansion for you. :(");
			TheMistsOfRioV.getInstance().natura = false;
		}

		if(Loader.isModLoaded("Botania"))
		{
			FMLLog.info("Botania detected! You get the Botania Expansion for RioV! :)");
			TheMistsOfRioV.getInstance().botania = true;
			if(TheMistsOfRioV.getInstance().botania)
			{
				RioVItems.addBotania();
			}
		}
		else
		{
			FMLLog.info("Botania wasn't detected... No Botania Expansion for you. :(");
			TheMistsOfRioV.getInstance().botania = false;
		}
	}
}
