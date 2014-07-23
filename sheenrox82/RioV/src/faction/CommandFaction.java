package sheenrox82.RioV.src.faction;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.EnumChatFormatting;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
import sheenrox82.RioV.src.api.util.RioVPlayer;

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
		return EnumChatFormatting.GOLD + "/mpFaction <factionID> - [MULTIPLAYER] Choose a Faction. (" + EnumChatFormatting.DARK_RED + "Raetiin ID: 1" + EnumChatFormatting.GOLD + ", " + EnumChatFormatting.GREEN + "Jaerin ID: 2" + EnumChatFormatting.GOLD + ")";
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
				icommandsender.addChatMessage(RioVAPIUtil.addChatMessage(EnumChatFormatting.DARK_RED, "Invalid arguments. Use /mpFaction <factionID> to join a faction."));
			}

			if(astring.length > 0)
			{
				int facID = Integer.parseInt(astring[0]);

				if(facID == 1)
				{
					player.setFactionID(player.raetiinID);
					player.setFactionName(player.raetiinName);
				}

				if(facID == 2)
				{
					player.setFactionID(player.jaerinID);
					player.setFactionName(player.jaerinName);
				}
			}
		}
	}

	public int getRequiredPermissionLevel()
	{
		return 0;
	}
}