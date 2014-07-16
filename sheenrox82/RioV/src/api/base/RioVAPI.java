package sheenrox82.RioV.src.api.base;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import sheenrox82.RioV.src.api.handler.packet.PacketPipeline;
import sheenrox82.RioV.src.api.recipe.manager.AnvilCraftingManager;
import sheenrox82.RioV.src.api.recipe.manager.InfuserManager;
import sheenrox82.RioV.src.api.util.LogHelper;
import sheenrox82.RioV.src.api.util.Util;

public class RioVAPI
{
	//The API instance.
	private static RioVAPI api = new RioVAPI();

	//The crafting manager for the Anvil in RioV
	private static AnvilCraftingManager crafter = new AnvilCraftingManager();

	//Gets infuser crafting from RioV
	private static InfuserManager infuser = new InfuserManager();

	//Writes to ./TheMistsOfRioV/debug.log
	private static LogHelper logger = new LogHelper();

	//Used to correctly write and close the debug file.
	public boolean modLoaded = false;

	//Get RioV PacketPipeline
	public PacketPipeline packetPipeline = new PacketPipeline();

	//These booleans are used to detect if certain mods are loaded in the ExpansionChecker class in the main source code for RioV.
	//Natura - continued by progwml6
	//Botania - by Vazkii
	//Optifine - by sp614x
	public boolean natura;
	public boolean botania;
	public boolean optifine;

	//RioV tab.
	public CreativeTabs tab = new CreativeTabs(Util.MOD_ID) {public Item getTabIconItem() {return Item.getItemFromBlock(getRioVBlock("infuser"));}};

	public static RioVAPI getInstance()
	{
		return api;
	}

	public AnvilCraftingManager getCraftingManager()
	{
		return crafter;
	}

	public LogHelper getLogger()
	{
		return logger;
	}

	public InfuserManager getInfuser()
	{
		return infuser;
	}

	public PacketPipeline getPacketPipeline()
	{
		return packetPipeline;
	}	

	/**
	 * Get a RioV Item using a string.
	 * 
	 * @param itemName - Object name in RioVItems.java (check Github).
	 */
	public Item getRioVItem(String itemName)
	{
		try
		{
			Class riovItems = Class.forName("sheenrox82.RioV.src.content.RioVItems");
			Item itemToGet = (Item)riovItems.getDeclaredField(itemName).get(null);
			return itemToGet;
		}
		catch(Exception e)
		{
			//If it can't find the item it will revert 
			//to this until the item is found. This is so 
			//you don't crash with this API in Eclipse because you don't have the RioV source code.
			return Items.iron_shovel;
		}
	}

	/**
	 * Get a RioV Block using a string.
	 * 
	 * @param blockName - Object name in RioVBlocks.java (check Github).
	 */
	public Block getRioVBlock(String blockName)
	{
		try
		{
			Class riovBlocks = Class.forName("sheenrox82.RioV.src.content.RioVBlocks");
			Block blockToGet = (Block)riovBlocks.getDeclaredField(blockName).get(null);
			return blockToGet;
		}
		catch(Exception e)
		{
			//If it can't find the block it will revert 
			//to this until the block is found. This is so 
			//you don't crash with this API in Eclipse because you don't have the RioV source code.
			return Blocks.stone;
		}
	}
	
	/**
	 * Get a RioV Config field using a string.
	 * 
	 * @param field - Field name in Config.java (check Github).
	 */
	public boolean getConfigFields(String field)
	{
		try
		{
			Class riovBlocks = Class.forName("sheenrox82.RioV.src.base.Config");
			boolean blockToGet = (Boolean)riovBlocks.getDeclaredField(field).get(null);
			return blockToGet;
		}
		catch(Exception e)
		{
			//If field is not found, the boolean will be false.
			return false;
		}
	}
}
