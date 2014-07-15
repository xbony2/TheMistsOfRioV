package sheenrox82.RioV.src.event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import net.minecraft.client.Minecraft;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import sheenrox82.RioV.src.block.BlockRioVSapling;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.handler.UpdateHandler;
import sheenrox82.RioV.src.handler.packet.PacketHandler;
import sheenrox82.RioV.src.proxy.CommonProxy;
import sheenrox82.RioV.src.util.BloodUtil;
import sheenrox82.RioV.src.util.Color;
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
	public void clientLoggedIn(EntityJoinWorldEvent e) throws IOException, MalformedURLException 
	{			
		if (e.entity instanceof EntityPlayer) 
		{
			EntityPlayer p = (EntityPlayer) e.entity;

			if (p.worldObj.isRemote) 
			{
				if (UpdateHandler.isUpdateAvailable()) 
				{
					if(!hasSeen)
					{
						p.addChatMessage(MethodUtil.addChatMessage(EnumChatFormatting.DARK_RED, "[" + Color.WHITE + Util.MOD_NAME + Color.DARK_RED + "] Hey, " + p.getDisplayName() + "! A new version is available! Check http://tinyurl.com/riovmod. - sheenrox82"));
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
		if (!event.entity.worldObj.isRemote && (event.entity instanceof EntityPlayer || event.entity instanceof EntityPlayerMP))
		{
			NBTTagCompound playerData = new NBTTagCompound();
			if(playerData != null)
			{
				BloodUtil.setCurrentBlood(100);
			}
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
				event.entityLiving.dropItem(RioVItems.onyx, 2);
			}
			if (event.entityLiving instanceof EntityDragon) 
			{
				event.entityLiving.dropItem(RioVItems.dragonSoul, 40);
			}
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

	@SubscribeEvent
	public void playerBloodUpdate(LivingHurtEvent event)
	{
		if(event.entity instanceof EntityPlayer)
		{
			BloodUtil.consumeBlood(2);
		}
	}

	public boolean bloodBlur = false;
	public boolean bloodColor = false;

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void playerUpdateClient(LivingEvent.LivingUpdateEvent event)
	{
		Minecraft mc = Minecraft.getMinecraft();

		if(event.entity instanceof EntityPlayer)
		{
			if(!mc.thePlayer.capabilities.isCreativeMode)
			{
				if(BloodUtil.getCurrentBlood() == 100)
				{
					mc.entityRenderer.theShaderGroup = null;
					bloodBlur = false;
					bloodColor = false;
				}

				if(BloodUtil.getCurrentBlood() <= 70 && BloodUtil.getCurrentBlood() > 60)
				{
					mc.entityRenderer.theShaderGroup = null;
					bloodBlur = false;
					bloodColor = false;
				}

				if(BloodUtil.getCurrentBlood() <= 60)
				{
					if(bloodBlur == false)
					{
						try
						{
							mc.entityRenderer.theShaderGroup = new ShaderGroup(mc.getTextureManager(), mc.getResourceManager(), mc.getFramebuffer(), new ResourceLocation("shaders/post/blur.json"));
							mc.entityRenderer.theShaderGroup.createBindFramebuffers(mc.displayWidth, mc.displayHeight);
							bloodBlur = true;
						}
						catch(IOException ioexception)
						{
							ioexception.printStackTrace();
						}
					}
				}

				if(BloodUtil.getCurrentBlood() <= 50)
				{
					if(bloodColor == false)
					{
						try
						{
							mc.entityRenderer.theShaderGroup = new ShaderGroup(mc.getTextureManager(), mc.getResourceManager(), mc.getFramebuffer(), new ResourceLocation("riov", "shaders/post/desaturateBlur.json"));
							mc.entityRenderer.theShaderGroup.createBindFramebuffers(mc.displayWidth, mc.displayHeight);
							bloodColor = true;
						}
						catch(IOException ioexception)
						{
							ioexception.printStackTrace();
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void playerUpdate(LivingEvent.LivingUpdateEvent event)
	{
		if(event.entity instanceof EntityPlayer)
		{
			EntityPlayer thePlayer = (EntityPlayer)event.entityLiving;

			if(!thePlayer.capabilities.isCreativeMode)
			{
				if(BloodUtil.getCurrentBlood() <= 85)
				{
					event.entityLiving.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 100, 1));
				}

				if(BloodUtil.getCurrentBlood() <= 35)
				{
					event.entityLiving.attackEntityFrom(DamageSource.generic, Float.MAX_VALUE);
				}
			}
		}
	}
}