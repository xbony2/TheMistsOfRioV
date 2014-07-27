package sheenrox82.RioV.src.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import sheenrox82.RioV.src.api.util.Color;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityAngel;
import sheenrox82.RioV.src.lib.RioVLib;
import sheenrox82.RioV.src.model.ModelDemonAngel;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderAngel extends RenderLiving
{
	public ModelDemonAngel modelBipedMain;

	public RenderAngel()
	{
		super(new ModelDemonAngel(), 0.0F);
		this.modelBipedMain = new ModelDemonAngel();
	}

	public void renderAdv(EntityAngel var1, double var2, double var4, double var6, float var8, float var9)
	{
		super.doRender(var1, var2, var4, var6, var8, var9);
	}

	public void doRender(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
	{
		renderAdv((EntityAngel)var1, var2, var4, var6, var8, var9);
		this.func_147906_a((EntityLiving)var1, "Angel", var2, var4, var6, 64);
		this.func_147906_a((EntityLiving)var1, "Faction: " + Color.GREEN + "Jaerin", var2, var4 - 0.25d, var6, 64);
	}

	public void doRenderLiving(Entity var1, double var2, double var4, double var6, float var8, float var9)
	{
		renderAdv((EntityAngel)var1, var2, var4, var6, var8, var9);
	}

	protected void preRenderScale(EntityAngel par1EntityGiantZombie, float par2)
	{
		GL11.glScalef(0.6F, 0.6F, 0.6F);
	}

	protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
	{
		this.preRenderScale((EntityAngel)par1EntityLivingBase, par2);
	}

	protected void func_82422_c()
    {
        GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
    }
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return RioVLib.angel;
	}
}
