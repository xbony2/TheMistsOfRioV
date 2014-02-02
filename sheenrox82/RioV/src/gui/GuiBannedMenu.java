package sheenrox82.RioV.src.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.mco.ExceptionMcoService;
import net.minecraft.client.mco.ExceptionRetryCall;
import net.minecraft.client.mco.McoClient;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Session;
import net.minecraft.world.storage.ISaveFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

import sheenrox82.RioV.src.proxy.ClientProxy;
import sheenrox82.RioV.src.util.Color;
import sheenrox82.RioV.src.util.Util;

public class GuiBannedMenu extends GuiScreen
{
	   private static final AtomicInteger field_146973_f = new AtomicInteger(0);
	    private static final Logger field_146974_g = LogManager.getLogger();
	    /** The RNG used by the Main Menu Screen. */

	    private static final Random rand = new Random();
	    /** Counts the number of screen updates. */

	    private float updateCounter;
	    /** The splash message. */

	    private String splashText;
	    private GuiButton buttonResetDemo;
	    /** Timer used to rotate the panorama, increases every tick. */

	    private int panoramaTimer;
	    /**
	     * Texture allocated for the current viewport of the main menu's panorama background.
	     */

	    private DynamicTexture viewportTexture;
	    private boolean field_96141_q = true;
	    private static boolean field_96140_r;
	    private static boolean field_96139_s;
	    private final Object field_104025_t = new Object();
	    private String field_92025_p;
	    private String field_146972_A;
	    private String field_104024_v;
	    private static final ResourceLocation minecraftTitleTextures = new ResourceLocation("textures/gui/title/minecraft.png");
	    /** An array of all the paths to the panorama pictures. */

	    private static final ResourceLocation[] titlePanoramaPaths = new ResourceLocation[] {new ResourceLocation("textures/gui/title/background/panorama_0.png"), new ResourceLocation("textures/gui/title/background/panorama_1.png"), new ResourceLocation("textures/gui/title/background/panorama_2.png"), new ResourceLocation("textures/gui/title/background/panorama_3.png"), new ResourceLocation("textures/gui/title/background/panorama_4.png"), new ResourceLocation("textures/gui/title/background/panorama_5.png")};
	    public static final String field_96138_a = "Please click " + EnumChatFormatting.UNDERLINE + "here" + EnumChatFormatting.RESET + " for more information.";
	    private int field_92024_r;
	    private int field_92023_s;
	    private int field_92022_t;
	    private int field_92021_u;
	    private int field_92020_v;
	    private int field_92019_w;
	    private ResourceLocation field_110351_G;
	    private GuiButton minecraftRealmsButton;
	    private GuiButton fmlModButton = null;
	    public BufferedReader bufferedreader = null;

	public GuiBannedMenu()
	{
		String var3;

		this.updateCounter = rand.nextFloat();
		this.field_92025_p = "";
		String var14 = System.getProperty("os_architecture");
		var3 = System.getProperty("java_version");

		if ("ppc".equalsIgnoreCase(var14))
		{
			this.field_92025_p = "" + EnumChatFormatting.BOLD + "Notice!" + EnumChatFormatting.RESET + " PowerPC compatibility will be dropped in Minecraft 1.6";
			this.field_104024_v = "http://tinyurl.com/javappc";
		}
		else if (var3 != null && var3.startsWith("1.5"))
		{
			this.field_92025_p = "" + EnumChatFormatting.BOLD + "Notice!" + EnumChatFormatting.RESET + " Java 1.5 compatibility will be dropped in Minecraft 1.6";
			this.field_104024_v = "http://tinyurl.com/javappc";
		}
	}

	/**
	 * Called from the main game loop to update the screen.
	 */
	public void updateScreen()
	{
		++this.panoramaTimer;
	}

	/**
	 * Returns true if this GUI should pause the game when it is displayed in single-player
	 */
	public boolean doesGuiPauseGame()
	{
		return false;
	}

	/**
	 * Fired when a key is typed. This is the equivalent of KeyListener.keyTyped(KeyEvent e).
	 */
	protected void keyTyped(char par1, int par2) {}

	/**
	 * Adds the buttons (and other controls) to the screen in question.
	 */
	public void initGui()
	{
		this.viewportTexture = new DynamicTexture(256, 256);
		this.field_110351_G = Minecraft.getMinecraft().getTextureManager().getDynamicTextureLocation("background", this.viewportTexture);
		Calendar var1 = Calendar.getInstance();
		var1.setTime(new Date());

		boolean var2 = true;
		int var3 = this.field_146295_m / 4 + 48;

		if (Minecraft.getMinecraft().isDemo())
		{
			this.addSingleplayerMultiplayerButtons(var3, 24);
		}
		else
		{
			this.addSingleplayerMultiplayerButtons(var3, 24);
		}

		this.func_130020_g();
		Object var4 = this.field_104025_t;

		 synchronized (this.field_104025_t)
	        {
	            this.field_92023_s = this.field_146289_q.getStringWidth(this.field_92025_p);
	            this.field_92024_r = this.field_146289_q.getStringWidth(this.field_146972_A);
	            int j = Math.max(this.field_92023_s, this.field_92024_r);
	            this.field_92022_t = (this.field_146294_l - j) / 2;
	            this.field_92021_u = ((GuiButton)this.field_146292_n.get(0)).field_146129_i - 24;
	            this.field_92020_v = this.field_92022_t + j;
	            this.field_92019_w = this.field_92021_u + 24;
	        }
	}

	private void func_130020_g()
    {
        if (this.field_96141_q)
        {
            if (!field_96140_r)
            {
                field_96140_r = true;
                (new Thread("MCO Availability Checker #" + field_146973_f.incrementAndGet())
                {
                    private static final String __OBFID = "CL_00001155";
                    public void run()
                    {
                        Session session = GuiBannedMenu.this.field_146297_k.getSession();
                        McoClient mcoclient = new McoClient(session.getSessionID(), session.getUsername(), "1.7.2", Minecraft.getMinecraft().getProxy());
                        boolean flag = false;

                        for (int i = 0; i < 3; ++i)
                        {
                            try
                            {
                                Boolean obool = mcoclient.func_148687_b();

                                if (obool.booleanValue())
                                {
                                	GuiBannedMenu.this.func_130022_h();
                                }

                                GuiBannedMenu.field_96139_s = obool.booleanValue();
                            }
                            catch (ExceptionRetryCall exceptionretrycall)
                            {
                                flag = true;
                            }
                            catch (ExceptionMcoService exceptionmcoservice)
                            {
                                GuiBannedMenu.field_146974_g.error("Couldn\'t connect to Realms");
                            }
                            catch (IOException ioexception)
                            {
                            	GuiBannedMenu.field_146974_g.error("Couldn\'t parse response connecting to Realms");
                            }

                            if (!flag)
                            {
                                break;
                            }

                            try
                            {
                                Thread.sleep(10000L);
                            }
                            catch (InterruptedException interruptedexception)
                            {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }).start();
            }
            else if (field_96139_s)
            {
                this.func_130022_h();
            }
        }
    }

	private void func_130022_h()
	{
		this.minecraftRealmsButton.field_146125_m = true;
	}

	private void addSingleplayerMultiplayerButtons(int par1, int par2)
	{
		GL11.glPushMatrix();
		//this.buttonList.add(new GuiRioVButton(1, this.width / 2 - 280, 90, I18n.getString("menu.singleplayer")));
		GL11.glPopMatrix();
	}

	protected void actionPerformed(GuiButton par1GuiButton)
	{
		
	}

	public void confirmClicked(boolean par1, int par2)
	{
		if (par1 && par2 == 12)
		{
			ISaveFormat var6 = Minecraft.getMinecraft().getSaveLoader();
			var6.flushCache();
			var6.deleteWorldDirectory("Demo_World");
			Minecraft.getMinecraft().func_147108_a(this);
		}
		else if (par2 == 13)
		{
			if (par1)
			{
				try
				{
					Class var3 = Class.forName("java.awt.Desktop");
					Object var4 = var3.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
					var3.getMethod("browse", new Class[] {URI.class}).invoke(var4, new Object[] {new URI(this.field_104024_v)});
				}
				catch (Throwable var5)
				{
					var5.printStackTrace();
				}
			}

			Minecraft.getMinecraft().func_147108_a(this);
		}
	}

	/**
	 * Draws the main menu panorama
	 */
	private void drawPanorama(int par1, int par2, float par3)
	{
		Tessellator var4 = Tessellator.instance;
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glPushMatrix();
		GL11.glLoadIdentity();
		Project.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glPushMatrix();
		GL11.glLoadIdentity();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_ALPHA_TEST);
		GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glDepthMask(false);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		byte var5 = 8;

		for (int var6 = 0; var6 < var5 * var5; ++var6)
		{
			GL11.glPushMatrix();
			float var7 = ((float)(var6 % var5) / (float)var5 - 0.5F) / 64.0F;
			float var8 = ((float)(var6 / var5) / (float)var5 - 0.5F) / 64.0F;
			float var9 = 0.0F;
			GL11.glTranslatef(var7, var8, var9);
			GL11.glRotatef(MathHelper.sin(((float)this.panoramaTimer + par3) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-((float)this.panoramaTimer + par3) * 0.1F, 0.0F, 1.0F, 0.0F);

			for (int var10 = 0; var10 < 6; ++var10)
			{
				GL11.glPushMatrix();

				if (var10 == 1)
				{
					GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
				}

				if (var10 == 2)
				{
					GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
				}

				if (var10 == 3)
				{
					GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
				}

				if (var10 == 4)
				{
					GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
				}

				if (var10 == 5)
				{
					GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
				}

				Minecraft.getMinecraft().getTextureManager().bindTexture(titlePanoramaPaths[var10]);
				var4.startDrawingQuads();
				var4.setColorRGBA_I(16777215, 255 / (var6 + 1));
				float var11 = 0.0F;
				var4.addVertexWithUV(-1.0D, -1.0D, 1.0D, (double)(0.0F + var11), (double)(0.0F + var11));
				var4.addVertexWithUV(1.0D, -1.0D, 1.0D, (double)(1.0F - var11), (double)(0.0F + var11));
				var4.addVertexWithUV(1.0D, 1.0D, 1.0D, (double)(1.0F - var11), (double)(1.0F - var11));
				var4.addVertexWithUV(-1.0D, 1.0D, 1.0D, (double)(0.0F + var11), (double)(1.0F - var11));
				var4.draw();
				GL11.glPopMatrix();
			}

			GL11.glPopMatrix();
			GL11.glColorMask(true, true, true, false);
		}

		var4.setTranslation(0.0D, 0.0D, 0.0D);
		GL11.glColorMask(true, true, true, true);
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glPopMatrix();
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glPopMatrix();
		GL11.glDepthMask(true);
		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glEnable(GL11.GL_ALPHA_TEST);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
	}

	/**
	 * Rotate and blurs the skybox view in the main menu
	 */
	private void rotateAndBlurSkybox(float par1)
	{
		Minecraft.getMinecraft().getTextureManager().bindTexture(this.field_110351_G);
		GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0, 0, 0, 256, 256);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColorMask(true, true, true, false);
		Tessellator var2 = Tessellator.instance;
		var2.startDrawingQuads();
		byte var3 = 3;

		for (int var4 = 0; var4 < var3; ++var4)
		{
			var2.setColorRGBA_F(1.0F, 1.0F, 1.0F, 1.0F / (float)(var4 + 1));
            int var5 = this.field_146294_l;
            int var6 = this.field_146295_m;
			float var7 = (float)(var4 - var3 / 2) / 256.0F;
			var2.addVertexWithUV((double)var5, (double)var6, (double)this.zLevel, (double)(0.0F + var7), 0.0D);
			var2.addVertexWithUV((double)var5, 0.0D, (double)this.zLevel, (double)(1.0F + var7), 0.0D);
			var2.addVertexWithUV(0.0D, 0.0D, (double)this.zLevel, (double)(1.0F + var7), 1.0D);
			var2.addVertexWithUV(0.0D, (double)var6, (double)this.zLevel, (double)(0.0F + var7), 1.0D);
		}

		var2.draw();
		GL11.glColorMask(true, true, true, true);
	}

	/**
	 * Renders the skybox in the main menu
	 */
	private void renderSkybox(int par1, int par2, float par3)
    {
        this.field_146297_k.func_147110_a().func_147609_e();
        GL11.glViewport(0, 0, 256, 256);
        this.drawPanorama(par1, par2, par3);
        this.rotateAndBlurSkybox(par3);
        this.rotateAndBlurSkybox(par3);
        this.rotateAndBlurSkybox(par3);
        this.rotateAndBlurSkybox(par3);
        this.rotateAndBlurSkybox(par3);
        this.rotateAndBlurSkybox(par3);
        this.rotateAndBlurSkybox(par3);
        this.field_146297_k.func_147110_a().func_147610_a(true);
        GL11.glViewport(0, 0, this.field_146297_k.displayWidth, this.field_146297_k.displayHeight);
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        float f1 = this.field_146294_l > this.field_146295_m ? 120.0F / (float)this.field_146294_l : 120.0F / (float)this.field_146295_m;
        float f2 = (float)this.field_146295_m * f1 / 256.0F;
        float f3 = (float)this.field_146294_l * f1 / 256.0F;
        tessellator.setColorRGBA_F(1.0F, 1.0F, 1.0F, 1.0F);
        int k = this.field_146294_l;
        int l = this.field_146295_m;
        tessellator.addVertexWithUV(0.0D, (double)l, (double)this.zLevel, (double)(0.5F - f2), (double)(0.5F + f3));
        tessellator.addVertexWithUV((double)k, (double)l, (double)this.zLevel, (double)(0.5F - f2), (double)(0.5F - f3));
        tessellator.addVertexWithUV((double)k, 0.0D, (double)this.zLevel, (double)(0.5F + f2), (double)(0.5F - f3));
        tessellator.addVertexWithUV(0.0D, 0.0D, (double)this.zLevel, (double)(0.5F + f2), (double)(0.5F + f3));
        tessellator.draw();
    }

	/**
	 * Draws the screen and all the components in it.
	 */
	public void drawScreen(int par1, int par2, float par3)
	{
		 GL11.glDisable(GL11.GL_ALPHA_TEST);
	        this.renderSkybox(par1, par2, par3);
	        GL11.glEnable(GL11.GL_ALPHA_TEST);
	        Tessellator tessellator = Tessellator.instance;
	        short short1 = 274;
	        int k = this.field_146294_l / 2 - short1 / 2;
	        byte b0 = 30;
	        this.drawGradientRect(0, 0, this.field_146294_l, this.field_146295_m, -2130706433, 16777215);
	        this.drawGradientRect(0, 0, this.field_146294_l, this.field_146295_m, 0, Integer.MIN_VALUE);
	        this.field_146297_k.getTextureManager().bindTexture(minecraftTitleTextures);
	        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

	        if ((double)this.updateCounter < 1.0E-4D)
	        {
	            this.drawTexturedModalRect(k + 0, b0 + 0, 0, 0, 99, 44);
	            this.drawTexturedModalRect(k + 99, b0 + 0, 129, 0, 27, 44);
	            this.drawTexturedModalRect(k + 99 + 26, b0 + 0, 126, 0, 3, 44);
	            this.drawTexturedModalRect(k + 99 + 26 + 3, b0 + 0, 99, 0, 26, 44);
	            this.drawTexturedModalRect(k + 155, b0 + 0, 0, 45, 155, 44);
	        }
	        else
	        {
	            this.drawTexturedModalRect(k + 0, b0 + 0, 0, 0, 155, 44);
	            this.drawTexturedModalRect(k + 155, b0 + 0, 0, 45, 155, 44);
	        }
	        
	        tessellator.setColorOpaque_I(-1);
	        GL11.glPushMatrix();
	        GL11.glTranslatef((float)(this.field_146294_l / 2 + 90), 70.0F, 0.0F);
	        GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
	        float f1 = 1.8F - MathHelper.abs(MathHelper.sin((float)(Minecraft.getSystemTime() % 1000L) / 1000.0F * (float)Math.PI * 2.0F) * 0.1F);
	        f1 = f1 * 100.0F / (float)(this.field_146289_q.getStringWidth(this.splashText) + 32);
	        GL11.glScalef(f1, f1, f1);
	        this.drawCenteredString(this.field_146289_q, this.splashText, 0, -8, -256);
	        GL11.glPopMatrix();

		String var10 = Color.RED + "You have been banned from The Mists of RioV Mod - sheenrox82";
		String var11 = Color.RED + "Current banned players: " + ClientProxy.bannedList;
		this.drawString(this.field_146289_q, var10, this.field_146294_l / 2 - 165, 90, 16777215);
		this.drawString(this.field_146289_q, var11, this.field_146294_l / 2 - 165, 100, 16777215);

		super.drawScreen(par1, par2, par3);
	}

	/**
	 * Called when the mouse is clicked.
	 */
	protected void mouseClicked(int par1, int par2, int par3)
	{
		super.mouseClicked(par1, par2, par3);
	}

	static Minecraft func_110348_a(GuiBannedMenu par0GuiMainMenu)
	{
		return Minecraft.getMinecraft();
	}

	static void func_130021_b(GuiBannedMenu par0GuiMainMenu)
	{
		par0GuiMainMenu.func_130022_h();
	}

	static boolean func_110349_a(boolean par0)
	{
		field_96139_s = par0;
		return par0;
	}

	static Minecraft func_130018_c(GuiBannedMenu par0GuiMainMenu)
	{
		return Minecraft.getMinecraft();
	}

	static Minecraft func_130019_d(GuiBannedMenu par0GuiMainMenu)
	{
		return Minecraft.getMinecraft();
	}
}