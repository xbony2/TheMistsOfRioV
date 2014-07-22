package sheenrox82.RioV.src.render.tileentity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import sheenrox82.RioV.src.model.ModelFlag;
import sheenrox82.RioV.src.tileentity.TileEntityInfuser;
import sheenrox82.RioV.src.util.Util;

public class RenderTileEntityInfuser extends TileEntitySpecialRenderer
{
	private final ModelFlag model;

	public RenderTileEntityInfuser() 
	{
		this.model = new ModelFlag();
	}

	@Override
	public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float f)
	{
		TileEntityInfuser infuser = (TileEntityInfuser)entity;
		ItemStack itemToRender = infuser.getStackInSlot(0);

		if(itemToRender != null)
		{
			GL11.glPushMatrix();
			ItemStack stack = new ItemStack(itemToRender.getItem(), 1, 0);
			EntityItem entItem = new EntityItem(Minecraft.getMinecraft().thePlayer.getEntityWorld(), 0D, 0D, 0D, stack);
			entItem.hoverStart = 0.0F;
			RenderItem.renderInFrame = true;
			RenderManager.instance.renderEntityWithPosYaw(entItem, x + 0.5, y + 1.2, z + 0.5, 0, 0);
			RenderItem.renderInFrame = false;
			GL11.glPopMatrix();
		}
	}
}