package sheenrox82.RioV.src.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
import sheenrox82.RioV.src.content.Materials;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSanctuatitePlant extends Block
{
	public BlockSanctuatitePlant()
	{
		super(Materials.customMaterial);
		this.setStepSound(Block.soundTypeGrass);
		this.setCreativeTab(RioVAPI.getInstance().tab);
		this.setHardness(0.3F);
		float f = 0.375F;
		float f1 = f / 2.0F;
		this.setBlockBounds(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f, 0.5F + f1);
	}

	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		if(this == RioVBlocks.sanctuatiteBerryBush)
		{
			return RioVItems.sanctuatiteBerry;
		}

		return Item.getItemFromBlock(null);
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
	{
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
	}

	@Override
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		if(this == RioVBlocks.sanctuatiteBush)
		{
			this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "skycloud");
		}
		else
		{
			this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + RioVAPIUtil.getName(this.getUnlocalizedName()));
		}
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	{
		return blockIcon;
	}

	public int getRenderBlockPass()
	{
		if(this == RioVBlocks.sanctuatiteBerryBush || this == RioVBlocks.sanctuatiteBush)
		{
			return 1;
		}

		return 0;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	protected boolean canPlaceBlockOn(Block par1)
	{		
		return par1 == RioVBlocks.sanctuatiteGrass;
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
	{
		return AxisAlignedBB.getBoundingBox((double)var2, (double)var3, (double)var4, (double)(var2 + 1), (double)var3, (double)(var4 + 1));
	}

	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta)
	{
		if(this == RioVBlocks.sanctuatiteBush)
		{
			world.setBlockToAir(x, y, z);
		}
		if(this == RioVBlocks.sanctuatiteBerryBush)
		{
			world.setBlock(x, y, z, RioVBlocks.sanctuatiteBush, meta, meta);
		}
	}
}
