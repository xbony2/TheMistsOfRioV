package sheenrox82.RioV.src.api.handler.packet;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import sheenrox82.RioV.src.api.util.RioVPlayer;
import cpw.mods.fml.common.network.ByteBufUtils;

public class RioVPlayerPackets extends AbstractPacket
{
	private NBTTagCompound data;
	public RioVPlayerPackets() {}
	public RioVPlayerPackets(EntityPlayer player) 
	{
		data = new NBTTagCompound();
		RioVPlayer.get(player).saveNBTData(data);
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) 
	{
		ByteBufUtils.writeTag(buffer, data);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) 
	{
		data = ByteBufUtils.readTag(buffer);
	}

	@Override
	public void handleClientSide(EntityPlayer player)
	{
		RioVPlayer.get(player).loadNBTData(data);
	}

	@Override
	public void handleServerSide(EntityPlayer player) 
	{
		
	}
}