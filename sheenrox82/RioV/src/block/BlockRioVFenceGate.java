package sheenrox82.RioV.src.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRioVFenceGate extends BlockFenceGate
{
	public IIcon blockIcon;

	public BlockRioVFenceGate()
	{
		super();
		this.func_149647_a(TheMistsOfRioV.getInstance().tab);
	}

	@SideOnly(Side.CLIENT)

	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	public IIcon func_149691_a(int par1, int par2)
	{
		return this.blockIcon;
	}

	public boolean func_149742_c(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_)
	{
		return !p_149742_1_.func_147439_a(p_149742_2_, p_149742_3_ - 1, p_149742_4_).func_149688_o().isSolid() ? false : super.func_149742_c(p_149742_1_, p_149742_2_, p_149742_3_, p_149742_4_);
	}

	public AxisAlignedBB func_149668_a(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
	{
		int l = p_149668_1_.getBlockMetadata(p_149668_2_, p_149668_3_, p_149668_4_);
		return func_149896_b(l) ? null : (l != 2 && l != 0 ? AxisAlignedBB.getAABBPool().getAABB((double)((float)p_149668_2_ + 0.375F), (double)p_149668_3_, (double)p_149668_4_, (double)((float)p_149668_2_ + 0.625F), (double)((float)p_149668_3_ + 1.5F), (double)(p_149668_4_ + 1)) : AxisAlignedBB.getAABBPool().getAABB((double)p_149668_2_, (double)p_149668_3_, (double)((float)p_149668_4_ + 0.375F), (double)(p_149668_2_ + 1), (double)((float)p_149668_3_ + 1.5F), (double)((float)p_149668_4_ + 0.625F)));
	}

	public void func_149719_a(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
	{
		int l = func_149895_l(p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_));

		if (l != 2 && l != 0)
		{
			this.func_149676_a(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
		}
		else
		{
			this.func_149676_a(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
		}
	}

	public boolean func_149662_c()
    {
        return false;
    }

    public boolean func_149686_d()
    {
        return false;
    }

    public boolean func_149655_b(IBlockAccess p_149655_1_, int p_149655_2_, int p_149655_3_, int p_149655_4_)
    {
        return func_149896_b(p_149655_1_.getBlockMetadata(p_149655_2_, p_149655_3_, p_149655_4_));
    }

    public int func_149645_b()
    {
        return 21;
    }

    public void func_149689_a(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_)
    {
        int l = (MathHelper.floor_double((double)(p_149689_5_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) % 4;
        p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, l, 2);
    }

    public boolean func_149727_a(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        int i1 = p_149727_1_.getBlockMetadata(p_149727_2_, p_149727_3_, p_149727_4_);

        if (func_149896_b(i1))
        {
            p_149727_1_.setBlockMetadataWithNotify(p_149727_2_, p_149727_3_, p_149727_4_, i1 & -5, 2);
        }
        else
        {
            int j1 = (MathHelper.floor_double((double)(p_149727_5_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) % 4;
            int k1 = func_149895_l(i1);

            if (k1 == (j1 + 2) % 4)
            {
                i1 = j1;
            }

            p_149727_1_.setBlockMetadataWithNotify(p_149727_2_, p_149727_3_, p_149727_4_, i1 | 4, 2);
        }

        p_149727_1_.playAuxSFXAtEntity(p_149727_5_, 1003, p_149727_2_, p_149727_3_, p_149727_4_, 0);
        return true;
    }
    
    public void func_149695_a(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        if (!p_149695_1_.isRemote)
        {
            int l = p_149695_1_.getBlockMetadata(p_149695_2_, p_149695_3_, p_149695_4_);
            boolean flag = p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_);

            if (flag || p_149695_5_.func_149744_f())
            {
                if (flag && !func_149896_b(l))
                {
                    p_149695_1_.setBlockMetadataWithNotify(p_149695_2_, p_149695_3_, p_149695_4_, l | 4, 2);
                    p_149695_1_.playAuxSFXAtEntity((EntityPlayer)null, 1003, p_149695_2_, p_149695_3_, p_149695_4_, 0);
                }
                else if (!flag && func_149896_b(l))
                {
                    p_149695_1_.setBlockMetadataWithNotify(p_149695_2_, p_149695_3_, p_149695_4_, l & -5, 2);
                    p_149695_1_.playAuxSFXAtEntity((EntityPlayer)null, 1003, p_149695_2_, p_149695_3_, p_149695_4_, 0);
                }
            }
        }
    }

    public static boolean func_149896_b(int p_149896_0_)
    {
        return (p_149896_0_ & 4) != 0;
    }

    @SideOnly(Side.CLIENT)
    public boolean func_149646_a(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
    {
        return true;
    }

	@SideOnly(Side.CLIENT)
	public void func_149651_a(IIconRegister par1IconRegister) 
	{
		if(this == RioVBlocks.glimmerwoodFenceGate) blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "glimmerwoodPlanks");
		if(this == RioVBlocks.cherryBlossomFenceGate) blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "cherryPlanks");
		if(this == RioVBlocks.bloodFenceGate) blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "bloodPlanks");
		if(this == RioVBlocks.skywoodFenceGate) blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "skywoodPlanks");
	}
}
