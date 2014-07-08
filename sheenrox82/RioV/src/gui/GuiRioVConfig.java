package sheenrox82.RioV.src.gui;

import sheenrox82.RioV.src.base.Config;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
 
public class GuiRioVConfig extends GuiConfig 
{
    public GuiRioVConfig(GuiScreen parent) 
    {
        super(parent, new ConfigElement(Config.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), "RioV", false, false, GuiConfig.getAbridgedConfigPath(Config.config.toString()));
    }
}