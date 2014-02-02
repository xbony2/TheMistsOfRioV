package sheenrox82.RioV.src.handler;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import sheenrox82.RioV.src.util.PlayerNBT;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;

@Sharable
public class EosHandler extends io.netty.channel.ChannelInboundHandlerAdapter
{
	public EosHandler() {}

	private void handleExtendedProperties(byte[] bs, EntityClientPlayerMP thePlayer)
	{
		DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(bs, bs.length, 0));
		PlayerNBT props = PlayerNBT.get((EntityPlayer) thePlayer);

		try 
		{
			props.setMaxEos(inputStream.readInt());
			props.setCurrentEos(inputStream.readInt());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			return;
		}

		System.out.println("[PACKET] Eos from packet: " + props.getCurrentEos() + "/" + props.maxEos);
	}

	public void channelRead(ChannelHandlerContext ctx, Object values) throws Exception 
	{
		if (ctx.channel().equals("riovchannel")) 
		{
			FMLProxyPacket packet = (FMLProxyPacket)values;

			handleExtendedProperties(packet.payload().array(), Minecraft.getMinecraft().thePlayer);
		}
	}
}