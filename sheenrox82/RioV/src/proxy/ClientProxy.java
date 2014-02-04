package sheenrox82.RioV.src.proxy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import com.jadarstudios.developercapes.DevCapes;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import sheenrox82.RioV.expansion.bosses.EntityChickenBoss;
import sheenrox82.RioV.expansion.bosses.EntityCowBoss;
import sheenrox82.RioV.expansion.bosses.EntityPigBoss;
import sheenrox82.RioV.expansion.bosses.EntitySheepBoss;
import sheenrox82.RioV.expansion.bosses.ModelSheep1;
import sheenrox82.RioV.expansion.bosses.ModelSheep2;
import sheenrox82.RioV.expansion.bosses.RenderChickenBoss;
import sheenrox82.RioV.expansion.bosses.RenderCowBoss;
import sheenrox82.RioV.expansion.bosses.RenderPigBoss;
import sheenrox82.RioV.expansion.bosses.RenderSheepBoss;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.entity.mob.hostile.EntityAunTun;
import sheenrox82.RioV.src.entity.mob.hostile.EntityAunTunBodyguard;
import sheenrox82.RioV.src.entity.mob.hostile.EntityAunTunMinion;
import sheenrox82.RioV.src.entity.mob.hostile.EntityBloodGhoul;
import sheenrox82.RioV.src.entity.mob.hostile.EntityDarkElf;
import sheenrox82.RioV.src.entity.mob.hostile.EntityDarkEssence;
import sheenrox82.RioV.src.entity.mob.hostile.EntityDemonAngel;
import sheenrox82.RioV.src.entity.mob.hostile.EntityHellhound;
import sheenrox82.RioV.src.entity.mob.hostile.EntityMage;
import sheenrox82.RioV.src.entity.mob.hostile.EntityPaladin;
import sheenrox82.RioV.src.entity.mob.hostile.EntityShadow;
import sheenrox82.RioV.src.entity.mob.hostile.EntityTef;
import sheenrox82.RioV.src.entity.mob.hostile.EntityTefGuard;
import sheenrox82.RioV.src.entity.mob.hostile.EntityTerron;
import sheenrox82.RioV.src.entity.mob.hostile.EntityVravinite;
import sheenrox82.RioV.src.entity.mob.passive.EntityAdv;
import sheenrox82.RioV.src.entity.mob.passive.EntityAltruEssence;
import sheenrox82.RioV.src.entity.mob.passive.EntityAngel;
import sheenrox82.RioV.src.entity.mob.passive.EntityDove;
import sheenrox82.RioV.src.entity.mob.passive.EntityFairy;
import sheenrox82.RioV.src.entity.mob.passive.EntityGalokin;
import sheenrox82.RioV.src.entity.mob.passive.EntityNizonian;
import sheenrox82.RioV.src.entity.mob.passive.EntityOrc;
import sheenrox82.RioV.src.entity.mob.passive.EntityRabbit;
import sheenrox82.RioV.src.entity.mob.passive.EntitySkeletalHorse;
import sheenrox82.RioV.src.entity.mob.passive.EntitySoverianOfficer;
import sheenrox82.RioV.src.entity.mob.passive.EntityTasaravMallor;
import sheenrox82.RioV.src.entity.mob.passive.EntityWoodElf;
import sheenrox82.RioV.src.entity.projectile.EntityDarkMatter;
import sheenrox82.RioV.src.entity.projectile.EntityDarknessArrow;
import sheenrox82.RioV.src.entity.projectile.EntityPinkEssence;
import sheenrox82.RioV.src.entity.projectile.EntityVraviniteArrow;
import sheenrox82.RioV.src.lib.EntityResourceLocation;
import sheenrox82.RioV.src.model.ModelDemonAngel;
import sheenrox82.RioV.src.model.ModelDragonWings;
import sheenrox82.RioV.src.model.ModelHellhound;
import sheenrox82.RioV.src.model.ModelTasaravChestplate;
import sheenrox82.RioV.src.model.ModelTasaravHelmet;
import sheenrox82.RioV.src.model.ModelTerron;
import sheenrox82.RioV.src.render.RenderAngel;
import sheenrox82.RioV.src.render.RenderAunTun;
import sheenrox82.RioV.src.render.RenderBipedCore;
import sheenrox82.RioV.src.render.RenderBossCore;
import sheenrox82.RioV.src.render.RenderDarkEssence;
import sheenrox82.RioV.src.render.RenderDove;
import sheenrox82.RioV.src.render.RenderEssence;
import sheenrox82.RioV.src.render.RenderFairy;
import sheenrox82.RioV.src.render.RenderLivingCore;
import sheenrox82.RioV.src.render.RenderOrc;
import sheenrox82.RioV.src.render.RenderPaladin;
import sheenrox82.RioV.src.render.RenderRabbit;
import sheenrox82.RioV.src.render.RenderSkeletalHorse;
import sheenrox82.RioV.src.render.RenderTasaravMallor;
import sheenrox82.RioV.src.render.RenderTef;
import sheenrox82.RioV.src.render.item.ItemRenderBloodChest;
import sheenrox82.RioV.src.render.item.ItemRenderBow;
import sheenrox82.RioV.src.render.item.ItemRenderCherryBlossomChest;
import sheenrox82.RioV.src.render.item.ItemRenderGlimmerwoodChest;
import sheenrox82.RioV.src.render.item.ItemRenderLongbow;
import sheenrox82.RioV.src.render.item.ItemRenderSkywoodChest;
import sheenrox82.RioV.src.render.projectile.RenderDarkMatter;
import sheenrox82.RioV.src.render.projectile.RenderDarknessArrow;
import sheenrox82.RioV.src.render.projectile.RenderPinkEssence;
import sheenrox82.RioV.src.render.projectile.RenderVraviniteArrow;
import sheenrox82.RioV.src.render.tileentity.RenderTileEntityBloodChest;
import sheenrox82.RioV.src.render.tileentity.RenderTileEntityCherryBlossomChest;
import sheenrox82.RioV.src.render.tileentity.RenderTileEntityFlag;
import sheenrox82.RioV.src.render.tileentity.RenderTileEntityGlimmerwoodChest;
import sheenrox82.RioV.src.render.tileentity.RenderTileEntitySkywoodChest;
import sheenrox82.RioV.src.tileentity.TileEntityBloodChest;
import sheenrox82.RioV.src.tileentity.TileEntityCherryBlossomChest;
import sheenrox82.RioV.src.tileentity.TileEntityFlag;
import sheenrox82.RioV.src.tileentity.TileEntityGlimmerwoodChest;
import sheenrox82.RioV.src.tileentity.TileEntitySkywoodChest;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy 
{	
	private static final ModelDragonWings dragonWings = new ModelDragonWings(1.0F);
	private static final ModelTasaravHelmet tasHelm = new ModelTasaravHelmet(1.0F);
	private static final ModelTasaravChestplate tasChest = new ModelTasaravChestplate(1.0F);

	@Override
	public void init() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityMage.class, new RenderBipedCore(EntityResourceLocation.mage));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkeletalHorse.class, new RenderSkeletalHorse());
		RenderingRegistry.registerEntityRenderingHandler(EntityAunTunBodyguard.class, new RenderBipedCore(EntityResourceLocation.auntun));
		RenderingRegistry.registerEntityRenderingHandler(EntityAdv.class, new RenderBipedCore(EntityResourceLocation.adventurer));
		RenderingRegistry.registerEntityRenderingHandler(EntityTerron.class, new RenderBossCore(new ModelTerron(), 0.5F, 1.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDemonAngel.class, new RenderBossCore(new ModelDemonAngel(), 0.5F, 2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkElf.class, new RenderBipedCore(EntityResourceLocation.dark_elf));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarknessArrow.class, new RenderDarknessArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityAunTun.class, new RenderAunTun());
		RenderingRegistry.registerEntityRenderingHandler(EntityAltruEssence.class, new RenderEssence());
		RenderingRegistry.registerEntityRenderingHandler(EntityNizonian.class, new RenderLivingCore(new ModelTerron(), 0.5F, 0.9F, 0.9F, 0.9F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGalokin.class, new RenderBipedCore(EntityResourceLocation.galokin));
		RenderingRegistry.registerEntityRenderingHandler(EntityOrc.class, new RenderOrc());
		RenderingRegistry.registerEntityRenderingHandler(EntityFairy.class, new RenderFairy());
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkEssence.class, new RenderDarkEssence());
		RenderingRegistry.registerEntityRenderingHandler(EntityHellhound.class, new RenderLivingCore(new ModelHellhound(), 0.6F, 1.5F, 1.5F, 1.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityWoodElf.class, new RenderBipedCore(EntityResourceLocation.wood_elf));
		RenderingRegistry.registerEntityRenderingHandler(EntityTef.class, new RenderTef());
		RenderingRegistry.registerEntityRenderingHandler(EntityTefGuard.class, new RenderBipedCore(EntityResourceLocation.essence));
		RenderingRegistry.registerEntityRenderingHandler(EntityShadow.class, new RenderBipedCore(EntityResourceLocation.shadow));
		RenderingRegistry.registerEntityRenderingHandler(EntityVravinite.class, new RenderBipedCore(EntityResourceLocation.vravinite));
		RenderingRegistry.registerEntityRenderingHandler(EntityDove.class, new RenderDove());
		RenderingRegistry.registerEntityRenderingHandler(EntityAngel.class, new RenderAngel());
		RenderingRegistry.registerEntityRenderingHandler(EntityRabbit.class, new RenderRabbit());
		RenderingRegistry.registerEntityRenderingHandler(EntitySoverianOfficer.class, new RenderBipedCore(EntityResourceLocation.officer));
		RenderingRegistry.registerEntityRenderingHandler(EntityPigBoss.class, new RenderPigBoss());
		RenderingRegistry.registerEntityRenderingHandler(EntityCowBoss.class, new RenderCowBoss());
		RenderingRegistry.registerEntityRenderingHandler(EntityChickenBoss.class, new RenderChickenBoss(new ResourceLocation(Util.MOD_ID + ":" + "textures/entity/ChickenBoss.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityTasaravMallor.class, new RenderTasaravMallor());
		RenderingRegistry.registerEntityRenderingHandler(EntityPaladin.class, new RenderPaladin());
		RenderingRegistry.registerEntityRenderingHandler(EntityPinkEssence.class, new RenderPinkEssence(new ResourceLocation(Util.MOD_ID + ":" + "pinkEssence.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkMatter.class, new RenderDarkMatter(new ResourceLocation(Util.MOD_ID + ":" + "darkMatter.png")));

		if(TheMistsOfRioV.getInstance().bosses)
		{
			RenderingRegistry.registerEntityRenderingHandler(EntityCowBoss.class, new RenderCowBoss());
			RenderingRegistry.registerEntityRenderingHandler(EntitySheepBoss.class, new RenderSheepBoss(new ModelSheep2(), new ModelSheep1()));
			RenderingRegistry.registerEntityRenderingHandler(EntityPigBoss.class, new RenderPigBoss());
			RenderingRegistry.registerEntityRenderingHandler(EntityCowBoss.class, new RenderCowBoss());
		}

		RenderingRegistry.registerEntityRenderingHandler(EntityVraviniteArrow.class, new RenderVraviniteArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityAunTunMinion.class, new RenderBipedCore(EntityResourceLocation.auntun));
		RenderingRegistry.registerEntityRenderingHandler(EntityBloodGhoul.class, new RenderBipedCore(EntityResourceLocation.blood_ghoul));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGlimmerwoodChest.class, new RenderTileEntityGlimmerwoodChest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCherryBlossomChest.class, new RenderTileEntityCherryBlossomChest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySkywoodChest.class, new RenderTileEntitySkywoodChest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBloodChest.class, new RenderTileEntityBloodChest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlag.class, new RenderTileEntityFlag());
	}

	@Override
	public void registerItemRenderers()
	{
		MinecraftForgeClient.registerItemRenderer(Item.func_150898_a(RioVBlocks.glimmerwoodChest), new ItemRenderGlimmerwoodChest());
		MinecraftForgeClient.registerItemRenderer(Item.func_150898_a(RioVBlocks.cherryBlossomChest), new ItemRenderCherryBlossomChest());
		MinecraftForgeClient.registerItemRenderer(Item.func_150898_a(RioVBlocks.bloodChest), new ItemRenderBloodChest());
		MinecraftForgeClient.registerItemRenderer(Item.func_150898_a(RioVBlocks.skywoodChest), new ItemRenderSkywoodChest());
		MinecraftForgeClient.registerItemRenderer(RioVItems.bowOfWurTun, new ItemRenderBow());
		MinecraftForgeClient.registerItemRenderer(RioVItems.enforcedBowOfWurTun, new ItemRenderBow());
		MinecraftForgeClient.registerItemRenderer(RioVItems.vraviniteBow, new ItemRenderLongbow());
	}

	@Override
	public void cape()
	{
		DevCapes.getInstance().registerConfig("https://dl.dropbox.com/u/126631367/RioVCapes.txt", Util.MOD_ID);
	}

	public static int addArmor(String armorName)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armorName);
	}

	@Override
	public ModelBiped getArmorModel(int id){
		switch (id) {
		case 0:
			return dragonWings;
		case 1:
			return tasHelm;
		case 2:
			return tasChest;
		default:
			break;
		}
		return dragonWings;
	}
}