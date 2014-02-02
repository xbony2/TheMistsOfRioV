package sheenrox82.RioV.src.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPlantCore extends BlockFlower
{
	public BlockPlantCore()
	{
		super(0);
	}

	@Override
	public Item func_149650_a(int par1, Random par2Random, int par3)
	{
		if(this == RioVBlocks.blackDuriiPlant)
		{
			return RioVItems.blackDurii;
		}
		if(this == RioVBlocks.tomatoPlant)
		{
			return RioVItems.tomato;
		}
		if(this == RioVBlocks.grapePlant)
		{
			return RioVItems.grapes;
		}
		if(this == RioVBlocks.pepperPlant)
		{
			return RioVItems.pepper;
		}
		if(this == RioVBlocks.bloodFlower)
		{
			return RioVItems.heart;
		}

		return Item.func_150898_a(this);
	}

	@SideOnly(Side.CLIENT)
	public IIcon blockIcon;
	
	@Override
	public void func_149651_a(IIconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.func_149739_a()));
	}

	protected boolean func_149854_a(Block par1)
	{		
		if(par1 == RioVBlocks.bloodFlower)
		{
			return par1 == RioVBlocks.bloodGrass;
		}
		
		return par1 == Blocks.grass || par1 == Blocks.dirt || par1 == Blocks.farmland;
	}
}
