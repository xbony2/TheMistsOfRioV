package sheenrox82.RioV.src.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTable extends ModelBase
{
	//fields
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer top;

	public ModelTable()
	{
		textureWidth = 128;
		textureHeight = 128;

		leg1 = new ModelRenderer(this, 0, 0);
		leg1.addBox(0F, 0F, 0F, 1, 11, 1);
		leg1.setRotationPoint(6F, 13F, -7F);
		leg1.setTextureSize(128, 128);
		leg1.mirror = true;
		setRotation(leg1, 0F, 0F, 0F);
		leg2 = new ModelRenderer(this, 0, 0);
		leg2.addBox(0F, 0F, 0F, 1, 11, 1);
		leg2.setRotationPoint(-7F, 13F, -7F);
		leg2.setTextureSize(128, 128);
		leg2.mirror = true;
		setRotation(leg2, 0F, 0F, 0F);
		leg3 = new ModelRenderer(this, 0, 0);
		leg3.addBox(0F, 0F, 0F, 1, 11, 1);
		leg3.setRotationPoint(6F, 13F, 22F);
		leg3.setTextureSize(128, 128);
		leg3.mirror = true;
		setRotation(leg3, 0F, 0F, 0F);
		leg4 = new ModelRenderer(this, 0, 0);
		leg4.addBox(0F, 0F, 0F, 1, 11, 1);
		leg4.setRotationPoint(-7F, 13F, 22F);
		leg4.setTextureSize(128, 128);
		leg4.mirror = true;
		setRotation(leg4, 0F, 0F, 0F);
		top = new ModelRenderer(this, 5, 0);
		top.addBox(0F, 0F, 0F, 16, 1, 32);
		top.setRotationPoint(-8F, 12F, -8F);
		top.setTextureSize(128, 128);
		top.mirror = true;
		setRotation(top, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	public void renderAll()
	{
		leg1.render(0.0625f);
		leg2.render(0.0625f);
		leg3.render(0.0625f);
		leg4.render(0.0625f);
		top.render(0.0625f);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
