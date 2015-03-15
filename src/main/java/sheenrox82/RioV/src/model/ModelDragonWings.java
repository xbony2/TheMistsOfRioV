// Date: 10/26/2013 3:40:59 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package sheenrox82.RioV.src.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDragonWings extends ModelBiped{
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	
	public ModelDragonWings(float f){
		super(f, 0, 64, 64);
		
		textureWidth = 64;
		textureHeight = 64;
		
		Shape1 = new ModelRenderer(this, 0, 33);
		Shape1.addBox(0F, 0F, 0F, 20, 10, 0);
		Shape1.setRotationPoint(0F, 1F, 2F);
		Shape1.setTextureSize(64, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, -0.9424778F, -0.418879F);
		Shape2 = new ModelRenderer(this, 0, 44);
		Shape2.addBox(-20F, 0F, 0F, 20, 10, 0);
		Shape2.setRotationPoint(0F, 1F, 2F);
		Shape2.setTextureSize(64, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0.9424778F, 0.418879F);
		
		this.bipedBody.addChild(Shape1);
		this.bipedBody.addChild(Shape2);
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
		super.render(entity, f, f1, f2, f3, f4, f5);
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
