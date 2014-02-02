package sheenrox82.RioV.src.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import sheenrox82.RioV.src.container.ContainerInfuser;
import sheenrox82.RioV.src.lib.GuiResourceLocation;
import sheenrox82.RioV.src.tileentity.TileEntityInfuser;

public class GuiInfuser extends GuiContainer
{
	int xSize = 176;
	int ySize = 184;
	int width, height;
	
	public GuiInfuser(InventoryPlayer player_inventory, TileEntityInfuser tile_entity)
	{
		super(new ContainerInfuser(player_inventory, tile_entity));
	}

	@Override
	protected void func_146979_b(int i, int j){

		field_146289_q.drawString("Infuser", 6, 6, 0x4A4A4A);
		field_146289_q.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.field_147000_g - 96 + 2, 0x4A4A4A);
	}

	@Override
	//drawGuiContainerBackgroundLayer
	protected void func_146976_a(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().renderEngine.bindTexture(GuiResourceLocation.infuser);
        int k = (this.field_146294_l - this.field_146999_f) / 2;
        int l = (this.field_146295_m - this.field_147000_g) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.field_146999_f, this.field_147000_g);
	}
}