package sheenrox82.RioV.src.api.util;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class RioVAPIUtil 
{
	public static void registerItem(Item item, String string)
	{
		GameRegistry.registerItem(item, string);	
	}

	public static void registerBlock(Block block, String string)
	{
		GameRegistry.registerBlock(block, string);
	}
	
	public static String getName(String unlocalizedName) 
	{
		return unlocalizedName.substring(unlocalizedName.lastIndexOf(".") + 1);
	}

	public static ChatComponentTranslation addChatMessage(EnumChatFormatting color, String str, Object... args)
	{
		ChatComponentTranslation ret = new ChatComponentTranslation(str, args);
		ret.getChatStyle().setColor(color);
		return ret;
	}

	public static ChatComponentTranslation addChatMessage(String str, Object... args)
	{
		ChatComponentTranslation ret = new ChatComponentTranslation(str, args);
		return ret;
	}

	public static void sendMessageToAll(String message)
	{
		FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage(addChatMessage(EnumChatFormatting.GOLD, message));
	}
	
	public static void sendMessageToAll(String message, EntityPlayer player)
	{
		FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage(addChatMessage(EnumChatFormatting.GOLD, message + player.getDisplayName()));
	}
}
