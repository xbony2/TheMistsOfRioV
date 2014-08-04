package sheenrox82.RioV.src.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import sheenrox82.RioV.src.api.util.Color;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiManual extends GuiScreen
{
	protected String title = Util.MOD_NAME + " Documentation";
	public int currentPage = 0;
	public int maxPages = 7;
	public int defaultPage = 0;

	public void initGui()
	{
		this.buttonList.add(new GuiButton(2000, this.width / 2 - 200, this.height / 6 + 72 - 6, 20, 20, I18n.format("<-", new Object[0])));
		this.buttonList.add(new GuiButton(2001, this.width / 2 + 180, this.height / 6 + 72 - 6, 20, 20, I18n.format("->", new Object[0])));
	}

	protected void actionPerformed(GuiButton p_146284_1_)
	{
		if (p_146284_1_.id == 2000)
		{
			if(currentPage > defaultPage)
			{
				currentPage -= 1;
			}
		}

		if (p_146284_1_.id == 2001)
		{
			if(currentPage < maxPages)
			{
				currentPage += 1;
			}
		}
	}

	public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_)
	{
		this.drawDefaultBackground();
		this.drawCenteredString(this.fontRendererObj, this.title, this.width / 2, 15, 16777215);
		this.drawCenteredString(this.fontRendererObj, "Current Page: " + currentPage + "/" + maxPages, this.width / 2, 25, 16777215);
		this.displayPageInfo();
		super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
	}
	
	public void displayPageInfo()
	{
		if(currentPage == 0)
		{
			this.drawCenteredString(this.fontRendererObj, Util.MOD_NAME + " In-Game Documentation by Sheenrox82", this.width / 2, 50, 16777215);
			this.drawCenteredString(this.fontRendererObj, Color.GREEN + "Table of Contents", this.width / 2, 60, 16777215);
			this.drawCenteredString(this.fontRendererObj, "-----------------", this.width / 2, 70, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Getting Started...........1", this.width / 2, 80, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Tools...................................2", this.width / 2, 90, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Infuser.............................3", this.width / 2, 100, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Dimensions......................4", this.width / 2, 110, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Bosses..............................5", this.width / 2, 120, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Eos Magic........................6", this.width / 2, 130, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Faction/Rep..................7", this.width / 2, 140, 16777215);
		}
		
		if(currentPage == 1)
		{
			this.drawCenteredString(this.fontRendererObj, Color.GREEN + "Getting Started", this.width / 2, 50, 16777215);
			this.drawCenteredString(this.fontRendererObj, "---------------", this.width / 2, 60, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Welcome to " + Util.MOD_NAME + ". This will be a difficult ", this.width / 2, 70, 16777215);
			this.drawCenteredString(this.fontRendererObj, "and frustrating mod as you advance throughout it.", this.width / 2, 80, 16777215);
			this.drawCenteredString(this.fontRendererObj, "To get started, do as you would normally do in Minecraft. Gather", this.width / 2, 90, 16777215);
			this.drawCenteredString(this.fontRendererObj, "wood, make a house, etc. Once you get an Iron Pickaxe,", this.width / 2, 100, 16777215);
			this.drawCenteredString(this.fontRendererObj, "proceed to find Onyx Ore (It is a black colored ore in the Overworld)", this.width / 2, 110, 16777215);
			this.drawCenteredString(this.fontRendererObj, "and mine it. Gather Amethyst too, if you wish, but it's not as", this.width / 2, 120, 16777215);
			this.drawCenteredString(this.fontRendererObj, "good as Onyx. Next travel to the Nether to find Black Bone.", this.width / 2, 130, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Black Bone is found by killing Skeletal Horses in the Nether.", this.width / 2, 140, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Once you have these materials, you need a RioV Anvil. To make", this.width / 2, 150, 16777215);
			this.drawCenteredString(this.fontRendererObj, "this, get Red Wool and Slate Bricks (Slate is like stone, found", this.width / 2, 160, 16777215);
			this.drawCenteredString(this.fontRendererObj, "in Overworld) and make the anvil.", this.width / 2, 170, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Combine the Black Bones and the Onyx to make an Onyx Pickaxe.", this.width / 2, 180, 16777215);
			this.drawCenteredString(this.fontRendererObj, "However, not all tools in this mod need Black Bones. Some need sticks!", this.width / 2, 190, 16777215);
			this.drawCenteredString(this.fontRendererObj, "These sticks/other handles can be found in the dimension the material for", this.width / 2, 200, 16777215);
			this.drawCenteredString(this.fontRendererObj, "the tools are in.", this.width / 2, 210, 16777215);
		}
		
		if(currentPage == 2)
		{
			this.drawCenteredString(this.fontRendererObj, Color.GREEN + "Tools", this.width / 2, 50, 16777215);
			this.drawCenteredString(this.fontRendererObj, "---------------", this.width / 2, 60, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Tools are a very important part in this mod. They are", this.width / 2, 70, 16777215);
			this.drawCenteredString(this.fontRendererObj, "heavily required to be upgraded and used to advance through", this.width / 2, 80, 16777215);
			this.drawCenteredString(this.fontRendererObj, "dimensions, get materials to fight bosses, and more.", this.width / 2, 90, 16777215);
			this.drawCenteredString(this.fontRendererObj, "There are new ores in every dimension to make tools out of.", this.width / 2, 100, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Some of these tools are very weak and some, strong.", this.width / 2, 110, 16777215);
			this.drawCenteredString(this.fontRendererObj, "If you look at the handle of the tool you are making, it is", this.width / 2, 120, 16777215);
			this.drawCenteredString(this.fontRendererObj, "very easy to determine the item you need.", this.width / 2, 130, 16777215);
			this.drawCenteredString(this.fontRendererObj, "White = Skywood Sticks (Found in Sanctuatite Dimension)", this.width / 2, 140, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Black = Black Bones (Found in Nether Dimension)", this.width / 2, 150, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Red = Blood Sticks (Found in Flamonor Dimension)", this.width / 2, 160, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Blue = Glimmerwood Sticks (Found in Vaeryn Dimension)", this.width / 2, 170, 16777215);
			this.drawCenteredString(this.fontRendererObj, "These are the main items you need to make tools.", this.width / 2, 180, 16777215);
			this.drawCenteredString(this.fontRendererObj, "The weakest tool/armor set is the" + Color.DARK_PURPLE + " Amethyst" + Color.WHITE + " set. The strongest", this.width / 2, 190, 16777215);
			this.drawCenteredString(this.fontRendererObj, "is " + Color.DARK_PURPLE + "Aleris" + Color.WHITE + ", but the" + Color.DARK_RED + " Supreme Aun'Tun" + Color.WHITE + " gear is stronger, however", this.width / 2, 200, 16777215);
			this.drawCenteredString(this.fontRendererObj, "that is not a complete tool set.", this.width / 2, 210, 16777215);
		}
		
		if(currentPage == 3)
		{
			this.drawCenteredString(this.fontRendererObj, Color.GREEN + "Infuser", this.width / 2, 50, 16777215);
			this.drawCenteredString(this.fontRendererObj, "---------------", this.width / 2, 60, 16777215);
			this.drawCenteredString(this.fontRendererObj, "The Infuser is a block, this block is going to be", this.width / 2, 70, 16777215);
			this.drawCenteredString(this.fontRendererObj, "very important throughout the mod. It is used to upgrade", this.width / 2, 80, 16777215);
			this.drawCenteredString(this.fontRendererObj, "your armor and tools to further progress into the mod.", this.width / 2, 90, 16777215);
			this.drawCenteredString(this.fontRendererObj, "To use this, kill Mages to obtain Orbs, these", this.width / 2, 100, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Orbs are the fuel for the Infuser. Place the Orb in the ", this.width / 2, 110, 16777215);
			this.drawCenteredString(this.fontRendererObj, "far left slot in the Infuser window, and place your", this.width / 2, 120, 16777215);
			this.drawCenteredString(this.fontRendererObj, "armor/tool in the middle slot and let the Infuser do it's thing.", this.width / 2, 130, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Your tool will now be upgraded with better stats.", this.width / 2, 140, 16777215);
		}
		
		if(currentPage == 4)
		{
			this.drawCenteredString(this.fontRendererObj, Color.GREEN + "Dimensions", this.width / 2, 50, 16777215);
			this.drawCenteredString(this.fontRendererObj, "---------------", this.width / 2, 60, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Dimensions are a huge part of this mod. You will use", this.width / 2, 70, 16777215);
			this.drawCenteredString(this.fontRendererObj, "these dimensions to fight bosses and mine for tools and gather unique food.", this.width / 2, 80, 16777215);
			this.drawCenteredString(this.fontRendererObj, "There are four dimensions, each consisting of deadly mobs, and", this.width / 2, 90, 16777215);
			this.drawCenteredString(this.fontRendererObj, "dangerous landscapes. Such as: deadly black liquid, tall and", this.width / 2, 100, 16777215);
			this.drawCenteredString(this.fontRendererObj, "steep mountains and floating islands. Certain bosses", this.width / 2, 110, 16777215);
			this.drawCenteredString(this.fontRendererObj, "can only be spawned in certain dimensions, the boss summoning", this.width / 2, 120, 16777215);
			this.drawCenteredString(this.fontRendererObj, "crystals will tell you which dimension to spawn the boss in.", this.width / 2, 130, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Here is a list of the new dimensions in RioV:", this.width / 2, 140, 16777215);
			this.drawCenteredString(this.fontRendererObj, "1. Blind Oasis: The first dimension, a dark place.", this.width / 2, 150, 16777215);
			this.drawCenteredString(this.fontRendererObj, "2. Vaeryn: A blue wonderland, but full of deadly creatures.", this.width / 2, 160, 16777215);
			this.drawCenteredString(this.fontRendererObj, "3. Flamonor: A blood-red hell.", this.width / 2, 170, 16777215);
			this.drawCenteredString(this.fontRendererObj, "4. Sanctuatite: The final dimension, a sanctuary.", this.width / 2, 180, 16777215);
		}
		
		if(currentPage == 5)
		{
			this.drawCenteredString(this.fontRendererObj, Color.GREEN + "Bosses", this.width / 2, 50, 16777215);
			this.drawCenteredString(this.fontRendererObj, "---------------", this.width / 2, 60, 16777215);
			this.drawCenteredString(this.fontRendererObj, "There are several bosses in this mod, and some are friendly", this.width / 2, 70, 16777215);
			this.drawCenteredString(this.fontRendererObj, "depending on your Faction (explained later on)", this.width / 2, 80, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Bosses are on Factions, too. Depending on your Faction, they will", this.width / 2, 90, 16777215);
			this.drawCenteredString(this.fontRendererObj, "either attack you, or help you. Your main goal is to kill", this.width / 2, 100, 16777215);
			this.drawCenteredString(this.fontRendererObj, "the opposing Faction's God. There are two Gods.", this.width / 2, 110, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Jaerin: Ti'Tun", this.width / 2, 120, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Raetiin: Aun'Tun", this.width / 2, 130, 16777215);
			this.drawCenteredString(this.fontRendererObj, "If you are on Jaerin, you want to kill Aun'Tun.", this.width / 2, 140, 16777215);
			this.drawCenteredString(this.fontRendererObj, "If you are on Raetiin, you want to kill Ti'Tun.", this.width / 2, 150, 16777215);
		}
		
		if(currentPage == 6)
		{
			this.drawCenteredString(this.fontRendererObj, Color.GREEN + "Eos Magic", this.width / 2, 50, 16777215);
			this.drawCenteredString(this.fontRendererObj, "---------------", this.width / 2, 60, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Eos is an essential part of RioV as well, you need it", this.width / 2, 70, 16777215);
			this.drawCenteredString(this.fontRendererObj, "to do certain things. You can monitor your Eos count by", this.width / 2, 80, 16777215);
			this.drawCenteredString(this.fontRendererObj, "looking at the purple bar/text in the lower left-hand corner.", this.width / 2, 90, 16777215);
			this.drawCenteredString(this.fontRendererObj, "You all have 50 max Eos, and this does regenerate. You can also", this.width / 2, 100, 16777215);
			this.drawCenteredString(this.fontRendererObj, "use an Eos potion (found by killing Mages) to speed up the process.", this.width / 2, 110, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Eos is needed to use wands in the mod, and summon bosses", this.width / 2, 120, 16777215);
			this.drawCenteredString(this.fontRendererObj, "or make portals.", this.width / 2, 130, 16777215);
		}
		
		if(currentPage == 7)
		{
			this.drawCenteredString(this.fontRendererObj, Color.GREEN + "Factions/Rep", this.width / 2, 50, 16777215);
			this.drawCenteredString(this.fontRendererObj, "---------------", this.width / 2, 60, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Factions and Reputation are two things that", this.width / 2, 70, 16777215);
			this.drawCenteredString(this.fontRendererObj, "determine which God you are going to kill. Your reputation", this.width / 2, 80, 16777215);
			this.drawCenteredString(this.fontRendererObj, "decides your faction. If you have a positive reputation, you", this.width / 2, 90, 16777215);
			this.drawCenteredString(this.fontRendererObj, "will be on " + Color.GREEN + "Jaerin" + Color.WHITE + ". If you are negative, you will be on " + Color.DARK_RED + "Raetiin" + Color.WHITE + ".", this.width / 2, 100, 16777215);
			this.drawCenteredString(this.fontRendererObj, "Depending on your faction, certain RioV mobs will not ", this.width / 2, 110, 16777215);
			this.drawCenteredString(this.fontRendererObj, "attack you; mobs are on factions as well. You can find out their", this.width / 2, 120, 16777215);
			this.drawCenteredString(this.fontRendererObj, "faction by looking at their nametags above them.", this.width / 2, 130, 16777215);
		}
	}
}