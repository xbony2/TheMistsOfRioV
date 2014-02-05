package sheenrox82.RioV.src.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import sheenrox82.RioV.src.container.ContainerAnvil;
import sheenrox82.RioV.src.lib.GuiResourceLocation;

public class GuiAnvil extends GuiContainer
{	
	int xSize = 176;
	int ySize = 184;
	int width, height;
	
	public GuiAnvil(InventoryPlayer inventoryplayer, World world, int i, int j, int k)
    {
        super(new ContainerAnvil(inventoryplayer, world, i, j, k));
		
    }

	@Override
    protected void func_146979_b(int par1, int par2)
    {
		field_146289_q.drawString("Anvil", 8, 6, 4210752);
    	field_146289_q.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 - 3, 4210752);
    }

	@Override
    protected void func_146976_a(float f, int i, int j)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        Minecraft.getMinecraft().renderEngine.bindTexture(GuiResourceLocation.anvil);
        int k = (this.field_146294_l - this.field_146999_f) / 2;
        int l = (this.field_146295_m - this.field_147000_g) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.field_146999_f, this.field_147000_g + 120);
    }
}
