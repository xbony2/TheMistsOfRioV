package sheenrox82.RioV.src.recipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeFireworks;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;

public class AnvilCraftingManager
{
	public String[] pickaxe = new String[] {"XXX", " ! ", " ! ", " ! "};
	public String[] sword = new String[] {" X ", " X ", "XXX", " ! ",};
	public String[] shovel = new String[] {"X", "!", "!", "!"};
	public String[] axe = new String[] {"XX", "X!", " !", " !"};
	public String[] bowOfWurTun = new String[] {" I*", "IB*", " I*"};
	public String[] bow = new String[] {" I*", "I *", " I*"};
	public String[] helmet = new String[] {"XXX", "X X"};
	public String[] chestplate = new String[] {"X X", "XXX", "XXX"};
	public String[] leggings = new String[] {"XXX", "X X", "X X"};
	public String[] boots = new String[] {"X X", "X X"};

	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	public static AnvilCraftingManager instance = new AnvilCraftingManager();
	public static List recipes = new ArrayList();

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
		this.addRecipe(new ItemStack(RioVItems.bowOfWurTun, 1), bowOfWurTun, Character.valueOf('I'), Items.gold_ingot, Character.valueOf('*'), Items.string, Character.valueOf('D'), RioVItems.blackBone);
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
	/**	this.addRecipe(new ItemStack(RioVItems.amethystBow, 1), bow, Character.valueOf('I'), RioVItems.amethyst, Character.valueOf('*'), Items.string);
		this.addRecipe(new ItemStack(RioVItems.onyxBow, 1), bow, Character.valueOf('I'), RioVItems.onyx, Character.valueOf('*'), Items.string);
		this.addRecipe(new ItemStack(RioVItems.dragonBow, 1), bow, Character.valueOf('I'), RioVItems.dragonSoul, Character.valueOf('*'), Items.string);
		this.addRecipe(new ItemStack(RioVItems.blindoniteBow, 1), bow, Character.valueOf('I'), RioVItems.blindonite, Character.valueOf('*'), Items.string);
		this.addRecipe(new ItemStack(RioVItems.alerisBow, 1), bow, Character.valueOf('I'), RioVItems.aleris, Character.valueOf('*'), Items.string);
		**/
		Collections.sort(this.recipes, new Comparator()
		{
			public int compare(IRecipe par1IRecipe, IRecipe par2IRecipe)
			{
				return par1IRecipe instanceof AnvilShapelessRecipes && par2IRecipe instanceof AnvilShapedRecipes ? 1 : (par2IRecipe instanceof AnvilShapelessRecipes && par1IRecipe instanceof AnvilShapedRecipes ? -1 : (par2IRecipe.getRecipeSize() < par1IRecipe.getRecipeSize() ? -1 : (par2IRecipe.getRecipeSize() > par1IRecipe.getRecipeSize() ? 1 : 0)));
			}
			public int compare(Object par1Obj, Object par2Obj)
			{
				return this.compare((IRecipe)par1Obj, (IRecipe)par2Obj);
			}
		});
	}

	public AnvilShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
		String s = "";
		int i = 0;
		int j = 0;
		int k = 0;

		if (par2ArrayOfObj[i] instanceof String[])
		{
			String[] astring = (String[])((String[])par2ArrayOfObj[i++]);

			for (int l = 0; l < astring.length; ++l)
			{
				String s1 = astring[l];
				++k;
				j = s1.length();
				s = s + s1;
			}
		}
		else
		{
			while (par2ArrayOfObj[i] instanceof String)
			{
				String s2 = (String)par2ArrayOfObj[i++];
				++k;
				j = s2.length();
				s = s + s2;
			}
		}

		HashMap hashmap;

		for (hashmap = new HashMap(); i < par2ArrayOfObj.length; i += 2)
		{
			Character character = (Character)par2ArrayOfObj[i];
			ItemStack itemstack1 = null;

			if (par2ArrayOfObj[i + 1] instanceof Item)
			{
				itemstack1 = new ItemStack((Item)par2ArrayOfObj[i + 1]);
			}
			else if (par2ArrayOfObj[i + 1] instanceof Block)
			{
				itemstack1 = new ItemStack((Block)par2ArrayOfObj[i + 1], 1, 32767);
			}
			else if (par2ArrayOfObj[i + 1] instanceof ItemStack)
			{
				itemstack1 = (ItemStack)par2ArrayOfObj[i + 1];
			}

			hashmap.put(character, itemstack1);
		}

		ItemStack[] aitemstack = new ItemStack[j * k];

		for (int i1 = 0; i1 < j * k; ++i1)
		{
			char c0 = s.charAt(i1);

			if (hashmap.containsKey(Character.valueOf(c0)))
			{
				aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
			}
			else
			{
				aitemstack[i1] = null;
			}
		}

		AnvilShapedRecipes shapedrecipes = new AnvilShapedRecipes(j, k, aitemstack, par1ItemStack);
		this.recipes.add(shapedrecipes);
		return shapedrecipes;
	}

	public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
		ArrayList arraylist = new ArrayList();
		Object[] aobject = par2ArrayOfObj;
		int i = par2ArrayOfObj.length;

		for (int j = 0; j < i; ++j)
		{
			Object object1 = aobject[j];

			if (object1 instanceof ItemStack)
			{
				arraylist.add(((ItemStack)object1).copy());
			}
			else if (object1 instanceof Item)
			{
				arraylist.add(new ItemStack((Item)object1));
			}
			else
			{
				if (!(object1 instanceof Block))
				{
					throw new RuntimeException("Invalid shapeless recipy!");
				}

				arraylist.add(new ItemStack((Block)object1));
			}
		}

		this.recipes.add(new AnvilShapelessRecipes(par1ItemStack, arraylist));
	}

	public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
	{
		int i = 0;
		ItemStack itemstack = null;
		ItemStack itemstack1 = null;
		int j;

		for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
		{
			ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

			if (itemstack2 != null)
			{
				if (i == 0)
				{
					itemstack = itemstack2;
				}

				if (i == 1)
				{
					itemstack1 = itemstack2;
				}

				++i;
			}
		}

		if (i == 2 && itemstack.getItem() == itemstack1.getItem() && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && itemstack.getItem().isRepairable())
		{
			Item item = itemstack.getItem();
			int j1 = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
			int k = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
			int l = j1 + k + item.getMaxDamage() * 5 / 100;
			int i1 = item.getMaxDamage() - l;

			if (i1 < 0)
			{
				i1 = 0;
			}

			return new ItemStack(itemstack.getItem(), 1, i1);
		}
		else
		{
			for (j = 0; j < this.recipes.size(); ++j)
			{
				IRecipe irecipe = (IRecipe)this.recipes.get(j);

				if (irecipe.matches(par1InventoryCrafting, par2World))
				{
					return irecipe.getCraftingResult(par1InventoryCrafting);
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