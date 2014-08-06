package sheenrox82.RioV.src.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTerron extends ModelBase
{
	//fields
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer arm1;
	ModelRenderer arm2;
	ModelRenderer bottomleg1;
	ModelRenderer bottomleg2;
	ModelRenderer bottomarm1;
	ModelRenderer bottomarm2;
	ModelRenderer bodytop;

	public ModelTerron()
	{
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this, 30, 13);
		head.addBox(-4F, -4F, -6F, 8, 8, 9);
		head.setRotationPoint(0F, -3F, -2F);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.3665191F, 0F, 0F);
		body = new ModelRenderer(this, 0, 13);
		body.addBox(-6F, -10F, -4F, 8, 7, 6);
		body.setRotationPoint(2F, 18F, 5F);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.1745329F, 0F, 0F);
		leg1 = new ModelRenderer(this, 33, 0);
		leg1.addBox(-3F, 0F, -2F, 4, 7, 4);
		leg1.setRotationPoint(-2F, 12F, 4F);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, -0.3490659F, 0F, 0F);
		leg2 = new ModelRenderer(this, 15, 0);
		leg2.addBox(-1F, 0F, -2F, 4, 7, 4);
		leg2.setRotationPoint(2F, 12F, 4F);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, -0.3490659F, 0F, 0F);
		arm1 = new ModelRenderer(this, 50, 0);
		arm1.addBox(-3F, 0F, -3F, 4, 9, 3);
		arm1.setRotationPoint(-3F, 0F, 1F);
		arm1.setTextureSize(64, 64);
		arm1.mirror = true;
		setRotation(arm1, 0F, 0F, 0.8028515F);
		arm2 = new ModelRenderer(this, 0, 0);
		arm2.addBox(-1F, 0F, -3F, 4, 9, 3);
		arm2.setRotationPoint(3F, 0F, 1F);
		arm2.setTextureSize(64, 64);
		arm2.mirror = true;
		setRotation(arm2, 0.0174533F, 0F, -0.8028515F);
		bottomleg1 = new ModelRenderer(this, 48, 49);
		bottomleg1.addBox(0F, 0F, 0F, 4, 6, 4);
		bottomleg1.setRotationPoint(-5F, 18F, 0F);
		bottomleg1.setTextureSize(64, 64);
		bottomleg1.mirror = true;
		setRotation(bottomleg1, 0F, 0F, 0F);
		bottomleg2 = new ModelRenderer(this, 31, 49);
		bottomleg2.addBox(0F, 0F, 0F, 4, 6, 4);
		bottomleg2.setRotationPoint(1F, 18F, 0F);
		bottomleg2.setTextureSize(64, 64);
		bottomleg2.mirror = true;
		setRotation(bottomleg2, 0F, 0F, 0F);
		bottomarm1 = new ModelRenderer(this, 37, 34);
		bottomarm1.addBox(0F, 0F, 0F, 3, 9, 3);
		bottomarm1.setRotationPoint(-12F, 4F, -2F);
		bottomarm1.setTextureSize(64, 64);
		bottomarm1.mirror = true;
		setRotation(bottomarm1, -0.4014257F, 0F, -0.4014257F);
		bottomarm2 = new ModelRenderer(this, 50, 34);
		bottomarm2.addBox(0F, 0F, 0F, 3, 9, 3);
		bottomarm2.setRotationPoint(9F, 3F, -2F);
		bottomarm2.setTextureSize(64, 64);
		bottomarm2.mirror = true;
		setRotation(bottomarm2, -0.4014257F, 0F, 0.4014257F);
		bodytop = new ModelRenderer(this, 0, 31);
		bodytop.addBox(0F, 0F, 0F, 10, 11, 6);
		bodytop.setRotationPoint(-5F, 0F, -4F);
		bodytop.setTextureSize(64, 64);
		bodytop.mirror = true;
		setRotation(bodytop, 0.3490659F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		head.render(f5);
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		arm1.render(f5);
		arm2.render(f5);
		bottomleg1.render(f5);
		bottomleg2.render(f5);
		bottomarm1.render(f5);
		bottomarm2.render(f5);
		bodytop.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
		bottomleg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
		bottomleg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;

	}
	public void renderAll(float f1)
	{
		head.render(f1);
		body.render(f1);
		leg1.render(f1);
		leg2.render(f1);
		arm1.render(f1);
		arm2.render(f1);
		bottomleg1.render(f1);
		bottomleg2.render(f1);
		bottomarm1.render(f1);
		bottomarm2.render(f1);
		bodytop.render(f1);
	}
}
