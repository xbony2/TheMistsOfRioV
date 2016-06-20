package sheenrox82.RioV.src.content;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.item.RioVArmor;
import sheenrox82.RioV.src.api.item.RioVAxe;
import sheenrox82.RioV.src.api.item.RioVItem;
import sheenrox82.RioV.src.api.item.RioVPickaxe;
import sheenrox82.RioV.src.api.item.RioVSpade;
import sheenrox82.RioV.src.api.item.RioVWeapon;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
import sheenrox82.RioV.src.baubles.RioVRing;
import sheenrox82.RioV.src.item.ItemEnforcedBowOfWurTun;
import sheenrox82.RioV.src.item.ItemGuideBook;
import sheenrox82.RioV.src.item.RioVActivators;
import sheenrox82.RioV.src.item.RioVBag;
import sheenrox82.RioV.src.item.RioVBow;
import sheenrox82.RioV.src.item.RioVConsumable;
import sheenrox82.RioV.src.item.RioVDoor;
import sheenrox82.RioV.src.item.RioVDrinkable;
import sheenrox82.RioV.src.item.RioVExplosives;
import sheenrox82.RioV.src.item.RioVPotions;
import sheenrox82.RioV.src.item.RioVSummoners;
import sheenrox82.RioV.src.item.RioVVoidHolder;
import sheenrox82.RioV.src.item.RioVWand;
import sheenrox82.RioV.src.proxy.CommonProxy;

public class RioVItems{
	public static final int render = CommonProxy.addArmor("armor");
	
	static ToolMaterial Amethyst = EnumHelper.addToolMaterial("Amethyst", 3, 400, 5F, 4, 8);
	static ToolMaterial InfusedAmethyst = EnumHelper.addToolMaterial("InfusedAmethyst", 3, 500, 9F, 5, 9);
	static ToolMaterial Onyx = EnumHelper.addToolMaterial("Onyx", 3, 600, 10F, 5, 10);
	static ToolMaterial InfusedOnyx = EnumHelper.addToolMaterial("InfusedOnyx", 4, 700, 11F, 6, 11);
	static ToolMaterial Agonite = EnumHelper.addToolMaterial("Agonite", 8, 1000, 9F, 3, 14);
	static ToolMaterial Dragon = EnumHelper.addToolMaterial("Dragon", 9, 3000, 15F, 10, 15);
	static ToolMaterial Daetori = EnumHelper.addToolMaterial("Daetori", 2, 500, 5F, 9, 12);
	static ToolMaterial Sorrow = EnumHelper.addToolMaterial("Sorrow", 2, 700, 5F, 10, 13);
	static ToolMaterial AxeOfAunTun = EnumHelper.addToolMaterial("AxeOfAunTun", 2, 2500, 5F, 18, 16);
	static ToolMaterial UltraAxeOfAunTun = EnumHelper.addToolMaterial("UltraAxeOfAunTun", 2, -1, 5F, 26, 30);
	static ToolMaterial Vulron = EnumHelper.addToolMaterial("Vulron", 6, 200, 9F, 6, 12);
	static ToolMaterial InfusedDragon = EnumHelper.addToolMaterial("InfusedDragon", 11, 3400, 18F, 11, 16);
	static ToolMaterial Flame = EnumHelper.addToolMaterial("Flame", 6, 900, 9F, 7, 16);
	static ToolMaterial Glimmerwood = EnumHelper.addToolMaterial("Glimmerwood", 2, 250, 4F, 2, 20);
	static ToolMaterial CherryBlossom = EnumHelper.addToolMaterial("CherryBlossom", 2, 100, 2F, 0, 20);
	static ToolMaterial Aleris = EnumHelper.addToolMaterial("Aleris", 14, 2400, 14F, 16, 21);
	static ToolMaterial InfusedVravinite = EnumHelper.addToolMaterial("InfusedVravinite", 13, 1000, 13F, 11, 12);
	static ToolMaterial Vravinite = EnumHelper.addToolMaterial("Vravinite", 12, 900, 13F, 10, 12);
	static ToolMaterial InfusedAleris = EnumHelper.addToolMaterial("InfusedAleris", 15, 2600, 16F, 17, 25);
	static ToolMaterial Shadownite = EnumHelper.addToolMaterial("Shadownite", 11, 2100, 11F, 12, 16);
	static ToolMaterial InfusedShadownite = EnumHelper.addToolMaterial("Shadownite", 13, 2300, 12F, 15, 25);
	
	static ArmorMaterial InfusedAmethystArmorMaterial = EnumHelper.addArmorMaterial("INFUSEDAMETHYST", 17, new int[] {4, 6, 6, 4}, 20);
	static ArmorMaterial InfusedOnyxArmorMaterial = EnumHelper.addArmorMaterial("INFUSEDONYX", 18, new int[] {5, 6, 6, 5}, 20);
	static ArmorMaterial Magic = EnumHelper.addArmorMaterial("MAGIC", 2, new int[] {1, 1, 1, 1}, 28);
	static ArmorMaterial InfusedDragonArmorMaterial = EnumHelper.addArmorMaterial("INFUSEDDRAGON", 39, new int[] {4, 6, 6, 4}, 20);
	static ArmorMaterial DragonArmorMaterial = EnumHelper.addArmorMaterial("DRAGON", 37, new int[] {4, 6, 6, 4}, 20);
	static ArmorMaterial AunTunArmorMaterial = EnumHelper.addArmorMaterial("AUNTUN", 40, new int[] {3, 8, 6, 3}, 20);
	static ArmorMaterial AmethystArmorMaterial = EnumHelper.addArmorMaterial("AMETHYST", 15, new int[] {3, 5, 6, 3}, 20);
	static ArmorMaterial OnyxArmorMaterial = EnumHelper.addArmorMaterial("ONYX", 16, new int[] {4, 5, 6, 4}, 20);
	static ArmorMaterial MythrilArmorMaterial = EnumHelper.addArmorMaterial("MYTHRIL", 36, new int[] {4, 8, 6, 4}, 20);
	static ArmorMaterial FlameArmorMaterial = EnumHelper.addArmorMaterial("FLAME", 30, new int[] {4, 5, 6, 4}, 20);
	static ArmorMaterial AlerisArmorMaterial = EnumHelper.addArmorMaterial("ALERIS", 48, new int[] {5, 8, 6, 5}, 20);
	static ArmorMaterial InfusedVraviniteArmorMaterial = EnumHelper.addArmorMaterial("VRAVINITE", 33, new int[] {4, 6, 6, 4}, 20);
	static ArmorMaterial VraviniteArmorMaterial = EnumHelper.addArmorMaterial("VRAVINITE", 32, new int[] {4, 6, 6, 4}, 20);
	static ArmorMaterial SupremeAunTunArmorMaterial = EnumHelper.addArmorMaterial("SUPREMEAUNTUN", 68, new int[] {7, 10, 9, 9}, 50);
	static ArmorMaterial InfusedAlerisArmorMaterial = EnumHelper.addArmorMaterial("INFUSEDALERIS", 49, new int[] {6, 8, 7, 6}, 25);
	static ArmorMaterial ShadowniteArmorMaterial = EnumHelper.addArmorMaterial("SHADOWNITE", 46, new int[] {4, 6, 5, 4}, 15);
	static ArmorMaterial InfusedShadowniteArmorMaterial = EnumHelper.addArmorMaterial("INFUSEDSHADOWNITE", 47, new int[] {5, 7, 6, 5}, 30);
	
	public static RioVArmor onyxHelmet = (RioVArmor) new RioVArmor(OnyxArmorMaterial, render, 0, "onyx", false).setUnlocalizedName("onyxHelmet");
	public static RioVArmor onyxChestplate = (RioVArmor) new RioVArmor(OnyxArmorMaterial, render, 1, "onyx", false)
			.setUnlocalizedName("onyxChestplate");
	public static RioVArmor onyxLeggings = (RioVArmor) new RioVArmor(OnyxArmorMaterial, render, 2, "onyx", false).setUnlocalizedName("onyxLeggings");
	public static RioVArmor onyxBoots = (RioVArmor) new RioVArmor(OnyxArmorMaterial, render, 3, "onyx", false).setUnlocalizedName("onyxBoots");
	public static RioVArmor amethystHelmet = (RioVArmor) new RioVArmor(AmethystArmorMaterial, render, 0, "amethyst", false)
			.setUnlocalizedName("amethystHelmet");
	public static RioVArmor amethystChestplate = (RioVArmor) new RioVArmor(AmethystArmorMaterial, render, 1, "amethyst", false)
			.setUnlocalizedName("amethystChestplate");
	public static RioVArmor amethystLeggings = (RioVArmor) new RioVArmor(AmethystArmorMaterial, render, 2, "amethyst", false)
			.setUnlocalizedName("amethystLeggings");
	public static RioVArmor amethystBoots = (RioVArmor) new RioVArmor(AmethystArmorMaterial, render, 3, "amethyst", false)
			.setUnlocalizedName("amethystBoots");
	public static RioVArmor infusedOnyxHelmet = (RioVArmor) new RioVArmor(InfusedOnyxArmorMaterial, render, 0, "onyx", true)
			.setUnlocalizedName("infused.onyxHelmet");
	public static RioVArmor infusedOnyxChestplate = (RioVArmor) new RioVArmor(InfusedOnyxArmorMaterial, render, 1, "onyx", true)
			.setUnlocalizedName("infused.onyxChestplate");
	public static RioVArmor infusedOnyxLeggings = (RioVArmor) new RioVArmor(InfusedOnyxArmorMaterial, render, 2, "onyx", true)
			.setUnlocalizedName("infused.onyxLeggings");
	public static RioVArmor infusedOnyxBoots = (RioVArmor) new RioVArmor(InfusedOnyxArmorMaterial, render, 3, "onyx", true)
			.setUnlocalizedName("infused.onyxBoots");
	public static RioVArmor infusedAmethystHelmet = (RioVArmor) new RioVArmor(InfusedAmethystArmorMaterial, render, 0, "amethyst", true)
			.setUnlocalizedName("infused.amethystHelmet");
	public static RioVArmor infusedAmethystChestplate = (RioVArmor) new RioVArmor(InfusedAmethystArmorMaterial, render, 1, "amethyst", true)
			.setUnlocalizedName("infused.amethystChestplate");
	public static RioVArmor infusedAmethystLeggings = (RioVArmor) new RioVArmor(InfusedAmethystArmorMaterial, render, 2, "amethyst", true)
			.setUnlocalizedName("infused.amethystLeggings");
	public static RioVArmor infusedAmethystBoots = (RioVArmor) new RioVArmor(InfusedAmethystArmorMaterial, render, 3, "amethyst", true)
			.setUnlocalizedName("infused.amethystBoots");
	public static RioVArmor auntunHelmet = (RioVArmor) new RioVArmor(AunTunArmorMaterial, render, 0, "auntunminion", false)
			.setUnlocalizedName("auntunMinionHelmet");
	public static RioVArmor auntunChestplate = (RioVArmor) new RioVArmor(AunTunArmorMaterial, render, 1, "auntunminion", false)
			.setUnlocalizedName("auntunMinionChestplate");
	public static RioVArmor auntunLeggings = (RioVArmor) new RioVArmor(AunTunArmorMaterial, render, 2, "auntunminion", false)
			.setUnlocalizedName("auntunMinionLeggings");
	public static RioVArmor auntunBoots = (RioVArmor) new RioVArmor(AunTunArmorMaterial, render, 3, "auntunminion", false)
			.setUnlocalizedName("auntunMinionBoots");
	public static RioVArmor mythrilHelmet = (RioVArmor) new RioVArmor(MythrilArmorMaterial, render, 0, "mythril", false)
			.setUnlocalizedName("mythrilHelmet");
	public static RioVArmor mythrilChestplate = (RioVArmor) new RioVArmor(MythrilArmorMaterial, render, 1, "mythril", false)
			.setUnlocalizedName("mythrilChestplate");
	public static RioVArmor mythrilLeggings = (RioVArmor) new RioVArmor(MythrilArmorMaterial, render, 2, "mythril", false)
			.setUnlocalizedName("mythrilLeggings");
	public static RioVArmor mythrilBoots = (RioVArmor) new RioVArmor(MythrilArmorMaterial, render, 3, "mythril", false)
			.setUnlocalizedName("mythrilBoots");
	public static RioVArmor dragonHelmet = (RioVArmor) new RioVArmor(DragonArmorMaterial, render, 0, "dragon", false)
			.setUnlocalizedName("dragonHelmet");
	public static RioVArmor dragonChestplate = (RioVArmor) new RioVArmor(DragonArmorMaterial, render, 1, "dragon", false)
			.setUnlocalizedName("dragonChestplate");
	public static RioVArmor dragonLeggings = (RioVArmor) new RioVArmor(DragonArmorMaterial, render, 2, "dragon", false)
			.setUnlocalizedName("dragonLeggings");
	public static RioVArmor dragonBoots = (RioVArmor) new RioVArmor(DragonArmorMaterial, render, 3, "dragon", false)
			.setUnlocalizedName("dragonBoots");
	public static Item amethystSword = new RioVWeapon(Amethyst, false).setUnlocalizedName("amethystSword");
	public static Item infusedAmethystSword = new RioVWeapon(InfusedAmethyst, true).setUnlocalizedName("infused.amethystSword");
	public static Item onyxSword = new RioVWeapon(Onyx, false).setUnlocalizedName("onyxSword");
	public static Item infusedOnyxSword = new RioVWeapon(InfusedOnyx, true).setUnlocalizedName("infused.onyxSword");
	public static Item daetoriSword = new RioVWeapon(Daetori, false).setUnlocalizedName("daetoriSword");
	public static Item sorrowSword = new RioVWeapon(Sorrow, false).setUnlocalizedName("sorrowSword");
	public static Item axeOfAunTun = new RioVWeapon(AxeOfAunTun, false).setUnlocalizedName("axeOfAunTun");
	public static Item dragonSword = new RioVWeapon(Dragon, false).setUnlocalizedName("dragonSword");
	public static Item onyxPickaxe = new RioVPickaxe(Onyx, false).setUnlocalizedName("onyxPickaxe");
	public static Item onyxAxe = new RioVAxe(Onyx, false).setUnlocalizedName("onyxAxe");
	public static Item onyxShovel = new RioVSpade(Onyx, false).setUnlocalizedName("onyxShovel");
	public static Item amethystPickaxe = new RioVPickaxe(Amethyst, false).setUnlocalizedName("amethystPickaxe");
	public static Item amethystAxe = new RioVAxe(Amethyst, false).setUnlocalizedName("amethystAxe");
	public static Item amethystShovel = new RioVSpade(Amethyst, false).setUnlocalizedName("amethystShovel");
	public static Item infusedOnyxPickaxe = new RioVPickaxe(InfusedOnyx, true).setUnlocalizedName("infused.onyxPickaxe");
	public static Item infusedOnyxAxe = new RioVAxe(InfusedOnyx, true).setUnlocalizedName("infused.onyxAxe");
	public static Item infusedOnyxShovel = new RioVSpade(InfusedOnyx, true).setUnlocalizedName("infused.onyxShovel");
	public static Item infusedAmethystPickaxe = new RioVPickaxe(InfusedAmethyst, true).setUnlocalizedName("infused.amethystPickaxe");
	public static Item infusedAmethystAxe = new RioVAxe(InfusedAmethyst, true).setUnlocalizedName("infused.amethystAxe");
	public static Item infusedAmethystShovel = new RioVSpade(InfusedAmethyst, true).setUnlocalizedName("infused.amethystShovel");
	public static Item agonitePickaxe = new RioVPickaxe(Agonite, false).setUnlocalizedName("agonitePickaxe");
	public static Item dragonPickaxe = new RioVPickaxe(Dragon, false).setUnlocalizedName("dragonPickaxe");
	public static Item dragonAxe = new RioVAxe(Dragon, false).setUnlocalizedName("dragonAxe");
	public static Item dragonShovel = new RioVSpade(Dragon, false).setUnlocalizedName("dragonShovel");
	public static Item amethyst = new RioVItem().setUnlocalizedName("amethyst");
	public static Item onyx = new RioVItem().setUnlocalizedName("onyx");
	public static Item blackBone = new RioVItem().setUnlocalizedName("blackBone");
	public static Item orb = new RioVItem().setUnlocalizedName("orb");
	public static Item slateFragment = new RioVItem().setUnlocalizedName("slateFragment");
	public static Item agonite = new RioVItem().setUnlocalizedName("agonite");
	public static Item darkMatter = new RioVExplosives().setUnlocalizedName("darkMatter");
	public static Item mythrilIngot = new RioVItem().setUnlocalizedName("mythrilIngot");
	public static Item dragonSoul = new RioVItem().setUnlocalizedName("dragonSoul");
	public static Item nironite = new RioVItem().setUnlocalizedName("nironite");
	public static Item burnedQuartz = new RioVItem().setUnlocalizedName("burnedQuartz");
	public static Item vulron = new RioVItem().setUnlocalizedName("vulron");
	public static Item darknessArrow = new RioVItem().setUnlocalizedName("darknessArrow");
	public static Item unfusedAxeOfAunTun = new RioVWeapon(Amethyst, false).setUnlocalizedName("unfusedAxeOfAunTun");
	public static Item halfFusedAxeOfAunTun = new RioVWeapon(Amethyst, false).setUnlocalizedName("half.unfusedAxeOfAunTun");
	public static Item ambrosia = new RioVConsumable(3, 2, false).setUnlocalizedName("ambrosia");
	public static Item tomato = new RioVConsumable(4, 2, false).setUnlocalizedName("tomato");
	public static Item cookedHorseMeat = new RioVConsumable(5, 2, false).setUnlocalizedName("cookedHorseMeat");
	public static Item horseMeat = new RioVConsumable(1, 2, false).setUnlocalizedName("horseMeat");
	public static Item blackDurii = new RioVConsumable(4, 2, false).setUnlocalizedName("blackDurii");
	public static Item baseCrystal = new RioVItem().setUnlocalizedName("baseCrystal");
	public static Item terronCrystal = new RioVSummoners().setUnlocalizedName("terronCrystal");
	public static Item demonAngelCrystal = new RioVSummoners().setUnlocalizedName("demonAngelCrystal");
	public static Item auntunSummoner = new RioVSummoners().setUnlocalizedName("auntunSummoner");
	public static Item khuulisScythe = new RioVWeapon(Onyx, false).setUnlocalizedName("khuulisScythe");
	public static Item bowOfWurTun = new RioVBow(400).setUnlocalizedName("bowOfWurTun");
	public static Item wineGlass = new RioVItem().setUnlocalizedName("wineGlass");
	public static Item potionGlass = new RioVItem().setUnlocalizedName("potionGlass");
	public static Item grapes = new RioVConsumable(3, 2, false).setUnlocalizedName("grapes");
	public static Item wine = new RioVDrinkable(3, 2, false).setUnlocalizedName("wine");
	public static Item greenApple = new RioVConsumable(2, 2, false).setUnlocalizedName("greenApple");
	public static Item spicedWine = new RioVDrinkable(4, 2, false).setUnlocalizedName("spicedWine");
	public static Item pepper = new RioVConsumable(1, 2, false).setUnlocalizedName("pepper");
	public static Item pepperSpices = new RioVConsumable(1, 2, false).setUnlocalizedName("pepperSpices");
	public static Item manchet = new RioVConsumable(4, 2, false).setUnlocalizedName("manchet");
	public static Item cherry = new RioVConsumable(6, 2, false).setUnlocalizedName("cherry");
	public static Item clothOfMagic = new RioVItem().setUnlocalizedName("clothOfMagic");
	public static RioVArmor magickaHelmet = (RioVArmor) new RioVArmor(Magic, render, 0, "magic", true).setUnlocalizedName("magickaHelmet");
	public static RioVArmor magickaChestplate = (RioVArmor) new RioVArmor(Magic, render, 1, "magic", true).setUnlocalizedName("magickaChestplate");
	public static RioVArmor magickaLeggings = (RioVArmor) new RioVArmor(Magic, render, 2, "magic", true).setUnlocalizedName("magickaLeggings");
	public static RioVArmor magickaBoots = (RioVArmor) new RioVArmor(Magic, render, 3, "magic", true).setUnlocalizedName("magickaBoots");
	public static Item theDarknessCrystal = new RioVSummoners().setUnlocalizedName("theDarknessCrystal");
	public static Item ingotOfFlame = new RioVItem().setUnlocalizedName("ingotOfFlame");
	public static Item swordOfFlame = new RioVWeapon(Flame, false).setUnlocalizedName("swordOfFlame");
	public static Item purpleFeather = new RioVItem().setUnlocalizedName("purpleFeather");
	public static Item bonyiumIngot = new RioVItem().setUnlocalizedName("bonyiumIngot");
	public static RioVArmor helmetOfFlame = (RioVArmor) new RioVArmor(FlameArmorMaterial, render, 0, "flame", false)
			.setUnlocalizedName("helmetOfFlame");
	public static RioVArmor chestplateOfFlame = (RioVArmor) new RioVArmor(FlameArmorMaterial, render, 1, "flame", false)
			.setUnlocalizedName("chestplateOfFlame");
	public static RioVArmor leggingsOfFlame = (RioVArmor) new RioVArmor(FlameArmorMaterial, render, 2, "flame", false)
			.setUnlocalizedName("leggingsOfFlame");
	public static RioVArmor bootsOfFlame = (RioVArmor) new RioVArmor(FlameArmorMaterial, render, 3, "flame", false)
			.setUnlocalizedName("bootsOfFlame");
	public static RioVArmor infusedDragonHelmet = (RioVArmor) new RioVArmor(InfusedDragonArmorMaterial, render, 0, "dragon", true)
			.setUnlocalizedName("infused.dragonHelmet");
	public static RioVArmor infusedDragonChestplate = (RioVArmor) new RioVArmor(InfusedDragonArmorMaterial, render, 1, "dragon", true)
			.setUnlocalizedName("infused.dragonChestplate");
	public static RioVArmor infusedDragonLeggings = (RioVArmor) new RioVArmor(InfusedDragonArmorMaterial, render, 2, "dragon", true)
			.setUnlocalizedName("infused.dragonLeggings");
	public static RioVArmor infusedDragonBoots = (RioVArmor) new RioVArmor(InfusedDragonArmorMaterial, render, 3, "dragon", true)
			.setUnlocalizedName("infused.dragonBoots");
	public static Item infusedDragonSword = new RioVWeapon(InfusedDragon, true).setUnlocalizedName("infused.dragonSword");
	public static Item infusedDragonPickaxe = new RioVPickaxe(InfusedDragon, true).setUnlocalizedName("infused.dragonPickaxe");
	public static Item infusedDragonAxe = new RioVAxe(InfusedDragon, true).setUnlocalizedName("infused.dragonAxe");
	public static Item infusedDragonShovel = new RioVSpade(InfusedDragon, true).setUnlocalizedName("infused.dragonShovel");
	public static Item enforcedBowOfWurTun = (new ItemEnforcedBowOfWurTun()).setUnlocalizedName("enforcedbowOfWurTun");
	public static Item blindonite = (new RioVItem()).setUnlocalizedName("blindonite");
	public static Item blindOasisActivator = (new RioVActivators()).setUnlocalizedName("blindOasisActivator");
	public static Item tefHelmet = (new RioVArmor(FlameArmorMaterial, render, 0, "tef", false)).setUnlocalizedName("tefHelmet");
	public static Item tefChestplate = (new RioVArmor(FlameArmorMaterial, render, 1, "tef", false)).setUnlocalizedName("tefChestplate");
	public static Item tefLeggings = (new RioVArmor(FlameArmorMaterial, render, 2, "tef", false)).setUnlocalizedName("tefLeggings");
	public static Item tefBoots = (new RioVArmor(FlameArmorMaterial, render, 3, "tef", false)).setUnlocalizedName("tefBoots");
	public static Item tefCrystal = (new RioVSummoners()).setUnlocalizedName("tefCrystal");
	public static Item vaerynActivator = (new RioVActivators()).setUnlocalizedName("vaerynActivator");
	public static Item glimmerwoodSticks = (new RioVItem()).setUnlocalizedName("glimmerwoodSticks");
	public static Item glimmerwoodPickaxe = (new RioVPickaxe(Glimmerwood, false)).setUnlocalizedName("glimmerwoodPickaxe");
	public static Item glimmerwoodAxe = (new RioVAxe(Glimmerwood, false)).setUnlocalizedName("glimmerwoodAxe");
	public static Item glimmerwoodShovel = (new RioVSpade(Glimmerwood, false)).setUnlocalizedName("glimmerwoodShovel");
	public static Item glimmerwoodSword = (new RioVWeapon(Glimmerwood, false)).setUnlocalizedName("glimmerwoodSword");
	public static Item blueMagicApple = (new RioVConsumable(8, 2, true)).setUnlocalizedName("blueApple");
	public static Item vraviniteBow = (new RioVBow(Vravinite.getMaxUses())).setUnlocalizedName("vraviniteBow");
	public static Item vraviniteArrow = (new RioVItem()).setUnlocalizedName("vraviniteArrow");
	public static Item vravinite = (new RioVItem()).setUnlocalizedName("vravinite");
	public static Item vraviniteHelmet = (new RioVArmor(VraviniteArmorMaterial, render, 0, "vravinite", false)).setUnlocalizedName("vraviniteHelmet");
	public static Item vraviniteChestplate = (new RioVArmor(VraviniteArmorMaterial, render, 1, "vravinite", false))
			.setUnlocalizedName("vraviniteChestplate");
	public static Item vraviniteLeggings = (new RioVArmor(VraviniteArmorMaterial, render, 2, "vravinite", false))
			.setUnlocalizedName("vraviniteLeggings");
	public static Item vraviniteBoots = (new RioVArmor(VraviniteArmorMaterial, render, 3, "vravinite", false)).setUnlocalizedName("vraviniteBoots");
	public static Item vravinitePickaxe = (new RioVPickaxe(Vravinite, false)).setUnlocalizedName("vravinitePickaxe");
	public static Item vraviniteAxe = (new RioVAxe(Vravinite, false)).setUnlocalizedName("vraviniteAxe");
	public static Item vraviniteShovel = (new RioVSpade(Vravinite, false)).setUnlocalizedName("vraviniteShovel");
	public static Item vraviniteSword = (new RioVWeapon(Vravinite, false)).setUnlocalizedName("vraviniteSword");
	public static Item glimmerwoodDoorItem = (new RioVDoor(Material.wood)).setUnlocalizedName("glimmerwoodDoorItem");
	public static Item flamonorActivator = (new RioVActivators()).setUnlocalizedName("flamonorActivator");
	public static Item drakiuz = (new RioVItem()).setUnlocalizedName("drakiuz");
	public static Item fireballWand = (new RioVWand(0, 1, 4)).setUnlocalizedName("fireballWand");
	public static Item cherryBlossomDoorItem = (new RioVDoor(Material.wood)).setUnlocalizedName("cherryBlossomDoorItem");
	public static Item cherryBlossomSticks = (new RioVItem()).setUnlocalizedName("cherryBlossomSticks");
	public static Item cherryBlossomPickaxe = (new RioVPickaxe(CherryBlossom, false)).setUnlocalizedName("cherryBlossomPickaxe");
	public static Item cherryBlossomAxe = (new RioVAxe(CherryBlossom, false)).setUnlocalizedName("cherryBlossomAxe");
	public static Item cherryBlossomShovel = (new RioVSpade(CherryBlossom, false)).setUnlocalizedName("cherryBlossomShovel");
	public static Item cherryBlossomSword = (new RioVWeapon(CherryBlossom, false)).setUnlocalizedName("cherryBlossomSword");
	public static Item potionGlassSanctuatite = (new RioVPotions(RioVBlocks.sanctuatiteMoving)).setUnlocalizedName("potionGlassSanctuatite");
	public static Item sanctuatiteActivator = (new RioVActivators()).setUnlocalizedName("sanctuatiteActivator");
	public static Item skywoodDoorItem = (new RioVDoor(Material.wood)).setUnlocalizedName("skywoodDoorItem");
	public static Item bloodDoorItem = (new RioVDoor(Material.wood)).setUnlocalizedName("bloodDoorItem");
	public static Item skywoodSticks = (new RioVItem()).setUnlocalizedName("skywoodSticks");
	public static Item skywoodPickaxe = (new RioVPickaxe(ToolMaterial.STONE, false)).setUnlocalizedName("skywoodPickaxe");
	public static Item skywoodAxe = (new RioVAxe(ToolMaterial.STONE, false)).setUnlocalizedName("skywoodAxe");
	public static Item skywoodShovel = (new RioVSpade(ToolMaterial.STONE, false)).setUnlocalizedName("skywoodShovel");
	public static Item skywoodSword = (new RioVWeapon(ToolMaterial.STONE, false)).setUnlocalizedName("skywoodSword");
	public static Item bloodSticks = (new RioVItem()).setUnlocalizedName("bloodSticks");
	public static Item bloodPickaxe = (new RioVPickaxe(ToolMaterial.WOOD, false)).setUnlocalizedName("bloodPickaxe");
	public static Item bloodAxe = (new RioVAxe(ToolMaterial.WOOD, false)).setUnlocalizedName("bloodAxe");
	public static Item bloodShovel = (new RioVSpade(ToolMaterial.WOOD, false)).setUnlocalizedName("bloodShovel");
	public static Item bloodSword = (new RioVWeapon(ToolMaterial.WOOD, false)).setUnlocalizedName("bloodSword");
	public static Item sanctuaryStonePickaxe = (new RioVPickaxe(ToolMaterial.IRON, false)).setUnlocalizedName("sanctuaryStonePickaxe");
	public static Item sanctuaryStoneAxe = (new RioVAxe(ToolMaterial.IRON, false)).setUnlocalizedName("sanctuaryStoneAxe");
	public static Item sanctuaryStoneShovel = (new RioVSpade(ToolMaterial.IRON, false)).setUnlocalizedName("sanctuaryStoneShovel");
	public static Item sanctuaryStoneSword = (new RioVWeapon(ToolMaterial.IRON, false)).setUnlocalizedName("sanctuaryStoneSword");
	public static Item aleris = (new RioVItem()).setUnlocalizedName("aleris");
	public static Item alerisHelmet = (new RioVArmor(AlerisArmorMaterial, render, 0, "aleris", false)).setUnlocalizedName("alerisHelmet");
	public static Item alerisChestplate = (new RioVArmor(AlerisArmorMaterial, render, 1, "aleris", false)).setUnlocalizedName("alerisChestplate");
	public static Item alerisLeggings = (new RioVArmor(AlerisArmorMaterial, render, 2, "aleris", false)).setUnlocalizedName("alerisLeggings");
	public static Item alerisBoots = (new RioVArmor(AlerisArmorMaterial, render, 3, "aleris", false)).setUnlocalizedName("alerisBoots");
	public static Item alerisPickaxe = (new RioVPickaxe(Aleris, false)).setUnlocalizedName("alerisPickaxe");
	public static Item alerisAxe = (new RioVAxe(Aleris, false)).setUnlocalizedName("alerisAxe");
	public static Item alerisShovel = (new RioVSpade(Aleris, false)).setUnlocalizedName("alerisShovel");
	public static Item alerisSword = (new RioVWeapon(Aleris, false)).setUnlocalizedName("alerisSword");
	public static Item infusedVraviniteHelmet = (new RioVArmor(InfusedVraviniteArmorMaterial, render, 0, "vravinite", true))
			.setUnlocalizedName("infused.vraviniteHelmet");
	public static Item infusedVraviniteChestplate = (new RioVArmor(InfusedVraviniteArmorMaterial, render, 1, "vravinite", true))
			.setUnlocalizedName("infused.vraviniteChestplate");
	public static Item infusedVraviniteLeggings = (new RioVArmor(InfusedVraviniteArmorMaterial, render, 2, "vravinite", true))
			.setUnlocalizedName("infused.vraviniteLeggings");
	public static Item infusedVraviniteBoots = (new RioVArmor(InfusedVraviniteArmorMaterial, render, 3, "vravinite", true))
			.setUnlocalizedName("infused.vraviniteBoots");
	public static Item infusedVravinitePickaxe = (new RioVPickaxe(InfusedVravinite, true)).setUnlocalizedName("infused.vravinitePickaxe");
	public static Item infusedVraviniteAxe = (new RioVAxe(InfusedVravinite, true)).setUnlocalizedName("infused.vraviniteAxe");
	public static Item infusedVraviniteShovel = (new RioVSpade(InfusedVravinite, true)).setUnlocalizedName("infused.vraviniteShovel");
	public static Item infusedVraviniteSword = (new RioVWeapon(InfusedVravinite, true)).setUnlocalizedName("infused.vraviniteSword");
	public static Item voidHolder = (new RioVVoidHolder(Blocks.air)).setUnlocalizedName("voidHolder");
	public static Item voidHolderFilled = (new RioVVoidHolder(RioVBlocks.voidMoving)).setUnlocalizedName("voidHolderFilled");
	public static Item berry = (new RioVConsumable(4, 2, false)).setUnlocalizedName("berry");
	public static Item blackBerry = (new RioVConsumable(4, 2, false)).setUnlocalizedName("blackBerry");
	public static Item jaavik = (new RioVItem()).setUnlocalizedName("jaavik");
	public static Item raspBerry = (new RioVConsumable(3, 2, false)).setUnlocalizedName("raspBerry");
	public static Item bloodBerry = (new RioVConsumable(6, 2, false)).setUnlocalizedName("bloodBerry");
	public static Item strawberry = (new RioVConsumable(3, 2, false)).setUnlocalizedName("strawBerry");
	public static Item chain = (new RioVItem()).setUnlocalizedName("chain");
	public static Item smallBag = (new RioVBag()).setUnlocalizedName("smallBag");
	public static Item mediumBag = (new RioVBag()).setUnlocalizedName("mediumBag");
	public static Item largeBag = (new RioVBag()).setUnlocalizedName("largeBag");
	public static Item sheenBag = (new RioVBag()).setUnlocalizedName("sheenBag");
	public static Item heart = (new RioVItem()).setUnlocalizedName("heart");
	public static Item supremeAunTunHelmet = (new RioVArmor(SupremeAunTunArmorMaterial, render, 0, "auntunminion", true))
			.setUnlocalizedName("supreme.auntunMinionHelmet");
	public static Item supremeAunTunChestplate = (new RioVArmor(SupremeAunTunArmorMaterial, render, 1, "auntunminion", true))
			.setUnlocalizedName("supremeAunTunChestplate");
	public static Item supremeAunTunLeggings = (new RioVArmor(SupremeAunTunArmorMaterial, render, 2, "auntunminion", true))
			.setUnlocalizedName("supreme.auntunMinionLeggings");
	public static Item supremeAunTunBoots = (new RioVArmor(SupremeAunTunArmorMaterial, render, 3, "auntunminion", true))
			.setUnlocalizedName("supreme.auntunMinionBoots");
	public static Item ultraAxeOfAunTun = (new RioVWeapon(UltraAxeOfAunTun, true)).setUnlocalizedName("ultra.axeOfAunTun");
	public static Item paladinHelmet = (new RioVArmor(FlameArmorMaterial, render, 0, "paladin", false)).setUnlocalizedName("paladinHelmet");
	public static Item paladinChestplate = (new RioVArmor(FlameArmorMaterial, render, 1, "paladin", false)).setUnlocalizedName("paladinChestplate");
	public static Item paladinLeggings = (new RioVArmor(FlameArmorMaterial, render, 2, "paladin", false)).setUnlocalizedName("paladinLeggings");
	public static Item paladinBoots = (new RioVArmor(FlameArmorMaterial, render, 3, "paladin", false)).setUnlocalizedName("paladinBoots");
	public static Item paladinLongsword = (new RioVWeapon(InfusedOnyx, false)).setUnlocalizedName("paladinLongsword");
	public static Item graviWand = (new RioVWand(0, 1, 3)).setUnlocalizedName("graviWand");
	public static Item eosPotion = (new RioVDrinkable(0, 2, true)).setAlwaysEdible().setUnlocalizedName("eosPotion");
	public static Item fakeBloodberry = (new RioVConsumable(-5, 2, false)).setUnlocalizedName("fakeBloodberry");
	public static Item glimmerBerry = (new RioVConsumable(2, 2, false)).setUnlocalizedName("glimmerBerry");
	public static Item elderBerry = (new RioVConsumable(5, 2, false)).setUnlocalizedName("elderBerry");
	public static Item enderBerry = (new RioVConsumable(3, 2, false)).setUnlocalizedName("enderBerry");
	public static Item cloudBerry = (new RioVConsumable(4, 2, false)).setUnlocalizedName("cloudBerry");
	public static Item fireBerry = (new RioVConsumable(2, 2, false)).setUnlocalizedName("fireBerry");
	public static Item sanctuatiteBerry = (new RioVConsumable(7, 6, false)).setUnlocalizedName("sanctuatiteBerry");
	public static Item glowingSwordOfTiTun = (new RioVWeapon(UltraAxeOfAunTun, true)).setUnlocalizedName("glowingSwordOfTiTun");;
	public static Item tiTunHelmet = (new RioVArmor(SupremeAunTunArmorMaterial, render, 0, "tiTun", true)).setUnlocalizedName("tiTunHelmet");
	public static Item tiTunChestplate = (new RioVArmor(SupremeAunTunArmorMaterial, render, 1, "tiTun", true)).setUnlocalizedName("tiTunChestplate");
	public static Item tiTunLeggings = (new RioVArmor(SupremeAunTunArmorMaterial, render, 2, "tiTun", true)).setUnlocalizedName("tiTunLeggings");
	public static Item tiTunBoots = (new RioVArmor(SupremeAunTunArmorMaterial, render, 3, "tiTun", true)).setUnlocalizedName("tiTunBoots");
	public static Item elfCrystal = (new RioVItem()).setUnlocalizedName("elfCrystal");
	public static Item altruSoul = (new RioVItem()).setUnlocalizedName("altruSoul");
	public static Item woodElfKingCrystal = (new RioVSummoners()).setUnlocalizedName("woodElfKingCrystal");
	public static Item altruCrystal = (new RioVSummoners()).setUnlocalizedName("altruCrystal");
	public static Item tiTunSummoner = (new RioVSummoners()).setUnlocalizedName("tiTunSummoner");
	public static Item infusedAlerisHelmet = (new RioVArmor(InfusedAlerisArmorMaterial, render, 0, "aleris", true))
			.setUnlocalizedName("infused.alerisHelmet");
	public static Item infusedAlerisChestplate = (new RioVArmor(InfusedAlerisArmorMaterial, render, 1, "aleris", true))
			.setUnlocalizedName("infused.alerisChestplate");
	public static Item infusedAlerisLeggings = (new RioVArmor(InfusedAlerisArmorMaterial, render, 2, "aleris", true))
			.setUnlocalizedName("infused.alerisLeggings");
	public static Item infusedAlerisBoots = (new RioVArmor(InfusedAlerisArmorMaterial, render, 3, "aleris", true))
			.setUnlocalizedName("infused.alerisBoots");
	public static Item infusedAlerisPickaxe = (new RioVPickaxe(InfusedAleris, true)).setUnlocalizedName("infused.alerisPickaxe");
	public static Item infusedAlerisAxe = (new RioVAxe(InfusedAleris, true)).setUnlocalizedName("infused.alerisAxe");
	public static Item infusedAlerisShovel = (new RioVSpade(InfusedAleris, true)).setUnlocalizedName("infused.alerisShovel");
	public static Item infusedAlerisSword = (new RioVWeapon(InfusedAleris, true)).setUnlocalizedName("infused.alerisSword");
	public static Item shadowniteIngot = (new RioVItem()).setUnlocalizedName("shadowniteIngot");
	public static Item shadowniteWand = (new RioVWand(0, 1, 3)).setUnlocalizedName("shadowniteWand");
	public static Item shadowniteHelmet = (new RioVArmor(ShadowniteArmorMaterial, render, 0, "shadownite", false))
			.setUnlocalizedName("shadowniteHelmet");
	public static Item shadowniteChestplate = (new RioVArmor(ShadowniteArmorMaterial, render, 1, "shadownite", false))
			.setUnlocalizedName("shadowniteChestplate");
	public static Item shadowniteLeggings = (new RioVArmor(ShadowniteArmorMaterial, render, 2, "shadownite", false))
			.setUnlocalizedName("shadowniteLeggings");
	public static Item shadowniteBoots = (new RioVArmor(ShadowniteArmorMaterial, render, 3, "shadownite", false))
			.setUnlocalizedName("shadowniteBoots");
	public static Item shadownitePickaxe = (new RioVPickaxe(Shadownite, false)).setUnlocalizedName("shadownitePickaxe");
	public static Item shadowniteAxe = (new RioVAxe(Shadownite, false)).setUnlocalizedName("shadowniteAxe");
	public static Item shadowniteShovel = (new RioVSpade(Shadownite, false)).setUnlocalizedName("shadowniteShovel");
	public static Item shadowniteSword = (new RioVWeapon(Shadownite, false)).setUnlocalizedName("shadowniteSword");
	public static Item infusedShadowniteHelmet = (new RioVArmor(InfusedShadowniteArmorMaterial, render, 0, "shadownite", true))
			.setUnlocalizedName("infused.shadowniteHelmet");
	public static Item infusedShadowniteChestplate = (new RioVArmor(InfusedShadowniteArmorMaterial, render, 1, "shadownite", true))
			.setUnlocalizedName("infused.shadowniteChestplate");
	public static Item infusedShadowniteLeggings = (new RioVArmor(InfusedShadowniteArmorMaterial, render, 2, "shadownite", true))
			.setUnlocalizedName("infused.shadowniteLeggings");
	public static Item infusedShadowniteBoots = (new RioVArmor(InfusedShadowniteArmorMaterial, render, 3, "shadownite", true))
			.setUnlocalizedName("infused.shadowniteBoots");
	public static Item infusedShadownitePickaxe = (new RioVPickaxe(InfusedShadownite, true)).setUnlocalizedName("infused.shadownitePickaxe");
	public static Item infusedShadowniteAxe = (new RioVAxe(InfusedShadownite, true)).setUnlocalizedName("infused.shadowniteAxe");
	public static Item infusedShadowniteShovel = (new RioVSpade(InfusedShadownite, true)).setUnlocalizedName("infused.shadowniteShovel");
	public static Item infusedShadowniteSword = (new RioVWeapon(InfusedShadownite, true)).setUnlocalizedName("infused.shadowniteSword");
	public static Item guideBook = new ItemGuideBook().setUnlocalizedName("guideBook");
	
	public static void add(){
		RioVAPIUtil.registerItem(guideBook, "Guide Book");
		RioVAPIUtil.registerItem(infusedShadownitePickaxe, "Infused Shadownite Pickaxe");
		RioVAPIUtil.registerItem(infusedShadowniteAxe, "Infused Shadownite Axe");
		RioVAPIUtil.registerItem(infusedShadowniteShovel, "Infused Shadownite Shovel");
		RioVAPIUtil.registerItem(infusedShadowniteSword, "Infused Shadownite Sword");
		RioVAPIUtil.registerItem(infusedShadowniteHelmet, "Infused Shadownite Helmet");
		RioVAPIUtil.registerItem(infusedShadowniteChestplate, "Infused Shadownite Chestplate");
		RioVAPIUtil.registerItem(infusedShadowniteLeggings, "Infused Shadownite Leggings");
		RioVAPIUtil.registerItem(infusedShadowniteBoots, "Infused Shadownite Boots");
		RioVAPIUtil.registerItem(shadownitePickaxe, "Shadownite Pickaxe");
		RioVAPIUtil.registerItem(shadowniteAxe, "Shadownite Axe");
		RioVAPIUtil.registerItem(shadowniteShovel, "Shadownite Shovel");
		RioVAPIUtil.registerItem(shadowniteSword, "Shadownite Sword");
		RioVAPIUtil.registerItem(shadowniteHelmet, "Shadownite Helmet");
		RioVAPIUtil.registerItem(shadowniteChestplate, "Shadownite Chestplate");
		RioVAPIUtil.registerItem(shadowniteLeggings, "Shadownite Leggings");
		RioVAPIUtil.registerItem(shadowniteBoots, "Shadownite Boots");
		RioVAPIUtil.registerItem(shadowniteWand, "Shadownite Wand");
		RioVAPIUtil.registerItem(shadowniteIngot, "Shadownite Ingot");
		RioVAPIUtil.registerItem(infusedAlerisPickaxe, "Infused Aleris Pickaxe");
		RioVAPIUtil.registerItem(infusedAlerisAxe, "Infused Aleris Axe");
		RioVAPIUtil.registerItem(infusedAlerisShovel, "Infused Aleris Shovel");
		RioVAPIUtil.registerItem(infusedAlerisSword, "Infused Aleris Sword");
		RioVAPIUtil.registerItem(infusedAlerisHelmet, "Infused Aleris Helmet");
		RioVAPIUtil.registerItem(infusedAlerisChestplate, "Infused Aleris Chestplate");
		RioVAPIUtil.registerItem(infusedAlerisLeggings, "Infused Aleris Leggings");
		RioVAPIUtil.registerItem(infusedAlerisBoots, "Infused Aleris Boots");
		RioVAPIUtil.registerItem(tiTunSummoner, "Ti'Tun Summoner");
		RioVAPIUtil.registerItem(altruCrystal, "Altru Crystal");
		RioVAPIUtil.registerItem(woodElfKingCrystal, "Wood Elf King Crystal");
		RioVAPIUtil.registerItem(altruSoul, "Altru Soul");
		RioVAPIUtil.registerItem(elfCrystal, "Elf Crystal");
		RioVAPIUtil.registerItem(tiTunHelmet, "Ti'Tun Helmet");
		RioVAPIUtil.registerItem(tiTunChestplate, "Ti'Tun Chestplate");
		RioVAPIUtil.registerItem(tiTunLeggings, "Ti'Tun Leggings");
		RioVAPIUtil.registerItem(tiTunBoots, "Ti'Tun Boots");
		RioVAPIUtil.registerItem(glowingSwordOfTiTun, "Glowing Sword of Ti'Tun");
		RioVAPIUtil.registerItem(chain, "Chain");
		RioVAPIUtil.registerItem(glimmerBerry, "Glimmerberry");
		RioVAPIUtil.registerItem(elderBerry, "Elderberry");
		RioVAPIUtil.registerItem(enderBerry, "Enderberry");
		RioVAPIUtil.registerItem(cloudBerry, "Cloudberry");
		RioVAPIUtil.registerItem(fireBerry, "Fireberry");
		RioVAPIUtil.registerItem(sanctuatiteBerry, "Sanctuatite Berry");
		RioVAPIUtil.registerItem(fakeBloodberry, "Fake Bloodberry");
		RioVAPIUtil.registerItem(eosPotion, "Eos Potion");
		RioVAPIUtil.registerItem(graviWand, "Gravi Wand");
		RioVAPIUtil.registerItem(paladinHelmet, "Paladin Helmet");
		RioVAPIUtil.registerItem(paladinChestplate, "Paladin Chestplate");
		RioVAPIUtil.registerItem(paladinLeggings, "Paladin Leggings");
		RioVAPIUtil.registerItem(paladinBoots, "Paladin Boots");
		RioVAPIUtil.registerItem(paladinLongsword, "Paladin Longsword");
		RioVAPIUtil.registerItem(supremeAunTunHelmet, "Supreme Aun'Tun Helmet");
		RioVAPIUtil.registerItem(supremeAunTunChestplate, "Supreme Aun'Tun Chestplate");
		RioVAPIUtil.registerItem(supremeAunTunLeggings, "Supreme Aun'Tun Leggings");
		RioVAPIUtil.registerItem(supremeAunTunBoots, "Supreme Aun'Tun Boots");
		RioVAPIUtil.registerItem(heart, "Heart");
		RioVAPIUtil.registerItem(ultraAxeOfAunTun, "Ultra Axe of Aun'Tun");
		RioVAPIUtil.registerItem(sheenBag, "Sheen's Bag");
		RioVAPIUtil.registerItem(largeBag, "Large Bag");
		RioVAPIUtil.registerItem(mediumBag, "Medium Bag");
		RioVAPIUtil.registerItem(smallBag, "Small Bag");
		RioVAPIUtil.registerItem(blackBerry, "Blackberry");
		RioVAPIUtil.registerItem(raspBerry, "Raspberry");
		RioVAPIUtil.registerItem(bloodBerry, "Bloodberry");
		RioVAPIUtil.registerItem(strawberry, "Strawberry");
		RioVAPIUtil.registerItem(jaavik, "Jaavik");
		RioVAPIUtil.registerItem(berry, "Berry");
		RioVAPIUtil.registerItem(voidHolderFilled, "Void Liquid Holder Filled");
		RioVAPIUtil.registerItem(voidHolder, "Void Liquid Holder");
		RioVAPIUtil.registerItem(infusedVraviniteHelmet, "Infused Vravinite Helmet");
		RioVAPIUtil.registerItem(infusedVraviniteChestplate, "Infused Vravinite Chestplate");
		RioVAPIUtil.registerItem(infusedVraviniteLeggings, "Infused Vravinite Leggings");
		RioVAPIUtil.registerItem(infusedVraviniteBoots, "Infused Vravinite Boots");
		RioVAPIUtil.registerItem(infusedVravinitePickaxe, "Infused Vravinite Pickaxe");
		RioVAPIUtil.registerItem(infusedVraviniteAxe, "Infused Vravinite Axe");
		RioVAPIUtil.registerItem(infusedVraviniteShovel, "Infused Vravinite Shovel");
		RioVAPIUtil.registerItem(infusedVraviniteSword, "Infused Vravinite Sword");
		RioVAPIUtil.registerItem(alerisPickaxe, "Aleris Pickaxe");
		RioVAPIUtil.registerItem(alerisAxe, "Aleris Axe");
		RioVAPIUtil.registerItem(alerisShovel, "Aleris Shovel");
		RioVAPIUtil.registerItem(alerisSword, "Aleris Sword");
		RioVAPIUtil.registerItem(alerisHelmet, "Aleris Helmet");
		RioVAPIUtil.registerItem(alerisChestplate, "Aleris Chestplate");
		RioVAPIUtil.registerItem(alerisLeggings, "Aleris Leggings");
		RioVAPIUtil.registerItem(alerisBoots, "Aleris Boots");
		RioVAPIUtil.registerItem(aleris, "Aleris");
		RioVAPIUtil.registerItem(sanctuaryStonePickaxe, "Sanctuary Stone Pickaxe");
		RioVAPIUtil.registerItem(sanctuaryStoneAxe, "Sanctuary Stone Axe");
		RioVAPIUtil.registerItem(sanctuaryStoneShovel, "Sanctuary Stone Shovel");
		RioVAPIUtil.registerItem(sanctuaryStoneSword, "Sanctuary Stone Sword");
		RioVAPIUtil.registerItem(skywoodPickaxe, "Skywood Pickaxe");
		RioVAPIUtil.registerItem(skywoodAxe, "Skywood Axe");
		RioVAPIUtil.registerItem(skywoodShovel, "Skywood Shovel");
		RioVAPIUtil.registerItem(skywoodSword, "Skywood Sword");
		RioVAPIUtil.registerItem(skywoodSticks, "Skywood Sticks");
		RioVAPIUtil.registerItem(bloodPickaxe, "Blood Pickaxe");
		RioVAPIUtil.registerItem(bloodAxe, "Blood Axe");
		RioVAPIUtil.registerItem(bloodShovel, "Blood Shovel");
		RioVAPIUtil.registerItem(bloodSword, "Blood Sword");
		RioVAPIUtil.registerItem(bloodSticks, "Blood Sticks");
		RioVAPIUtil.registerItem(skywoodDoorItem, "Skywood Door");
		RioVAPIUtil.registerItem(bloodDoorItem, "Blood Door");
		RioVAPIUtil.registerItem(sanctuatiteActivator, "Sanctuatite Activator");
		RioVAPIUtil.registerItem(potionGlassSanctuatite, "Sanctuatite Potion");
		RioVAPIUtil.registerItem(cherryBlossomDoorItem, "Cherry Blossom Door");
		RioVAPIUtil.registerItem(cherryBlossomPickaxe, "Cherry Blossom Pickaxe");
		RioVAPIUtil.registerItem(cherryBlossomAxe, "Cherry Blossom Axe");
		RioVAPIUtil.registerItem(cherryBlossomShovel, "Cherry Blossom Shovel");
		RioVAPIUtil.registerItem(cherryBlossomSword, "Cherry Blossom Sword");
		RioVAPIUtil.registerItem(cherryBlossomSticks, "Cherry Blossom Sticks");
		RioVAPIUtil.registerItem(fireballWand, "Fireball Wand");
		RioVAPIUtil.registerItem(drakiuz, "Drakiuz");
		RioVAPIUtil.registerItem(flamonorActivator, "Flamonor Activator");
		RioVAPIUtil.registerItem(glimmerwoodDoorItem, "Glimmerwood Door");
		RioVAPIUtil.registerItem(vraviniteHelmet, "Vravinite Helmet");
		RioVAPIUtil.registerItem(vraviniteChestplate, "Vravinite Chestplate");
		RioVAPIUtil.registerItem(vraviniteLeggings, "Vravinite Leggings");
		RioVAPIUtil.registerItem(vraviniteBoots, "Vravinite Boots");
		RioVAPIUtil.registerItem(vravinitePickaxe, "Vravinite Pickaxe");
		RioVAPIUtil.registerItem(vraviniteAxe, "Vravinite Axe");
		RioVAPIUtil.registerItem(vraviniteShovel, "Vravinite Shovel");
		RioVAPIUtil.registerItem(vraviniteSword, "Vravinite Sword");
		RioVAPIUtil.registerItem(vravinite, "Vravinite");
		RioVAPIUtil.registerItem(vraviniteArrow, "Vravinite Arrow");
		RioVAPIUtil.registerItem(vraviniteBow, "Vravinite Bow");
		RioVAPIUtil.registerItem(blueMagicApple, "Magical Blue Apple");
		RioVAPIUtil.registerItem(glimmerwoodPickaxe, "Glimmerwood Pickaxe");
		RioVAPIUtil.registerItem(glimmerwoodAxe, "Glimmerwood Axe");
		RioVAPIUtil.registerItem(glimmerwoodShovel, "Glimmerwood Shovel");
		RioVAPIUtil.registerItem(glimmerwoodSword, "Glimmerwood Sword");
		RioVAPIUtil.registerItem(glimmerwoodSticks, "Glimmerwood Sticks");
		RioVAPIUtil.registerItem(vaerynActivator, "Vaeryn Activator");
		RioVAPIUtil.registerItem(tefCrystal, "Tef Crystal");
		RioVAPIUtil.registerItem(tefHelmet, "Tef's Legendary Helmet");
		RioVAPIUtil.registerItem(tefChestplate, "Tef's Legendary Chestplate");
		RioVAPIUtil.registerItem(tefLeggings, "Tef's Legendary Leggings");
		RioVAPIUtil.registerItem(tefBoots, "Tef's Legendary Boots");
		RioVAPIUtil.registerItem(blindOasisActivator, "Blind Oasis Activator");
		RioVAPIUtil.registerItem(blindonite, "Blindonite");
		RioVAPIUtil.registerItem(enforcedBowOfWurTun, "Enforced Bow Of Wur-Tun");
		RioVAPIUtil.registerItem(helmetOfFlame, "Helmet of Flame");
		RioVAPIUtil.registerItem(chestplateOfFlame, "Chestplate of Flame");
		RioVAPIUtil.registerItem(leggingsOfFlame, "Leggings of Flame");
		RioVAPIUtil.registerItem(bootsOfFlame, "Boots of Flame");
		RioVAPIUtil.registerItem(ingotOfFlame, "Ingot of Flame");
		RioVAPIUtil.registerItem(purpleFeather, "Purple Feather");
		RioVAPIUtil.registerItem(clothOfMagic, "Cloth of Magic");
		RioVAPIUtil.registerItem(swordOfFlame, "Sword of Flame");
		RioVAPIUtil.registerItem(theDarknessCrystal, "Crystal of Darkness");
		RioVAPIUtil.registerItem(magickaHelmet, "Hood of Magic");
		RioVAPIUtil.registerItem(magickaChestplate, "Robe of Magic");
		RioVAPIUtil.registerItem(magickaLeggings, "Leggings of Magic");
		RioVAPIUtil.registerItem(magickaBoots, "Boots of Magic");
		RioVAPIUtil.registerItem(cherry, "Cherry");
		RioVAPIUtil.registerItem(manchet, "Manchet");
		RioVAPIUtil.registerItem(pepper, "Pepper");
		RioVAPIUtil.registerItem(pepperSpices, "Pepper Spices");
		RioVAPIUtil.registerItem(spicedWine, "Spiced Wine");
		RioVAPIUtil.registerItem(greenApple, "Green Apple");
		RioVAPIUtil.registerItem(wine, "Wine");
		RioVAPIUtil.registerItem(grapes, "Grapes");
		RioVAPIUtil.registerItem(potionGlass, "Potion Glass");
		RioVAPIUtil.registerItem(wineGlass, "Wine Glass");
		RioVAPIUtil.registerItem(cookedHorseMeat, "Cooked Horse Meat");
		RioVAPIUtil.registerItem(horseMeat, "Horse Meat");
		RioVAPIUtil.registerItem(tomato, "Tomato");
		RioVAPIUtil.registerItem(khuulisScythe, "Khuuli's Scythe");
		RioVAPIUtil.registerItem(blackDurii, "Black Durii");
		RioVAPIUtil.registerItem(auntunSummoner, "Aun'Tun Summoner");
		RioVAPIUtil.registerItem(vulron, "Vulron");
		RioVAPIUtil.registerItem(bowOfWurTun, "Bow of Wur-Tun");
		RioVAPIUtil.registerItem(darknessArrow, "Arrow of Darkness");
		RioVAPIUtil.registerItem(daetoriSword, "Daetori's Sword");
		RioVAPIUtil.registerItem(sorrowSword, "Sorrow Sword");
		RioVAPIUtil.registerItem(axeOfAunTun, "Axe of Aun'Tun");
		RioVAPIUtil.registerItem(halfFusedAxeOfAunTun, "Half Fused Axe of Aun'Tun");
		RioVAPIUtil.registerItem(unfusedAxeOfAunTun, "Unfused Axe of Aun'Tun");
		RioVAPIUtil.registerItem(blackBone, "Black Bone");
		RioVAPIUtil.registerItem(amethyst, "Amethyst");
		RioVAPIUtil.registerItem(onyx, "Onyx");
		RioVAPIUtil.registerItem(slateFragment, "Slate Fragment");
		RioVAPIUtil.registerItem(orb, "Orb");
		RioVAPIUtil.registerItem(nironite, "Nironite");
		RioVAPIUtil.registerItem(agonite, "Agonite");
		RioVAPIUtil.registerItem(terronCrystal, "Terron Crystal");
		RioVAPIUtil.registerItem(baseCrystal, "Base Crystal");
		RioVAPIUtil.registerItem(infusedAmethystShovel, "Infused Amethyst Shovel");
		RioVAPIUtil.registerItem(infusedAmethystPickaxe, "Infused Amethyst Pickaxe");
		RioVAPIUtil.registerItem(infusedAmethystAxe, "Infused Amethyst Axe");
		RioVAPIUtil.registerItem(infusedOnyxShovel, "Infused Onyx Shovel");
		RioVAPIUtil.registerItem(infusedOnyxPickaxe, "Infused Onyx Pickaxe");
		RioVAPIUtil.registerItem(infusedOnyxAxe, "Infused Onyx Axe");
		RioVAPIUtil.registerItem(auntunHelmet, "Aun'Tun Minion Helmet");
		RioVAPIUtil.registerItem(auntunChestplate, "Aun'Tun Minion Chestplate");
		RioVAPIUtil.registerItem(auntunLeggings, "Aun'Tun Minion Leggings");
		RioVAPIUtil.registerItem(auntunBoots, "Aun'Tun Minion Boots");
		RioVAPIUtil.registerItem(onyxHelmet, "Onyx Helmet");
		RioVAPIUtil.registerItem(onyxChestplate, "Onyx Chestplate");
		RioVAPIUtil.registerItem(onyxLeggings, "Onyx Leggings");
		RioVAPIUtil.registerItem(onyxBoots, "Onyx Boots");
		RioVAPIUtil.registerItem(amethystHelmet, "Amethyst Helmet");
		RioVAPIUtil.registerItem(amethystChestplate, "Amethyst Chestplate");
		RioVAPIUtil.registerItem(amethystLeggings, "Amethyst Leggings");
		RioVAPIUtil.registerItem(amethystBoots, "Amethyst Boots");
		RioVAPIUtil.registerItem(infusedOnyxHelmet, "Infused Onyx Helmet");
		RioVAPIUtil.registerItem(infusedOnyxChestplate, "Infused Onyx Chestplate");
		RioVAPIUtil.registerItem(infusedOnyxLeggings, "Infused Onyx Leggings");
		RioVAPIUtil.registerItem(infusedOnyxBoots, "Infused Onyx Boots");
		RioVAPIUtil.registerItem(infusedAmethystHelmet, "Infused Amethyst Helmet");
		RioVAPIUtil.registerItem(infusedAmethystChestplate, "Infused Amethyst Chestplate");
		RioVAPIUtil.registerItem(infusedAmethystLeggings, "Infused Amethyst Leggings");
		RioVAPIUtil.registerItem(infusedAmethystBoots, "Infused Amethyst Boots");
		RioVAPIUtil.registerItem(amethystPickaxe, "Amethyst Pickaxe");
		RioVAPIUtil.registerItem(amethystAxe, "Amethyst Axe");
		RioVAPIUtil.registerItem(amethystShovel, "Amethyst Shovel");
		RioVAPIUtil.registerItem(amethystSword, "Amethyst Sword");
		RioVAPIUtil.registerItem(infusedAmethystSword, "Infused Amethyst Sword");
		RioVAPIUtil.registerItem(onyxSword, "Onyx Sword");
		RioVAPIUtil.registerItem(infusedOnyxSword, "Infused Onyx Sword");
		RioVAPIUtil.registerItem(onyxPickaxe, "Onyx Pickaxe");
		RioVAPIUtil.registerItem(agonitePickaxe, "Agonite Pickaxe");
		RioVAPIUtil.registerItem(onyxAxe, "Onyx Axe");
		RioVAPIUtil.registerItem(onyxShovel, "Onyx Shovel");
		RioVAPIUtil.registerItem(mythrilHelmet, "Mythril Helmet");
		RioVAPIUtil.registerItem(mythrilChestplate, "Mythril Chestplate");
		RioVAPIUtil.registerItem(mythrilLeggings, "Mythril Leggings");
		RioVAPIUtil.registerItem(mythrilBoots, "Mythril Boots");
		RioVAPIUtil.registerItem(darkMatter, "Dark Matter");
		RioVAPIUtil.registerItem(ambrosia, "Ambrosia");
		RioVAPIUtil.registerItem(mythrilIngot, "Mythril Ingot");
		RioVAPIUtil.registerItem(burnedQuartz, "Black Quartz");
		RioVAPIUtil.registerItem(dragonSword, "Dragon Sword");
		RioVAPIUtil.registerItem(dragonSoul, "Dragon Soul Gem");
		RioVAPIUtil.registerItem(demonAngelCrystal, "Demon Angel Crystal");
		RioVAPIUtil.registerItem(dragonHelmet, "Dragon Helmet");
		RioVAPIUtil.registerItem(dragonChestplate, "Dragon Chestplate");
		RioVAPIUtil.registerItem(dragonLeggings, "Dragon Leggings");
		RioVAPIUtil.registerItem(dragonBoots, "Dragon Boots");
		RioVAPIUtil.registerItem(dragonPickaxe, "Dragon Pickaxe");
		RioVAPIUtil.registerItem(dragonAxe, "Dragon Axe");
		RioVAPIUtil.registerItem(dragonShovel, "Dragon Shovel");
		RioVAPIUtil.registerItem(infusedDragonHelmet, "Infused Dragon Helmet");
		RioVAPIUtil.registerItem(infusedDragonChestplate, "Infused Dragon Chestplate");
		RioVAPIUtil.registerItem(infusedDragonLeggings, "Infused Dragon Leggings");
		RioVAPIUtil.registerItem(infusedDragonBoots, "Infused Dragon Boots");
		RioVAPIUtil.registerItem(infusedDragonPickaxe, "Infused Dragon Pickaxe");
		RioVAPIUtil.registerItem(infusedDragonAxe, "Infused Dragon Axe");
		RioVAPIUtil.registerItem(infusedDragonShovel, "Infused Dragon Shovel");
		RioVAPIUtil.registerItem(infusedDragonSword, "Infused Dragon Sword");
		RioVAPIUtil.registerItem(bonyiumIngot, "Bonyium Ingot");
	}
	
	public static Item infusedBloodwoodPickaxe;
	public static Item infusedBloodwoodAxe;
	public static Item infusedBloodwoodShovel;
	public static Item infusedBloodwoodSword;
	public static Item infusedGhostwoodSword;
	public static Item infusedGhostwoodPickaxe;
	public static Item infusedGhostwoodShovel;
	public static Item infusedGhostwoodAxe;
	public static Item infusedDarkwoodSword;
	public static Item infusedDarkwoodPickaxe;
	public static Item infusedDarkwoodShovel;
	public static Item infusedDarkwoodAxe;
	public static Item infusedFusewoodSword;
	public static Item infusedFusewoodPickaxe;
	public static Item infusedFusewoodShovel;
	public static Item infusedFusewoodAxe;
	public static Item infusedNetherquartzSword;
	public static Item infusedNetherquartzPickaxe;
	public static Item infusedNetherquartzShovel;
	public static Item infusedNetherquartzAxe;
	
	public static void addNatura(){
		if(RioVAPI.getInstance().natura){
			ToolMaterial InfusedBloodwood = EnumHelper.addToolMaterial("InfusedBloodwood", 3, 450, 8.0F, 4.0F, 25);
			ToolMaterial InfusedGhostwood = EnumHelper.addToolMaterial("InfusedGhostwood", 1, 159, 3.0F, 1.0F, 16);
			ToolMaterial InfusedDarkwood = EnumHelper.addToolMaterial("InfusedDarkwood", 2, 231, 5.0F, 2.0F, 6);
			
			infusedBloodwoodPickaxe = (new RioVPickaxe(InfusedBloodwood, true)).setUnlocalizedName("Natura:bloodwood_pickaxe");
			infusedBloodwoodAxe = (new RioVAxe(InfusedBloodwood, true)).setUnlocalizedName("Natura:bloodwood_hatchet");
			infusedBloodwoodShovel = (new RioVSpade(InfusedBloodwood, true)).setUnlocalizedName("Natura:bloodwood_shovel");
			infusedBloodwoodSword = (new RioVWeapon(InfusedBloodwood, true)).setUnlocalizedName("Natura:bloodwood_sword");
			infusedGhostwoodPickaxe = (new RioVPickaxe(InfusedGhostwood, true)).setUnlocalizedName("Natura:ghostwood_pickaxe");
			infusedGhostwoodAxe = (new RioVAxe(InfusedGhostwood, true)).setUnlocalizedName("Natura:ghostwood_hatchet");
			infusedGhostwoodShovel = (new RioVSpade(InfusedGhostwood, true)).setUnlocalizedName("Natura:ghostwood_shovel");
			infusedGhostwoodSword = (new RioVWeapon(InfusedGhostwood, true)).setUnlocalizedName("Natura:ghostwood_sword");
			infusedDarkwoodPickaxe = (new RioVPickaxe(InfusedDarkwood, true)).setUnlocalizedName("Natura:darkwood_pickaxe");
			infusedDarkwoodAxe = (new RioVAxe(InfusedDarkwood, true)).setUnlocalizedName("Natura:darkwood_hatchet");
			infusedDarkwoodShovel = (new RioVSpade(InfusedDarkwood, true)).setUnlocalizedName("Natura:darkwood_shovel");
			infusedDarkwoodSword = (new RioVWeapon(InfusedDarkwood, true)).setUnlocalizedName("Natura:darkwood_sword");
			infusedFusewoodPickaxe = (new RioVPickaxe(ToolMaterial.IRON, true)).setUnlocalizedName("Natura:fusewood_pickaxe");
			infusedFusewoodAxe = (new RioVAxe(ToolMaterial.IRON, true)).setUnlocalizedName("Natura:fusewood_hatchet");
			infusedFusewoodShovel = (new RioVSpade(ToolMaterial.IRON, true)).setUnlocalizedName("Natura:fusewood_shovel");
			infusedFusewoodSword = (new RioVWeapon(ToolMaterial.IRON, true)).setUnlocalizedName("Natura:fusewood_sword");
			infusedNetherquartzPickaxe = (new RioVPickaxe(ToolMaterial.STONE, true)).setUnlocalizedName("Natura:netherquartz_pickaxe");
			infusedNetherquartzAxe = (new RioVAxe(ToolMaterial.STONE, true)).setUnlocalizedName("Natura:netherquartz_hatchet");
			infusedNetherquartzShovel = (new RioVSpade(ToolMaterial.STONE, true)).setUnlocalizedName("Natura:netherquartz_shovel");
			infusedNetherquartzSword = (new RioVWeapon(ToolMaterial.STONE, true)).setUnlocalizedName("Natura:netherquartz_sword");
			
			RioVAPIUtil.registerItem(infusedFusewoodPickaxe, "Infused Fusewood Pickaxe");
			RioVAPIUtil.registerItem(infusedFusewoodAxe, "Infused Fusewood Axe");
			RioVAPIUtil.registerItem(infusedFusewoodShovel, "Infused Fusewood Shovel");
			RioVAPIUtil.registerItem(infusedFusewoodSword, "Infused Fusewood Sword");
			RioVAPIUtil.registerItem(infusedNetherquartzPickaxe, "Infused Netherquartz Pickaxe");
			RioVAPIUtil.registerItem(infusedNetherquartzAxe, "Infused Netherquartz Axe");
			RioVAPIUtil.registerItem(infusedNetherquartzShovel, "Infused Netherquartz Shovel");
			RioVAPIUtil.registerItem(infusedNetherquartzSword, "Infused Netherquartz Sword");
			RioVAPIUtil.registerItem(infusedBloodwoodPickaxe, "Infused Bloodwood Pickaxe");
			RioVAPIUtil.registerItem(infusedBloodwoodAxe, "Infused Bloodwood Axe");
			RioVAPIUtil.registerItem(infusedBloodwoodShovel, "Infused Bloodwood Shovel");
			RioVAPIUtil.registerItem(infusedBloodwoodSword, "Infused Bloodwood Sword");
			RioVAPIUtil.registerItem(infusedGhostwoodPickaxe, "Infused Ghostwood Pickaxe");
			RioVAPIUtil.registerItem(infusedGhostwoodAxe, "Infused Ghostwood Axe");
			RioVAPIUtil.registerItem(infusedGhostwoodShovel, "Infused Ghostwood Shovel");
			RioVAPIUtil.registerItem(infusedGhostwoodSword, "Infused Ghostwood Sword");
			RioVAPIUtil.registerItem(infusedDarkwoodPickaxe, "Infused Darkwood Pickaxe");
			RioVAPIUtil.registerItem(infusedDarkwoodAxe, "Infused Darkwood Axe");
			RioVAPIUtil.registerItem(infusedDarkwoodShovel, "Infused Darkwood Shovel");
			RioVAPIUtil.registerItem(infusedDarkwoodSword, "Infused Darkwood Sword");
		}
	}
	
	public static Item amethystRing;
	public static Item onyxRing;
	public static Item infusedAmethystRing;
	public static Item infusedOnyxRing;
	public static Item dragonRing;
	public static Item infusedDragonRing;
	public static Item vraviniteRing;
	public static Item infusedVraviniteRing;
	public static Item alerisRing;
	public static Item infusedAlerisRing;
	public static Item shadowniteRing;
	public static Item infusedShadowniteRing;
	public static String[] ring = new String[] {" X ", "X X", " X "};
	
	public static void addBaubles(){
		if(RioVAPI.getInstance().baubles){
			amethystRing = (new RioVRing((int) 1.3, false)).setUnlocalizedName("amethystRing");
			onyxRing = (new RioVRing((int) 1.3, false)).setUnlocalizedName("onyxRing");
			infusedAmethystRing = (new RioVRing((int) 1.3, true)).setUnlocalizedName("infused.amethystRing");
			infusedOnyxRing = (new RioVRing((int) 1.4, true)).setUnlocalizedName("infused.onyxRing");
			dragonRing = (new RioVRing((int) 2.4, false)).setUnlocalizedName("dragonRing");
			infusedDragonRing = (new RioVRing((int) 2.6, true)).setUnlocalizedName("infused.dragonRing");
			vraviniteRing = (new RioVRing((int) 2.7, false)).setUnlocalizedName("vraviniteRing");
			infusedVraviniteRing = (new RioVRing((int) 3.1, true)).setUnlocalizedName("infused.vraviniteRing");
			alerisRing = (new RioVRing((int) 3.5, false)).setUnlocalizedName("alerisRing");
			infusedAlerisRing = (new RioVRing((int) 3.9, true)).setUnlocalizedName("infused.alerisRing");
			shadowniteRing = (new RioVRing((int) 3.5, false)).setUnlocalizedName("shadowniteRing");
			infusedShadowniteRing = (new RioVRing((int) 3.9, true)).setUnlocalizedName("infused.shadowniteRing");
			
			RioVAPIUtil.registerItem(amethystRing, "Amethyst Ring");
			RioVAPIUtil.registerItem(onyxRing, "Onyx Ring");
			RioVAPIUtil.registerItem(infusedAmethystRing, "Infused Amethyst Ring");
			RioVAPIUtil.registerItem(infusedOnyxRing, "Infused Onyx Ring");
			RioVAPIUtil.registerItem(dragonRing, "Dragon Ring");
			RioVAPIUtil.registerItem(infusedDragonRing, "Infused Dragon Ring");
			RioVAPIUtil.registerItem(vraviniteRing, "Vravinite Ring");
			RioVAPIUtil.registerItem(infusedVraviniteRing, "Infused Vravinite Ring");
			RioVAPIUtil.registerItem(alerisRing, "Aleris Ring");
			RioVAPIUtil.registerItem(infusedAlerisRing, "Infused Aleris Ring");
			RioVAPIUtil.registerItem(shadowniteRing, "Shadownite Ring");
			RioVAPIUtil.registerItem(infusedShadowniteRing, "Infused Shadownite Ring");
			
			RioVAPI.getInstance().getCraftingManager()
					.addRecipe(new ItemStack(RioVItems.amethystRing, 1), ring, Character.valueOf('X'), RioVItems.amethyst);
			RioVAPI.getInstance().getCraftingManager().addRecipe(new ItemStack(RioVItems.onyxRing, 1), ring, Character.valueOf('X'), RioVItems.onyx);
			RioVAPI.getInstance().getCraftingManager()
					.addRecipe(new ItemStack(RioVItems.dragonRing, 1), ring, Character.valueOf('X'), RioVItems.dragonSoul);
			RioVAPI.getInstance().getCraftingManager()
					.addRecipe(new ItemStack(RioVItems.vraviniteRing, 1), ring, Character.valueOf('X'), RioVItems.vravinite);
			RioVAPI.getInstance().getCraftingManager()
					.addRecipe(new ItemStack(RioVItems.alerisRing, 1), ring, Character.valueOf('X'), RioVItems.aleris);
			RioVAPI.getInstance().getCraftingManager()
					.addRecipe(new ItemStack(RioVItems.shadowniteRing, 1), ring, Character.valueOf('X'), RioVItems.shadowniteIngot);
			RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.amethystRing, new ItemStack(RioVItems.infusedAmethystRing, 1));
			RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.onyxRing, new ItemStack(RioVItems.infusedOnyxRing, 1));
			RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.dragonRing, new ItemStack(RioVItems.infusedDragonRing, 1));
			RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.vraviniteRing, new ItemStack(RioVItems.infusedVraviniteRing, 1));
			RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.alerisRing, new ItemStack(RioVItems.infusedAlerisRing, 1));
			RioVAPI.getInstance().getInfuser().addInfusion(RioVItems.shadowniteRing, new ItemStack(RioVItems.infusedShadowniteRing, 1));
		}
	}
}