package sheenrox82.RioV.src.handler.packet;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import sheenrox82.RioV.src.util.PlayerNBT;

public class PacketHandler extends AbstractPacket 
{
	public int eos;
	public int mEos;
	
	public PacketHandler() 
	{
		super();
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) 
	{
		PlayerNBT props = PlayerNBT.get((EntityPlayer)ctx);
		buffer.writeInt(props.getCurrentEos());
		buffer.writeInt(props.maxEos);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) 
	{
		PlayerNBT props = PlayerNBT.get((EntityPlayer)ctx);
		eos = buffer.readInt();
		mEos = buffer.readInt();
	}

	@Override
	public void handleClientSide(EntityPlayer player) 
	{
		PlayerNBT props = PlayerNBT.get(player);
		
		eos = props.getCurrentEos();
		mEos = props.maxEos;
	}

	@Override
	public void handleServerSide(EntityPlayer player)
	{
		
	}
}