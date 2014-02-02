package sheenrox82.RioV.src.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiDownloadTerrain;
import net.minecraft.client.gui.GuiMainMenu;

import org.lwjgl.opengl.GL11;

import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.gui.GuiRioVMainMenu;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;

public class HudHandler 
{
	@SubscribeEvent
	public synchronized void tickStart(TickEvent.ClientTickEvent evt)
	{
		if(evt.type.equals("CLIENT"))
		{
			if(evt.phase == Phase.START)
			{     
				final Minecraft minecraft = FMLClientHandler.instance().getClient();

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
				}
			}
		}
	}

	@SubscribeEvent
	public synchronized void tickEnd(TickEvent.ClientTickEvent evt)
	{
		if(evt.type.equals("RENDER"))
		{
			if(evt.phase == Phase.END)
			{     
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
	}

}
