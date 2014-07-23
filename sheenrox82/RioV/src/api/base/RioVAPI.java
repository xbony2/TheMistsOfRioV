package sheenrox82.RioV.src.api.base;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sheenrox82.RioV.src.api.handler.packet.PacketPipeline;
import sheenrox82.RioV.src.api.recipe.manager.AnvilCraftingManager;
import sheenrox82.RioV.src.api.recipe.manager.InfuserManager;
import sheenrox82.RioV.src.api.util.LogHelper;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;

public class RioVAPI
{
	private static RioVAPI api = new RioVAPI();
	private AnvilCraftingManager crafter = new AnvilCraftingManager();
	private InfuserManager infuser = new InfuserManager();
	private LogHelper logger = new LogHelper();
	private RioVAPIUtil util = new RioVAPIUtil();
	private PacketPipeline pipeline = new PacketPipeline();

	public boolean modLoaded = false;
	
	/**
	 * These booleans are used to detect if certain mods are loaded in the ExpansionChecker class in the main source code for RioV.
	 * Natura - continued by progwml6
	 * Botania - by Vazkii
	 * Optifine - by sp614x
	 * NEI - by CodeChicken
	 */
	public boolean natura;
	public boolean botania;
	public boolean optifine;
	public boolean nei;

	/**
	 * RioV tab.
	 */
	public CreativeTabs tab = new CreativeTabs("RioV") {public Item getTabIconItem() {return Item.getItemFromBlock(getUtil().getRioVBlock("infuser"));}};

	/**
	 * The API instance.
	 */
	public static RioVAPI getInstance()
	{
		return api;
	}

	/**
	 * The crafting manager for the Anvil in RioV
	 */
	public AnvilCraftingManager getCraftingManager()
	{
		return crafter;
	}

	/**
	 * Writes to ./TheMistsOfRioV/debug.log
	 */
	public LogHelper getLogger()
	{
		return logger;
	}

	/**
	 * Gets infuser crafting from RioV
	 */
	public InfuserManager getInfuser()
	{
		return infuser;
	}

	/**
	 * Get RioVAPIUtil.java
	 */
	public RioVAPIUtil getUtil()
	{
		return util;
	}

	public PacketPipeline getPipeline() 
	{
		return pipeline;
	}
}
