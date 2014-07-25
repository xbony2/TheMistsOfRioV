package sheenrox82.RioV.src.event;

import java.util.List;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import sheenrox82.Core.src.base.ModUpdateChecker;
import sheenrox82.RioV.src.api.util.Color;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
import sheenrox82.RioV.src.api.util.RioVPlayer;
import sheenrox82.RioV.src.block.BlockRioVSapling;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityAdv;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityAltruEssence;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityAngel;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityGalokin;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityOrc;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityWoodElf;
import sheenrox82.RioV.src.entity.mob.jaerin.boss.EntityAltru;
import sheenrox82.RioV.src.entity.mob.jaerin.boss.EntityTiTun;
import sheenrox82.RioV.src.entity.mob.jaerin.boss.EntityWoodElfKing;
import sheenrox82.RioV.src.entity.mob.raetiin.EntityAunTunBodyguard;
import sheenrox82.RioV.src.entity.mob.raetiin.EntityAunTunMinion;
import sheenrox82.RioV.src.entity.mob.raetiin.EntityBloodGhoul;
import sheenrox82.RioV.src.entity.mob.raetiin.EntityDarkElf;
import sheenrox82.RioV.src.entity.mob.raetiin.EntityHellhound;
import sheenrox82.RioV.src.entity.mob.raetiin.EntityShadow;
import sheenrox82.RioV.src.entity.mob.raetiin.EntitySkeletalHorse;
import sheenrox82.RioV.src.entity.mob.raetiin.EntitySoverianOfficer;
import sheenrox82.RioV.src.entity.mob.raetiin.EntityTefGuard;
import sheenrox82.RioV.src.entity.mob.raetiin.boss.EntityAunTun;
import sheenrox82.RioV.src.entity.mob.raetiin.boss.EntityDarkEssence;
import sheenrox82.RioV.src.entity.mob.raetiin.boss.EntityDemonAngel;
import sheenrox82.RioV.src.entity.mob.raetiin.boss.EntityTef;
import sheenrox82.RioV.src.entity.mob.raetiin.boss.EntityTerron;
import sheenrox82.RioV.src.util.Registry;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Events
{
	public boolean hasSeen;

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void clientLoggedIn(EntityJoinWorldEvent event)
	{			
		if (event.entity instanceof EntityPlayer) 
		{
			EntityPlayer p = (EntityPlayer) event.entity;

			if (!p.worldObj.isRemote) 
			{
				if (ModUpdateChecker.isUpdateAvailable()) 
				{
					if(!hasSeen)
					{
						p.addChatMessage(RioVAPIUtil.addChatMessage(Color.DARK_RED, "[" + Color.WHITE + Util.MOD_NAME + Color.DARK_RED + "] Hey, " + p.getDisplayName() + "! " + Color.GOLD + "Version " + ModUpdateChecker.newVersionStr + " is available!" + Color.DARK_RED + " Check http://tinyurl.com/riovmod. - sheenrox82"));
						hasSeen = true;
					}
				}

				if (!ModUpdateChecker.isUpdateAvailable()) 
				{
					if(!hasSeen)
					{
						p.addChatMessage(RioVAPIUtil.addChatMessage(Color.GREEN, "[" + Color.WHITE + Util.MOD_NAME + Color.GREEN + "] Hey, " + p.getDisplayName() + "! Thank you for downloading " + Util.MOD_NAME + "! You are up-to-date! - sheenrox82"));
						hasSeen = true;
					}	
				}
			}
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
	public void onEntityConstructing(EntityConstructing event) 
	{
		if (event.entity instanceof EntityPlayer) 
		{
			if (RioVPlayer.get((EntityPlayer) event.entity) == null)
			{
				RioVPlayer.register((EntityPlayer) event.entity);
			}
		}
	}

	@SubscribeEvent
	public void onEntityJoinWorld(EntityJoinWorldEvent event) 
	{
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer) 
		{
			if (RioVPlayer.get((EntityPlayer) event.entity) != null)
			{
				RioVPlayer.loadProxyData((EntityPlayer) event.entity);
			}
		}
	}

	@SubscribeEvent
	public void onLivingDeathEvent(LivingDeathEvent event) 
	{
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer)
		{
			if (RioVPlayer.get((EntityPlayer) event.entity) != null)
			{
				RioVPlayer.saveProxyData((EntityPlayer) event.entity);
			}
		}
	}

	@SubscribeEvent
	public void playerUpdate(LivingEvent.LivingUpdateEvent event)
	{
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer) 
		{
			if (RioVPlayer.get((EntityPlayer) event.entity) != null)
			{
				RioVPlayer.saveProxyData((EntityPlayer) event.entity);
			}
		}
	}

	@SubscribeEvent
	public void onBurnDamage(LivingAttackEvent event)
	{
		if (event.entity instanceof EntityPlayer) 
		{
			EntityPlayer player = (EntityPlayer)event.entity;
			RioVPlayer riovPlayer = RioVPlayer.get(player);

			if(event.source.getDamageType().equals("onFire") || event.source.getDamageType().equals("inFire") || event.source.getDamageType().equals("lava"))
			{
				if(riovPlayer.getFactionID() == riovPlayer.raetiinID)
				{
					event.setCanceled(true);
				}
			}

			if(event.source.getDamageType().equals("fall") || event.source.getDamageType().equals("cactus"))
			{
				if(riovPlayer.getFactionID() == riovPlayer.jaerinID)
				{
					event.setCanceled(true);
				}
			}
		}
	}

	@SubscribeEvent
	public void entityTarget(LivingSetAttackTargetEvent event)
	{
		if (event.target instanceof EntityPlayer) 
		{
			EntityPlayer player = (EntityPlayer)event.target;
			RioVPlayer riov = RioVPlayer.get(player);
			EntityLiving attacker = (EntityLiving)event.entityLiving;

			//RAETIIN
			if(attacker instanceof EntityAunTunMinion || attacker instanceof EntityAunTunBodyguard || attacker instanceof EntityBloodGhoul || 
					attacker instanceof EntityDarkElf || attacker instanceof EntityHellhound || attacker instanceof EntityShadow || 
					attacker instanceof EntitySkeletalHorse || attacker instanceof EntitySoverianOfficer || attacker instanceof EntityTefGuard || 
					attacker instanceof EntityAunTun || attacker instanceof EntityDarkEssence || attacker instanceof EntityDemonAngel || 
					attacker instanceof EntityTef || attacker instanceof EntityTerron)
			{
				if(riov.getFactionID() == riov.raetiinID)
				{
					attacker.setAttackTarget(null);
				}
			}

			//JAERIN
			if(attacker instanceof EntityAdv || attacker instanceof EntityAltruEssence || attacker instanceof EntityAngel || 
					attacker instanceof EntityGalokin || attacker instanceof EntityOrc || attacker instanceof EntityWoodElf || 
					attacker instanceof EntityAltru || attacker instanceof EntityTiTun || attacker instanceof EntityWoodElfKing)
			{
				if(riov.getFactionID() == riov.jaerinID)
				{
					attacker.setAttackTarget(null);
				}
			}
		}
	}

	@SubscribeEvent
	public void onServerChatReceivedEvent(ServerChatEvent event)
	{
		if (event.player != null) 
		{
			EntityPlayer player = (EntityPlayer) event.player;
			RioVPlayer riovPlayer = RioVPlayer.get(player);

			if (player != null)
			{
				event.setCanceled(true);

				List players = MinecraftServer.getServer().getConfigurationManager().playerEntityList;

				for (int i = 0; i < + players.size(); i++) 
				{
					EntityPlayer target = (EntityPlayer) players.get(i);

					String playerMsg = "[" + riovPlayer.getFactionName() + EnumChatFormatting.WHITE + "] <" + player.getDisplayName() + "> " + event.message;
					String devMsg = Color.DARK_AQUA + "[" + Color.DARK_GRAY + "RioV" + Color.DARK_AQUA + "]" + Color.white + " [" + riovPlayer.getFactionName() + EnumChatFormatting.WHITE + "] <" + player.getDisplayName() + "> " + event.message;

					if(player.getDisplayName().equals(Registry.developer))
					{
						target.addChatMessage(new ChatComponentTranslation(devMsg));
					}
					else
					{
						target.addChatMessage(new ChatComponentTranslation(playerMsg));
					}
				}
			}
		}
	}
}