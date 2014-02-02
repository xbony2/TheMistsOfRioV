package sheenrox82.RioV.src.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRioVTallGrass extends BlockFlower
{
	@SideOnly(Side.CLIENT)
	public IIcon blockIcon;
	
	public BlockRioVTallGrass()
	{
		super(0);
		this.func_149647_a(null);
	}

	@Override
	protected boolean func_149854_a(Block p_149854_1_)
    {
		return p_149854_1_ == RioVBlocks.sanctuatiteGrass;
	}

	@Override
	public IIcon func_149691_a(int p_149691_1_, int p_149691_2_)
    {
		return this.blockIcon;
	}

	@Override
	public void func_149651_a(IIconRegister i)
	{
		this.blockIcon = i.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.func_149739_a()));
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return -1;
	}

}
