package sheenrox82.RioV.src.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBush extends BlockFlower
{	
	@SideOnly(Side.CLIENT)
	public IIcon blockIcon;
	
	public BlockBush()
	{
		super(0);
		this.func_149647_a(null);
		func_149711_c(0.3F);
		float f = 0.375F;
		float f1 = f / 2.0F;
		this.func_149676_a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f, 0.5F + f1);
	}

	@Override
	public Item func_149650_a(int par1, Random par2Random, int par3)
	{
		if(this == RioVBlocks.blueBerryBush)
		{
			return RioVItems.berry;
		}

		if(this == RioVBlocks.blackBerryBush)
		{
			return RioVItems.blackBerry;
		}

		if(this == RioVBlocks.raspBerryBush)
		{
			return RioVItems.raspBerry;
		}

		if(this == RioVBlocks.bloodBerryBush)
		{
			return RioVItems.bloodBerry;
		}

		if(this == RioVBlocks.strawberryBush)
		{
			return RioVItems.strawberry;
		}
		
		return Item.func_150898_a(this);
	}

	@Override
	public void func_149651_a(IIconRegister par1IconRegister)
	{
		if(this == RioVBlocks.paleBush)
		{
			this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "paleLeaf");
		}
		else
		{
			this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.func_149739_a()));
		}
	}

	@Override
	public boolean func_149662_c()
    {
        return false;
    }

    public boolean func_149686_d()
    {
        return false;
    }

	@Override
	public int func_149645_b()
	{
		return 0;
	}

	@Override
	public void func_149664_b(World world, int x, int y, int z, int meta)
	{
		if(this == RioVBlocks.bush)
		{
			world.func_147439_a(x, y, z);
		}
		if(this == RioVBlocks.bloodBerryBush)
		{
			world.func_147446_b(x, y, z, RioVBlocks.paleBush, meta, meta);
		}
		if(this == RioVBlocks.blueBerryBush)
		{
			world.func_147446_b(x, y, z, RioVBlocks.bush, meta, meta);
		}
		if(this == RioVBlocks.blackBerryBush)
		{
			world.func_147446_b(x, y, z, RioVBlocks.bush, meta, meta);
		}
		if(this == RioVBlocks.raspBerryBush)
		{
			world.func_147446_b(x, y, z, RioVBlocks.bush, meta, meta);
		}
		if(this == RioVBlocks.strawberryBush)
		{
			world.func_147446_b(x, y, z, RioVBlocks.bush, meta, meta);
		}
	}

	@Override
	public AxisAlignedBB func_149633_g(World par1World, int par2, int par3, int par4)
	{
		return null;
	}

	@Override
	protected boolean func_149854_a(Block block)
	{
		if(block == RioVBlocks.bloodBerryBush || block == RioVBlocks.paleBush)
		{
			return block == RioVBlocks.bloodDirt || block == RioVBlocks.bloodGrass;
		}
		else
		{
			return block == Blocks.grass || block == Blocks.dirt || block == Blocks.farmland;
		}
	}
}
