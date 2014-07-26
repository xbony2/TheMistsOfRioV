package sheenrox82.RioV.src.gui.hud;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

import org.lwjgl.opengl.GL11;

import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.util.Color;
import sheenrox82.RioV.src.api.util.RioVPlayer;
import sheenrox82.RioV.src.base.Config;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiReputationBar extends Gui
{
	public Minecraft mc;

	public GuiReputationBar(Minecraft mc)
	{
		super();
		this.mc = mc;
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void render(RenderGameOverlayEvent event)
	{
		if (event.isCancelable() || event.type != ElementType.EXPERIENCE)
		{
			return;
		}

		ResourceLocation icons = new ResourceLocation("riov", "textures/gui/rep_bar.png");
		RioVPlayer props = RioVPlayer.get(mc.thePlayer);
		FontRenderer fontrenderer = Minecraft.getMinecraft().fontRenderer;

		if (props == null || props.maxEos == 0)
		{
			return;
		}

		if(!mc.thePlayer.capabilities.isCreativeMode)
		{
			int height = event.resolution.getScaledHeight();
			GL11.glPushMatrix();
			if(props.getCurrentRep() < 0)
			{
				fontrenderer.drawStringWithShadow("Reputation: " + Color.DARK_RED + props.getCurrentRep(), 32, height - 40, 16777215);
			}
			
			if(props.getCurrentRep() > 0)
			{
				fontrenderer.drawStringWithShadow("Reputation: " + Color.GREEN + props.getCurrentRep(), 32, height - 40, 16777215);
			}
			
			if(props.getCurrentRep() == 0)
			{
				fontrenderer.drawStringWithShadow("Reputation: " + Color.WHITE + props.getCurrentRep(), 32, height - 40, 16777215);
			}
			GL11.glPopMatrix();
		}
	}
}