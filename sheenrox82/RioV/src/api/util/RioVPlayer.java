package sheenrox82.RioV.src.api.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.handler.packet.RioVPlayerPackets;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RioVPlayer implements IExtendedEntityProperties
{
	public final static String EXT_PROP_NAME = "RioVPlayer";

	private static EntityPlayer player;

	public int maxEos;

	public final int EOS_WATCHER = 20;

	public int factionID;
	public int noFactionID = 0;
	public int raetiinID;
	public int jaerinID;
	public String factionName;
	public String noFactionName = "No Faction";
	public String raetiinName;
	public String jaerinName;

	public RioVPlayer(EntityPlayer player) 
	{
		this.player = player;
		this.maxEos = 50;
		factionID = noFactionID;
		raetiinID = 1;
		jaerinID = 2;
		factionName = noFactionName;
		raetiinName = EnumChatFormatting.DARK_RED + "Raetiin";
		jaerinName = EnumChatFormatting.GREEN + "Jaerin";
		this.player.getDataWatcher().addObject(EOS_WATCHER, this.maxEos);
	}

	public static final void register(EntityPlayer player) 
	{
		player.registerExtendedProperties(RioVPlayer.EXT_PROP_NAME, new RioVPlayer(player));
	}

	public static final RioVPlayer get(EntityPlayer player) 
	{
		return (RioVPlayer) player.getExtendedProperties(EXT_PROP_NAME);
	}

	@Override
	public final void saveNBTData(NBTTagCompound compound) 
	{
		NBTTagCompound properties = new NBTTagCompound();
		
		properties.setInteger("CurrentEos", player.getDataWatcher().getWatchableObjectInt(EOS_WATCHER));
		properties.setInteger("MaxEos", maxEos);
		properties.setInteger("FactionID", factionID);
		properties.setString("FactionName", factionName);

		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public final void loadNBTData(NBTTagCompound compound) 
	{
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		
		player.getDataWatcher().updateObject(EOS_WATCHER, properties.getInteger("CurrentEos"));
		maxEos = properties.getInteger("MaxEos");
		factionID = properties.getInteger("FactionID");
		factionName = properties.getString("FactionName");
	}

	@Override
	public void init(Entity entity, World world) {}

	public final boolean consumeEos(int amount) 
	{
		boolean sufficient = amount <= getCurrentEos();
		setCurrentEos(getCurrentEos() - amount);
		return sufficient;
	}

	public final void replenishEos()
	{
		this.player.getDataWatcher().updateObject(EOS_WATCHER, this.maxEos);
	}

	public final int getCurrentEos() 
	{
		return player.getDataWatcher().getWatchableObjectInt(EOS_WATCHER);
	}

	public final void setCurrentEos(int amount)
	{
		player.getDataWatcher().updateObject(EOS_WATCHER, amount > 0 ? (amount < maxEos ? amount : maxEos) : 0);
	}

	public final int getMaxEos() 
	{
		return maxEos;
	}

	public final void upgradeEos(int amount) 
	{
		maxEos = (amount > 0 ? amount : 0);
		RioVAPI.getInstance().getPipeline().sendTo(new RioVPlayerPackets(player), (EntityPlayerMP) player);
	}
	
	public final void setFactionID(int facID)
	{
		factionID = facID;
		RioVAPI.getInstance().getPipeline().sendTo(new RioVPlayerPackets(player), (EntityPlayerMP) player);
	}
	
	@SideOnly(Side.CLIENT)
	public final void setClientFactionID(int facID)
	{
		factionID = facID;
	}
	
	public final int getFactionID()
	{
		return factionID;
	}
	
	public final void setFactionName(String facName)
	{
		factionName = facName;
		RioVAPI.getInstance().getPipeline().sendTo(new RioVPlayerPackets(player), (EntityPlayerMP) player);
	}
	
	@SideOnly(Side.CLIENT)
	public final void setClientFactionName(String facName)
	{
		factionName = facName;
	}
	
	public final String getFactionName()
	{
		return factionName;
	}

	private static final String getSaveKey(EntityPlayer player) 
	{
		return player.getCommandSenderName() + ":" + EXT_PROP_NAME;
	}

	public static final void saveProxyData(EntityPlayer player)
	{
		NBTTagCompound savedData = new NBTTagCompound();
		RioVPlayer.get(player).saveNBTData(savedData);
		PlayerStorage.storeEntityData(getSaveKey(player), savedData);
	}

	public static final void loadProxyData(EntityPlayer player) 
	{
		RioVPlayer playerData = RioVPlayer.get(player);
		NBTTagCompound savedData = PlayerStorage.getEntityData(getSaveKey(player));
		
		if (savedData != null) 
		{ 
			playerData.loadNBTData(savedData); 
		}

		RioVAPI.getInstance().getPipeline().sendTo(new RioVPlayerPackets(player), (EntityPlayerMP) player);
	}
}