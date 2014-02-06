package sheenrox82.RioV.src.item;

import java.lang.reflect.Field;
import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.util.Color;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RioVArmor extends ItemArmor
{
	public String armorNamePrefix;
	public ArmorMaterial material;
	public boolean isInfused;
	public RioVArmor(ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String armornamePrefix, boolean par5)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.setCreativeTab(TheMistsOfRioV.getInstance().tab);
		armorNamePrefix = armornamePrefix;
		this.isInfused = par5;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.toString().contains("leggings")) 
		{
			return Util.MOD_ID + ":" + "textures/armor/" + armorNamePrefix + "_2.png";
		}
		if (stack.toString().contains("Leggings")) 
		{
			return Util.MOD_ID + ":" + "textures/armor/" + armorNamePrefix + "_2.png";
		}

		return Util.MOD_ID + ":" + "textures/armor/" + armorNamePrefix + "_1.png";
	}

	@Override
	public ArmorMaterial getArmorMaterial()
	{
		return this.material;
	}

	@Override
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		if(isInfused)
		{
			return true;
		}

		return par1ItemStack.isItemEnchanted();
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		ItemStack boots = player.getEquipmentInSlot(1);
		ItemStack leggings = player.getEquipmentInSlot(2);
		ItemStack chestplate = player.getEquipmentInSlot(3);
		ItemStack helmet = player.getEquipmentInSlot(4);

		if(boots != null) 
		{
			if(boots.getItem().equals(RioVItems.magickaBoots))
			{
				player.fallDistance = 0.0F;
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			}
			if(boots.getItem().equals(RioVItems.bootsOfFlame))
			{
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 1));
			}
		}

		if(chestplate != null) 
		{
			if(chestplate.getItem().equals(RioVItems.magickaChestplate))
			{
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
			}
			if(chestplate.getItem().equals(RioVItems.chestplateOfFlame))
			{
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 1));
			}
		}

		if(leggings != null) 
		{
			if(leggings.getItem().equals(RioVItems.magickaLeggings))
			{
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
			}
			if(leggings.getItem().equals(RioVItems.leggingsOfFlame))
			{
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 1));
			}
		}

		if(helmet != null) 
		{
			if(helmet.getItem().equals(RioVItems.magickaHelmet))
			{
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
			}
			if(helmet.getItem().equals(RioVItems.helmetOfFlame))
			{
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 1));
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{		
		if ((this == RioVItems.onyxHelmet) || (this == RioVItems.infusedOnyxHelmet))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "onyxHelmet");
		if ((this == RioVItems.onyxChestplate) || (this == RioVItems.infusedOnyxChestplate))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "onyxChestplate");
		if ((this == RioVItems.onyxLeggings) || (this == RioVItems.infusedOnyxLeggings))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "onyxLeggings");
		if ((this == RioVItems.onyxBoots) || (this == RioVItems.infusedOnyxBoots))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "onyxBoots");
		if ((this == RioVItems.amethystHelmet) || (this == RioVItems.infusedAmethystHelmet))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "amethystHelmet");
		if ((this == RioVItems.amethystChestplate) || (this == RioVItems.infusedAmethystChestplate))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "amethystChestplate");
		if ((this == RioVItems.amethystLeggings) || (this == RioVItems.infusedAmethystLeggings))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "amethystLeggings");
		if ((this == RioVItems.amethystBoots) || (this == RioVItems.infusedAmethystBoots))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "amethystBoots");
		if (this == RioVItems.auntunHelmet || this == RioVItems.supremeAunTunHelmet)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "auntunMinionHelmet");
		if (this == RioVItems.auntunChestplate)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "auntunMinionChestplate");
		if (this == RioVItems.supremeAunTunChestplate)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "supremeAunTunChestplate");
		if (this == RioVItems.auntunLeggings || this == RioVItems.supremeAunTunLeggings)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "auntunMinionLeggings");
		if (this == RioVItems.auntunBoots || this == RioVItems.supremeAunTunBoots)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "auntunMinionBoots");
		if (this == RioVItems.galokinHelmet)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "galokinHelmet");
		if (this == RioVItems.galokinChestplate)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "galokinChestplate");
		if (this == RioVItems.galokinLeggings)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "galokinLeggings");
		if (this == RioVItems.galokinBoots)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "galokinBoots");
		if (this == RioVItems.tasaravLeggings)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "tasaravLeggings");
		if (this == RioVItems.tasaravBoots)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "tasaravBoots");
		if (this == RioVItems.garnetHelmet)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "garnetHelmet");
		if (this == RioVItems.garnetChestplate)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "garnetChestplate");
		if (this == RioVItems.garnetLeggings)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "garnetLeggings");
		if (this == RioVItems.garnetBoots)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "garnetBoots");
		if (this == RioVItems.mythrilHelmet)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "mythrilHelmet");
		if (this == RioVItems.mythrilChestplate)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "mythrilChestplate");
		if (this == RioVItems.mythrilLeggings)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "mythrilLeggings");
		if (this == RioVItems.mythrilBoots)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "mythrilBoots");
		if ((this == RioVItems.dragonHelmet) || (this == RioVItems.infusedDragonHelmet))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "dragonHelmet");
		if ((this == RioVItems.dragonChestplate) || (this == RioVItems.infusedDragonChestplate))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "dragonChestplate");
		if ((this == RioVItems.dragonLeggings) || (this == RioVItems.infusedDragonLeggings))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "dragonLeggings");
		if ((this == RioVItems.dragonBoots) || (this == RioVItems.infusedDragonBoots))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "dragonBoots");
		if ((this == RioVItems.blindoniteHelmet) || (this == RioVItems.infusedBlindoniteHelmet))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "blindoniteHelmet");
		if ((this == RioVItems.blindoniteChestplate) || (this == RioVItems.infusedBlindoniteChestplate))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "blindoniteChestplate");
		if ((this == RioVItems.blindoniteLeggings) || (this == RioVItems.infusedBlindoniteLeggings))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "blindoniteLeggings");
		if ((this == RioVItems.blindoniteBoots) || (this == RioVItems.infusedBlindoniteBoots))
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "blindoniteBoots");
		if (this == RioVItems.magickaHelmet)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "magickaHelmet");
		if (this == RioVItems.magickaChestplate)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "magickaChestplate");
		if (this == RioVItems.magickaLeggings)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "magickaLeggings");
		if (this == RioVItems.magickaBoots)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "magickaBoots");
		if (this == RioVItems.helmetOfFlame)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "helmetOfFlame");
		if (this == RioVItems.chestplateOfFlame)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "chestplateOfFlame");
		if (this == RioVItems.leggingsOfFlame)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "leggingsOfFlame");
		if (this == RioVItems.bootsOfFlame)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "bootsOfFlame");
		if (this == RioVItems.tefHelmet)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "tefHelmet");
		if (this == RioVItems.tefChestplate)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "tefChestplate");
		if (this == RioVItems.tefLeggings)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "tefLeggings");
		if (this == RioVItems.tefBoots)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "tefBoots");
		if (this == RioVItems.vraviniteHelmet || this == RioVItems.infusedVraviniteHelmet)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "vraviniteHelmet");
		if (this == RioVItems.vraviniteChestplate || this == RioVItems.infusedVraviniteChestplate)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "vraviniteChestplate");
		if (this == RioVItems.vraviniteLeggings || this == RioVItems.infusedVraviniteLeggings)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "vraviniteLeggings");
		if (this == RioVItems.vraviniteBoots || this == RioVItems.infusedVraviniteBoots)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "vraviniteBoots");
		if (this == RioVItems.alerisHelmet)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "alerisHelmet");
		if (this == RioVItems.alerisChestplate)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "alerisChestplate");
		if (this == RioVItems.alerisLeggings)
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "alerisLeggings");
		if (this == RioVItems.alerisBoots)this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "alerisBoots");
		if (this == RioVItems.paladinHelmet)this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "paladinHelmet");
		if (this == RioVItems.paladinChestplate)this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "paladinChestplate");
		if (this == RioVItems.paladinLeggings)this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "paladinLeggings");
		if (this == RioVItems.paladinBoots)this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "paladinBoots");
		if (TheMistsOfRioV.getInstance().aether)
		{
			if (this == RioVItems.infusedZaniteHelmet)this.itemIcon = par1IconRegister.registerIcon("Aether:Zanite Helmet");
			if (this == RioVItems.infusedZaniteChestplate)this.itemIcon = par1IconRegister.registerIcon("Aether:Zanite Chestplate");
			if (this == RioVItems.infusedZaniteLeggings)this.itemIcon = par1IconRegister.registerIcon("Aether:Zanite Leggings");
			if (this == RioVItems.infusedZaniteBoots)this.itemIcon = par1IconRegister.registerIcon("Aether:Zanite Boots");
			if (this == RioVItems.infusedGravititeHelmet)this.itemIcon = par1IconRegister.registerIcon("Aether:Gravitite Helmet");
			if (this == RioVItems.infusedGravititeChestplate)this.itemIcon = par1IconRegister.registerIcon("Aether:Gravitite Chestplate");
			if (this == RioVItems.infusedGravititeLeggings)this.itemIcon = par1IconRegister.registerIcon("Aether:Gravitite Leggings");
			if (this == RioVItems.infusedGravititeBoots)this.itemIcon = par1IconRegister.registerIcon("Aether:Gravitite Boots");
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		if(Config.showToolInfo)
		{
			var3.add(Color.GOLD + (var1.getMaxDamage() - var1.getItemDamage()) + " Uses");
			var3.add(Color.DARK_PURPLE + "Protection: " + RioVArmor.getMaxDamageFactor(material));
		}
	}

	public static int getMaxDamageFactor(ArmorMaterial material)
	{
		int maxDamageFactor = 0;

		try 
		{
			Field fMaxDamageFactor = material.getClass().getDeclaredField("maxDamageFactor");
			fMaxDamageFactor.setAccessible(true);
			maxDamageFactor = fMaxDamageFactor.getInt(material);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return maxDamageFactor;
	}
}