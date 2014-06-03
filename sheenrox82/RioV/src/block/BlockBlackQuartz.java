package sheenrox82.RioV.src.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBlackQuartz extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon field_150190_P;
    @SideOnly(Side.CLIENT)
    private IIcon field_150188_Q;

    public BlockBlackQuartz()
    {
        super(Material.rock);
        this.setCreativeTab(TheMistsOfRioV.getInstance().tab);
    }

    @SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.field_150190_P : (par1 == 0 ? this.field_150188_Q : this.field_150190_P);
	}

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_150190_P = p_149651_1_.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.getUnlocalizedName()) + "_" + "top");
        this.field_150188_Q = p_149651_1_.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.getUnlocalizedName()) + "_" + "bottom");
    }
    
    public boolean renderAsNormalBlock()
    {
        return true;
    }
}