package sheenrox82.RioV.src.command;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import sheenrox82.Core.src.base.ModUpdateChecker;
import sheenrox82.RioV.src.api.util.Color;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;

public class CommandFactionHelp extends CommandBase implements ICommand
{
	private List aliases;
	public CommandFactionHelp()
	{
		this.aliases = new ArrayList();
		this.aliases.add("riovfactionhelp");
		this.aliases.add("riovFactionhelp");
		this.aliases.add("rfactionhelp");
		this.aliases.add("rFactionhelp");
	}

	@Override
	public String getCommandName()
	{
		return "riovfactionhelp";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender)
	{
		return Color.GOLD + "/riovfactionhelp - Find the command to join a faction.";
	}

	@Override
	public List getCommandAliases()
	{
		return this.aliases;
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring)
	{        
		if(icommandsender instanceof EntityPlayer)
		{
			if(astring.length > 0)
			{
				icommandsender.addChatMessage(RioVAPIUtil.addChatMessage(Color.DARK_RED, "Invalid arguments. Use { /riovfactionhelp } to join a faction."));
			}

			icommandsender.addChatMessage(RioVAPIUtil.addChatMessage(Color.AQUA + "MULTIPLAYER: /mpfaction <factionID> - Join a faction on SMP."));
			icommandsender.addChatMessage(RioVAPIUtil.addChatMessage(Color.AQUA + "SINGLEPLAYER: /spfaction <factionID> - Join a faction on SSP."));
			icommandsender.addChatMessage(RioVAPIUtil.addChatMessage(Color.AQUA + "<Faction IDs>"));
			icommandsender.addChatMessage(RioVAPIUtil.addChatMessage(Color.AQUA + "Raetiin (bad) ID: 1, Jaerin (good) ID: 2"));
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