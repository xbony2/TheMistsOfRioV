package sheenrox82.RioV.src.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiDownloadTerrain;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import org.lwjgl.opengl.GL11;

import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.gui.GuiRioVMainMenu;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HudHandler 
{
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void renderGameOverlayEvent(RenderGameOverlayEvent evt)
	{
		//I dont why this shit won't work.
		/**Minecraft minecraft = FMLClientHandler.instance().getClient();

		if(minecraft.currentScreen instanceof GuiMainMenu)
		{
			minecraft.func_147108_a(new GuiRioVMainMenu());
		}
		if(minecraft.currentScreen instanceof GuiDownloadTerrain)
		{
			WavHandler.stopSound();			
		}
		if(minecraft.currentScreen == null)
		{
			WavHandler.stopSound();			
		}**/

		//This works, fuck yeah.
		if(Config.HUD)
		{
			Minecraft mc = Minecraft.getMinecraft();

			FontRenderer fontrenderer = mc.fontRenderer;

			if (!mc.gameSettings.showDebugInfo)
			{
				if(mc.currentScreen == null)
				{
					mc.mcProfiler.startSection("debug");
					GL11.glPushMatrix();
					fontrenderer.drawStringWithShadow(Config.color + Util.MOD_NAME + " - " + Util.VERSION, Config.posX, Config.posY, 16777215);
					GL11.glPopMatrix();
				}
			}
		}
	}
}
