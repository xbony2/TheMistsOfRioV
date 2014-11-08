package sheenrox82.RioV.src.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.container.ContainerBagLarge;
import sheenrox82.RioV.src.container.ContainerBagMedium;
import sheenrox82.RioV.src.container.ContainerBagSheen;
import sheenrox82.RioV.src.container.ContainerBagSmall;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.lib.RioVLib;
import sheenrox82.RioV.src.util.LangHelper;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RioVBag extends Item
{
	public RioVBag()
	{
		super();
		this.maxStackSize = 1;
		this.setCreativeTab(RioVAPI.getInstance().tab);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean isCurrentItem)
	{
		if (!world.isRemote && entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) entity;

			if(itemstack.getItem().equals(RioVItems.smallBag))
			{
				if(player.openContainer != null && player.openContainer instanceof ContainerBagSmall && ((ContainerBagSmall) player.openContainer).needsUpdate)
				{
					((ContainerBagSmall) player.openContainer).writeToNBT();
					((ContainerBagSmall) player.openContainer).needsUpdate = false;
				}
			}

			if(itemstack.getItem().equals(RioVItems.mediumBag))
			{
				if(player.openContainer != null && player.openContainer instanceof ContainerBagMedium && ((ContainerBagMedium) player.openContainer).needsUpdate)
				{
					((ContainerBagMedium) player.openContainer).writeToNBT();
					((ContainerBagMedium) player.openContainer).needsUpdate = false;
				}
			}

			if(itemstack.getItem().equals(RioVItems.largeBag))
			{
				if(player.openContainer != null && player.openContainer instanceof ContainerBagLarge && ((ContainerBagLarge) player.openContainer).needsUpdate)
				{
					((ContainerBagLarge) player.openContainer).writeToNBT();
					((ContainerBagLarge) player.openContainer).needsUpdate = false;
				}
			}

			if(player.getCommandSenderName().contains("sheenrox82") || player.getCommandSenderName().contains("Mr_Simba"))
			{
				if(itemstack.getItem().equals(RioVItems.sheenBag))
				{
					if(player.openContainer != null && player.openContainer instanceof ContainerBagSheen && ((ContainerBagSheen) player.openContainer).needsUpdate)
					{
						((ContainerBagSheen) player.openContainer).writeToNBT();
						((ContainerBagSheen) player.openContainer).needsUpdate = false;
					}
				}
			}
		}
	}

	@Override
	public int getMaxItemUseDuration(ItemStack itemstack)
	{
		return 1;
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	{
		if (!world.isRemote)
		{
			if(stack.getItem().equals(RioVItems.smallBag))
			{
				player.openGui(TheMistsOfRioV.INSTANCE, RioVLib.smallBagID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
			}

			if(stack.getItem().equals(RioVItems.mediumBag))
			{
				player.openGui(TheMistsOfRioV.INSTANCE, RioVLib.mediumBagID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
			}

			if(stack.getItem().equals(RioVItems.largeBag))
			{
				player.openGui(TheMistsOfRioV.INSTANCE, RioVLib.largeBagID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
			}

			if(player.getDisplayName().equals("sheenrox82"))
			{
				if(stack.getItem().equals(RioVItems.sheenBag))
				{
					player.openGui(TheMistsOfRioV.INSTANCE, RioVLib.sheensBagID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
				}
			}
		}

		return false;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		if (!world.isRemote)
		{
			if(itemstack.getItem().equals(RioVItems.smallBag))
			{
				player.openGui(TheMistsOfRioV.INSTANCE, RioVLib.smallBagID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
			}

			if(itemstack.getItem().equals(RioVItems.mediumBag))
			{
				player.openGui(TheMistsOfRioV.INSTANCE, RioVLib.mediumBagID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
			}

			if(itemstack.getItem().equals(RioVItems.largeBag))
			{
				player.openGui(TheMistsOfRioV.INSTANCE, RioVLib.largeBagID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
			}

			if(player.getDisplayName().equals("sheenrox82"))
			{
				if(itemstack.getItem().equals(RioVItems.sheenBag))
				{
					player.openGui(TheMistsOfRioV.INSTANCE, RioVLib.sheensBagID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
				}
			}
		}

		return itemstack;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if(par1ItemStack.getItem().equals(RioVItems.sheenBag))
		{
			par3List.add(LangHelper.translate("msg.riov.Idiot1"));
			par3List.add(LangHelper.translate("msg.riov.Idiot2"));
			par3List.add(LangHelper.translate("msg.riov.Idiot3"));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon(Util.MOD_ID + ":" + RioVAPI.getInstance().getUtil().getName(this.getUnlocalizedName()));
	}
}