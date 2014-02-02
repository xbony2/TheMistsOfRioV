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
import sheenrox82.RioV.src.util.Util;

public class BlockVoidStill extends BlockStaticLiquid
{
	public IIcon blockIcon;
	
	public BlockVoidStill() 
	{
		super(Material.field_151586_h);
		this.func_149647_a(null);
	}

	public void func_149651_a(IIconRegister i)
	{
		this.blockIcon = i.registerIcon(Util.MOD_ID + ":" + "voidStill");
	}
    
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
    	if (par5Entity instanceof EntityLivingBase)
    	{
    		((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.wither.getId(), 50, 2));
    	}
	}
}
