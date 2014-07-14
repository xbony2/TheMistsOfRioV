package sheenrox82.RioV.src.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.PlayerNBT;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RioVActivators extends Item
{
	public RioVActivators()
	{
		super();
		this.maxStackSize = 1;
		this.setMaxDamage(50);
		this.setCreativeTab(TheMistsOfRioV.getInstance().tab);
	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
		PlayerNBT player = PlayerNBT.get(entityplayer);

		if(this ==  RioVItems.blindOasisActivator)
		{
			if (par7 == 0)
			{
				--par5;
			}

			if (par7 == 1)
			{
				++par5;
			}

			if (par7 == 2)
			{
				--par6;
			}

			if (par7 == 3)
			{
				++par6;
			}

			if (par7 == 4)
			{
				--par4;
			}

			if (par7 == 5)
			{
				++par4;
			}

			if (!entityplayer.canPlayerEdit(par4, par5, par6, par7, itemstack))
			{
				return false;
			}
			else
			{
				if(player.getCurrentEos() > 10)
				{
					if(player.consumeEos(10))
					{
						if (world.isAirBlock(par4, par5, par6))
						{
							world.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
							world.setBlock(par4, par5, par6, RioVBlocks.blackFire);
						}

						if(!world.isRemote)
						{
							MethodUtil.sendMessageToAll("A Blind Oasis portal has opened!");	
						}

						itemstack.damageItem(1, entityplayer);
						return true;
					}
				}
				else
				{
					if(player.getCurrentEos() < 10)
					{
						if(!world.isRemote)
						{
							entityplayer.addChatMessage(MethodUtil.addChatMessage(EnumChatFormatting.WHITE, "You do not have enough Eos!"));	
						}	
					}
				}
			}
		}

		if(this == RioVItems.vaerynActivator)
		{
			if (par7 == 0)
			{
				--par5;
			}

			if (par7 == 1)
			{
				++par5;
			}

			if (par7 == 2)
			{
				--par6;
			}

			if (par7 == 3)
			{
				++par6;
			}

			if (par7 == 4)
			{
				--par4;
			}

			if (par7 == 5)
			{
				++par4;
			}

			if (!entityplayer.canPlayerEdit(par4, par5, par6, par7, itemstack))
			{
				return false;
			}
			else
			{
				if(player.getCurrentEos() > 15)
				{
					if(player.consumeEos(15))
					{
						if (world.isAirBlock(par4, par5, par6))
						{
							world.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
							world.setBlock(par4, par5, par6, RioVBlocks.whiteFire);
						}

						if(!world.isRemote)
						{
							MethodUtil.sendMessageToAll("A Vaeryn portal has opened!");	
						}

						itemstack.damageItem(1, entityplayer);
						return true;
					}
				}
				else
				{
					if(player.getCurrentEos() < 15)
					{
						if(!world.isRemote)
						{
							entityplayer.addChatMessage(MethodUtil.addChatMessage(EnumChatFormatting.WHITE, "You do not have enough Eos!"));	
						}	
					}
				}
			}
		}

		if(this == RioVItems.flamonorActivator)
		{
			if (par7 == 0)
			{
				--par5;
			}

			if (par7 == 1)
			{
				++par5;
			}

			if (par7 == 2)
			{
				--par6;
			}

			if (par7 == 3)
			{
				++par6;
			}

			if (par7 == 4)
			{
				--par4;
			}

			if (par7 == 5)
			{
				++par4;
			}

			if (!entityplayer.canPlayerEdit(par4, par5, par6, par7, itemstack))
			{
				return false;
			}
			else
			{
				if(player.getCurrentEos() > 20)
				{
					if(player.consumeEos(20))
					{
						if (world.isAirBlock(par4, par5, par6))
						{
							world.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
							world.setBlock(par4, par5, par6, RioVBlocks.redFire);
						}

						if(!world.isRemote)
						{
							MethodUtil.sendMessageToAll("A Flamonor portal has opened!");	
						}

						itemstack.damageItem(1, entityplayer);
						return true;
					}
				}
				else
				{
					if(player.getCurrentEos() < 20)
					{
						if(!world.isRemote)
						{
							entityplayer.addChatMessage(MethodUtil.addChatMessage(EnumChatFormatting.WHITE, "You do not have enough Eos!"));	
						}	
					}
				}
			}
		}

		if(this == RioVItems.sanctuatiteActivator)
		{
			if (par7 == 0)
			{
				--par5;
			}

			if (par7 == 1)
			{
				++par5;
			}

			if (par7 == 2)
			{
				--par6;
			}

			if (par7 == 3)
			{
				++par6;
			}

			if (par7 == 4)
			{
				--par4;
			}

			if (par7 == 5)
			{
				++par4;
			}

			if (!entityplayer.canPlayerEdit(par4, par5, par6, par7, itemstack))
			{
				return false;
			}
			else
			{
				if(player.getCurrentEos() > 35)
				{
					if(player.consumeEos(35))
					{
						if (world.isAirBlock(par4, par5, par6))
						{
							world.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
							world.setBlock(par4, par5, par6, RioVBlocks.sanctuatiteFire);
						}
						
						itemstack.damageItem(1, entityplayer);
						return true;
					}
				}
				else
				{
					if(player.getCurrentEos() < 35)
					{
						if(!world.isRemote)
						{
							entityplayer.addChatMessage(MethodUtil.addChatMessage(EnumChatFormatting.WHITE, "You do not have enough Eos!"));	
						}	
					}
				}
			}
		}

		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.getUnlocalizedName()));
	}
}

