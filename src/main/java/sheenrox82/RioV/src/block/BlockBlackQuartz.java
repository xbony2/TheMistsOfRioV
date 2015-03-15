package sheenrox82.RioV.src.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBlackQuartz extends Block
{
    private IIcon field_150190_P;
    private IIcon field_150188_Q;

    public BlockBlackQuartz()
    {
        super(Material.rock);
		this.setStepSound(Block.soundTypeStone);
        this.setCreativeTab(RioVAPI.getInstance().tab);
    }

    @Override
    @SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.field_150190_P : (par1 == 0 ? this.field_150188_Q : this.field_150190_P);
	}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_150190_P = p_149651_1_.registerIcon(Util.MOD_ID + ":" + RioVAPI.getInstance().getUtil().getName(this.getUnlocalizedName()) + "_" + "top");
        this.field_150188_Q = p_149651_1_.registerIcon(Util.MOD_ID + ":" + RioVAPI.getInstance().getUtil().getName(this.getUnlocalizedName()) + "_" + "bottom");
    }
    
    @Override
    public boolean renderAsNormalBlock()
    {
        return true;
    }
}