package sheenrox82.RioV.src.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import sheenrox82.RioV.src.entity.mob.neutral.EntityFairy;
import sheenrox82.RioV.src.lib.RioVLib;
import sheenrox82.RioV.src.model.ModelFairy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderFairy extends RenderLiving{
	
	public RenderFairy(){
		super(new ModelFairy(), 0.3F);
		
	}
	
	public void renderAdv(EntityFairy par1Entity, double par2, double par4, double par6, float par8, float par9){
		super.doRender(par1Entity, par2, par4, par6, par8, par9);
	}
	
	public void doRender(EntityLiving var1, double var2, double var4, double var6, float var8, float var9){
		renderAdv((EntityFairy) var1, var2, var4, var6, var8, var9);
	}
	
	public void doRenderLiving(Entity var1, double var2, double var4, double var6, float var8, float var9){
		renderAdv((EntityFairy) var1, var2, var4, var6, var8, var9);
	}
	
	protected void preRenderScale(EntityFairy par1EntityGiantZombie, float par2){
		GL11.glScalef(0.4F, 0.4F, 0.4F);
	}
	
	protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2){
		this.preRenderScale((EntityFairy) par1EntityLivingBase, par2);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity){
		return RioVLib.fairy;
	}
}
