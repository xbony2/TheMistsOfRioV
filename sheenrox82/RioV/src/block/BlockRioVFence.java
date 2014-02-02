package sheenrox82.RioV.src.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRioVFence extends BlockFence
{
    public final String field_94464_a;

    public BlockRioVFence(String par2Str)
    {
        super(par2Str, Material.field_151575_d);
        this.field_94464_a = par2Str;
        this.func_149647_a(TheMistsOfRioV.getInstance().tab);
    }

	@SuppressWarnings("rawtypes")
	@Override
	public void func_149743_a(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
    {
        boolean flag = this.func_149826_e(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_ - 1);
        boolean flag1 = this.func_149826_e(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_ + 1);
        boolean flag2 = this.func_149826_e(p_149743_1_, p_149743_2_ - 1, p_149743_3_, p_149743_4_);
        boolean flag3 = this.func_149826_e(p_149743_1_, p_149743_2_ + 1, p_149743_3_, p_149743_4_);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;

        if (flag)
        {
            f2 = 0.0F;
        }

        if (flag1)
        {
            f3 = 1.0F;
        }

        if (flag || flag1)
        {
            this.func_149676_a(f, 0.0F, f2, f1, 1.5F, f3);
            super.func_149743_a(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
        }

        f2 = 0.375F;
        f3 = 0.625F;

        if (flag2)
        {
            f = 0.0F;
        }

        if (flag3)
        {
            f1 = 1.0F;
        }

        if (flag2 || flag3 || !flag && !flag1)
        {
            this.func_149676_a(f, 0.0F, f2, f1, 1.5F, f3);
            super.func_149743_a(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
        }

        if (flag)
        {
            f2 = 0.0F;
        }

        if (flag1)
        {
            f3 = 1.0F;
        }

        this.func_149676_a(f, 0.0F, f2, f1, 1.0F, f3);
    }
	
	@Override
	public void func_149719_a(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
    {
        boolean flag = this.func_149826_e(p_149719_1_, p_149719_2_, p_149719_3_, p_149719_4_ - 1);
        boolean flag1 = this.func_149826_e(p_149719_1_, p_149719_2_, p_149719_3_, p_149719_4_ + 1);
        boolean flag2 = this.func_149826_e(p_149719_1_, p_149719_2_ - 1, p_149719_3_, p_149719_4_);
        boolean flag3 = this.func_149826_e(p_149719_1_, p_149719_2_ + 1, p_149719_3_, p_149719_4_);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;

        if (flag)
        {
            f2 = 0.0F;
        }

        if (flag1)
        {
            f3 = 1.0F;
        }

        if (flag2)
        {
            f = 0.0F;
        }

        if (flag3)
        {
            f1 = 1.0F;
        }

        this.func_149676_a(f, 0.0F, f2, f1, 1.0F, f3);
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
        return false;
    }

    public int func_149645_b()
    {
        return 11;
    }
    
    public boolean func_149826_e(IBlockAccess p_149826_1_, int p_149826_2_, int p_149826_3_, int p_149826_4_)
    {
        Block block = p_149826_1_.func_147439_a(p_149826_2_, p_149826_3_, p_149826_4_);
        return block != this && block != Blocks.fence_gate ? (Material.field_151579_a.isOpaque() && block.func_149686_d() ? Material.field_151579_a != Material.field_151572_C : false) : true;
    }

    public static boolean func_149825_a(Block p_149825_0_)
    {
        return p_149825_0_ == Blocks.fence || p_149825_0_ == Blocks.nether_brick_fence || p_149825_0_ == RioVBlocks.glimmerwoodFence || p_149825_0_ == RioVBlocks.cherryBlossomFence || p_149825_0_ == RioVBlocks.bloodFence || p_149825_0_ == RioVBlocks.skywoodFence;
    }

    @SideOnly(Side.CLIENT)
    public boolean func_149646_a(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
    {
        return true;
    }

    public IIcon blockIcon;
    
    @SideOnly(Side.CLIENT)
	@Override
    public void func_149651_a(IIconRegister par1IconRegister)
    {
        if(this == RioVBlocks.glimmerwoodFence) this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "glimmerwoodPlanks");
        if(this == RioVBlocks.cherryBlossomFence) this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "cherryPlanks");
        if(this == RioVBlocks.bloodFence) this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "bloodPlanks");
        if(this == RioVBlocks.skywoodFence) this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "skywoodPlanks");
    }
}
