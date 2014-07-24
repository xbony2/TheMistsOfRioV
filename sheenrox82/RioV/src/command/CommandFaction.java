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
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
import sheenrox82.RioV.src.api.util.RioVPlayer;
import sheenrox82.RioV.src.content.RioVBlocks;

public class CommandFaction extends CommandBase implements ICommand
{
	private List aliases;
	public CommandFaction()
	{
		this.aliases = new ArrayList();
		this.aliases.add("mpfaction");
		this.aliases.add("mpFaction");
		this.aliases.add("mpf");
		this.aliases.add("mpF");
		this.aliases.add("mpriovFaction");
		this.aliases.add("mpriovfaction");
	}

	@Override
	public String getCommandName()
	{
		return "mpFaction";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender)
	{
		return EnumChatFormatting.GOLD + "/mpFaction <factionID> - [MULTIPLAYER] Choose a Faction. (" + Color.DARK_RED + "Raetiin ID: 1" + Color.GOLD + ", " + Color.GREEN + "Jaerin ID: 2" + Color.GOLD + ")";
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
				icommandsender.addChatMessage(RioVAPIUtil.addChatMessage(Color.DARK_RED, "Invalid arguments. Use /mpFaction <factionID> to join a faction."));
			}

			if(astring.length > 0)
			{
				int facID = Integer.parseInt(astring[0]);

				if(facID == 1)
				{
					if(player.getFactionID() == player.noFactionID && !thePlayer.capabilities.isCreativeMode)
					{
						player.setFactionID(player.raetiinID);
						player.setFactionName(player.raetiinName);
						thePlayer.inventory.addItemStackToInventory(new ItemStack(RioVBlocks.raetiinFlag));
						icommandsender.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(Color.WHITE, "Current faction set to: " + player.getFactionName()));

					}
					else
					{
						if(thePlayer.capabilities.isCreativeMode)
						{
							player.setFactionID(player.raetiinID);
							player.setFactionName(player.raetiinName);
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
						player.setFactionID(player.jaerinID);
						player.setFactionName(player.jaerinName);
						thePlayer.inventory.addItemStackToInventory(new ItemStack(RioVBlocks.jaerinFlag));
						icommandsender.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(Color.WHITE, "Current faction set to: " + player.getFactionName()));
					}
					else
					{
						if(thePlayer.capabilities.isCreativeMode)
						{
							player.setFactionID(player.jaerinID);
							player.setFactionName(player.jaerinName);
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

	public int getRequiredPermissionLevel()
	{
		return 0;
	}
}