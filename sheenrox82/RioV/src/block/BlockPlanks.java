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

public class BlockPlanks extends Block
{
    public static final String[] woodType = new String[] {"white", "orange", "magenta", "lightBlue", "yellow", "lime", "pink", "gray", "lightGray", "cyan", "purple", "blue", "brown", "green", "red", "black"};

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    public BlockPlanks()
    {
        super(Material.field_151575_d);
        this.func_149647_a(TheMistsOfRioV.tab);
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

    @SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
    @Override
    public void func_149666_a(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
    	 for(int i = 0; i < woodType.length; i++)
         {
    		 p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
         }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void func_149651_a(IIconRegister par1IconRegister)
    {
        this.iconArray = new IIcon[woodType.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(Util.MOD_ID + ":" + woodType[i] + "Planks");
        }
    }
}
