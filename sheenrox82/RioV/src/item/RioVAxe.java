package sheenrox82.RioV.src.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.util.Color;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RioVAxe extends ItemAxe
{
	public boolean isInfused;

	public RioVAxe(ToolMaterial par2EnumToolMaterial, boolean par2)
	{
		super(par2EnumToolMaterial);
		this.isInfused = par2;
		this.setCreativeTab(TheMistsOfRioV.getInstance().tab);
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
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		if(this == RioVItems.onyxAxe || this == RioVItems.infusedOnyxAxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "onyxAxe");
		}
		if(this == RioVItems.amethystAxe || this == RioVItems.infusedAmethystAxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "amethystAxe");
		}
		if(this == RioVItems.dragonAxe || this == RioVItems.infusedDragonAxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "dragonAxe");
		}
		if(this == RioVItems.glimmerwoodAxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "glimmerwoodAxe");
		}
		if(this == RioVItems.vraviniteAxe || this == RioVItems.infusedVraviniteAxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "vraviniteAxe");
		}
		if(this == RioVItems.blindoniteAxe || this == RioVItems.infusedBlindoniteAxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "blindoniteAxe");
		}
		if(this == RioVItems.cherryBlossomAxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "cherryBlossomAxe");
		}
		if(this == RioVItems.bloodAxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "bloodAxe");
		}
		if(this == RioVItems.skywoodAxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "skywoodAxe");
		}
		if(this == RioVItems.sanctuaryStoneAxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "sanctuaryStoneAxe");
		}
		if(this == RioVItems.alerisAxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "alerisAxe");
		}
		if(TheMistsOfRioV.getInstance().natura)
		{
			if(this == RioVItems.infusedBloodwoodAxe || this == RioVItems.infusedGhostwoodAxe || this == RioVItems.infusedDarkwoodAxe || this == RioVItems.infusedFusewoodAxe || this == RioVItems.infusedNetherquartzAxe)
				this.itemIcon = par1IconRegister.registerIcon(MethodUtil.getName(this.getUnlocalizedName()));
		}
		
		if(TheMistsOfRioV.getInstance().aether)
		{
			if(this == RioVItems.infusedSkyrootAxe) this.itemIcon = par1IconRegister.registerIcon("Aether:Skyroot Axe");	
			if(this == RioVItems.infusedHolystoneAxe) this.itemIcon = par1IconRegister.registerIcon("Aether:Holystone Axe");	
			if(this == RioVItems.infusedZaniteAxe) this.itemIcon = par1IconRegister.registerIcon("Aether:Zanite Axe");	
			if(this == RioVItems.infusedGravititeAxe) this.itemIcon = par1IconRegister.registerIcon("Aether:Gravitite Axe");	
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		if(Config.showToolInfo)
		{
			var3.add(Color.GOLD + (var1.getMaxDamage() - var1.getItemDamage()) + " Uses");
			var3.add(Color.DARK_PURPLE + "Axing Speed: " + toolMaterial.getEfficiencyOnProperMaterial());
			var3.add(Color.AQUA + "Harvest Level: " + toolMaterial.getHarvestLevel());
		}
	}
}
