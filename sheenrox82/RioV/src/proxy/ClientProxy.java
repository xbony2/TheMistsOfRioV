package sheenrox82.RioV.src.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityAdv;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityAltruEssence;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityAngel;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityGalokin;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityOrc;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityWoodElf;
import sheenrox82.RioV.src.entity.mob.jaerin.boss.EntityAltru;
import sheenrox82.RioV.src.entity.mob.jaerin.boss.EntityWoodElfKing;
import sheenrox82.RioV.src.entity.mob.neutral.EntityDove;
import sheenrox82.RioV.src.entity.mob.neutral.EntityFairy;
import sheenrox82.RioV.src.entity.mob.neutral.EntityMage;
import sheenrox82.RioV.src.entity.mob.neutral.EntityNizonian;
import sheenrox82.RioV.src.entity.mob.neutral.EntityPaladin;
import sheenrox82.RioV.src.entity.mob.neutral.EntityRabbit;
import sheenrox82.RioV.src.entity.mob.neutral.EntityVravinite;
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
import sheenrox82.RioV.src.entity.projectile.EntityDarkMatter;
import sheenrox82.RioV.src.entity.projectile.EntityDarknessArrow;
import sheenrox82.RioV.src.entity.projectile.EntityPinkEssence;
import sheenrox82.RioV.src.entity.projectile.EntityVraviniteArrow;
import sheenrox82.RioV.src.gui.hud.GuiBootsHud;
import sheenrox82.RioV.src.gui.hud.GuiChestplateHud;
import sheenrox82.RioV.src.gui.hud.GuiEosBar;
import sheenrox82.RioV.src.gui.hud.GuiHelmetHud;
import sheenrox82.RioV.src.gui.hud.GuiLeggingsHud;
import sheenrox82.RioV.src.gui.hud.GuiToolHud;
import sheenrox82.RioV.src.lib.RioVLib;
import sheenrox82.RioV.src.model.ModelDemonAngel;
import sheenrox82.RioV.src.model.ModelDragonWings;
import sheenrox82.RioV.src.model.ModelHellhound;
import sheenrox82.RioV.src.model.ModelTerron;
import sheenrox82.RioV.src.render.RenderAltru;
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
import sheenrox82.RioV.src.render.RenderTef;
import sheenrox82.RioV.src.render.RenderWoodElfKing;
import sheenrox82.RioV.src.render.item.ItemRenderBow;
import sheenrox82.RioV.src.render.item.ItemRenderJaerinFlag;
import sheenrox82.RioV.src.render.item.ItemRenderLongbow;
import sheenrox82.RioV.src.render.item.ItemRenderNoFactionFlag;
import sheenrox82.RioV.src.render.item.ItemRenderRaetiinFlag;
import sheenrox82.RioV.src.render.projectile.RenderDarkMatter;
import sheenrox82.RioV.src.render.projectile.RenderDarknessArrow;
import sheenrox82.RioV.src.render.projectile.RenderPinkEssence;
import sheenrox82.RioV.src.render.projectile.RenderVraviniteArrow;
import sheenrox82.RioV.src.render.tileentity.RenderTileEntityInfuser;
import sheenrox82.RioV.src.render.tileentity.RenderTileEntityJaerinFlag;
import sheenrox82.RioV.src.render.tileentity.RenderTileEntityNoFactionFlag;
import sheenrox82.RioV.src.render.tileentity.RenderTileEntityRaetiinFlag;
import sheenrox82.RioV.src.tileentity.TileEntityInfuser;
import sheenrox82.RioV.src.tileentity.TileEntityJaerinFlag;
import sheenrox82.RioV.src.tileentity.TileEntityNoFactionFlag;
import sheenrox82.RioV.src.tileentity.TileEntityRaetiinFlag;
import sheenrox82.RioV.src.util.Util;

import com.jadarstudios.developercapes.DevCapes;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy 
{	
	private static final ModelDragonWings dragonWings = new ModelDragonWings(1.0F);
	
	@Override
	public void init() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityMage.class, new RenderBipedCore(RioVLib.mage));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkeletalHorse.class, new RenderSkeletalHorse());
		RenderingRegistry.registerEntityRenderingHandler(EntityAunTunBodyguard.class, new RenderBipedCore(RioVLib.auntun));
		RenderingRegistry.registerEntityRenderingHandler(EntityAdv.class, new RenderBipedCore(RioVLib.adventurer));
		RenderingRegistry.registerEntityRenderingHandler(EntityTerron.class, new RenderBossCore(new ModelTerron(), 0.5F, 1.8F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDemonAngel.class, new RenderBossCore(new ModelDemonAngel(), 0.5F, 2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkElf.class, new RenderBipedCore(RioVLib.dark_elf));
		RenderingRegistry.registerEntityRenderingHandler(EntityAunTun.class, new RenderAunTun());
		RenderingRegistry.registerEntityRenderingHandler(EntityAltruEssence.class, new RenderEssence());
		RenderingRegistry.registerEntityRenderingHandler(EntityNizonian.class, new RenderLivingCore(new ModelTerron(), 0.5F, 1.5F, 1.5F, 1.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGalokin.class, new RenderBipedCore(RioVLib.galokin));
		RenderingRegistry.registerEntityRenderingHandler(EntityOrc.class, new RenderOrc());
		RenderingRegistry.registerEntityRenderingHandler(EntityFairy.class, new RenderFairy());
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkEssence.class, new RenderDarkEssence());
		RenderingRegistry.registerEntityRenderingHandler(EntityHellhound.class, new RenderLivingCore(new ModelHellhound(), 0.6F, 1.5F, 1.5F, 1.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityWoodElf.class, new RenderBipedCore(RioVLib.wood_elf));
		RenderingRegistry.registerEntityRenderingHandler(EntityTef.class, new RenderTef());
		RenderingRegistry.registerEntityRenderingHandler(EntityTefGuard.class, new RenderBipedCore(RioVLib.essence));
		RenderingRegistry.registerEntityRenderingHandler(EntityShadow.class, new RenderBipedCore(RioVLib.shadow));
		RenderingRegistry.registerEntityRenderingHandler(EntityVravinite.class, new RenderBipedCore(RioVLib.vravinite));
		RenderingRegistry.registerEntityRenderingHandler(EntityDove.class, new RenderDove());
		RenderingRegistry.registerEntityRenderingHandler(EntityAngel.class, new RenderAngel());
		RenderingRegistry.registerEntityRenderingHandler(EntityRabbit.class, new RenderRabbit());
		RenderingRegistry.registerEntityRenderingHandler(EntitySoverianOfficer.class, new RenderBipedCore(RioVLib.officer));
		RenderingRegistry.registerEntityRenderingHandler(EntityPaladin.class, new RenderPaladin());
		RenderingRegistry.registerEntityRenderingHandler(EntityPinkEssence.class, new RenderPinkEssence(new ResourceLocation(Util.MOD_ID + ":" + "pinkEssence.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkMatter.class, new RenderDarkMatter(new ResourceLocation(Util.MOD_ID + ":" + "darkMatter.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityAunTunMinion.class, new RenderBipedCore(RioVLib.auntun));
		RenderingRegistry.registerEntityRenderingHandler(EntityBloodGhoul.class, new RenderBipedCore(RioVLib.blood_ghoul));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarknessArrow.class, new RenderDarknessArrow(RioVLib.darkness_arrow));
		RenderingRegistry.registerEntityRenderingHandler(EntityVraviniteArrow.class, new RenderVraviniteArrow(RioVLib.vravinite_arrow));
		RenderingRegistry.registerEntityRenderingHandler(EntityWoodElfKing.class, new RenderWoodElfKing());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNoFactionFlag.class, new RenderTileEntityNoFactionFlag());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRaetiinFlag.class, new RenderTileEntityRaetiinFlag());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJaerinFlag.class, new RenderTileEntityJaerinFlag());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityInfuser.class, new RenderTileEntityInfuser());
		RenderingRegistry.registerEntityRenderingHandler(EntityAltru.class, new RenderAltru());
		MinecraftForge.EVENT_BUS.register(new GuiEosBar(Minecraft.getMinecraft()));
		
		if(RioVAPI.getInstance().getUtil().getConfigBool("toolHud") == true)
		{
			MinecraftForge.EVENT_BUS.register(new GuiToolHud(Minecraft.getMinecraft()));
			MinecraftForge.EVENT_BUS.register(new GuiHelmetHud(Minecraft.getMinecraft()));
			MinecraftForge.EVENT_BUS.register(new GuiChestplateHud(Minecraft.getMinecraft()));
			MinecraftForge.EVENT_BUS.register(new GuiLeggingsHud(Minecraft.getMinecraft()));
			MinecraftForge.EVENT_BUS.register(new GuiBootsHud(Minecraft.getMinecraft()));
		}

		RioVAPI.getInstance().getLogger().info("HUD elements registered.");
	}

	@Override
	public void registerItemRenderers()
	{
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RioVBlocks.noFacFlag), new ItemRenderNoFactionFlag());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RioVBlocks.raetiinFlag), new ItemRenderRaetiinFlag());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RioVBlocks.jaerinFlag), new ItemRenderJaerinFlag());

		MinecraftForgeClient.registerItemRenderer(RioVItems.bowOfWurTun, new ItemRenderBow());
		MinecraftForgeClient.registerItemRenderer(RioVItems.enforcedBowOfWurTun, new ItemRenderBow());
		MinecraftForgeClient.registerItemRenderer(RioVItems.vraviniteBow, new ItemRenderLongbow());
	}

	@Override
	public void cape()
	{
		if(RioVAPI.getInstance().getUtil().getConfigBool("runCapes") == true)
		{
			DevCapes.getInstance().registerConfig("https://dl.dropbox.com/u/126631367/RioVCapes.json");
		}
		else
		{

		}
	}

	public static int addArmor(String armorName)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armorName);
	}

	@Override
	public ModelBiped getArmorModel(int id)
	{
		switch (id) {
		case 0:
			return dragonWings;
		default:
			break;
		}
		return dragonWings;
	}
}