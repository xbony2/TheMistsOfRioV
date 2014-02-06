package sheenrox82.RioV.src.block;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;

public class BlockSanctuatiteFlowing extends BlockLiquid
{
	public IIcon blockIcon;
	
	public BlockSanctuatiteFlowing() 
	{
		super(Material.water);
		this.setCreativeTab(null);
	}

	public void func_149651_a(IIconRegister i)
	{
		this.blockIcon = i.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.getUnlocalizedName()));
	}
}
