package sheenrox82.RioV.src.api.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
import sheenrox82.RioV.src.api.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCoreOne extends Block
{	
	public BlockCoreOne()
	{
		super(Material.rock);
		this.setCreativeTab(RioVAPI.getInstance().tab);
	}
	
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		if(this == RioVAPI.getInstance().getRioVBlock("onyxOre"))
		{
			return RioVAPI.getInstance().getRioVItem("onyx");
		}
		if(this == RioVAPI.getInstance().getRioVBlock("garnetOre"))
		{
			return RioVAPI.getInstance().getRioVItem("garnet");
		}
		if(this == RioVAPI.getInstance().getRioVBlock("nironiteOre"))
		{
			return RioVAPI.getInstance().getRioVItem("nironite");
		}
		if(this == RioVAPI.getInstance().getRioVBlock("dragonOre"))
		{
			return RioVAPI.getInstance().getRioVItem("dragonSoul");
		}
		if(this == RioVAPI.getInstance().getRioVBlock("netherCrystal"))
		{
			return RioVAPI.getInstance().getRioVItem("burnedQuartz");
		}
		if(this == RioVAPI.getInstance().getRioVBlock("slate"))
		{
			return Item.getItemFromBlock(RioVAPI.getInstance().getRioVBlock("slateCobble"));
		}
		if(this == RioVAPI.getInstance().getRioVBlock("amethystOre"))
		{
			return RioVAPI.getInstance().getRioVItem("amethyst");
		}
		if(this == RioVAPI.getInstance().getRioVBlock("blindoniteOre"))
		{
			return RioVAPI.getInstance().getRioVItem("blindonite");
		}
		if(this == RioVAPI.getInstance().getRioVBlock("vraviniteOre"))
		{
			return RioVAPI.getInstance().getRioVItem("vravinite");
		}
		if(this == RioVAPI.getInstance().getRioVBlock("drakiuzOre"))
		{
			return RioVAPI.getInstance().getRioVItem("drakiuz");
		}
		if(this == RioVAPI.getInstance().getRioVBlock("alerisOre"))
		{
			return RioVAPI.getInstance().getRioVItem("aleris");
		}
		if(this == RioVAPI.getInstance().getRioVBlock("jaavikOre"))
		{
			return RioVAPI.getInstance().getRioVItem("jaavik");
		}

		return Item.getItemFromBlock(this);
	}

	@Override
	public IIcon getIcon(int par1, int par2)
	{
		return this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + RioVAPIUtil.getName(this.getUnlocalizedName()));
	} 

	@Override
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}
}
