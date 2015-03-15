package sheenrox82.RioV.src.block;

import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import sheenrox82.RioV.src.util.Util;

public class BlockVoidFlowing extends BlockDynamicLiquid
{
	public IIcon blockIcon;

	public BlockVoidFlowing() 
	{
		super(Material.water);
		this.setCreativeTab(null);
	}

	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	{
		return blockIcon;
	}

	@Override
	public void registerBlockIcons(IIconRegister i)
	{
		this.blockIcon = i.registerIcon(Util.MOD_ID + ":" + "voidMoving");
	}

}
