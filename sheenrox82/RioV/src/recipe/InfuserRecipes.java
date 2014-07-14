package sheenrox82.RioV.src.recipe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
/*
import mods.natura.common.NContent;
import net.aetherteam.aether.items.AetherItems;
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVItems;

public class InfuserRecipes
{
	private static final InfuserRecipes altarBase = new InfuserRecipes();
	private Map AltarList = new HashMap();
    private Map AltarExp = new HashMap();

	public static final InfuserRecipes getInfuser()
	{
		return altarBase;
	}

	private InfuserRecipes()
	{
		this.addAltarRecipe(RioVItems.amethystSword, new ItemStack(RioVItems.infusedAmethystSword, 1));
		this.addAltarRecipe(RioVItems.onyxSword, new ItemStack(RioVItems.infusedOnyxSword, 1));
		this.addAltarRecipe(RioVItems.amethystShovel, new ItemStack(RioVItems.infusedAmethystShovel, 1));
		this.addAltarRecipe(RioVItems.amethystPickaxe, new ItemStack(RioVItems.infusedAmethystPickaxe, 1));
		this.addAltarRecipe(RioVItems.amethystAxe, new ItemStack(RioVItems.infusedAmethystAxe, 1));
		this.addAltarRecipe(RioVItems.onyxShovel, new ItemStack(RioVItems.infusedOnyxShovel, 1));
		this.addAltarRecipe(RioVItems.onyxPickaxe, new ItemStack(RioVItems.infusedOnyxPickaxe, 1));
		this.addAltarRecipe(RioVItems.onyxAxe, new ItemStack(RioVItems.infusedOnyxAxe, 1));
		this.addAltarRecipe(RioVItems.amethystHelmet, new ItemStack(RioVItems.infusedAmethystHelmet, 1));
		this.addAltarRecipe(RioVItems.amethystChestplate, new ItemStack(RioVItems.infusedAmethystChestplate, 1));
		this.addAltarRecipe(RioVItems.amethystLeggings, new ItemStack(RioVItems.infusedAmethystLeggings, 1));
		this.addAltarRecipe(RioVItems.amethystBoots, new ItemStack(RioVItems.infusedAmethystBoots, 1));
		this.addAltarRecipe(RioVItems.onyxHelmet, new ItemStack(RioVItems.infusedOnyxHelmet, 1));
		this.addAltarRecipe(RioVItems.onyxChestplate, new ItemStack(RioVItems.infusedOnyxChestplate, 1));
		this.addAltarRecipe(RioVItems.onyxLeggings, new ItemStack(RioVItems.infusedOnyxLeggings, 1));
		this.addAltarRecipe(RioVItems.onyxBoots, new ItemStack(RioVItems.infusedOnyxBoots, 1));
		this.addAltarRecipe(RioVItems.unfusedAxeOfAunTun, new ItemStack(RioVItems.halfFusedAxeOfAunTun, 1));
		this.addAltarRecipe(RioVItems.halfFusedAxeOfAunTun, new ItemStack(RioVItems.axeOfAunTun, 1));
		this.addAltarRecipe(RioVItems.dragonHelmet, new ItemStack(RioVItems.infusedDragonHelmet, 1));
		this.addAltarRecipe(RioVItems.dragonChestplate, new ItemStack(RioVItems.infusedDragonChestplate, 1));
		this.addAltarRecipe(RioVItems.dragonLeggings, new ItemStack(RioVItems.infusedDragonLeggings, 1));
		this.addAltarRecipe(RioVItems.dragonBoots, new ItemStack(RioVItems.infusedDragonBoots, 1));
		this.addAltarRecipe(RioVItems.dragonPickaxe, new ItemStack(RioVItems.infusedDragonPickaxe, 1));
		this.addAltarRecipe(RioVItems.dragonAxe, new ItemStack(RioVItems.infusedDragonAxe, 1));
		this.addAltarRecipe(RioVItems.dragonShovel, new ItemStack(RioVItems.infusedDragonShovel, 1));
		this.addAltarRecipe(RioVItems.dragonSword, new ItemStack(RioVItems.infusedDragonSword, 1));
		this.addAltarRecipe(RioVItems.blindoniteHelmet, new ItemStack(RioVItems.infusedBlindoniteHelmet, 1));
		this.addAltarRecipe(RioVItems.blindoniteChestplate, new ItemStack(RioVItems.infusedBlindoniteChestplate, 1));
		this.addAltarRecipe(RioVItems.blindoniteLeggings, new ItemStack(RioVItems.infusedBlindoniteLeggings, 1));
		this.addAltarRecipe(RioVItems.blindoniteBoots, new ItemStack(RioVItems.infusedBlindoniteBoots, 1));
		this.addAltarRecipe(RioVItems.blindonitePickaxe, new ItemStack(RioVItems.infusedBlindonitePickaxe, 1));
		this.addAltarRecipe(RioVItems.blindoniteAxe, new ItemStack(RioVItems.infusedBlindoniteAxe, 1));
		this.addAltarRecipe(RioVItems.blindoniteShovel, new ItemStack(RioVItems.infusedBlindoniteShovel, 1));
		this.addAltarRecipe(RioVItems.blindoniteSword, new ItemStack(RioVItems.infusedBlindoniteSword, 1));
		this.addAltarRecipe(Items.apple, new ItemStack(RioVItems.blueMagicApple, 1));
		this.addAltarRecipe(RioVItems.vraviniteHelmet, new ItemStack(RioVItems.infusedVraviniteHelmet, 1));
		this.addAltarRecipe(RioVItems.vraviniteChestplate, new ItemStack(RioVItems.infusedVraviniteChestplate, 1));
		this.addAltarRecipe(RioVItems.vraviniteLeggings, new ItemStack(RioVItems.infusedVraviniteLeggings, 1));
		this.addAltarRecipe(RioVItems.vraviniteBoots, new ItemStack(RioVItems.infusedVraviniteBoots, 1));
		this.addAltarRecipe(RioVItems.vravinitePickaxe, new ItemStack(RioVItems.infusedVravinitePickaxe, 1));
		this.addAltarRecipe(RioVItems.vraviniteAxe, new ItemStack(RioVItems.infusedVraviniteAxe, 1));
		this.addAltarRecipe(RioVItems.vraviniteShovel, new ItemStack(RioVItems.infusedVraviniteShovel, 1));
		this.addAltarRecipe(RioVItems.vraviniteSword, new ItemStack(RioVItems.infusedVraviniteSword, 1));

		if(TheMistsOfRioV.getInstance().botania)
		{
			try 
			{
				Class botaniaItems = Class.forName("vazkii.botania.common.item.ModItems");

				this.addAltarRecipe(((Item)botaniaItems.getDeclaredField("manasteelHelm").get(null)), new ItemStack(RioVItems.infusedManasteelHelm, 1));
				this.addAltarRecipe(((Item)botaniaItems.getDeclaredField("manasteelChest").get(null)), new ItemStack(RioVItems.infusedManasteelChest, 1));
				this.addAltarRecipe(((Item)botaniaItems.getDeclaredField("manasteelLegs").get(null)), new ItemStack(RioVItems.infusedManasteelLegs, 1));
				this.addAltarRecipe(((Item)botaniaItems.getDeclaredField("manasteelBoots").get(null)), new ItemStack(RioVItems.infusedManasteelBoots, 1));
			} 
			catch(Exception e)
			{

			}
		}

		if(TheMistsOfRioV.getInstance().natura)
		{
			try 
			{
				Class natura = Class.forName("mods.natura.common.NContent");

				this.addAltarRecipe(((Item)natura.getDeclaredField("bloodwoodPickaxe").get(null)), new ItemStack(RioVItems.infusedBloodwoodPickaxe, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("bloodwoodAxe").get(null)), new ItemStack(RioVItems.infusedBloodwoodAxe, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("bloodwoodShovel").get(null)), new ItemStack(RioVItems.infusedBloodwoodShovel, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("bloodwoodSword").get(null)), new ItemStack(RioVItems.infusedBloodwoodSword, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("ghostwoodPickaxe").get(null)), new ItemStack(RioVItems.infusedGhostwoodPickaxe, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("ghostwoodAxe").get(null)), new ItemStack(RioVItems.infusedGhostwoodAxe, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("ghostwoodShovel").get(null)), new ItemStack(RioVItems.infusedGhostwoodShovel, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("ghostwoodSword").get(null)), new ItemStack(RioVItems.infusedGhostwoodSword, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("darkwoodPickaxe").get(null)), new ItemStack(RioVItems.infusedDarkwoodPickaxe, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("darkwoodAxe").get(null)), new ItemStack(RioVItems.infusedDarkwoodAxe, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("darkwoodShovel").get(null)), new ItemStack(RioVItems.infusedDarkwoodShovel, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("darkwoodSword").get(null)), new ItemStack(RioVItems.infusedDarkwoodSword, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("netherquartzPickaxe").get(null)), new ItemStack(RioVItems.infusedNetherquartzPickaxe, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("netherquartzAxe").get(null)), new ItemStack(RioVItems.infusedNetherquartzAxe, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("netherquartzShovel").get(null)), new ItemStack(RioVItems.infusedNetherquartzShovel, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("netherquartzSword").get(null)), new ItemStack(RioVItems.infusedNetherquartzSword, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("fusewoodPickaxe").get(null)), new ItemStack(RioVItems.infusedFusewoodPickaxe, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("fusewoodAxe").get(null)), new ItemStack(RioVItems.infusedFusewoodAxe, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("fusewoodShovel").get(null)), new ItemStack(RioVItems.infusedFusewoodShovel, 1));
				this.addAltarRecipe(((Item)natura.getDeclaredField("fusewoodSword").get(null)), new ItemStack(RioVItems.infusedFusewoodSword, 1));
			} 
			catch(Exception e)
			{

			}
		}

	}
	
    public void addAltarRecipe(Item p_151396_1_, ItemStack p_151396_2_)
    {
        this.func_151394_a(new ItemStack(p_151396_1_, 1, 32767), p_151396_2_);
    }

    public void func_151394_a(ItemStack p_151394_1_, ItemStack p_151394_2_)
    {
        this.AltarList.put(p_151394_1_, p_151394_2_);
    }

    public ItemStack getResult(ItemStack p_151395_1_)
    {
        Iterator iterator = this.AltarList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(p_151395_1_, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_)
    {
        return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
    }

    public Map getSmeltingList()
    {
        return this.AltarList;
    }
}
