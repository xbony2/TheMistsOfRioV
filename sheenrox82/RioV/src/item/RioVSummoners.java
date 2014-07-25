package sheenrox82.RioV.src.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.util.Color;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
import sheenrox82.RioV.src.api.util.RioVPlayer;
import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.entity.mob.jaerin.boss.EntityAltru;
import sheenrox82.RioV.src.entity.mob.jaerin.boss.EntityTiTun;
import sheenrox82.RioV.src.entity.mob.jaerin.boss.EntityWoodElfKing;
import sheenrox82.RioV.src.entity.mob.raetiin.boss.EntityAunTun;
import sheenrox82.RioV.src.entity.mob.raetiin.boss.EntityDarkEssence;
import sheenrox82.RioV.src.entity.mob.raetiin.boss.EntityDemonAngel;
import sheenrox82.RioV.src.entity.mob.raetiin.boss.EntityTef;
import sheenrox82.RioV.src.entity.mob.raetiin.boss.EntityTerron;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RioVSummoners extends Item
{

	public RioVSummoners()
	{
		super();
		this.maxStackSize = 1;
		this.setMaxDamage(1);
		this.setCreativeTab(RioVAPI.getInstance().tab);
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer entityplayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
		RioVPlayer player = RioVPlayer.get(entityplayer);

		if(player.getFactionID() != player.raetiinID)
		{
			if(world.provider.dimensionId == Config.blindOasisID)
			{
				if (par1ItemStack.getItem().equals(RioVItems.terronCrystal))
				{
					int var4 = 0;
					if (!world.isRemote)
					{
						if(player.getCurrentEos() > 3)
						{
							while (var4 < 1)
							{
								EntityTerron var5 = new EntityTerron(world);
								var5.setPosition(par4, par5+1, par6);
								world.spawnEntityInWorld(var5);
								player.consumeEos(3);
								++var4;
								RioVAPI.getInstance().getUtil().sendMessageToAll("Terron has been summoned!");
								par1ItemStack.damageItem(2, entityplayer);
							}
						}
						else
						{
							if(player.getCurrentEos() < 3)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough Eos!"));
							}

							if(player.getCurrentEos() < 0)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough- ... wait, how is it below 0?"));
							}
						}
					}

				}

				if (par1ItemStack.getItem().equals(RioVItems.tefCrystal))
				{
					int var4 = 0;
					if (!world.isRemote)
					{
						if(player.getCurrentEos() > 4)
						{
							while (var4 < 1)
							{
								EntityTef var5 = new EntityTef(world);
								var5.setPosition(par4, par5+1, par6);
								world.spawnEntityInWorld(var5);
								player.consumeEos(4);
								++var4;
								RioVAPI.getInstance().getUtil().sendMessageToAll("Tef has been summoned!");
								par1ItemStack.damageItem(2, entityplayer);
							}
						}
						else
						{
							if(player.getCurrentEos() < 4)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough Eos!"));
							}

							if(player.getCurrentEos() < 0)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough- ... wait, how is it below 0?"));
							}
						}
					}
				}

				if (par1ItemStack.getItem().equals(RioVItems.theDarknessCrystal))
				{
					int var4 = 0;
					if (!world.isRemote)
					{
						if(player.getCurrentEos() > 18)
						{
							while (var4 < 1)
							{
								EntityDarkEssence var5 = new EntityDarkEssence(world);
								var5.setPosition(par4, par5+1, par6);
								world.spawnEntityInWorld(var5);
								player.consumeEos(18);
								++var4;
								RioVAPI.getInstance().getUtil().sendMessageToAll("The Darkness has arrived!");
								par1ItemStack.damageItem(2, entityplayer);
							}
						}
						else
						{
							if(player.getCurrentEos() < 18)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough Eos!"));
							}

							if(player.getCurrentEos() < 0)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough- ... wait, how is it below 0?"));
							}
						}
					}
				}
			}

			if(world.provider.dimensionId == Config.flamonorID)
			{
				if (par1ItemStack.getItem().equals(RioVItems.demonAngelCrystal))
				{
					int var4 = 0;
					if (!world.isRemote)
					{
						if(player.getCurrentEos() > 12)
						{
							while (var4 < 1)
							{
								EntityDemonAngel var5 = new EntityDemonAngel(world);
								var5.setPosition(par4, par5+1, par6);
								world.spawnEntityInWorld(var5);
								player.consumeEos(12);
								++var4;
								RioVAPI.getInstance().getUtil().sendMessageToAll("Demon Angel has been summoned!");
								par1ItemStack.damageItem(2, entityplayer);
							}
						}
						else
						{
							if(player.getCurrentEos() < 12)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough Eos!"));
							}

							if(player.getCurrentEos() < 0)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough- ... wait, how is it below 0?"));
							}
						}
					}
				}

				if (par1ItemStack.getItem().equals(RioVItems.auntunSummoner))
				{
					int var4 = 0;

					if (!world.isRemote)
					{
						if(player.getCurrentEos() > 34)
						{
							while (var4 < 1)
							{
								EntityAunTun var5 = new EntityAunTun(world);
								var5.setPosition(par4, par5+1, par6);
								world.spawnEntityInWorld(var5);
								player.consumeEos(34);
								++var4;
								RioVAPI.getInstance().getUtil().sendMessageToAll("Aun'Tun has been summoned! Good luck, this'll be a LONG fight.");
								par1ItemStack.damageItem(2, entityplayer);
							}
						}
						else
						{
							if(player.getCurrentEos() < 34)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough Eos!"));
							}

							if(player.getCurrentEos() < 0)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough- ... wait, how is it below 0?"));
							}
						}
					}
				}
			}
		}

		if(player.getFactionID() != player.jaerinID)
		{
			if(world.provider.dimensionId == 0)
			{
				if (par1ItemStack.getItem().equals(RioVItems.woodElfKingCrystal))
				{
					int var4 = 0;
					if (!world.isRemote)
					{
						if(player.getCurrentEos() > 3)
						{
							while (var4 < 1)
							{
								EntityWoodElfKing var5 = new EntityWoodElfKing(world);
								var5.setPosition(par4, par5+1, par6);
								world.spawnEntityInWorld(var5);
								player.consumeEos(3);
								++var4;
								RioVAPI.getInstance().getUtil().sendMessageToAll("Wood Elf King has been summoned!");
								par1ItemStack.damageItem(2, entityplayer);
							}
						}
						else
						{
							if(player.getCurrentEos() < 3)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough Eos!"));
							}

							if(player.getCurrentEos() < 0)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough- ... wait, how is it below 0?"));
							}
						}
					}
				}

				if (par1ItemStack.getItem().equals(RioVItems.altruCrystal))
				{
					int var4 = 0;

					if (!world.isRemote)
					{
						if(player.getCurrentEos() > 10)
						{
							while (var4 < 1)
							{
								EntityAltru var5 = new EntityAltru(world);
								var5.setPosition(par4, par5+1, par6);
								world.spawnEntityInWorld(var5);
								player.consumeEos(10);
								++var4;
								RioVAPI.getInstance().getUtil().sendMessageToAll("Altru has been summoned!");
								par1ItemStack.damageItem(2, entityplayer);
							}
						}
						else
						{
							if(player.getCurrentEos() < 10)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough Eos!"));
							}

							if(player.getCurrentEos() < 0)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough- ... wait, how is it below 0?"));
							}
						}
					}
				}

				if (par1ItemStack.getItem().equals(RioVItems.tiTunSummoner))
				{
					int var4 = 0;

					if (!world.isRemote)
					{
						if(player.getCurrentEos() > 17)
						{
							while (var4 < 1)
							{
								EntityTiTun var5 = new EntityTiTun(world);
								var5.setPosition(par4, par5+1, par6);
								world.spawnEntityInWorld(var5);
								player.consumeEos(17);
								++var4;
								RioVAPI.getInstance().getUtil().sendMessageToAll("Ti'Tun has been summoned!");
								par1ItemStack.damageItem(2, entityplayer);
							}
						}
						else
						{
							if(player.getCurrentEos() < 17)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough Eos!"));
							}

							if(player.getCurrentEos() < 0)
							{
								if(!world.isRemote)
									entityplayer.addChatMessage(RioVAPI.getInstance().getUtil().addChatMessage(EnumChatFormatting.WHITE, "You do not have enough- ... wait, how is it below 0?"));
							}
						}
					}
				}
			}
		}

		return false;
	}

	@Override
	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		if (var1.getItem().equals(RioVItems.tefCrystal))
		{
			var3.add(StatCollector.translateToLocal("A side challenge, given by The Darkness."));
			var3.add(StatCollector.translateToLocal("Spawned in: Blind Oasis Dimension"));
		}

		if (var1.getItem().equals(RioVItems.terronCrystal) || var1.getItem().equals(RioVItems.theDarknessCrystal))
		{
			var3.add(StatCollector.translateToLocal("Spawned in: Blind Oasis Dimension"));
		}

		if (var1.getItem().equals(RioVItems.demonAngelCrystal) || var1.getItem().equals(RioVItems.auntunSummoner))
		{
			var3.add(StatCollector.translateToLocal("Spawned in: Flamonor Dimension"));
		}

		if (var1.getItem().equals(RioVItems.woodElfKingCrystal) || var1.getItem().equals(RioVItems.altruCrystal) || var1.getItem().equals(RioVItems.tiTunSummoner))
		{
			var3.add(StatCollector.translateToLocal("Spawned in: Overworld Dimension"));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + RioVAPIUtil.getName(this.getUnlocalizedName()));
	}

}
