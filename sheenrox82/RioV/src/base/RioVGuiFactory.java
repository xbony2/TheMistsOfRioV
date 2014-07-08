package sheenrox82.RioV.src.base;
 
import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
 

import java.util.Set;

import sheenrox82.RioV.src.gui.GuiRioVConfig;
 
public class RioVGuiFactory implements IModGuiFactory 
{
    @Override
    public void initialize(Minecraft minecraftInstance) 
    {
 
    }
 
    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() 
    {
        return GuiRioVConfig.class;
    }
 
    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() 
    {
        return null;
    }
 
    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) 
    {
        return null;
    }
}