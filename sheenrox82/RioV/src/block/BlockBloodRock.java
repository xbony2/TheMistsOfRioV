package sheenrox82.RioV.src.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBloodRock extends Block
{
	public Random rand = new Random();
	@SideOnly(Side.CLIENT)
	public IIcon blockIcon;
	
	public BlockBloodRock()
	{
		super(Material.field_151576_e);
		this.func_149647_a(TheMistsOfRioV.getInstance().tab);
	}

	@Override
	public void func_149670_a(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_)
	{
		p_149670_5_.setFire(2);
	}

	@Override
	public boolean func_149686_d()
	{
		return false;
	}

	@Override
	public boolean func_149662_c()
	{
		return false;
	}

	@Override
	public AxisAlignedBB func_149668_a(World par1, int par2, int par3, int par4)
    {
		float f = 0.0625F;
		return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2 + f), (double)par3, (double)((float)par4 + f), (double)((float)(par2 + 1) - f), (double)((float)(par3 + 1) - f), (double)((float)(par4 + 1) - f));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void func_149651_a(IIconRegister par1IconRegister)
	{
		blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.func_149739_a()));
	} 
}
