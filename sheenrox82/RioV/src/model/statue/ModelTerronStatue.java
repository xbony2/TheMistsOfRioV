package sheenrox82.RioV.src.model.statue;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTerronStatue extends ModelStatueCore
{
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

	public ModelTerronStatue()
	{
		super();

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

	@Override
	public void renderAll()
	{
		head.render(0.0625F);
		body.render(0.0625F);
		leg1.render(0.0625F);
		leg2.render(0.0625F);
		arm1.render(0.0625F);
		arm2.render(0.0625F);
		bottomleg1.render(0.0625F);
		bottomleg2.render(0.0625F);
		bottomarm1.render(0.0625F);
		bottomarm2.render(0.0625F);
		bodytop.render(0.0625F);
	}
}
