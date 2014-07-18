package sheenrox82.RioV.src.block.statue;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.tileentity.statue.TileEntityTheDarknessStatue;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTheDarknessStatue extends BlockContainer 
{
	public BlockTheDarknessStatue() 
	{
		super(Material.rock);
		this.setCreativeTab(RioVAPI.getInstance().tab);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1F, 2F, 1F);
	}

	@Override
	public TileEntity createNewTileEntity(World par1World, int var1)
	{
		return new TileEntityTheDarknessStatue();
	}

	@Override
	public int getRenderType()
	{
		return 51;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public IIcon getIcon(int par1, int par2)
	{
		return this.blockIcon;
	}

	public void registerBlockIcons(IIconRegister icon) 
	{
		this.blockIcon = icon.registerIcon(Util.MOD_ID + ":" + "theDarknessStatue");
	}

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	{
		int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		++l;
		l %= 4;

		if (l == 0)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2); //2
		}
		if (l == 1)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2); //3
		}
		if (l == 2)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2); //0
		}
		if (l == 3)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2); //1
		}
	}

	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
	{
		int l;
		float f;
		float f1;
		float f2;

		f = (float)p_149734_2_ + p_149734_5_.nextFloat();
		f1 = (float)p_149734_3_ + p_149734_5_.nextFloat() * 0.5F;
		f2 = (float)p_149734_4_ + p_149734_5_.nextFloat();
		p_149734_1_.spawnParticle("largesmoke", (double)f, (double)f1, (double)f2, 0.0D, 0.0D, 0.0D);
		p_149734_1_.spawnParticle("largesmoke", (double)f, (double)f1, (double)f2, 0.0D, 0.0D, 0.0D);
		p_149734_1_.spawnParticle("largesmoke", (double)f, (double)f1, (double)f2, 0.0D, 0.0D, 0.0D);
	}
}
