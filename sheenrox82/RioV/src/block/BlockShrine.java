package sheenrox82.RioV.src.block;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.entity.mob.passive.EntityRabbit;
import sheenrox82.RioV.src.entity.mob.passive.EntityTasaravMallor;
import sheenrox82.RioV.src.tileentity.TileEntityShrine;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockShrine extends BlockContainer
{	
	@SideOnly(Side.CLIENT)
	private IIcon field_94461_a;
	@SideOnly(Side.CLIENT)
	private IIcon field_94460_b;
	@SideOnly(Side.CLIENT)
	private IIcon blockIcon;
	
	public BlockShrine()
	{
		super(Material.rock);
		this.setCreativeTab(TheMistsOfRioV.getInstance().tab);
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		TileEntityShrine shrine = new TileEntityShrine();
		EntityTasaravMallor tasarav = new EntityTasaravMallor(par1World);
		Random random = new Random();
		int rand = random.nextInt(1000);
		int itemRand = random.nextInt(10);
		int weaponRand = random.nextInt(20);

		if(par1World.provider.dimensionId == 0)
		{
			if(!par5EntityPlayer.isSneaking() && par1World.isDaytime())
			{
				if(rand > 0 && rand < 70)
				{
					if(!shrine.isTasaravSpawned && !shrine.isTasaravDead && !tasarav.isTasaravAlive)
					{
						if (!par1World.isRemote)
						{
							tasarav.setPosition(par2, par3 + 1, par4);
							par1World.spawnEntityInWorld(tasarav);
							par1World.setBlockToAir(par2, par3, par4);
							tasarav.isTasaravAlive = true;
							shrine.isTasaravSpawned = true;

							Minecraft.getMinecraft().thePlayer.sendChatMessage("Ti'Tun: Have a companion! His name is Tasarav Mallor.");
							Minecraft.getMinecraft().thePlayer.sendChatMessage("Ti'Tun: Give Tasarav some Vaizi so he'll protect you!");
						}
					}
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand == 71)
				{
					if(shrine.isTasaravDead && !shrine.isTasaravSpawned && !tasarav.isTasaravAlive)
					{
						if(!par1World.isRemote)
						{
							Minecraft.getMinecraft().thePlayer.sendChatMessage("Ti'Tun: I'm sorry youngling, but Tasarav Mallor is no more...");
						}
					}
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand == 72)
				{
					if(!par1World.isRemote)
					{
						par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.vaiziCurrency, random.nextInt(10)));
					}
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand > 74 && rand < 120)
				{
					if(!par1World.isRemote)
					{
						if(weaponRand == 0)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.infusedOnyxSword, 1));
						}

						if(weaponRand == 1)
						{
						}

						if(weaponRand == 2)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.infusedAmethystSword, 1));
						}

						if(weaponRand == 3)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.amethystSword, 1));
						}

						if(weaponRand == 4)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.onyxSword, 1));
						}

						if(weaponRand == 5)
						{
							if(TheMistsOfRioV.getInstance().aether)
							{
								par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.infusedZaniteSword, 1));
							}
							else
							{
								par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.skywoodSword, 1));
							}
						}

						if(weaponRand == 6)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.infusedOnyxHelmet, 1));
						}

						if(weaponRand == 7)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.amethystHelmet, 1));
						}

						if(weaponRand == 8)
						{
						}

						if(weaponRand == 9)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.infusedOnyxSword, 1));
						}
					}
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand == 121)
				{
					if(!par1World.isRemote)
					{
						EntityRabbit rabbit = new EntityRabbit(par1World);
						rabbit.setPosition(par2, par3 + 1, par4);
						par1World.spawnEntityInWorld(rabbit);
						par1World.setBlockToAir(par2, par3, par4);

						Minecraft.getMinecraft().thePlayer.sendChatMessage("Ti'Tun: Have a companion! It is a bunny! Tame it with Sanctuatite Potions!");
					}
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand > 123 && rand < 200)
				{
					if(!par1World.isRemote)
					{
						par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.vaiziCurrency, random.nextInt(10)));
					}	
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand > 201 && rand < 290)
				{
					if(!par1World.isRemote)
					{
						if(itemRand > 0 && itemRand < 5)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.onyx, random.nextInt(10)));
						}

						if(itemRand > 6 && itemRand < 7)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.vravinite, random.nextInt(7)));
						}
					}	
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand > 291)
				{
					if(!par1World.isRemote)
					{
						Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A7oTi'Tun doesn't respond to your prayer...");
					}
				}
			}

			if(!par5EntityPlayer.isSneaking() && !par1World.isDaytime())
			{
				if(rand > 0 && rand < 110)
				{
					if(!shrine.isTasaravSpawned && !shrine.isTasaravDead && !tasarav.isTasaravAlive)
					{
						if (!par1World.isRemote)
						{
							tasarav.setPosition(par2, par3 + 1, par4);
							par1World.spawnEntityInWorld(tasarav);
							par1World.setBlockToAir(par2, par3, par4);
							tasarav.isTasaravAlive = true;
							shrine.isTasaravSpawned = true;

							Minecraft.getMinecraft().thePlayer.sendChatMessage("Ti'Tun: Have a companion! His name is Tasarav Mallor.");
							Minecraft.getMinecraft().thePlayer.sendChatMessage("Ti'Tun: Give Tasarav some Vaizi so he'll protect you!");
						}
					}
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand == 111)
				{
					if(shrine.isTasaravDead && !shrine.isTasaravSpawned && !tasarav.isTasaravAlive)
					{
						if(!par1World.isRemote)
						{
							Minecraft.getMinecraft().thePlayer.sendChatMessage("Ti'Tun: I'm sorry youngling, but Tasarav Mallor is no more...");
						}
					}
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand == 112)
				{
					if(!par1World.isRemote)
					{
						par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.vaiziCurrency, 3));
					}
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand == 113)
				{
					if(!par1World.isRemote)
					{
						par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.vaiziCurrency, 10));
					}
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand > 114 && rand < 220)
				{
					if(!par1World.isRemote)
					{
						if(weaponRand == 0)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.infusedOnyxSword, 1));
						}

						if(weaponRand == 1)
						{
						}

						if(weaponRand == 2)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.infusedAmethystSword, 1));
						}

						if(weaponRand == 3)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.amethystSword, 1));
						}

						if(weaponRand == 4)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.onyxSword, 1));
						}

						if(weaponRand == 5)
						{
							if(TheMistsOfRioV.getInstance().aether)
							{
								par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.infusedZaniteSword, 1));
							}
							else
							{
								par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.skywoodSword, 1));
							}
						}

						if(weaponRand == 6)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.infusedOnyxHelmet, 1));
						}

						if(weaponRand == 7)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.amethystHelmet, 1));
						}

						if(weaponRand == 8)
						{
						}

						if(weaponRand == 9)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.infusedOnyxSword, 1));
						}
					}
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand == 221)
				{
					if(!par1World.isRemote)
					{
						EntityRabbit rabbit = new EntityRabbit(par1World);
						rabbit.setLocationAndAngles((double)par2 + 2D, (double)par3, (double)par4, 0.0F, 0.0F);
						par1World.spawnEntityInWorld(rabbit);
						par1World.setBlockToAir(par2, par3, par4);

						Minecraft.getMinecraft().thePlayer.sendChatMessage("Ti'Tun: Have a companion! It is a bunny! Tame it with Sanctuatite Potions!");
					}
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand == 222)
				{
					if(!par1World.isRemote)
					{
						par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.vravinite, random.nextInt(5)));
					}
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand > 223 && rand < 330)
				{
					if(!par1World.isRemote)
					{
						par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.vaiziCurrency, random.nextInt(10)));
					}	
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand > 330 && rand < 390)
				{
					if(!par1World.isRemote)
					{
						if(itemRand > 0 && itemRand < 5)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.onyx, random.nextInt(10)));
						}

						if(itemRand > 6 && itemRand < 7)
						{
							par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RioVItems.vravinite, random.nextInt(7)));
						}
					}	
					par1World.setBlockToAir(par2, par3, par4);
				}

				if(rand > 391)
				{
					if(!par1World.isRemote)
					{
						Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A7oTi'Tun doesn't respond to your prayer...");
					}
				}
			}

			if(par5EntityPlayer.isSneaking() && par1World.isDaytime())
			{
				if(!par1World.isRemote)
				{
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A76Current Possibilities");
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A74Tasarav Mallor: < 12%");
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A73Weapons/Armor: > 33%");
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A7bVravinite: > 19%");
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A72Vaizi: < 42%");
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A78Onyx: < 31%");
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A79Nothing: > 76%");
				}
			}

			if(par5EntityPlayer.isSneaking() && !par1World.isDaytime())
			{
				if(!par1World.isRemote)
				{
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A76Current Possibilities");
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A74Tasarav Mallor: < 25%");
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A73Weapons/Armor: > 42%");
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A7bVravinite: > 26%");
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A72Vaizi: < 47%");
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A78Onyx: < 43%");
					Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A79Nothing: > 83%");
				}
			}
		}
		
		if(par1World.provider.dimensionId == -1)
		{
			if(!par1World.isRemote)
			{
				Minecraft.getMinecraft().thePlayer.sendChatMessage("\u00A7oAun'Tun seems to be ignoring you...");
			}
		}
		return true;
	}

	public TileEntity createNewTileEntity(World par1World)
	{
		return new TileEntityShrine();
	}

	@Override
	public IIcon getIcon(int par1, int par2)
	{
		return par1 == 0 ? this.field_94460_b : (par1 == 1 ? this.field_94461_a : this.blockIcon);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "slateBricks");
		this.field_94461_a = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "shrine_top");
		this.field_94460_b = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "slateBricks");
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		// TODO Auto-generated method stub
		return new TileEntityShrine();
	}
}
