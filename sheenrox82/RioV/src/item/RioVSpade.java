package sheenrox82.RioV.src.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.util.Color;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RioVSpade extends ItemSpade
{
	public boolean isInfused;

	public RioVSpade(ToolMaterial par2EnumToolMaterial, boolean par2)
	{
		super(par2EnumToolMaterial);
		this.isInfused = par2;
		this.setCreativeTab(TheMistsOfRioV.getInstance().tab);
	}

	public boolean hasEffect(ItemStack par1ItemStack)
	{
		if (isInfused)
		{
			return true;
		}

		return par1ItemStack.isItemEnchanted();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		if(this == RioVItems.onyxShovel || this == RioVItems.infusedOnyxShovel)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "onyxShovel");
		}
		if(this == RioVItems.amethystShovel || this == RioVItems.infusedAmethystShovel)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "amethystShovel");
		}
		if(this == RioVItems.dragonShovel || this == RioVItems.infusedDragonShovel)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "dragonShovel");
		}
		if(this == RioVItems.glimmerwoodShovel)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "glimmerwoodShovel");
		}
		if(this == RioVItems.vraviniteShovel || this == RioVItems.infusedVraviniteShovel)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "vraviniteShovel");
		}
		if(this == RioVItems.blindoniteShovel || this == RioVItems.infusedBlindoniteShovel)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "blindoniteShovel");
		}
		if(this == RioVItems.cherryBlossomShovel)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "cherryBlossomShovel");
		}
		if(this == RioVItems.bloodShovel)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "bloodShovel");
		}
		if(this == RioVItems.skywoodShovel)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "skywoodShovel");
		}
		if(this == RioVItems.sanctuaryStoneShovel)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "sanctuaryStoneShovel");
		}
		if(this == RioVItems.alerisShovel)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "alerisShovel");
		}
		if(TheMistsOfRioV.getInstance().natura)
		{
			if(this == RioVItems.infusedBloodwoodShovel || this == RioVItems.infusedGhostwoodShovel || this == RioVItems.infusedDarkwoodShovel || this == RioVItems.infusedFusewoodShovel || this == RioVItems.infusedNetherquartzShovel)
				this.itemIcon = par1IconRegister.registerIcon(MethodUtil.getName(this.getUnlocalizedName()));
		}

		if(TheMistsOfRioV.getInstance().aether)
		{
			if(this == RioVItems.infusedSkyrootShovel) this.itemIcon = par1IconRegister.registerIcon("Aether:Skyroot Shovel");
			if(this == RioVItems.infusedHolystoneShovel) this.itemIcon = par1IconRegister.registerIcon("Aether:Holystone Shovel");
			if(this == RioVItems.infusedZaniteShovel) this.itemIcon = par1IconRegister.registerIcon("Aether:Zanite Shovel");
			if(this == RioVItems.infusedGravititeShovel) this.itemIcon = par1IconRegister.registerIcon("Aether:Gravitite Shovel");
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		if(Config.showToolInfo)
		{
			var3.add(Color.GOLD + (var1.getMaxDamage() - var1.getItemDamage()) + " Uses");
			var3.add(Color.DARK_PURPLE + "Digging Speed: " + toolMaterial.getEfficiencyOnProperMaterial());
			var3.add(Color.AQUA + "Harvest Level: " + toolMaterial.getHarvestLevel());
		}
	}
}
