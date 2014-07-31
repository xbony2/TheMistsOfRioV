package sheenrox82.RioV.src.api.item;

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
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.util.Color;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
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
		this.setCreativeTab(RioVAPI.getInstance().tab);
		this.armorNamePrefix = armornamePrefix;
		this.isInfused = par5;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.toString().contains("leggings")) 
		{
			return RioVAPI.getInstance().getUtil().mod_id + ":" + "textures/armor/" + armorNamePrefix + "_2.png";
		}
		if (stack.toString().contains("Leggings")) 
		{
			return RioVAPI.getInstance().getUtil().mod_id + ":" + "textures/armor/" + armorNamePrefix + "_2.png";
		}

		return RioVAPI.getInstance().getUtil().mod_id + ":" + "textures/armor/" + armorNamePrefix + "_1.png";
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
			if(boots.getItem().equals(RioVAPI.getInstance().getUtil().getRioVItem("magickaBoots")))
			{
				player.fallDistance = 0.0F;
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			}
			if(boots.getItem().equals(RioVAPI.getInstance().getUtil().getRioVItem("bootsOfFlame")))
			{
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 1));
			}
		}

		if(chestplate != null) 
		{
			if(chestplate.getItem().equals(RioVAPI.getInstance().getUtil().getRioVItem("magickaChestplate")))
			{
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
			}
			if(chestplate.getItem().equals(RioVAPI.getInstance().getUtil().getRioVItem("chestplateOfFlame")))
			{
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 1));
			}
		}

		if(leggings != null) 
		{
			if(leggings.getItem().equals(RioVAPI.getInstance().getUtil().getRioVItem("magickaLeggings")))
			{
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
			}
			if(leggings.getItem().equals(RioVAPI.getInstance().getUtil().getRioVItem("leggingsOfFlame")))
			{
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 1));
			}
		}

		if(helmet != null) 
		{
			if(helmet.getItem().equals(RioVAPI.getInstance().getUtil().getRioVItem("magickaHelmet")))
			{
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
			}
			if(helmet.getItem().equals(RioVAPI.getInstance().getUtil().getRioVItem("helmetOfFlame")))
			{
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 1));
			}
		}

		/**if (boots != null)
		{
			if (boots.getItem() == RioVItems.amethystBoots)
			{
				EntityPlayer tmp99_98 = player;tmp99_98.field_70746_aG = ((float)(tmp99_98.field_70746_aG * 0.999D));
			}
			if (boots.getItem() == RioVItems.blindoniteBoots)
			{
				EntityPlayer tmp124_123 = player;tmp124_123.field_70746_aG = ((float)(tmp124_123.field_70746_aG * 0.998D));
			}
			if (boots.getItem() == RioVItems.infusedBlindoniteBoots)
			{
				EntityPlayer tmp149_148 = player;tmp149_148.field_70746_aG = ((float)(tmp149_148.field_70746_aG * 0.997D));
			}
			if (boots.getItem() == RioVItems.infusedAmethystBoots)
			{
				EntityPlayer tmp174_173 = player;tmp174_173.field_70746_aG = ((float)(tmp174_173.field_70746_aG * 0.998D));
			}
			if (boots.getItem() == RioVItems.onyxBoots)
			{
				EntityPlayer tmp199_198 = player;tmp199_198.field_70746_aG = ((float)(tmp199_198.field_70746_aG * 0.997D));
			}
			if (boots.getItem() == RioVItems.infusedOnyxBoots)
			{
				EntityPlayer tmp224_223 = player;tmp224_223.field_70746_aG = ((float)(tmp224_223.field_70746_aG * 0.996D));
			}
			if (boots.getItem() == RioVItems.garnetBoots)
			{
				EntityPlayer tmp349_348 = player;tmp349_348.field_70746_aG = ((float)(tmp349_348.field_70746_aG * 0.991D));
			}
			if (boots.getItem() == RioVItems.bootsOfFlame)
			{
				tmp393_392 = player;tmp393_392.field_70746_aG = ((float)(tmp393_392.field_70746_aG * 0.991D));
			}
			if (boots.getItem() == RioVItems.auntunBoots)
			{
				EntityPlayer tmp418_417 = player;tmp418_417.field_70746_aG = ((float)(tmp418_417.field_70746_aG * 0.99D));
			}
			if (boots.getItem() == RioVItems.galokinBoots)
			{
				EntityPlayer tmp443_442 = player;tmp443_442.field_70746_aG = ((float)(tmp443_442.field_70746_aG * 0.99D));
			}
			if (boots.getItem() == RioVItems.mythrilBoots)
			{
				EntityPlayer tmp468_467 = player;tmp468_467.field_70746_aG = ((float)(tmp468_467.field_70746_aG * 0.989D));
			}
			if (boots.getItem() == RioVItems.dragonBoots)
			{
				EntityPlayer tmp493_492 = player;tmp493_492.field_70746_aG = ((float)(tmp493_492.field_70746_aG * 0.988D));
			}
			if (boots.getItem() == RioVItems.vraviniteBoots)
			{
				EntityPlayer tmp518_517 = player;tmp518_517.field_70746_aG = ((float)(tmp518_517.field_70746_aG * 0.989D));
			}
		}
		if (chestplate != null)
		{
			if (chestplate.getItem() == RioVItems.amethystChestplate)
			{
				EntityPlayer tmp578_577 = player;tmp578_577.field_70746_aG = ((float)(tmp578_577.field_70746_aG * 0.999D));
			}
			if (chestplate.getItem() == RioVItems.infusedAmethystChestplate)
			{
				EntityPlayer tmp603_602 = player;tmp603_602.field_70746_aG = ((float)(tmp603_602.field_70746_aG * 0.998D));
			}
			if (chestplate.getItem() == RioVItems.blindoniteChestplate)
			{
				EntityPlayer tmp628_627 = player;tmp628_627.field_70746_aG = ((float)(tmp628_627.field_70746_aG * 0.998D));
			}
			if (chestplate.getItem() == RioVItems.infusedBlindoniteChestplate)
			{
				EntityPlayer tmp653_652 = player;tmp653_652.field_70746_aG = ((float)(tmp653_652.field_70746_aG * 0.997D));
			}
			if (chestplate.getItem() == RioVItems.onyxChestplate)
			{
				EntityPlayer tmp678_677 = player;tmp678_677.field_70746_aG = ((float)(tmp678_677.field_70746_aG * 0.997D));
			}
			if (chestplate.getItem() == RioVItems.infusedOnyxChestplate)
			{
				EntityPlayer tmp703_702 = player;tmp703_702.field_70746_aG = ((float)(tmp703_702.field_70746_aG * 0.996D));
			}
			if (chestplate.getItem() == RioVItems.garnetChestplate)
			{
				EntityPlayer tmp828_827 = player;tmp828_827.field_70746_aG = ((float)(tmp828_827.field_70746_aG * 0.991D));
			}
			if (chestplate.getItem() == RioVItems.chestplateOfFlame)
			{
				tmp872_871 = player;tmp872_871.field_70746_aG = ((float)(tmp872_871.field_70746_aG * 0.991D));
			}
			if (chestplate.getItem() == RioVItems.auntunChestplate)
			{
				EntityPlayer tmp897_896 = player;tmp897_896.field_70746_aG = ((float)(tmp897_896.field_70746_aG * 0.996D));
			}
			if (chestplate.getItem() == RioVItems.galokinChestplate)
			{
				EntityPlayer tmp922_921 = player;tmp922_921.field_70746_aG = ((float)(tmp922_921.field_70746_aG * 0.996D));
			}
			if (chestplate.getItem() == RioVItems.mythrilChestplate)
			{
				EntityPlayer tmp947_946 = player;tmp947_946.field_70746_aG = ((float)(tmp947_946.field_70746_aG * 0.995D));
			}
			if (chestplate.getItem() == RioVItems.dragonChestplate)
			{
				player.jumpMovementFactor = ((float)(player.jumpMovementFactor * 0.994D));
			}
			if (chestplate.getItem() == RioVItems.vraviniteChestplate)
			{
				player.jumpMovementFactor = ((float)(player.jumpMovementFactor * 0.995D));
			}
		}
		if (leggings != null)
		{
			if (leggings.func_77973_b() == RioVItems.magickaLeggings) 
			{
				player.func_70690_d(new PotionEffect(Potion.field_76429_m.field_76415_H, 5, 0));
			}
			if (leggings.func_77973_b() == RioVItems.amethystLeggings)
			{
				EntityPlayer tmp1057_1056 = player;tmp1057_1056.field_70746_aG = ((float)(tmp1057_1056.field_70746_aG * 0.999D));
			}
			if (leggings.func_77973_b() == RioVItems.infusedAmethystLeggings)
			{
				EntityPlayer tmp1082_1081 = player;tmp1082_1081.field_70746_aG = ((float)(tmp1082_1081.field_70746_aG * 0.998D));
			}
			if (leggings.func_77973_b() == RioVItems.blindoniteLeggings)
			{
				EntityPlayer tmp1107_1106 = player;tmp1107_1106.field_70746_aG = ((float)(tmp1107_1106.field_70746_aG * 0.998D));
			}
			if (leggings.func_77973_b() == RioVItems.infusedBlindoniteLeggings)
			{
				EntityPlayer tmp1132_1131 = player;tmp1132_1131.field_70746_aG = ((float)(tmp1132_1131.field_70746_aG * 0.997D));
			}
			if (leggings.func_77973_b() == RioVItems.onyxLeggings)
			{
				EntityPlayer tmp1157_1156 = player;tmp1157_1156.field_70746_aG = ((float)(tmp1157_1156.field_70746_aG * 0.997D));
			}
			if (leggings.func_77973_b() == RioVItems.infusedOnyxLeggings)
			{
				EntityPlayer tmp1182_1181 = player;tmp1182_1181.field_70746_aG = ((float)(tmp1182_1181.field_70746_aG * 0.996D));
			}
			if (leggings.func_77973_b() == RioVItems.garnetLeggings)
			{
				EntityPlayer tmp1307_1306 = player;tmp1307_1306.field_70746_aG = ((float)(tmp1307_1306.field_70746_aG * 0.991D));
			}
			if (leggings.func_77973_b() == RioVItems.leggingsOfFlame)
			{
				tmp1351_1350 = player;tmp1351_1350.field_70746_aG = ((float)(tmp1351_1350.field_70746_aG * 0.991D));
			}
			if (leggings.func_77973_b() == RioVItems.auntunLeggings)
			{
				EntityPlayer tmp1376_1375 = player;tmp1376_1375.field_70746_aG = ((float)(tmp1376_1375.field_70746_aG * 0.996D));
			}
			if (leggings.func_77973_b() == RioVItems.galokinLeggings)
			{
				EntityPlayer tmp1401_1400 = player;tmp1401_1400.field_70746_aG = ((float)(tmp1401_1400.field_70746_aG * 0.996D));
			}
			if (leggings.func_77973_b() == RioVItems.mythrilLeggings)
			{
				EntityPlayer tmp1426_1425 = player;tmp1426_1425.field_70746_aG = ((float)(tmp1426_1425.field_70746_aG * 0.995D));
			}
			if (leggings.func_77973_b() == RioVItems.dragonLeggings)
			{
				EntityPlayer tmp1451_1450 = player;tmp1451_1450.field_70746_aG = ((float)(tmp1451_1450.field_70746_aG * 0.994D));
			}
			if (leggings.func_77973_b() == RioVItems.vraviniteLeggings)
			{
				EntityPlayer tmp1476_1475 = player;tmp1476_1475.field_70746_aG = ((float)(tmp1476_1475.field_70746_aG * 0.995D));
			}
		}
		if (helmet != null)
		{
			if (helmet.func_77973_b() == RioVItems.amethystHelmet)
			{
				EntityPlayer tmp1536_1535 = player;tmp1536_1535.field_70746_aG = ((float)(tmp1536_1535.field_70746_aG * 0.999D));
			}
			if (helmet.func_77973_b() == RioVItems.infusedAmethystHelmet)
			{
				EntityPlayer tmp1561_1560 = player;tmp1561_1560.field_70746_aG = ((float)(tmp1561_1560.field_70746_aG * 0.998D));
			}
			if (helmet.func_77973_b() == RioVItems.blindoniteHelmet)
			{
				EntityPlayer tmp1586_1585 = player;tmp1586_1585.field_70746_aG = ((float)(tmp1586_1585.field_70746_aG * 0.998D));
			}
			if (helmet.func_77973_b() == RioVItems.infusedBlindoniteHelmet)
			{
				EntityPlayer tmp1611_1610 = player;tmp1611_1610.field_70746_aG = ((float)(tmp1611_1610.field_70746_aG * 0.997D));
			}
			if (helmet.func_77973_b() == RioVItems.onyxHelmet)
			{
				EntityPlayer tmp1636_1635 = player;tmp1636_1635.field_70746_aG = ((float)(tmp1636_1635.field_70746_aG * 0.997D));
			}
			if (helmet.func_77973_b() == RioVItems.infusedOnyxHelmet)
			{
				EntityPlayer tmp1661_1660 = player;tmp1661_1660.field_70746_aG = ((float)(tmp1661_1660.field_70746_aG * 0.996D));
			}
			if (helmet.func_77973_b() == RioVItems.garnetHelmet)
			{
				EntityPlayer tmp1786_1785 = player;tmp1786_1785.field_70746_aG = ((float)(tmp1786_1785.field_70746_aG * 0.991D));
			}
			if (helmet.func_77973_b() == RioVItems.helmetOfFlame)
			{
				player.func_70690_d(new PotionEffect(Potion.field_76426_n.field_76415_H, 5, 1)); EntityPlayer 
				tmp1830_1829 = player;tmp1830_1829.field_70746_aG = ((float)(tmp1830_1829.field_70746_aG * 0.991D));
			}
			if (helmet.func_77973_b() == RioVItems.auntunHelmet)
			{
				EntityPlayer tmp1855_1854 = player;tmp1855_1854.field_70746_aG = ((float)(tmp1855_1854.field_70746_aG * 0.99D));
			}
			if (helmet.func_77973_b() == RioVItems.galokinHelmet)
			{
				EntityPlayer tmp1880_1879 = player;tmp1880_1879.field_70746_aG = ((float)(tmp1880_1879.field_70746_aG * 0.99D));
			}
			if (helmet.func_77973_b() == RioVItems.mythrilHelmet)
			{
				EntityPlayer tmp1905_1904 = player;tmp1905_1904.field_70746_aG = ((float)(tmp1905_1904.field_70746_aG * 0.99D));
			}
			if (helmet.func_77973_b() == RioVItems.dragonHelmet)
			{
				EntityPlayer tmp1930_1929 = player;tmp1930_1929.field_70746_aG = ((float)(tmp1930_1929.field_70746_aG * 0.99D));
			}
			if (helmet.func_77973_b() == RioVItems.vraviniteHelmet)
			{
				EntityPlayer tmp1955_1954 = player;tmp1955_1954.field_70746_aG = ((float)(tmp1955_1954.field_70746_aG * 0.99D));
			}
		}**/
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{		
		this.itemIcon = par1IconRegister.registerIcon(RioVAPI.getInstance().getUtil().mod_id + ":" + RioVAPIUtil.getName(this.getUnlocalizedName()));

		if (RioVAPI.getInstance().botania)
		{
			if (this == RioVAPI.getInstance().getUtil().getRioVItem("infusedManasteelHelm"))this.itemIcon = par1IconRegister.registerIcon("Botania:manasteelHelm");
			if (this == RioVAPI.getInstance().getUtil().getRioVItem("infusedManasteelChest"))this.itemIcon = par1IconRegister.registerIcon("Botania:manasteelChest");
			if (this == RioVAPI.getInstance().getUtil().getRioVItem("infusedManasteelLegs"))this.itemIcon = par1IconRegister.registerIcon("Botania:manasteelLegs");
			if (this == RioVAPI.getInstance().getUtil().getRioVItem("infusedManasteelBoots"))this.itemIcon = par1IconRegister.registerIcon("Botania:manasteelBoots");
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		if(RioVAPI.getInstance().getUtil().getConfigBool("showToolInfo") == true)
		{
			var3.add(Color.gold + (var1.getMaxDamage() - var1.getItemDamage()) + " Uses");

			if(RioVAPI.getInstance().getUtil().getConfigBool("dev") == false)
			{
				var3.add(Color.dark_purple + "Protection: " + getMaxDamageFactor(material));
			}
			else
			{
				var3.add(Color.dark_purple + "Protection: " + getMaxDamageFactorDebug(material));
			}
		}
	}

	public final int getMaxDamageFactor(ArmorMaterial material)
	{
		int maxDamageFactor = 0;

		try 
		{
			//will not work in eclipse environment
			Field fMaxDamageFactor = material.getClass().getDeclaredField("field_78048_f");
			fMaxDamageFactor.setAccessible(true);
			maxDamageFactor = fMaxDamageFactor.getInt(material);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return maxDamageFactor;
	}

	public final int getMaxDamageFactorDebug(ArmorMaterial material)
	{
		int maxDamageFactor = 0;

		try 
		{
			//works only in eclipse environment
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