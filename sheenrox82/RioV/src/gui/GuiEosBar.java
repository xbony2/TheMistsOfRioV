package sheenrox82.RioV.src.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

import org.lwjgl.opengl.GL11;

import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.util.PlayerNBT;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiEosBar extends Gui
{
	public Minecraft mc;

	@SideOnly(Side.CLIENT)
	public GuiEosBar(Minecraft mc)
	{
		super();
		this.mc = mc;
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void renderMagickaBar(RenderGameOverlayEvent event)
	{
		if (event.isCancelable() || event.type != ElementType.EXPERIENCE)
		{
			return;
		}

		PlayerNBT props = PlayerNBT.get(mc.thePlayer);
		FontRenderer fontrenderer = Minecraft.getMinecraft().fontRenderer;
		ResourceLocation icons = new ResourceLocation("riov", "textures/gui/eos_bar.png");
		int height = event.resolution.getScaledHeight();

		if (props == null || props.maxEos == 0)
		{
			return;
		}

		if(Config.EOS)
		{
			if(!mc.thePlayer.capabilities.isCreativeMode)
			{
				GL11.glPushMatrix();
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				Minecraft.getMinecraft().renderEngine.bindTexture(icons);
				float magicka = (int)(((float) props.getCurrentEos() / props.maxEos) * 80);
				this.drawTexturedModalRect(20, height - 20, 0, 49, 102, 14);
				this.drawTexturedModalRect(31, height - 16, 11, 64, (int)magicka, 6);
				GL11.glPopMatrix();
			}
		}

		if(!Config.EOS)
		{
			if(!mc.thePlayer.capabilities.isCreativeMode)
			{
				GL11.glPushMatrix();
				fontrenderer.drawStringWithShadow("Eos: " + props.getCurrentEos() + "/" + props.maxEos, 32, height - 18, 16777215);
				GL11.glPopMatrix();
			}
		}
	}
}
