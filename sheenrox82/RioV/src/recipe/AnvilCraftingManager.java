package sheenrox82.RioV.src.recipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;

public class AnvilCraftingManager
{
	public String[] pickaxe = new String[] {"XXX", " ! ", " ! ", " ! "};
	public String[] sword = new String[] {" X ", " X ", "XXX", " ! ",};
	public String[] shovel = new String[] {"X", "!", "!", "!"};
	public String[] axe = new String[] {"XX", "X!", " !", " !"};
	public String[] dagger = new String[] {"X", "!"};
	
	public String[] helmet = new String[] {"XXX", "X X"};
	public String[] chestplate = new String[] {"X X", "XXX", "XXX"};
	public String[] leggings = new String[] {"XXX", "X X", "X X"};
	public String[] boots = new String[] {"X X", "X X"};
	public String[] shield = { "X X", "XXX", " X " };
	
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	public static AnvilCraftingManager instance;
	public static List recipes = new ArrayList();

	public static final AnvilCraftingManager getInstance()
	{
		return instance;
	}

	public AnvilCraftingManager()
	{
		recipes = new ArrayList();

		this.addRecipe(new ItemStack(RioVItems.amethystPickaxe, 1), new Object[] { pickaxe, Character.valueOf('X'), RioVItems.amethyst, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.amethystSword, 1), new Object[] { sword, Character.valueOf('X'), RioVItems.amethyst, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.amethystShovel, 1), new Object[] { shovel, Character.valueOf('X'), RioVItems.amethyst, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.amethystAxe, 1), new Object[] { axe, Character.valueOf('X'), RioVItems.amethyst, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.onyxPickaxe, 1), new Object[] { pickaxe, Character.valueOf('X'), RioVItems.onyx, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.onyxSword, 1), new Object[] { sword, Character.valueOf('X'), RioVItems.onyx, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.onyxShovel, 1), new Object[] { shovel, Character.valueOf('X'), RioVItems.onyx, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.onyxAxe, 1), new Object[] { axe, Character.valueOf('X'), RioVItems.onyx, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.dragonPickaxe, 1), new Object[] { pickaxe, Character.valueOf('X'), RioVItems.dragonSoul, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.dragonSword, 1), new Object[] { sword, Character.valueOf('X'), RioVItems.dragonSoul, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.dragonShovel, 1), new Object[] { shovel, Character.valueOf('X'), RioVItems.dragonSoul, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.dragonAxe, 1), new Object[] { axe, Character.valueOf('X'), RioVItems.dragonSoul, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.agonitePickaxe, 1), new Object[] { pickaxe, Character.valueOf('X'), RioVItems.agonite, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.galokinSword, 1), new Object[] { sword, Character.valueOf('X'), RioVItems.galokinCrystal, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.blindonitePickaxe, 1), new Object[] { pickaxe, Character.valueOf('X'), RioVItems.blindonite, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.blindoniteSword, 1), new Object[] { sword, Character.valueOf('X'), RioVItems.blindonite, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.blindoniteShovel, 1), new Object[] { shovel, Character.valueOf('X'), RioVItems.blindonite, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.blindoniteAxe, 1), new Object[] { axe, Character.valueOf('X'), RioVItems.blindonite, Character.valueOf('!'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.vravinitePickaxe, 1), new Object[] { pickaxe, Character.valueOf('X'), RioVItems.vravinite, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		this.addRecipe(new ItemStack(RioVItems.vraviniteSword, 1), new Object[] { sword, Character.valueOf('X'), RioVItems.vravinite, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		this.addRecipe(new ItemStack(RioVItems.vraviniteShovel, 1), new Object[] { shovel, Character.valueOf('X'), RioVItems.vravinite, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		this.addRecipe(new ItemStack(RioVItems.vraviniteAxe, 1), new Object[] { axe, Character.valueOf('X'), RioVItems.vravinite, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		this.addRecipe(new ItemStack(RioVItems.cherryBlossomPickaxe, 1), new Object[] { pickaxe, Character.valueOf('X'), RioVBlocks.cherryPlanks, Character.valueOf('!'), RioVItems.cherryBlossomSticks});
		this.addRecipe(new ItemStack(RioVItems.cherryBlossomSword, 1), new Object[] { sword, Character.valueOf('X'), RioVBlocks.cherryPlanks, Character.valueOf('!'), RioVItems.cherryBlossomSticks});
		this.addRecipe(new ItemStack(RioVItems.cherryBlossomShovel, 1), new Object[] { shovel, Character.valueOf('X'), RioVBlocks.cherryPlanks, Character.valueOf('!'), RioVItems.cherryBlossomSticks});
		this.addRecipe(new ItemStack(RioVItems.cherryBlossomAxe, 1), new Object[] { axe, Character.valueOf('X'), RioVBlocks.cherryPlanks, Character.valueOf('!'), RioVItems.cherryBlossomSticks});
		this.addRecipe(new ItemStack(RioVItems.glimmerwoodPickaxe, 1), new Object[] { pickaxe, Character.valueOf('X'), RioVBlocks.glimmerwoodPlanks, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		this.addRecipe(new ItemStack(RioVItems.glimmerwoodSword, 1), new Object[] { sword, Character.valueOf('X'), RioVBlocks.glimmerwoodPlanks, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		this.addRecipe(new ItemStack(RioVItems.glimmerwoodShovel, 1), new Object[] { shovel, Character.valueOf('X'), RioVBlocks.glimmerwoodPlanks, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		this.addRecipe(new ItemStack(RioVItems.glimmerwoodAxe, 1), new Object[] { axe, Character.valueOf('X'), RioVBlocks.glimmerwoodPlanks, Character.valueOf('!'), RioVItems.glimmerwoodSticks});
		this.addRecipe(new ItemStack(RioVItems.khuulisScythe, 1), "X  ", " Z ", "  X", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('Z'), RioVItems.blackBone);
		this.addRecipe(new ItemStack(RioVItems.bowOfWurTun, 1), " XC", "D C", " XC", Character.valueOf('X'), Items.gold_ingot, Character.valueOf('C'), Items.string, Character.valueOf('D'), RioVItems.blackBone);
		this.addRecipe(new ItemStack(RioVItems.enforcedBowOfWurTun, 1), " XC", "DOC", " XC", Character.valueOf('X'), Items.gold_ingot, Character.valueOf('C'), Items.string, Character.valueOf('D'), RioVItems.blackBone, Character.valueOf('O'), RioVItems.bowOfWurTun);
		this.addRecipe(new ItemStack(RioVItems.skywoodPickaxe, 1), new Object[] { pickaxe, Character.valueOf('X'), RioVBlocks.skywoodPlanks, Character.valueOf('!'), RioVItems.skywoodSticks});
		this.addRecipe(new ItemStack(RioVItems.skywoodSword, 1), new Object[] { sword, Character.valueOf('X'), RioVBlocks.skywoodPlanks, Character.valueOf('!'), RioVItems.skywoodSticks});
		this.addRecipe(new ItemStack(RioVItems.skywoodShovel, 1), new Object[] { shovel, Character.valueOf('X'), RioVBlocks.skywoodPlanks, Character.valueOf('!'), RioVItems.skywoodSticks});
		this.addRecipe(new ItemStack(RioVItems.skywoodAxe, 1), new Object[] { axe, Character.valueOf('X'), RioVBlocks.skywoodPlanks, Character.valueOf('!'), RioVItems.skywoodSticks});
		this.addRecipe(new ItemStack(RioVItems.bloodPickaxe, 1), new Object[] { pickaxe, Character.valueOf('X'), RioVBlocks.bloodPlanks, Character.valueOf('!'), RioVItems.bloodSticks});
		this.addRecipe(new ItemStack(RioVItems.bloodSword, 1), new Object[] { sword, Character.valueOf('X'), RioVBlocks.bloodPlanks, Character.valueOf('!'), RioVItems.bloodSticks});
		this.addRecipe(new ItemStack(RioVItems.bloodShovel, 1), new Object[] { shovel, Character.valueOf('X'), RioVBlocks.bloodPlanks, Character.valueOf('!'), RioVItems.bloodSticks});
		this.addRecipe(new ItemStack(RioVItems.bloodAxe, 1), new Object[] { axe, Character.valueOf('X'), RioVBlocks.bloodPlanks, Character.valueOf('!'), RioVItems.bloodSticks});
		this.addRecipe(new ItemStack(RioVItems.alerisPickaxe, 1), new Object[] { pickaxe, Character.valueOf('X'), RioVItems.aleris, Character.valueOf('!'), RioVItems.skywoodSticks});
		this.addRecipe(new ItemStack(RioVItems.alerisSword, 1), new Object[] { sword, Character.valueOf('X'), RioVItems.aleris, Character.valueOf('!'), RioVItems.skywoodSticks});
		this.addRecipe(new ItemStack(RioVItems.alerisShovel, 1), new Object[] { shovel, Character.valueOf('X'), RioVItems.aleris, Character.valueOf('!'), RioVItems.skywoodSticks});
		this.addRecipe(new ItemStack(RioVItems.alerisAxe, 1), new Object[] { axe, Character.valueOf('X'), RioVItems.aleris, Character.valueOf('!'), RioVItems.skywoodSticks});
		this.addRecipe(new ItemStack(RioVItems.daetoriSword, 1), new Object[] { " X ", " X ", "!!!", " X ", Character.valueOf('X'), RioVItems.blackBone, Character.valueOf('!'), Items.iron_ingot});
		this.addRecipe(new ItemStack(RioVItems.sorrowSword, 1), new Object[] { " X ", " X ", "XXX", " X ", Character.valueOf('X'), RioVItems.blackBone});
		this.addRecipe(new ItemStack(RioVItems.unfusedAxeOfAunTun, 1), new Object[] { "XOX", "X!X", " ! ", "*!*", Character.valueOf('X'), RioVItems.vulron, Character.valueOf('!'), RioVItems.blackBone, Character.valueOf('O'), RioVItems.darkMatter, Character.valueOf('*'), RioVItems.clothOfMagic});
		this.addRecipe(new ItemStack(RioVItems.swordOfFlame, 1), "*", "*", "*", Character.valueOf('*'), RioVItems.ingotOfFlame);

		this.addRecipe(new ItemStack(RioVItems.onyxHelmet, 1), new Object[] { helmet, Character.valueOf('X'), RioVItems.onyx});
		this.addRecipe(new ItemStack(RioVItems.onyxChestplate, 1), new Object[] { chestplate, Character.valueOf('X'), RioVItems.onyx});
		this.addRecipe(new ItemStack(RioVItems.onyxLeggings, 1), new Object[] { leggings, Character.valueOf('X'), RioVItems.onyx});
		this.addRecipe(new ItemStack(RioVItems.onyxBoots, 1), new Object[] { boots, Character.valueOf('X'), RioVItems.onyx});
		this.addRecipe(new ItemStack(RioVItems.amethystHelmet, 1), new Object[] { helmet, Character.valueOf('X'), RioVItems.amethyst});
		this.addRecipe(new ItemStack(RioVItems.amethystChestplate, 1), new Object[] { chestplate, Character.valueOf('X'), RioVItems.amethyst});
		this.addRecipe(new ItemStack(RioVItems.amethystLeggings, 1), new Object[] { leggings, Character.valueOf('X'), RioVItems.amethyst});
		this.addRecipe(new ItemStack(RioVItems.amethystBoots, 1), new Object[] { boots, Character.valueOf('X'), RioVItems.amethyst});
		this.addRecipe(new ItemStack(RioVItems.garnetHelmet, 1), new Object[] { helmet, Character.valueOf('X'), RioVItems.garnet});
		this.addRecipe(new ItemStack(RioVItems.garnetChestplate, 1), new Object[] { chestplate, Character.valueOf('X'), RioVItems.garnet});
		this.addRecipe(new ItemStack(RioVItems.garnetLeggings, 1), new Object[] { leggings, Character.valueOf('X'), RioVItems.garnet});
		this.addRecipe(new ItemStack(RioVItems.garnetBoots, 1), new Object[] { boots, Character.valueOf('X'), RioVItems.garnet});
		this.addRecipe(new ItemStack(RioVItems.mythrilHelmet, 1), "XAX", "X*X", Character.valueOf('X'), RioVItems.mythrilIngot, Character.valueOf('A'), Items.iron_ingot, Character.valueOf('*'), RioVItems.darkMatter);
		this.addRecipe(new ItemStack(RioVItems.mythrilChestplate, 1), "X X", "XAX", "X*X", Character.valueOf('X'), RioVItems.mythrilIngot, Character.valueOf('A'), Items.iron_ingot, Character.valueOf('*'), RioVItems.darkMatter);
		this.addRecipe(new ItemStack(RioVItems.mythrilLeggings, 1), "X*X", "A A", "X X", Character.valueOf('X'), RioVItems.mythrilIngot, Character.valueOf('A'), Items.iron_ingot, Character.valueOf('*'), RioVItems.darkMatter);
		this.addRecipe(new ItemStack(RioVItems.mythrilBoots, 1), "A A", "X*X", Character.valueOf('X'), RioVItems.mythrilIngot, Character.valueOf('A'), Items.iron_ingot, Character.valueOf('*'), RioVItems.darkMatter);
		this.addRecipe(new ItemStack(RioVItems.dragonHelmet, 1), new Object[] { helmet, Character.valueOf('X'), RioVItems.dragonSoul});
		this.addRecipe(new ItemStack(RioVItems.dragonChestplate, 1), new Object[] { chestplate, Character.valueOf('X'), RioVItems.dragonSoul});
		this.addRecipe(new ItemStack(RioVItems.dragonLeggings, 1), new Object[] { leggings, Character.valueOf('X'), RioVItems.dragonSoul});
		this.addRecipe(new ItemStack(RioVItems.dragonBoots, 1), new Object[] { boots, Character.valueOf('X'), RioVItems.dragonSoul});
		this.addRecipe(new ItemStack(RioVItems.galokinHelmet, 1), new Object[] { helmet, Character.valueOf('X'), RioVItems.galokinCrystal});
		this.addRecipe(new ItemStack(RioVItems.galokinChestplate, 1), new Object[] { chestplate, Character.valueOf('X'), RioVItems.galokinCrystal});
		this.addRecipe(new ItemStack(RioVItems.galokinLeggings, 1), new Object[] { leggings, Character.valueOf('X'), RioVItems.galokinCrystal});
		this.addRecipe(new ItemStack(RioVItems.galokinBoots, 1), new Object[] { boots, Character.valueOf('X'), RioVItems.galokinCrystal});
		this.addRecipe(new ItemStack(RioVItems.blindoniteHelmet, 1), new Object[] { helmet, Character.valueOf('X'), RioVItems.blindonite});
		this.addRecipe(new ItemStack(RioVItems.blindoniteChestplate, 1), new Object[] { chestplate, Character.valueOf('X'), RioVItems.blindonite});
		this.addRecipe(new ItemStack(RioVItems.blindoniteLeggings, 1), new Object[] { leggings, Character.valueOf('X'), RioVItems.blindonite});
		this.addRecipe(new ItemStack(RioVItems.blindoniteBoots, 1), new Object[] { boots, Character.valueOf('X'), RioVItems.blindonite});
		this.addRecipe(new ItemStack(RioVItems.helmetOfFlame, 1), new Object[] { helmet, Character.valueOf('X'), RioVItems.ingotOfFlame});
		this.addRecipe(new ItemStack(RioVItems.chestplateOfFlame, 1), new Object[] { chestplate, Character.valueOf('X'), RioVItems.ingotOfFlame});
		this.addRecipe(new ItemStack(RioVItems.leggingsOfFlame, 1), new Object[] { leggings, Character.valueOf('X'), RioVItems.ingotOfFlame});
		this.addRecipe(new ItemStack(RioVItems.bootsOfFlame, 1), new Object[] { boots, Character.valueOf('X'), RioVItems.ingotOfFlame});
		this.addRecipe(new ItemStack(RioVItems.vraviniteHelmet, 1), new Object[] { helmet, Character.valueOf('X'), RioVItems.vravinite});
		this.addRecipe(new ItemStack(RioVItems.vraviniteChestplate, 1), new Object[] { chestplate, Character.valueOf('X'), RioVItems.vravinite});
		this.addRecipe(new ItemStack(RioVItems.vraviniteLeggings, 1), new Object[] { leggings, Character.valueOf('X'), RioVItems.vravinite});
		this.addRecipe(new ItemStack(RioVItems.vraviniteBoots, 1), new Object[] { boots, Character.valueOf('X'), RioVItems.vravinite});
		this.addRecipe(new ItemStack(RioVItems.magickaHelmet, 1), new Object[] { helmet, Character.valueOf('X'), RioVItems.clothOfMagic});
		this.addRecipe(new ItemStack(RioVItems.magickaChestplate, 1), new Object[] { chestplate, Character.valueOf('X'), RioVItems.clothOfMagic});
		this.addRecipe(new ItemStack(RioVItems.magickaLeggings, 1), new Object[] { leggings, Character.valueOf('X'), RioVItems.clothOfMagic});
		this.addRecipe(new ItemStack(RioVItems.magickaBoots, 1), new Object[] { boots, Character.valueOf('X'), RioVItems.clothOfMagic});
		this.addRecipe(new ItemStack(RioVItems.alerisHelmet, 1), new Object[] { helmet, Character.valueOf('X'), RioVItems.aleris});
		this.addRecipe(new ItemStack(RioVItems.alerisChestplate, 1), new Object[] { chestplate, Character.valueOf('X'), RioVItems.aleris});
		this.addRecipe(new ItemStack(RioVItems.alerisLeggings, 1), new Object[] { leggings, Character.valueOf('X'), RioVItems.aleris});
		this.addRecipe(new ItemStack(RioVItems.alerisBoots, 1), new Object[] { boots, Character.valueOf('X'), RioVItems.aleris});
		
		Collections.sort(this.recipes, new AnvilRecipeSorter(this));
		System.out.println(this.recipes.size() + " recipes");
	}

	public AnvilShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
		String var3 = "";
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;

		if (par2ArrayOfObj[var4] instanceof String[])
		{
			String[] var7 = (String[])((String[])par2ArrayOfObj[var4++]);

			for (int var8 = 0; var8 < var7.length; ++var8)
			{
				String var9 = var7[var8];
				++var6;
				var5 = var9.length();
				var3 = var3 + var9;
			}
		}
		else
		{
			while (par2ArrayOfObj[var4] instanceof String)
			{
				String var11 = (String)par2ArrayOfObj[var4++];
				++var6;
				var5 = var11.length();
				var3 = var3 + var11;
			}
		}

		HashMap var12;

		for (var12 = new HashMap(); var4 < par2ArrayOfObj.length; var4 += 2)
		{
			Character var13 = (Character)par2ArrayOfObj[var4];
			ItemStack var14 = null;

			if (par2ArrayOfObj[var4 + 1] instanceof Item)
			{
				var14 = new ItemStack((Item)par2ArrayOfObj[var4 + 1]);
			}
			else if (par2ArrayOfObj[var4 + 1] instanceof Block)
			{
				var14 = new ItemStack((Block)par2ArrayOfObj[var4 + 1], 1, -1);
			}
			else if (par2ArrayOfObj[var4 + 1] instanceof ItemStack)
			{
				var14 = (ItemStack)par2ArrayOfObj[var4 + 1];
			}

			var12.put(var13, var14);
		}

		ItemStack[] var15 = new ItemStack[var5 * var6];

		for (int var16 = 0; var16 < var5 * var6; ++var16)
		{
			char var10 = var3.charAt(var16);

			if (var12.containsKey(Character.valueOf(var10)))
			{
				//var15[var16] = ((ItemStack)var12.get(Character.valueOf(var10))).copy();
			}
			else
			{
				var15[var16] = null;
			}
		}

		AnvilShapedRecipes var17 = new AnvilShapedRecipes(var5, var6, var15, par1ItemStack);
		this.recipes.add(var17);
		return var17;
	}

	public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
		ArrayList var3 = new ArrayList();
		Object[] var4 = par2ArrayOfObj;
		int var5 = par2ArrayOfObj.length;

		for (int var6 = 0; var6 < var5; ++var6)
		{
			Object var7 = var4[var6];

			if (var7 instanceof ItemStack)
			{
				var3.add(((ItemStack)var7).copy());
			}
			else if (var7 instanceof Item)
			{
				var3.add(new ItemStack((Item)var7));
			}
			else
			{
				if (!(var7 instanceof Block))
				{
					throw new RuntimeException("Invalid shapeless recipe!");
				}

				var3.add(new ItemStack((Block)var7));
			}
		}

		this.recipes.add(new AnvilShapelessRecipes(par1ItemStack, var3));
	}

	public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
	{
		int var3 = 0;
		ItemStack var4 = null;
		ItemStack var5 = null;
		int var6;

		for (var6 = 0; var6 < par1InventoryCrafting.getSizeInventory(); ++var6)
		{
			ItemStack var7 = par1InventoryCrafting.getStackInSlot(var6);

			if (var7 != null)
			{
				if (var3 == 0)
				{
					var4 = var7;
				}

				if (var3 == 1)
				{
					var5 = var7;
				}

				++var3;
			}
		}

		if (var3 == 2 && var4.getItem() == var5.getItem() && var4.stackSize == 1 && var5.stackSize == 1 && var4.getItem().isRepairable())
		{
			Item var11 = var4.getItem();
			int var13 = var11.getMaxDamage() - var4.getItemDamageForDisplay();
			int var8 = var11.getMaxDamage() - var5.getItemDamageForDisplay();
			int var9 = var13 + var8 + var11.getMaxDamage() * 5 / 100;
			int var10 = var11.getMaxDamage() - var9;

			if (var10 < 0)
			{
				var10 = 0;
			}

			return new ItemStack(var4.getItem(), 1, var10);
		}
		else
		{
			for (var6 = 0; var6 < this.recipes.size(); ++var6)
			{
				IRecipe var12 = (IRecipe)this.recipes.get(var6);

				if (var12.matches(par1InventoryCrafting, par2World))
				{
					return var12.getCraftingResult(par1InventoryCrafting);
				}
			}

			return null;
		}
	}

	/**
	 * returns the List<> of all recipes
	 */
	public List getRecipeList()
	{
		return this.recipes;
	}
}