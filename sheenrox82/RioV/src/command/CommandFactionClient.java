package sheenrox82.RioV.src.command;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.util.Color;
import sheenrox82.RioV.src.api.util.RioVPlayer;
import sheenrox82.RioV.src.content.RioVBlocks;

public class CommandFactionClient extends CommandBase implements ICommand
{
	private List aliases;
	public CommandFactionClient()
	{
		this.aliases = new ArrayList();
		this.aliases.add("spfaction");
		this.aliases.add("spFaction");
		this.aliases.add("spf");
		this.aliases.add("spF");
		this.aliases.add("spriovFaction");
		this.aliases.add("spriovfaction");
	}

	@Override
	public String getCommandName()
	{
		return "faction";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender)
	{
		return Color.GOLD + "/spFaction <factionID> - [SINGLEPLAYER] Choose a Faction. (" + Color.DARK_RED + "Raetiin ID: 1" + Color.GOLD + ", " + Color.GREEN + "Jaerin ID: 2" + Color.GOLD + ")";
	}

	@Override
	public List getCommandAliases()
	{
		return this.aliases;
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring)
	{        
		EntityPlayer thePlayer = (EntityPlayer)icommandsender;
		RioVPlayer player = RioVPlayer.get(thePlayer);

		if(icommandsender instanceof EntityPlayerMP)
		{
			if (astring.length == 0)
			{
				icommandsender.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.DARK_RED, "Invalid arguments. Use /spFaction <factionID> to join a faction."));
			}

			if(astring.length > 0)
			{
				int facID = Integer.parseInt(astring[0]);

				if(facID == 1)
				{
					if(player.getFactionID() == player.noFactionID && !thePlayer.capabilities.isCreativeMode)
					{
						player.setClientFactionID(player.raetiinID);
						player.setClientFactionName(player.raetiinName);
						thePlayer.inventory.addItemStackToInventory(new ItemStack(RioVBlocks.raetiinFlag));
						icommandsender.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(Color.WHITE, "Current faction set to: " + player.getFactionName()));

					}
					else
					{
						if(thePlayer.capabilities.isCreativeMode)
						{
							player.setClientFactionID(player.raetiinID);
							player.setClientFactionName(player.raetiinName);
						}
						else
						{
							icommandsender.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(Color.WHITE, "Your faction is currently: " + player.getFactionName() + Color.WHITE + " - You cannot change it."));
						}
					}
				}

				if(facID == 2)
				{
					if(player.getFactionID() == player.noFactionID && !thePlayer.capabilities.isCreativeMode)
					{
						player.setClientFactionID(player.jaerinID);
						player.setClientFactionName(player.jaerinName);
						thePlayer.inventory.addItemStackToInventory(new ItemStack(RioVBlocks.jaerinFlag));
						icommandsender.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(Color.WHITE, "Current faction set to: " + player.getFactionName()));
					}
					else
					{
						if(thePlayer.capabilities.isCreativeMode)
						{
							player.setClientFactionID(player.jaerinID);
							player.setClientFactionName(player.jaerinName);
						}
						else
						{
							icommandsender.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(Color.WHITE, "Your faction is currently: " + player.getFactionName() + Color.WHITE + " - You cannot change it."));
						}
					}
				}

				if(facID > 2)
				{
					icommandsender.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(Color.DARK_RED, "The max number is two. Use one or two for the ID."));
				}
			}
		}
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender icommandsender)
	{
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender icommandsender, String[] astring)
	{
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] astring, int i)
	{
		return false;
	}

	@Override
	public int compareTo(Object o)
	{
		return 0;
	}

	public int getRequiredPermissionLevel()
	{
		return 0;
	}
}