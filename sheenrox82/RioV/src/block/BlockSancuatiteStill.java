package sheenrox82.RioV.src.block;

import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;

public class BlockSancuatiteStill extends BlockStaticLiquid
{
	public IIcon blockIcon;
	
	public BlockSancuatiteStill() 
	{
		super(Material.water);
		this.setCreativeTab(null);
	}

	public void func_149651_a(IIconRegister i)
	{
		this.blockIcon = i.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.getUnlocalizedName()));
	}

	public boolean isOpaqueCube()
	{
		return false;
	}
	
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		if (par5Entity instanceof EntityLivingBase)
		{
			if(this == RioVBlocks.sanctuatiteStill)
			{
				((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 100, 2));
			}
		}
	}
}
