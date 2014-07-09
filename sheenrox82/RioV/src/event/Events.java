package sheenrox82.RioV.src.event;

import java.io.IOException;
import java.net.MalformedURLException;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import sheenrox82.RioV.src.block.BlockRioVSapling;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.handler.UpdateHandler;
import sheenrox82.RioV.src.handler.packet.PacketHandler;
import sheenrox82.RioV.src.proxy.CommonProxy;
import sheenrox82.RioV.src.util.Color;
import sheenrox82.RioV.src.util.LogHelper;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.PlayerNBT;
import sheenrox82.RioV.src.util.Registry;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Events
{
	public boolean hasSeen;

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void clientLoggedIn(EntityJoinWorldEvent e)
	{			
		if (e.entity instanceof EntityPlayer) 
		{
			EntityPlayer p = (EntityPlayer) e.entity;

			if (p.worldObj.isRemote) 
			{
				try
				{
					if (UpdateHandler.isUpdateAvailable()) 
					{
						if(!hasSeen)
						{
							p.addChatMessage(MethodUtil.addChatMessage(EnumChatFormatting.DARK_RED, "[" + Color.WHITE + Util.MOD_NAME + Color.DARK_RED + "] Hey, " + p.getDisplayName() + "! An update is available for " + Util.MOD_NAME + ". Check http://goo.gl/Wf3zCW for more info. - sheenrox82"));
							hasSeen = true;
						}
					}

					if (!UpdateHandler.isUpdateAvailable()) 
					{
						if(!hasSeen)
						{
							p.addChatMessage(MethodUtil.addChatMessage(EnumChatFormatting.GREEN, "[" + Color.WHITE + Util.MOD_NAME + Color.GREEN + "] Hey, " + p.getDisplayName() + "! Thank you for downloading " + Util.MOD_NAME + "! You are up-to-date! - sheenrox82"));
							hasSeen = true;
						}	
					}

					/**	URL url = new URL("https://dl.dropboxusercontent.com/u/126631367/PlayerLogins.txt");
					URLConnection connection = url.openConnection();
		            connection.setDoOutput(true);
		            OutputStream outStream = connection.getOutputStream();
		            ObjectOutputStream playerLister = new ObjectOutputStream(outStream);

					playerLister.writeObject(p.getDisplayName() + " logged in.");
					playerLister.close();**/
				} 
				catch (MalformedURLException mal) 
				{
					mal.printStackTrace();
				}
				catch (IOException io)
				{
					io.printStackTrace();
				}
			}
		} 
	}

	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
		if (event.entity instanceof EntityPlayer && PlayerNBT.get((EntityPlayer) event.entity) == null)
		{
			PlayerNBT.register((EntityPlayer) event.entity);
		}
		if (event.entity instanceof EntityPlayer && event.entity.getExtendedProperties(PlayerNBT.EXT_PROP_NAME) == null)
		{
			event.entity.registerExtendedProperties(PlayerNBT.EXT_PROP_NAME, new PlayerNBT((EntityPlayer) event.entity));
		}
	}

	@SubscribeEvent
	public void playerLoggedInEvent(PlayerLoggedInEvent event)
	{
		EntityPlayer p = event.player;
		Registry.packetPipeline.sendTo(new PacketHandler(), (EntityPlayerMP)p);
	}

	@SubscribeEvent
	public void onEntityJoinWorld(EntityJoinWorldEvent event)
	{
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer)
		{
			NBTTagCompound playerData = CommonProxy.getEntityData(((EntityPlayer) event.entity).getDisplayName() + PlayerNBT.EXT_PROP_NAME);
			if (playerData != null) 
			{
				((PlayerNBT)(event.entity.getExtendedProperties(PlayerNBT.EXT_PROP_NAME))).loadNBTData(playerData);
			}
		}
	}

	@SubscribeEvent
	public void onLivingDeathEvent(LivingDeathEvent event)
	{
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer)
		{
			NBTTagCompound playerData = new NBTTagCompound();
			((PlayerNBT)(event.entity.getExtendedProperties(PlayerNBT.EXT_PROP_NAME))).saveNBTData(playerData);
			CommonProxy.storeEntityData(((EntityPlayer) event.entity).getDisplayName() + PlayerNBT.EXT_PROP_NAME, playerData);
			PlayerNBT.saveProxyData((EntityPlayer) event.entity);
		}
	}

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) 
	{
		if (event.source.getDamageType().equals("player")) 
		{
			if (event.entityLiving instanceof EntityBlaze) 
			{
				event.entityLiving.dropItem(RioVItems.vaiziCurrency, 1);
			}
			if (event.entityLiving instanceof EntityDragon) 
			{
				event.entityLiving.dropItem(RioVItems.vaiziCurrency, 40);
			}
			if (event.entityLiving instanceof EntityEnderman) 
			{
				event.entityLiving.dropItem(RioVItems.vaiziCurrency, 1);
			}
			if (event.entityLiving instanceof EntityCreeper) 
			{
				event.entityLiving.dropItem(RioVItems.vaiziCurrency, 1);
			}
			if (event.entityLiving instanceof EntityGhast) 
			{
				event.entityLiving.dropItem(RioVItems.vaiziCurrency, 3);
			}
			if (event.entityLiving instanceof EntityPigZombie) 
			{
				event.entityLiving.dropItem(RioVItems.vaiziCurrency, 2);
			}
			if (event.entityLiving instanceof EntityWitch) 
			{
				event.entityLiving.dropItem(RioVItems.vaiziCurrency, 2);
			}
			if (event.entityLiving instanceof EntityWither) 
			{
				event.entityLiving.dropItem(RioVItems.vaiziCurrency, 5);
			}
		}

		if (event.source.getDamageType().equals("player")) 
		{
			if (event.entityLiving instanceof EntityHorse) 
			{
				event.entityLiving.dropItem(RioVItems.horseMeat, 2);
			}
		}
	}

	@SubscribeEvent
	public void bonemealUsed(BonemealEvent event)
	{
		if(event.world.getBlock(event.x, event.y, event.z) == RioVBlocks.glimmerwoodSapling)
		{
			((BlockRioVSapling)RioVBlocks.glimmerwoodSapling).func_149878_d(event.world, event.x, event.y, event.z, event.world.rand);
		}

		if(event.world.getBlock(event.x, event.y, event.z) == RioVBlocks.cherryBlossomSapling)
		{
			((BlockRioVSapling)RioVBlocks.cherryBlossomSapling).func_149878_d(event.world, event.x, event.y, event.z, event.world.rand);
		}

		if(event.world.getBlock(event.x, event.y, event.z) == RioVBlocks.bloodSapling)
		{
			((BlockRioVSapling)RioVBlocks.bloodSapling).func_149878_d(event.world, event.x, event.y, event.z, event.world.rand);
		}

		if(event.world.getBlock(event.x, event.y, event.z) == RioVBlocks.skywoodSapling)
		{
			((BlockRioVSapling)RioVBlocks.skywoodSapling).func_149878_d(event.world, event.x, event.y, event.z, event.world.rand);
		}
	}
}