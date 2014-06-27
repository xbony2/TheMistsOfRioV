package sheenrox82.RioV.src.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.event.terraingen.TerrainGen;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import sheenrox82.RioV.src.world.feature.WorldGenBloodTree;
import sheenrox82.RioV.src.world.feature.WorldGenCherryBlossomTree;
import sheenrox82.RioV.src.world.feature.WorldGenGlimmerWoodTree;
import sheenrox82.RioV.src.world.feature.WorldGenSanctuatiteTree;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRioVSapling extends BlockSapling implements IPlantable
{    
	public IIcon blockIcon;
	
	public BlockRioVSapling()
	{
		super();
		this.setCreativeTab(TheMistsOfRioV.getInstance().tab);
		this.setStepSound(Block.soundTypeGrass);
        this.setHardness(0.2F);
        this.setLightOpacity(1);
		float f = 0.4F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
	}

	public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
	{
		if (!p_149674_1_.isRemote)
		{
			super.updateTick(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_, p_149674_5_);

			if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) >= 9 && p_149674_5_.nextInt(7) == 0)
			{
				this.func_149879_c(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_, p_149674_5_);
			}
		}
	}

	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return blockIcon;
    }

    public void func_149879_c(World p_149879_1_, int p_149879_2_, int p_149879_3_, int p_149879_4_, Random p_149879_5_)
    {
        int l = p_149879_1_.getBlockMetadata(p_149879_2_, p_149879_3_, p_149879_4_);

        if ((l & 8) == 0)
        {
            p_149879_1_.setBlockMetadataWithNotify(p_149879_2_, p_149879_3_, p_149879_4_, l | 8, 4);
        }
        else
        {
            this.func_149878_d(p_149879_1_, p_149879_2_, p_149879_3_, p_149879_4_, p_149879_5_);
        }
    }

	public void growTree(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if(this == RioVBlocks.glimmerwoodSapling)
		{
			if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4)) return;
			int l = par1World.getBlockMetadata(par2, par3, par4) & 3;
			Object object = null;
			int i1 = 0;
			int j1 = 0;
			boolean flag = false;
			if (l == 3)
			{
				for (i1 = 0; i1 >= -1; --i1)
				{
					for (j1 = 0; j1 >= -1; --j1)
					{
						if (this.func_149880_a(par1World, par2 + i1, par3, par4 + j1, 3) && this.func_149880_a(par1World, par2 + i1 + 1, par3, par4 + j1, 3) && this.func_149880_a(par1World, par2 + i1, par3, par4 + j1 + 1, 3) && this.func_149880_a(par1World, par2 + i1 + 1, par3, par4 + j1 + 1, 3))
						{
							/** Change this to your WorldGenNAMETree **/
							object = new WorldGenGlimmerWoodTree(false);
							flag = true;
							break;
						}
					}
					if (object != null)
					{
						break;
					}
				}
				if (object == null)
				{
					j1 = 0;
					i1 = 0;

					object = new WorldGenGlimmerWoodTree(false);
				}
			}
			else
			{
				object = new WorldGenGlimmerWoodTree(false); // Changed //

			}

			Block block = Blocks.air;

			if (flag)
			{
				par1World.setBlock(par2 + i1, par3, par4 + j1, block, 0, 4);
				par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, block, 0, 4);
				par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, block, 0, 4);
				par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, block, 0, 4);
			}
			else
			{
				par1World.setBlock(par2, par3, par4, block, 0, 4);
			}
			if (!((WorldGenerator)object).generate(par1World, par5Random, par2 + i1, par3, par4 + j1))
			{
				if (flag)
				{
					par1World.setBlock(par2 + i1, par3, par4 + j1, this, l, 4);
					par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, this, l, 4);
					par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, this, l, 4);
					par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, this, l, 4);
				}
				else
				{
					par1World.setBlock(par2, par3, par4, this, l, 4);
				}
			}
		}

		if(this == RioVBlocks.cherryBlossomSapling)
		{
			if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4)) return;
			int l = par1World.getBlockMetadata(par2, par3, par4) & 3;
			Object object = null;
			int i1 = 0;
			int j1 = 0;
			boolean flag = false;
			if (l == 3)
			{
				for (i1 = 0; i1 >= -1; --i1)
				{
					for (j1 = 0; j1 >= -1; --j1)
					{
						if (this.func_149880_a(par1World, par2 + i1, par3, par4 + j1, 3) && this.func_149880_a(par1World, par2 + i1 + 1, par3, par4 + j1, 3) && this.func_149880_a(par1World, par2 + i1, par3, par4 + j1 + 1, 3) && this.func_149880_a(par1World, par2 + i1 + 1, par3, par4 + j1 + 1, 3))
						{
							/** Change this to your WorldGenNAMETree **/
							object = new WorldGenCherryBlossomTree(false);
							flag = true;
							break;
						}
					}
					if (object != null)
					{
						break;
					}
				}
				if (object == null)
				{
					j1 = 0;
					i1 = 0;

					object = new WorldGenCherryBlossomTree(false);
				}
			}
			else
			{
				object = new WorldGenCherryBlossomTree(false); // Changed //

			}

			Block block = Blocks.air;

			if (flag)
			{
				par1World.setBlock(par2 + i1, par3, par4 + j1, block, 0, 4);
				par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, block, 0, 4);
				par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, block, 0, 4);
				par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, block, 0, 4);
			}
			else
			{
				par1World.setBlock(par2, par3, par4, block, 0, 4);
			}
			if (!((WorldGenerator)object).generate(par1World, par5Random, par2 + i1, par3, par4 + j1))
			{
				if (flag)
				{
					par1World.setBlock(par2 + i1, par3, par4 + j1, this, l, 4);
					par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, this, l, 4);
					par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, this, l, 4);
					par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, this, l, 4);
				}
				else
				{
					par1World.setBlock(par2, par3, par4, this, l, 4);
				}
			}
		}

		if(this == RioVBlocks.bloodSapling)
		{
			if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4)) return;
			int l = par1World.getBlockMetadata(par2, par3, par4) & 3;
			Object object = null;
			int i1 = 0;
			int j1 = 0;
			boolean flag = false;
			if (l == 3)
			{
				for (i1 = 0; i1 >= -1; --i1)
				{
					for (j1 = 0; j1 >= -1; --j1)
					{
						if (this.func_149880_a(par1World, par2 + i1, par3, par4 + j1, 3) && this.func_149880_a(par1World, par2 + i1 + 1, par3, par4 + j1, 3) && this.func_149880_a(par1World, par2 + i1, par3, par4 + j1 + 1, 3) && this.func_149880_a(par1World, par2 + i1 + 1, par3, par4 + j1 + 1, 3))
						{
							/** Change this to your WorldGenNAMETree **/
							object = new WorldGenBloodTree(false);
							flag = true;
							break;
						}
					}
					if (object != null)
					{
						break;
					}
				}
				if (object == null)
				{
					j1 = 0;
					i1 = 0;

					object = new WorldGenBloodTree(false);
				}
			}
			else
			{
				object = new WorldGenBloodTree(false); // Changed //

			}

			Block block = Blocks.air;

			if (flag)
			{
				par1World.setBlock(par2 + i1, par3, par4 + j1, block, 0, 4);
				par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, block, 0, 4);
				par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, block, 0, 4);
				par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, block, 0, 4);
			}
			else
			{
				par1World.setBlock(par2, par3, par4, block, 0, 4);
			}
			if (!((WorldGenerator)object).generate(par1World, par5Random, par2 + i1, par3, par4 + j1))
			{
				if (flag)
				{
					par1World.setBlock(par2 + i1, par3, par4 + j1, this, l, 4);
					par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, this, l, 4);
					par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, this, l, 4);
					par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, this, l, 4);
				}
				else
				{
					par1World.setBlock(par2, par3, par4, this, l, 4);
				}
			}
		}

		if(this == RioVBlocks.skywoodSapling)
		{
			if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4)) return;
			int l = par1World.getBlockMetadata(par2, par3, par4) & 3;
			Object object = null;
			int i1 = 0;
			int j1 = 0;
			boolean flag = false;
			if (l == 3)
			{
				for (i1 = 0; i1 >= -1; --i1)
				{
					for (j1 = 0; j1 >= -1; --j1)
					{
						if (this.func_149880_a(par1World, par2 + i1, par3, par4 + j1, 3) && this.func_149880_a(par1World, par2 + i1 + 1, par3, par4 + j1, 3) && this.func_149880_a(par1World, par2 + i1, par3, par4 + j1 + 1, 3) && this.func_149880_a(par1World, par2 + i1 + 1, par3, par4 + j1 + 1, 3))
						{
							/** Change this to your WorldGenNAMETree **/
							object = new WorldGenSanctuatiteTree(false);
							flag = true;
							break;
						}
					}
					if (object != null)
					{
						break;
					}
				}
				if (object == null)
				{
					j1 = 0;
					i1 = 0;

					object = new WorldGenSanctuatiteTree(false);
				}
			}
			else
			{
				object = new WorldGenSanctuatiteTree(false); // Changed //

			}

			Block block = Blocks.air;

			if (flag)
			{
				par1World.setBlock(par2 + i1, par3, par4 + j1, block, 0, 4);
				par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, block, 0, 4);
				par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, block, 0, 4);
				par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, block, 0, 4);
			}
			else
			{
				par1World.setBlock(par2, par3, par4, block, 0, 4);
			}
			if (!((WorldGenerator)object).generate(par1World, par5Random, par2 + i1, par3, par4 + j1))
			{
				if (flag)
				{
					par1World.setBlock(par2 + i1, par3, par4 + j1, this, l, 4);
					par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, this, l, 4);
					par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, this, l, 4);
					par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, this, l, 4);
				}
				else
				{
					par1World.setBlock(par2, par3, par4, this, l, 4);
				}
			}
		}
	}

	public boolean func_149880_a(World p_149880_1_, int p_149880_2_, int p_149880_3_, int p_149880_4_, int p_149880_5_)
	{
		return p_149880_1_.getBlock(p_149880_2_, p_149880_3_, p_149880_4_) == this && (p_149880_1_.getBlockMetadata(p_149880_2_, p_149880_3_, p_149880_4_) & 7) == p_149880_5_;
	}

	public int func_149692_a(int p_149692_1_)
	{
		return MathHelper.clamp_int(p_149692_1_ & 7, 0, 5);
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
	{
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_)
	{
		blockIcon = p_149651_1_.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.getUnlocalizedName()));
	}

	public boolean func_149851_a(World p_149851_1_, int p_149851_2_, int p_149851_3_, int p_149851_4_, boolean p_149851_5_)
	{
		return true;
	}

	public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_)
	{
		return (double)p_149852_1_.rand.nextFloat() < 0.45D;
	}

	public void func_149853_b(World p_149853_1_, Random p_149853_2_, int p_149853_3_, int p_149853_4_, int p_149853_5_)
	{
		this.func_149879_c(p_149853_1_, p_149853_3_, p_149853_4_, p_149853_5_, p_149853_2_);
	}
}