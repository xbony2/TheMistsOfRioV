package sheenrox82.RioV.src.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.util.Color;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RioVPickaxe extends ItemPickaxe
{
	public boolean isInfused;
	public RioVPickaxe(ToolMaterial par2EnumToolMaterial, boolean par2)
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
	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		if (var1.getItem() == RioVItems.agonitePickaxe)
		{
			var3.add("Used to mine Nironite/Dragon/Vravinite Ore");
		}

		if(Config.showToolInfo)
		{
			var3.add(Color.GOLD + (var1.getMaxDamage() - var1.getItemDamage()) + " Uses");
			var3.add(Color.DARK_PURPLE + "Mining Speed: " + toolMaterial.getEfficiencyOnProperMaterial());
			var3.add(Color.AQUA + "Harvest Level: " + toolMaterial.getHarvestLevel());
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		if(this == RioVItems.onyxPickaxe || this == RioVItems.infusedOnyxPickaxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "onyxPickaxe");
		}
		if(this == RioVItems.amethystPickaxe || this == RioVItems.infusedAmethystPickaxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "amethystPickaxe");
		}
		if(this == RioVItems.agonitePickaxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "agonitePickaxe");
		}
		if(this == RioVItems.dragonPickaxe || this == RioVItems.infusedDragonPickaxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "dragonPickaxe");
		}
		if(this == RioVItems.glimmerwoodPickaxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "glimmerwoodPickaxe");
		}
		if(this == RioVItems.vravinitePickaxe || this == RioVItems.infusedVravinitePickaxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "vravinitePickaxe");
		}
		if(this == RioVItems.blindonitePickaxe || this == RioVItems.infusedBlindonitePickaxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "blindonitePickaxe");
		}
		if(this == RioVItems.cherryBlossomPickaxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "cherryBlossomPickaxe");
		}
		if(this == RioVItems.bloodPickaxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "bloodPickaxe");
		}
		if(this == RioVItems.skywoodPickaxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "skywoodPickaxe");
		}
		if(this == RioVItems.sanctuaryStonePickaxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "sanctuaryStonePickaxe");
		}
		if(this == RioVItems.alerisPickaxe)
		{
			this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "alerisPickaxe");
		}
		if(TheMistsOfRioV.getInstance().natura)
		{
			if(this == RioVItems.infusedBloodwoodPickaxe || this == RioVItems.infusedGhostwoodPickaxe || this == RioVItems.infusedDarkwoodPickaxe || this == RioVItems.infusedFusewoodPickaxe || this == RioVItems.infusedNetherquartzPickaxe)
				this.itemIcon = par1IconRegister.registerIcon(MethodUtil.getName(this.getUnlocalizedName()));
		}

		if(TheMistsOfRioV.getInstance().aether)
		{
			if(this == RioVItems.infusedSkyrootPickaxe) this.itemIcon = par1IconRegister.registerIcon("Aether:Skyroot Pickaxe");
			if(this == RioVItems.infusedHolystonePickaxe) this.itemIcon = par1IconRegister.registerIcon("Aether:Holystone Pickaxe");
			if(this == RioVItems.infusedZanitePickaxe) this.itemIcon = par1IconRegister.registerIcon("Aether:Zanite Pickaxe");
			if(this == RioVItems.infusedGravititePickaxe) this.itemIcon = par1IconRegister.registerIcon("Aether:Gravitite Pickaxe");
		}
	}
}
