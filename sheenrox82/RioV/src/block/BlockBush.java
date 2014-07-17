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
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
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
		this.setCreativeTab(null);
		this.setStepSound(Block.soundTypeGrass);
		this.setHardness(0.3F);
		float f = 0.375F;
		float f1 = f / 2.0F;
		this.setBlockBounds(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f, 0.5F + f1);
	}

	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
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

		return Item.getItemFromBlock(this);
	}
	
	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
		return this.blockIcon;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		if(this == RioVBlocks.paleBush)
		{
			this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "paleLeaf");
		}
		else
		{
			this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + RioVAPIUtil.getName(this.getUnlocalizedName()));
		}
	}

	public boolean isOpaqueCube()
	{
		return false;
	}


	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public int getRenderType()
	{
		return 0;
	}

	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta)
	{
		if(this == RioVBlocks.bush)
		{
			world.setBlockToAir(x, y, z);
		}
		if(this == RioVBlocks.bloodBerryBush)
		{
			world.setBlock(x, y, z, RioVBlocks.paleBush, meta, meta);
		}
		if(this == RioVBlocks.blueBerryBush)
		{
			world.setBlock(x, y, z, RioVBlocks.bush, meta, meta);
		}
		if(this == RioVBlocks.blackBerryBush)
		{
			world.setBlock(x, y, z, RioVBlocks.bush, meta, meta);
		}
		if(this == RioVBlocks.raspBerryBush)
		{
			world.setBlock(x, y, z, RioVBlocks.bush, meta, meta);
		}
		if(this == RioVBlocks.strawberryBush)
		{
			world.setBlock(x, y, z, RioVBlocks.bush, meta, meta);
		}
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		return null;
	}

	@Override
	protected boolean canPlaceBlockOn(Block block)
	{
		if(this == RioVBlocks.bloodBerryBush || this == RioVBlocks.paleBush)
		{
			return block == RioVBlocks.bloodDirt || block == RioVBlocks.bloodGrass;
		}
		else
		{
			return block == Blocks.grass || block == Blocks.dirt || block == Blocks.farmland;
		}
	}
}
