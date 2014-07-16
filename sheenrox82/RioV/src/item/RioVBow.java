package sheenrox82.RioV.src.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
import sheenrox82.RioV.src.api.util.Util;
import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.content.Enchantments;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.content.Sounds;
import sheenrox82.RioV.src.entity.projectile.EntityAlerisArrow;
import sheenrox82.RioV.src.entity.projectile.EntityAmethystArrow;
import sheenrox82.RioV.src.entity.projectile.EntityBlindoniteArrow;
import sheenrox82.RioV.src.entity.projectile.EntityDarknessArrow;
import sheenrox82.RioV.src.entity.projectile.EntityDragonArrow;
import sheenrox82.RioV.src.entity.projectile.EntityOnyxArrow;
import sheenrox82.RioV.src.entity.projectile.EntityVraviniteArrow;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RioVBow extends ItemBow
{
	public EntityAmethystArrow amethystArrow = new EntityAmethystArrow(null);
	public static final String[] amethyst = new String[] {Util.MOD_ID + ":" + "amethyst_pull_0", Util.MOD_ID + ":" + "amethyst_pull_1", Util.MOD_ID + ":" + "amethyst_pull_2"};
	public EntityOnyxArrow onyxArrow = new EntityOnyxArrow(null);
	public static final String[] onyx = new String[] {Util.MOD_ID + ":" + "onyx_pull_0", Util.MOD_ID + ":" + "onyx_pull_1", Util.MOD_ID + ":" + "onyx_pull_2"};
	public EntityDragonArrow dragonArrow = new EntityDragonArrow(null);
	public static final String[] dragon = new String[] {Util.MOD_ID + ":" + "dragon_pull_0", Util.MOD_ID + ":" + "dragon_pull_1", Util.MOD_ID + ":" + "dragon_pull_2"};
	public EntityBlindoniteArrow blindoniteArrow = new EntityBlindoniteArrow(null);
	public static final String[] blindonite = new String[] {Util.MOD_ID + ":" + "blindonite_pull_0", Util.MOD_ID + ":" + "blindonite_pull_1", Util.MOD_ID + ":" + "blindonite_pull_2"};
	public EntityAlerisArrow alerisArrow = new EntityAlerisArrow(null);
	public static final String[] aleris = new String[] {Util.MOD_ID + ":" + "aleris_pull_0", Util.MOD_ID + ":" + "aleris_pull_1", Util.MOD_ID + ":" + "aleris_pull_2"};
	public EntityVraviniteArrow vraviniteArrow = new EntityVraviniteArrow(null);
	public static final String[] vravinite = new String[] {Util.MOD_ID + ":" + "vBow_pull_0", Util.MOD_ID + ":" + "vBow_pull_1", Util.MOD_ID + ":" + "vBow_pull_2"};
	public EntityDarknessArrow darknessArrow = new EntityDarknessArrow(null);
	public static final String[] wurTunBow = new String[] {Util.MOD_ID + ":" + "wBow_pull_0", Util.MOD_ID + ":" + "wBow_pull_1", Util.MOD_ID + ":" + "wBow_pull_2"};
	
	@SideOnly(Side.CLIENT)
	private IIcon[] iconArray;

	public RioVBow(int uses)
	{
		super();
		this.maxStackSize = 1;
		this.setMaxDamage(uses);
		this.setCreativeTab(RioVAPI.getInstance().tab);
	}

	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
	{
		int j = this.getMaxItemUseDuration(par1ItemStack) - par4;

		ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
		{
			return;
		}
		j = event.charge;

		boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

		/**if(this == RioVItems.amethystBow)
		{
			if (flag || par3EntityPlayer.inventory.hasItem(RioVItems.amethystArrow))
			{
				float f = (float)j / 20.0F;
				f = (f * f + f * 2.0F) / 3.0F;

				if ((double)f < 0.1D)
				{
					return;
				}

				if (f > 1.0F)
				{
					f = 1.0F;
				}

				EntityAmethystArrow entityarrow = new EntityAmethystArrow(par2World, par3EntityPlayer, f * 2.0F);

				if (f == 1.0F)
				{
					entityarrow.setIsCritical(true);
				}

				int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

				if (k > 0)
				{
					entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
				}

				int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

				if (l > 0)
				{
					entityarrow.setKnockbackStrength(l);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
				{
					entityarrow.setFire(100);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, par1ItemStack) > 0)
				{
					entityarrow.setDamage(amethystArrow.damage * 1.4);	
				}

				par1ItemStack.damageItem(1, par3EntityPlayer);
				par2World.playSoundAtEntity(par3EntityPlayer, Sounds.bow.getPrefixedName(), 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

				if (flag)
				{
					entityarrow.canBePickedUp = 2;
				}
				else
				{
					par3EntityPlayer.inventory.consumeInventoryItem(RioVItems.amethystArrow);
				}

				if (!par2World.isRemote)
				{
					par2World.spawnEntityInWorld(entityarrow);
				}
			}
		}
		
		if(this == RioVItems.onyxBow)
		{
			if (flag || par3EntityPlayer.inventory.hasItem(RioVItems.onyxArrow))
			{
				float f = (float)j / 20.0F;
				f = (f * f + f * 2.0F) / 3.0F;

				if ((double)f < 0.1D)
				{
					return;
				}

				if (f > 1.0F)
				{
					f = 1.0F;
				}

				EntityOnyxArrow entityarrow = new EntityOnyxArrow(par2World, par3EntityPlayer, f * 2.0F);

				if (f == 1.0F)
				{
					entityarrow.setIsCritical(true);
				}

				int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

				if (k > 0)
				{
					entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
				}

				int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

				if (l > 0)
				{
					entityarrow.setKnockbackStrength(l);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
				{
					entityarrow.setFire(100);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, par1ItemStack) > 0)
				{
					entityarrow.setDamage(onyxArrow.damage * 1.4);	
				}

				par1ItemStack.damageItem(1, par3EntityPlayer);
				par2World.playSoundAtEntity(par3EntityPlayer, Sounds.bow.getPrefixedName(), 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

				if (flag)
				{
					entityarrow.canBePickedUp = 2;
				}
				else
				{
					par3EntityPlayer.inventory.consumeInventoryItem(RioVItems.onyxArrow);
				}

				if (!par2World.isRemote)
				{
					par2World.spawnEntityInWorld(entityarrow);
				}
			}
		}
		
		if(this == RioVItems.dragonBow)
		{
			if (flag || par3EntityPlayer.inventory.hasItem(RioVItems.dragonArrow))
			{
				float f = (float)j / 20.0F;
				f = (f * f + f * 2.0F) / 3.0F;

				if ((double)f < 0.1D)
				{
					return;
				}

				if (f > 1.0F)
				{
					f = 1.0F;
				}

				EntityDragonArrow entityarrow = new EntityDragonArrow(par2World, par3EntityPlayer, f * 2.0F);

				if (f == 1.0F)
				{
					entityarrow.setIsCritical(true);
				}

				int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

				if (k > 0)
				{
					entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
				}

				int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

				if (l > 0)
				{
					entityarrow.setKnockbackStrength(l);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
				{
					entityarrow.setFire(100);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, par1ItemStack) > 0)
				{
					entityarrow.setDamage(dragonArrow.damage * 1.4);	
				}

				par1ItemStack.damageItem(1, par3EntityPlayer);
				par2World.playSoundAtEntity(par3EntityPlayer, Sounds.bow.getPrefixedName(), 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

				if (flag)
				{
					entityarrow.canBePickedUp = 2;
				}
				else
				{
					par3EntityPlayer.inventory.consumeInventoryItem(RioVItems.dragonArrow);
				}

				if (!par2World.isRemote)
				{
					par2World.spawnEntityInWorld(entityarrow);
				}
			}
		}
		
		if(this == RioVItems.blindoniteBow)
		{
			if (flag || par3EntityPlayer.inventory.hasItem(RioVItems.blindoniteArrow))
			{
				float f = (float)j / 20.0F;
				f = (f * f + f * 2.0F) / 3.0F;

				if ((double)f < 0.1D)
				{
					return;
				}

				if (f > 1.0F)
				{
					f = 1.0F;
				}

				EntityBlindoniteArrow entityarrow = new EntityBlindoniteArrow(par2World, par3EntityPlayer, f * 2.0F);

				if (f == 1.0F)
				{
					entityarrow.setIsCritical(true);
				}

				int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

				if (k > 0)
				{
					entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
				}

				int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

				if (l > 0)
				{
					entityarrow.setKnockbackStrength(l);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
				{
					entityarrow.setFire(100);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, par1ItemStack) > 0)
				{
					entityarrow.setDamage(blindoniteArrow.damage * 1.4);	
				}

				par1ItemStack.damageItem(1, par3EntityPlayer);
				par2World.playSoundAtEntity(par3EntityPlayer, Sounds.bow.getPrefixedName(), 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

				if (flag)
				{
					entityarrow.canBePickedUp = 2;
				}
				else
				{
					par3EntityPlayer.inventory.consumeInventoryItem(RioVItems.blindoniteArrow);
				}

				if (!par2World.isRemote)
				{
					par2World.spawnEntityInWorld(entityarrow);
				}
			}
		}
		
		if(this == RioVItems.alerisBow)
		{
			if (flag || par3EntityPlayer.inventory.hasItem(RioVItems.alerisArrow))
			{
				float f = (float)j / 20.0F;
				f = (f * f + f * 2.0F) / 3.0F;

				if ((double)f < 0.1D)
				{
					return;
				}

				if (f > 1.0F)
				{
					f = 1.0F;
				}

				EntityAlerisArrow entityarrow = new EntityAlerisArrow(par2World, par3EntityPlayer, f * 2.0F);

				if (f == 1.0F)
				{
					entityarrow.setIsCritical(true);
				}

				int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

				if (k > 0)
				{
					entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
				}

				int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

				if (l > 0)
				{
					entityarrow.setKnockbackStrength(l);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
				{
					entityarrow.setFire(100);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, par1ItemStack) > 0)
				{
					entityarrow.setDamage(alerisArrow.damage * 1.4);	
				}

				par1ItemStack.damageItem(1, par3EntityPlayer);
				par2World.playSoundAtEntity(par3EntityPlayer, Sounds.bow.getPrefixedName(), 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

				if (flag)
				{
					entityarrow.canBePickedUp = 2;
				}
				else
				{
				//	par3EntityPlayer.inventory.consumeInventoryItem(RioVItems.alerisArrow);
				}

				if (!par2World.isRemote)
				{
					par2World.spawnEntityInWorld(entityarrow);
				}
			}
		}**/
		
		if(this == RioVItems.vraviniteBow)
		{
			if (flag || par3EntityPlayer.inventory.hasItem(RioVItems.vraviniteArrow))
			{
				float f = (float)j / 20.0F;
				f = (f * f + f * 2.0F) / 3.0F;

				if ((double)f < 0.1D)
				{
					return;
				}

				if (f > 1.0F)
				{
					f = 1.0F;
				}

				EntityVraviniteArrow entityarrow = new EntityVraviniteArrow(par2World, par3EntityPlayer, f * 2.0F);

				if (f == 1.0F)
				{
					entityarrow.setIsCritical(true);
				}

				int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

				if (k > 0)
				{
					entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
				}

				int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

				if (l > 0)
				{
					entityarrow.setKnockbackStrength(l);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
				{
					entityarrow.setFire(100);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, par1ItemStack) > 0)
				{
					entityarrow.setDamage(vraviniteArrow.damage * 1.4);	
				}

				par1ItemStack.damageItem(1, par3EntityPlayer);
				par2World.playSoundAtEntity(par3EntityPlayer, Sounds.bow.getPrefixedName(), 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

				if (flag)
				{
					entityarrow.canBePickedUp = 2;
				}
				else
				{
					par3EntityPlayer.inventory.consumeInventoryItem(RioVItems.vraviniteArrow);
				}

				if (!par2World.isRemote)
				{
					par2World.spawnEntityInWorld(entityarrow);
				}
			}
		}
		
		if(this == RioVItems.bowOfWurTun)
		{
			if (flag || par3EntityPlayer.inventory.hasItem(RioVItems.darknessArrow))
			{
				float f = (float)j / 20.0F;
				f = (f * f + f * 2.0F) / 3.0F;

				if ((double)f < 0.1D)
				{
					return;
				}

				if (f > 1.0F)
				{
					f = 1.0F;
				}

				EntityDarknessArrow entityarrow = new EntityDarknessArrow(par2World, par3EntityPlayer, f * 2.0F);

				if (f == 1.0F)
				{
					entityarrow.setIsCritical(true);
				}

				int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

				if (k > 0)
				{
					entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
				}

				int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

				if (l > 0)
				{
					entityarrow.setKnockbackStrength(l);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
				{
					entityarrow.setFire(100);
				}

				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, par1ItemStack) > 0)
				{
					entityarrow.setDamage(darknessArrow.damage * 1.4);	
				}

				par1ItemStack.damageItem(1, par3EntityPlayer);
				par2World.playSoundAtEntity(par3EntityPlayer, Sounds.bow.getPrefixedName(), 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

				if (flag)
				{
					entityarrow.canBePickedUp = 2;
				}
				else
				{
					par3EntityPlayer.inventory.consumeInventoryItem(RioVItems.darknessArrow);
				}

				if (!par2World.isRemote)
				{
					par2World.spawnEntityInWorld(entityarrow);
				}
			}
		}
	}

	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		return par1ItemStack;
	}

	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 72000;
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.bow;
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
		{
			return event.result;
		}

		/**if(this == RioVItems.amethystBow)
		{
			if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(RioVItems.amethystArrow))
			{
				par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
			}
		}
		
		if(this == RioVItems.onyxBow)
		{
			if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(RioVItems.onyxArrow))
			{
				par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
			}
		}
		
		if(this == RioVItems.dragonBow)
		{
			if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(RioVItems.dragonArrow))
			{
				par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
			}
		}
		
		if(this == RioVItems.blindoniteBow)
		{
			if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(RioVItems.blindoniteArrow))
			{
				par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
			}
		}
		
		if(this == RioVItems.alerisBow)
		{
			if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(RioVItems.alerisArrow))
			{
				par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
			}
		}**/
		
		if(this == RioVItems.vraviniteBow)
		{
			if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(RioVItems.vraviniteArrow))
			{
				par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
			}
		}
		
		if(this == RioVItems.bowOfWurTun)
		{
			if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(RioVItems.darknessArrow))
			{
				par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
			}
		}

		return par1ItemStack;
	}

	public int getItemEnchantability()
	{
		return 1;
	}


	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + RioVAPIUtil.getName(this.getUnlocalizedName()));

	/**	if(this == RioVItems.amethystBow)
		{
			this.iconArray = new IIcon[amethyst.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(amethyst[i]);
			}
		}
		
		if(this == RioVItems.onyxBow)
		{
			this.iconArray = new IIcon[onyx.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(onyx[i]);
			}
		}
		
		if(this == RioVItems.dragonBow)
		{
			this.iconArray = new IIcon[dragon.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(dragon[i]);
			}
		}
		
		if(this == RioVItems.blindoniteBow)
		{
			this.iconArray = new IIcon[blindonite.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(blindonite[i]);
			}
		}
		
		if(this == RioVItems.alerisBow)
		{
			this.iconArray = new IIcon[aleris.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(aleris[i]);
			}
		}**/
		
		if(this == RioVItems.vraviniteBow)
		{
			this.iconArray = new IIcon[vravinite.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(vravinite[i]);
			}
		}
		
		if(this == RioVItems.bowOfWurTun)
		{
			this.iconArray = new IIcon[wurTunBow.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(wurTunBow[i]);
			}
		}
	}

	@Override
	public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
	{
		if(player.getItemInUse() == null) return this.itemIcon;
		int var4 = stack.getMaxItemUseDuration() - useRemaining;
		if (var4 > 18)
		{
			return iconArray[2];
		}
		else if (var4 > 13)
		{
			return iconArray[1];
		}
		else if (var4 > 0)
		{
			return iconArray[0];
		}

		return iconArray[0];
	}

	public IIcon getItemIconForUseDuration(int par1)
	{
		return this.iconArray[par1];
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		if(RioVAPI.getInstance().getConfigFields("showToolInfo") == true)
		{
			var3.add(var1.getMaxDamage() - var1.getItemDamage() + " Uses");

		/**	if(this == RioVItems.amethystBow)
			{
				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, var1) > 0)
				{
					var3.add("Damage: " + amethystArrow.damage * 1.4);
				}
				else
				{
					var3.add("Damage: " + amethystArrow.damage);
				}
			}
			
			if(this == RioVItems.onyxBow)
			{
				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, var1) > 0)
				{
					var3.add("Damage: " + onyxArrow.damage * 1.4);
				}
				else
				{
					var3.add("Damage: " + onyxArrow.damage);
				}
			}
			
			if(this == RioVItems.dragonBow)
			{
				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, var1) > 0)
				{
					var3.add("Damage: " + dragonArrow.damage * 1.4);
				}
				else
				{
					var3.add("Damage: " + dragonArrow.damage);
				}
			}
			
			if(this == RioVItems.blindoniteBow)
			{
				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, var1) > 0)
				{
					var3.add("Damage: " + blindoniteArrow.damage * 1.4);
				}
				else
				{
					var3.add("Damage: " + blindoniteArrow.damage);
				}
			}
			
			if(this == RioVItems.alerisBow)
			{
				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, var1) > 0)
				{
					var3.add("Damage: " + alerisArrow.damage * 1.4);
				}
				else
				{
					var3.add("Damage: " + alerisArrow.damage);
				}
			}**/
			
			if(this == RioVItems.vraviniteBow)
			{
				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, var1) > 0)
				{
					var3.add("Damage: " + vraviniteArrow.damage * 1.4);
				}
				else
				{
					var3.add("Damage: " + vraviniteArrow.damage);
				}
			}
			
			if(this == RioVItems.bowOfWurTun)
			{
				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.vicious.effectId, var1) > 0)
				{
					var3.add("Damage: " + darknessArrow.damage * 1.4);
				}
				else
				{
					var3.add("Damage: " + darknessArrow.damage);
				}
			}
		}
	}

}
