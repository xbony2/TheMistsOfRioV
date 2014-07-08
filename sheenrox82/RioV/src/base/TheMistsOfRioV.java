package sheenrox82.RioV.src.base;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.handler.GuiHandler;
import sheenrox82.RioV.src.proxy.CommonProxy;
import sheenrox82.RioV.src.util.Registry;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Util.MOD_ID ,name= Util.MOD_NAME, version= Util.VERSION, guiFactory = "sheenrox82.RioV.src.base.RioVGuiFactory")
public class TheMistsOfRioV
{
	@Instance(Util.MOD_ID)
	private static TheMistsOfRioV instance;

	@SidedProxy(clientSide="sheenrox82.RioV.src.proxy.ClientProxy", serverSide="sheenrox82.RioV.src.proxy.CommonProxy")
	public static CommonProxy commonProxy;

	public CreativeTabs tab = new CreativeTabs(Util.MOD_ID) {public Item getTabIconItem() {return Item.getItemFromBlock(RioVBlocks.infuser);}};
	public GuiHandler guiHandler = new GuiHandler();
	public boolean natura;
	public boolean aether;
	public boolean thaumcraft;
	public boolean optifine;
	public boolean modLoaded = false;

	public static TheMistsOfRioV getInstance()
	{
		return instance;
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent initEvent)
	{
		Registry.preInit(initEvent);
	}

	@EventHandler
	public void init(FMLInitializationEvent initEvent)
	{
		Registry.init(initEvent);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent initEvent)
	{
		Registry.postInit(initEvent);
	}
}
