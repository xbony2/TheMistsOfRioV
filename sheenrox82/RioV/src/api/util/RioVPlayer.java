package sheenrox82.RioV.src.api.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.handler.packet.RioVPlayerPackets;

public class RioVPlayer implements IExtendedEntityProperties
{
	public final static String EXT_PROP_NAME = "RioVPlayer";

	private final EntityPlayer player;

	public int maxEos;
	public static final int EOS_WATCHER = 20;

	public int factionID;
	public int noFactionID = 0;
	public int raetiinID;
	public int jaerinID;
	public String noFactionName;
	public String raetiinName;
	public String jaerinName;

	//NEW FACTION SYSTEM FIELDS
	public int defaultRep;
	public int maxRep;
	public int minRep;
	public static final int REP_WATCHER = 21;

	public RioVPlayer(EntityPlayer player) 
	{
		this.player = player;
		this.maxEos = 50;
		this.defaultRep = 0;
		this.maxRep = 100;
		this.minRep = -100;
		this.factionID = noFactionID;
		this.raetiinID = 1;
		this.jaerinID = 2;
		this.noFactionName = "No Faction";
		this.raetiinName = Color.DARK_RED + "Raetiin";
		this.jaerinName = Color.GREEN + "Jaerin";
		this.player.getDataWatcher().addObject(EOS_WATCHER, this.maxEos);
		this.player.getDataWatcher().addObject(REP_WATCHER, this.defaultRep);
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
		properties.setInteger("CurrentRep", player.getDataWatcher().getWatchableObjectInt(REP_WATCHER));
		properties.setInteger("MinRep", minRep);
		properties.setInteger("MaxRep", maxRep);
		properties.setInteger("FactionID", factionID);

		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public final void loadNBTData(NBTTagCompound compound) 
	{
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);

		player.getDataWatcher().updateObject(EOS_WATCHER, properties.getInteger("CurrentEos"));
		maxEos = properties.getInteger("MaxEos");
		player.getDataWatcher().updateObject(REP_WATCHER, properties.getInteger("CurrentRep"));
		minRep = properties.getInteger("MinRep");
		maxRep = properties.getInteger("MaxRep");
		factionID = properties.getInteger("FactionID");
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
		RioVAPI.getInstance().getNetworkHandler().sendTo(new RioVPlayerPackets(player), (EntityPlayerMP) player);
	}

	public final boolean consumeRep(int amount) 
	{
		boolean sufficient = true;
		setCurrentRep(getCurrentRep() - amount);
		return sufficient;
	}

	public final void resetRep()
	{
		this.player.getDataWatcher().updateObject(REP_WATCHER, this.defaultRep);
	}

	public final int getCurrentRep() 
	{
		return player.getDataWatcher().getWatchableObjectInt(REP_WATCHER);
	}

	public final void setCurrentRep(int amount)
	{
		if(amount > maxRep)
		{
			player.getDataWatcher().updateObject(REP_WATCHER, maxRep);
		}
		else if(amount < minRep)
		{
			player.getDataWatcher().updateObject(REP_WATCHER, minRep);
		}
		else
		{
			player.getDataWatcher().updateObject(REP_WATCHER, amount);
		}
	}

	public final int getDefaultRep() 
	{
		return defaultRep;
	}

	public final void setFactionID(int facID)
	{
		factionID = facID;
		RioVAPI.getInstance().getNetworkHandler().sendTo(new RioVPlayerPackets(player), (EntityPlayerMP) player);
	}

	public final int getFactionID()
	{
		return factionID;
	}

	private static final String getSaveKey(EntityPlayer player) 
	{
		return RioVAPI.getInstance().getUtil().getPlayerUUID(player) + ":" + EXT_PROP_NAME;
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

		RioVAPI.getInstance().getNetworkHandler().sendTo(new RioVPlayerPackets(player), (EntityPlayerMP) player);
	}
}