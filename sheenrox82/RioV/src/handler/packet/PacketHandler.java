package sheenrox82.RioV.src.handler.packet;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import sheenrox82.RioV.src.util.PlayerNBT;

public class PacketHandler extends AbstractPacket 
{
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
		int currentEos = props.getCurrentEos();
		currentEos = buffer.readInt();
		props.maxEos = buffer.readInt();
	}

	@Override
	public void handleClientSide(EntityPlayer player) 
	{
		
	}

	@Override
	public void handleServerSide(EntityPlayer player)
	{
		
	}
}