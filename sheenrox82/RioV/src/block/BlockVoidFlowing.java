package sheenrox82.RioV.src.block;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import sheenrox82.RioV.src.util.Util;

public class BlockVoidFlowing extends BlockLiquid
{
	public IIcon blockIcon;
	
	public BlockVoidFlowing() 
	{
		super(Material.field_151586_h);
		this.func_149647_a(null);
	}

	public void func_149651_a(IIconRegister i)
	{
		this.blockIcon = i.registerIcon(Util.MOD_ID + ":" + "voidMoving");
	}
	
}
