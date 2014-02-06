package sheenrox82.RioV.src.render.tileentity;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.model.ModelLargeChest;
import net.minecraft.client.renderer.tileentity.TileEntityChestRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import sheenrox82.RioV.src.lib.TileEntityResourceLocation;
import sheenrox82.RioV.src.tileentity.TileEntityBloodChest;
import sheenrox82.RioV.src.tileentity.TileEntityGlimmerwoodChest;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderTileEntityGlimmerwoodChest extends TileEntityChestRenderer
{
	
	/** The normal small chest model. */
	private ModelChest chestModel = new ModelChest();

	/** The large double chest model. */
	private ModelChest largeChestModel = new ModelLargeChest();


	public RenderTileEntityGlimmerwoodChest()
	{
	}

	@Override
	public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_)
    {
        this.renderTileEntityAt((TileEntityGlimmerwoodChest)p_147500_1_, p_147500_2_, p_147500_4_, p_147500_6_, p_147500_8_);
    }

	public void renderTileEntityAt(TileEntityGlimmerwoodChest tile, double x, double y, double z, float f)
	{
		int rotation = 0;
		if (!tile.hasWorldObj())
        {
			rotation = 0;
		}

		if (tile.adjacentChestZNeg == null && tile.adjacentChestXNeg == null)
		{
			ModelChest modelchest;

			if (tile.adjacentChestXPos == null && tile.adjacentChestZPos == null)
			{
				modelchest = this.chestModel;

				this.bindTexture(TileEntityResourceLocation.glimmerwood_singleChest);

			}
			else
			{
				modelchest = this.largeChestModel;

				this.bindTexture(TileEntityResourceLocation.glimmerwood_doubleChest);

			}
			GL11.glPushMatrix();
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslatef((float)x, (float)y + 1.0F, (float)z + 1.0F);
            GL11.glScalef(1.0F, -1.0F, -1.0F);
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            short short1 = 0;

            if (rotation == 2)
            {
                short1 = 180;
            }

            if (rotation == 3)
            {
                short1 = 0;
            }

            if (rotation == 4)
            {
                short1 = 90;
            }

            if (rotation == 5)
            {
                short1 = -90;
            }

            if (rotation == 2 && tile.adjacentChestXPos != null)
            {
                GL11.glTranslatef(1.0F, 0.0F, 0.0F);
            }

            if (rotation == 5 && tile.adjacentChestZPos != null)
            {
                GL11.glTranslatef(0.0F, 0.0F, -1.0F);
            }

            GL11.glRotatef((float)short1, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            float f1 = tile.prevLidAngle + (tile.lidAngle - tile.prevLidAngle) * f;
            float f2;

            if (tile.adjacentChestZNeg != null)
            {
            	f2 = tile.adjacentChestZNeg.prevLidAngle + (tile.adjacentChestZNeg.lidAngle - tile.adjacentChestZNeg.prevLidAngle) * f;

                if (f2 > f1)
                {
                    f1 = f2;
                }
            }

            if (tile.adjacentChestXNeg != null)
            {
            	f2 = tile.adjacentChestXNeg.prevLidAngle + (tile.adjacentChestXNeg.lidAngle - tile.adjacentChestXNeg.prevLidAngle) * f;
                
            	if (f2 > f1)
                {
                    f1 = f2;
                }
            }

            f1 = 1.0F - f1;
            f1 = 1.0F - f1 * f1 * f1;
            modelchest.chestLid.rotateAngleX = -(f1 * (float)Math.PI / 2.0F);
            modelchest.renderAll();
            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            GL11.glPopMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}

	}
}
