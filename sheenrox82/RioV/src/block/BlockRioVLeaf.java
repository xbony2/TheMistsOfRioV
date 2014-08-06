package sheenrox82.RioV.src.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.content.Particles;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRioVLeaf extends BlockLeavesBase
{
    protected int field_150127_b;

	int[] field_150128_a;
	@SideOnly(Side.CLIENT)
	public IIcon opaqueIcon;
	@SideOnly(Side.CLIENT)
	public IIcon blockIcon;

	public BlockRioVLeaf()
	{
		super(Material.leaves, true); //wow... I had it to false the whole time, and I was wondering why the leaves were fucking up...
		this.setCreativeTab(RioVAPI.getInstance().tab);
		this.setStepSound(Block.soundTypeGrass);
        this.setHardness(0.2F);
        this.setLightOpacity(1);
	    this.setTickRandomly(true);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(Util.MOD_ID + ":" + RioVAPI.getInstance().getUtil().getName(this.getUnlocalizedName()));
		this.opaqueIcon = iconRegister.registerIcon(Util.MOD_ID + ":" + RioVAPI.getInstance().getUtil().getName(this.getUnlocalizedName()) + "_fast");
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		if(Minecraft.getMinecraft().gameSettings.fancyGraphics)
		{
			return this.blockIcon;
		}
		else
		{
			return this.opaqueIcon;
		}
	}

	public boolean func_149662_c()
	{
		return false;
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
	{
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
	}

    public int getRenderColor(int i)
	{
		return 16777215;
	}

	public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return 16777215;
    }

	public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
    {
        byte b0 = 1;
        int i1 = b0 + 1;

        if (p_149749_1_.checkChunksExist(p_149749_2_ - i1, p_149749_3_ - i1, p_149749_4_ - i1, p_149749_2_ + i1, p_149749_3_ + i1, p_149749_4_ + i1))
        {
            for (int j1 = -b0; j1 <= b0; ++j1)
            {
                for (int k1 = -b0; k1 <= b0; ++k1)
                {
                    for (int l1 = -b0; l1 <= b0; ++l1)
                    {
                        Block block = p_149749_1_.getBlock(p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1);
                        if (block.isLeaves(p_149749_1_, p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1))
                        {
                            block.beginLeavesDecay(p_149749_1_, p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1);
                        }
                    }
                }
            }
        }
    }

	public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (!p_149674_1_.isRemote)
        {
            int l = p_149674_1_.getBlockMetadata(p_149674_2_, p_149674_3_, p_149674_4_);

            if ((l & 8) != 0 && (l & 4) == 0)
            {
                byte b0 = 4;
                int i1 = b0 + 1;
                byte b1 = 32;
                int j1 = b1 * b1;
                int k1 = b1 / 2;

                if (this.field_150128_a == null)
                {
                    this.field_150128_a = new int[b1 * b1 * b1];
                }

                int l1;

                if (p_149674_1_.checkChunksExist(p_149674_2_ - i1, p_149674_3_ - i1, p_149674_4_ - i1, p_149674_2_ + i1, p_149674_3_ + i1, p_149674_4_ + i1))
                {
                    int i2;
                    int j2;

                    for (l1 = -b0; l1 <= b0; ++l1)
                    {
                        for (i2 = -b0; i2 <= b0; ++i2)
                        {
                            for (j2 = -b0; j2 <= b0; ++j2)
                            {
                                Block block = p_149674_1_.getBlock(p_149674_2_ + l1, p_149674_3_ + i2, p_149674_4_ + j2);

                                if (!block.canSustainLeaves(p_149674_1_, p_149674_2_ + l1, p_149674_3_ + i2, p_149674_4_ + j2))
                                {
                                    if (block.isLeaves(p_149674_1_, p_149674_2_ + l1, p_149674_3_ + i2, p_149674_4_ + j2))
                                    {
                                        this.field_150128_a[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = -2;
                                    }
                                    else
                                    {
                                        this.field_150128_a[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = -1;
                                    }
                                }
                                else
                                {
                                    this.field_150128_a[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = 0;
                                }
                            }
                        }
                    }

                    for (l1 = 1; l1 <= 4; ++l1)
                    {
                        for (i2 = -b0; i2 <= b0; ++i2)
                        {
                            for (j2 = -b0; j2 <= b0; ++j2)
                            {
                                for (int k2 = -b0; k2 <= b0; ++k2)
                                {
                                    if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1] == l1 - 1)
                                    {
                                        if (this.field_150128_a[(i2 + k1 - 1) * j1 + (j2 + k1) * b1 + k2 + k1] == -2)
                                        {
                                            this.field_150128_a[(i2 + k1 - 1) * j1 + (j2 + k1) * b1 + k2 + k1] = l1;
                                        }

                                        if (this.field_150128_a[(i2 + k1 + 1) * j1 + (j2 + k1) * b1 + k2 + k1] == -2)
                                        {
                                            this.field_150128_a[(i2 + k1 + 1) * j1 + (j2 + k1) * b1 + k2 + k1] = l1;
                                        }

                                        if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1 - 1) * b1 + k2 + k1] == -2)
                                        {
                                            this.field_150128_a[(i2 + k1) * j1 + (j2 + k1 - 1) * b1 + k2 + k1] = l1;
                                        }

                                        if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1 + 1) * b1 + k2 + k1] == -2)
                                        {
                                            this.field_150128_a[(i2 + k1) * j1 + (j2 + k1 + 1) * b1 + k2 + k1] = l1;
                                        }

                                        if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + (k2 + k1 - 1)] == -2)
                                        {
                                            this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + (k2 + k1 - 1)] = l1;
                                        }

                                        if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1 + 1] == -2)
                                        {
                                            this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1 + 1] = l1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                l1 = this.field_150128_a[k1 * j1 + k1 * b1 + k1];

                if (l1 >= 0)
                {
                    p_149674_1_.setBlockMetadataWithNotify(p_149674_2_, p_149674_3_, p_149674_4_, l & -9, 4);
                }
                else
                {
                    this.removeLeaves(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_);
                }
            }
        }
    }

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par1World.canLightningStrikeAt(par2, par3 + 1, par4) && !World.doesBlockHaveSolidTopSurface(par1World, par2, par3 - 1, par4) && par5Random.nextInt(15) == 1)
        {
            double d0 = (double)((float)par2 + par5Random.nextFloat());
            double d1 = (double)par3 - 0.05D;
            double d2 = (double)((float)par4 + par5Random.nextFloat());
            par1World.spawnParticle("dripWater", d0, d1, d2, 0.0D, 0.0D, 0.0D);
        }
        
        if(this == RioVBlocks.glimmerwoodLeaf)
        {
        	for (int var6 = par2 - 2; var6 <= par2 + 2; ++var6)
    		{
    			for (int var7 = par4 - 2; var7 <= par4 + 2; ++var7)
    			{
    				if (var6 > par2 - 2 && var6 < par2 + 2 && var7 == par4 - 1)
    				{
    					var7 = par4 + 2;
    				}

    				if (par5Random.nextInt(16) == 0)
    				{
    					for (int var8 = par3; var8 <= par3 + 1; ++var8)
    					{

    						if (!par1World.isAirBlock((var6 - par2) / 2 + par2, var8, (var7 - par4) / 2 + par4))
    						{
    							break;
    						}

    						Particles.spawnParticle("glimmer", (double)par2 + 0.5D, (double)par3 + 1.0D, (double)par4 + 0.5D, (double)((float)(par2) + par5Random.nextFloat()) - 0.5D, (double)((float)(par3) - par5Random.nextFloat() - 1.0F), (double)((float)(par4) + par5Random.nextFloat()) - 0.5D);

    						if (!par1World.isAirBlock((var6 - par2) / 2 + par2, var8, (var7 - par4) / 2 + par4))
    						{
    							break;
    						}

    						Particles.spawnParticle("glimmer", (double)par2 + 0.5D, (double)par3 + 1.0D, (double)par4 + 0.5D, (double)((float)(par2) + par5Random.nextFloat()) - 0.5D, (double)((float)(par3) - par5Random.nextFloat() - 1.0F), (double)((float)(par4) + par5Random.nextFloat()) - 0.5D);                       	
    					}
    				}
    			}
    		}
        }
    }

    private void removeLeaves(World p_150126_1_, int p_150126_2_, int p_150126_3_, int p_150126_4_)
    {
        this.dropBlockAsItem(p_150126_1_, p_150126_2_, p_150126_3_, p_150126_4_, p_150126_1_.getBlockMetadata(p_150126_2_, p_150126_3_, p_150126_4_), 0);
        p_150126_1_.setBlockToAir(p_150126_2_, p_150126_3_, p_150126_4_);
    }

    public int quantityDropped(Random p_149745_1_)
    {
        return p_149745_1_.nextInt(20) == 0 ? 1 : 0;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
    	if(this == RioVBlocks.glimmerwoodLeaf)
    	{
            return Item.getItemFromBlock(RioVBlocks.glimmerwoodSapling);
    	}
    	if(this == RioVBlocks.paleLeaf)
    	{
            return Item.getItemFromBlock(RioVBlocks.bloodSapling);
    	}
    	if(this == RioVBlocks.cherryLeaf)
    	{
            return Item.getItemFromBlock(RioVBlocks.cherryBlossomSapling);
    	}
    	
        return Item.getItemFromBlock(Blocks.sapling);
    }

    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
    {
        if (!p_149690_1_.isRemote)
        {
            int j1 = this.func_150123_b(p_149690_5_);

            if (p_149690_7_ > 0)
            {
                j1 -= 2 << p_149690_7_;

                if (j1 < 10)
                {
                    j1 = 10;
                }
            }

            if (p_149690_1_.rand.nextInt(j1) == 0)
            {
                Item item = this.getItemDropped(p_149690_5_, p_149690_1_.rand, p_149690_7_);
                this.dropBlockAsItem(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, new ItemStack(item, 1, this.damageDropped(p_149690_5_)));
            }

            j1 = 200;

            if (p_149690_7_ > 0)
            {
                j1 -= 10 << p_149690_7_;

                if (j1 < 40)
                {
                    j1 = 40;
                }
            }

            this.func_150124_c(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, j1);
        }
    }

    protected void func_150124_c(World p_150124_1_, int p_150124_2_, int p_150124_3_, int p_150124_4_, int p_150124_5_, int p_150124_6_) {}

    protected int func_150123_b(int p_150123_1_)
    {
        return 20;
    }

    public void harvestBlock(World p_149636_1_, EntityPlayer p_149636_2_, int p_149636_3_, int p_149636_4_, int p_149636_5_, int p_149636_6_)
    {
        {
            super.harvestBlock(p_149636_1_, p_149636_2_, p_149636_3_, p_149636_4_, p_149636_5_, p_149636_6_);
        }
    }

    public int damageDropped(int p_149692_1_)
    {
        return p_149692_1_ & 3;
    }
    
    @SideOnly(Side.CLIENT)
    public void func_150122_b(boolean p_150122_1_)
    {
        this.field_150121_P = p_150122_1_;
        this.field_150127_b = p_150122_1_ ? 0 : 1;
    }

    protected ItemStack createStackedBlock(int p_149644_1_)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, p_149644_1_ & 3);
    }

    @Override
    public void beginLeavesDecay(World world, int x, int y, int z)
    {

        int i2 = world.getBlockMetadata(x, y, z);

        if ((i2 & 8) == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, i2 | 8, 4);
        }
        world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
    }

    @Override
    public boolean isLeaves(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }
}