package sheenrox82.RioV.src.faction;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import sheenrox82.Core.src.base.ModUpdateChecker;
import sheenrox82.RioV.src.api.util.RioVPlayer;

public class CommandFaction extends CommandBase implements ICommand
{
	private List aliases;
	public CommandFaction()
	{
		this.aliases = new ArrayList();
		this.aliases.add("faction");
		this.aliases.add("Faction");
		this.aliases.add("f");
		this.aliases.add("F");
		this.aliases.add("riovFaction");
		this.aliases.add("riovfaction");

	}

	@Override
	public String getCommandName()
	{
		return "faction";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender)
	{
		return EnumChatFormatting.GOLD + "/faction <factionID> - Choose a Faction. (Raetiin (bad) ID: 1) || (Jaerin (good) ID: 2)";
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
			EntityPlayer thePlayer = (EntityPlayer)icommandsender;
			RioVPlayer player = RioVPlayer.get(thePlayer);
			
			int factionID = Integer.parseInt(astring[0]);
			
			if(factionID == 1)
			{
				player.setFactionID(player.raetiinID);
				player.setFactionName(player.raetiinName);
			}
			
			if(factionID == 2)
			{
				player.setFactionID(player.jaerinID);
				player.setFactionName(player.jaerinName);
			}
		}
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender icommandsender)
	{
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender icommandsender,
			String[] astring)
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