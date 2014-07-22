package sheenrox82.RioV.src.handler.packet;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import sheenrox82.RioV.src.api.handler.packet.AbstractPacket;
import sheenrox82.RioV.src.api.util.BloodUtil;
import sheenrox82.RioV.src.api.util.EosUtil;
import sheenrox82.RioV.src.api.util.PlayerNBT;
import sheenrox82.RioV.src.faction.FactionUtil;

public class PacketHandler extends AbstractPacket 
{
	public int eos;
	public int mEos;
	public int blood;
	public int mBlood;
	public int facID;
	public boolean seenGui;
	
	public PacketHandler() 
	{
		super();
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) 
	{
		PlayerNBT props = PlayerNBT.get((EntityPlayer)ctx);
		buffer.writeInt(EosUtil.getCurrentEos());
		buffer.writeInt(props.maxEos);

		buffer.writeInt(BloodUtil.getCurrentBlood());
		buffer.writeInt(props.maxBlood);
		buffer.writeInt(FactionUtil.factionID);
		buffer.writeBoolean(FactionUtil.hasSeenFactionGui);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) 
	{
		PlayerNBT props = PlayerNBT.get((EntityPlayer)ctx);
		eos = buffer.readInt();
		mEos = buffer.readInt();

		blood = buffer.readInt();
		mBlood = buffer.readInt();
		facID = buffer.readInt();
		seenGui = buffer.readBoolean();
	}

	@Override
	public void handleClientSide(EntityPlayer player) 
	{
		PlayerNBT props = PlayerNBT.get(player);

		eos = EosUtil.getCurrentEos();
		mEos = props.maxEos;
		blood = BloodUtil.getCurrentBlood();
		mBlood = props.maxBlood;
		facID = FactionUtil.factionID;
		seenGui = FactionUtil.hasSeenFactionGui;
	}

	@Override
	public void handleServerSide(EntityPlayer player)
	{
		facID = FactionUtil.factionID;
		seenGui = FactionUtil.hasSeenFactionGui;
	}
}