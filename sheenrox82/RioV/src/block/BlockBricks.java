package sheenrox82.RioV.src.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBricks extends Block
{
    public static final String[] brickList = new String[] {"sapphire", "topaz", "amethyst", "onyx", "blindonite", "dragon", "vravinite", "aleris", "jaavik", "nironite", "garnet", "drakiuz"};

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    public BlockBricks()
    {
        super(Material.field_151576_e);
        this.func_149647_a(TheMistsOfRioV.getInstance().tab);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon func_149691_a(int par1, int par2)
    {
        return this.iconArray[par2];
    }

    @Override
    public int func_149692_a(int p_149692_1_)
    {
        return p_149692_1_;
    }

	@SideOnly(Side.CLIENT)
    @Override
    public void func_149666_a(Item par1, CreativeTabs par2CreativeTabs, List par3List)
    {
    	 for(int i = 0; i < brickList.length; i++)
         {
                par3List.add(new ItemStack(par1, 1, i));
         }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void func_149651_a(IIconRegister par1IconRegister)
    {
        this.iconArray = new IIcon[brickList.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(Util.MOD_ID + ":" + brickList[i] + "Bricks");
        }
    }
}
