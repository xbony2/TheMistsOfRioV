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

		if(TheMistsOfRioV.getInstance().aether)
		{
			try 
			{
				Class<?> clAetherItems = Class.forName("net.aetherteam.aether.items.AetherItems");

				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("SkyrootPickaxe").get(null)), new ItemStack(RioVItems.infusedSkyrootPickaxe, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("SkyrootAxe").get(null)), new ItemStack(RioVItems.infusedSkyrootAxe, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("SkyrootShovel").get(null)), new ItemStack(RioVItems.infusedSkyrootShovel, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("SkyrootSword").get(null)), new ItemStack(RioVItems.infusedSkyrootSword, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("HolystonePickaxe").get(null)), new ItemStack(RioVItems.infusedHolystonePickaxe, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("HolystoneAxe").get(null)), new ItemStack(RioVItems.infusedHolystoneAxe, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("HolystoneShovel").get(null)), new ItemStack(RioVItems.infusedHolystoneShovel, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("HolystoneSword").get(null)), new ItemStack(RioVItems.infusedHolystoneSword, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("ZanitePickaxe").get(null)), new ItemStack(RioVItems.infusedZanitePickaxe, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("ZaniteAxe").get(null)), new ItemStack(RioVItems.infusedZaniteAxe, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("ZaniteShovel").get(null)), new ItemStack(RioVItems.infusedZaniteShovel, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("ZaniteSword").get(null)), new ItemStack(RioVItems.infusedZaniteSword, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("GravititePickaxe").get(null)), new ItemStack(RioVItems.infusedGravititePickaxe, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("GravititeAxe").get(null)), new ItemStack(RioVItems.infusedGravititeAxe, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("GravititeShovel").get(null)), new ItemStack(RioVItems.infusedGravititeShovel, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("GravititeSword").get(null)), new ItemStack(RioVItems.infusedGravititeSword, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("GravititeHelmet").get(null)), new ItemStack(RioVItems.infusedGravititeHelmet, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("GravititeChestplate").get(null)), new ItemStack(RioVItems.infusedGravititeChestplate, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("GravititeLeggings").get(null)), new ItemStack(RioVItems.infusedGravititeLeggings, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("GravititeBoots").get(null)), new ItemStack(RioVItems.infusedGravititeBoots, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("ZaniteHelmet").get(null)), new ItemStack(RioVItems.infusedZaniteHelmet, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("ZaniteChestplate").get(null)), new ItemStack(RioVItems.infusedZaniteChestplate, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("ZaniteLeggings").get(null)), new ItemStack(RioVItems.infusedZaniteLeggings, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("ZaniteBoots").get(null)), new ItemStack(RioVItems.infusedZaniteBoots, 1));
				this.addAltarRecipe(((Item)clAetherItems.getDeclaredField("BlueBerry").get(null)), new ItemStack(RioVItems.magicalBlueBerry, 1));
			} 
			catch(Exception e)
			{

			}
		}

		if(TheMistsOfRioV.getInstance().natura)
		{
			try 
			{
				Class<?> clNContent = Class.forName("mods.natura.common.NContent");

				this.addAltarRecipe(((Item)clNContent.getDeclaredField("bloodwoodPickaxe").get(null)), new ItemStack(RioVItems.infusedBloodwoodPickaxe, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("bloodwoodAxe").get(null)), new ItemStack(RioVItems.infusedBloodwoodAxe, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("bloodwoodShovel").get(null)), new ItemStack(RioVItems.infusedBloodwoodShovel, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("bloodwoodSword").get(null)), new ItemStack(RioVItems.infusedBloodwoodSword, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("ghostwoodPickaxe").get(null)), new ItemStack(RioVItems.infusedGhostwoodPickaxe, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("ghostwoodAxe").get(null)), new ItemStack(RioVItems.infusedGhostwoodAxe, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("ghostwoodShovel").get(null)), new ItemStack(RioVItems.infusedGhostwoodShovel, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("ghostwoodSword").get(null)), new ItemStack(RioVItems.infusedGhostwoodSword, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("darkwoodPickaxe").get(null)), new ItemStack(RioVItems.infusedDarkwoodPickaxe, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("darkwoodAxe").get(null)), new ItemStack(RioVItems.infusedDarkwoodAxe, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("darkwoodShovel").get(null)), new ItemStack(RioVItems.infusedDarkwoodShovel, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("darkwoodSword").get(null)), new ItemStack(RioVItems.infusedDarkwoodSword, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("netherquartzPickaxe").get(null)), new ItemStack(RioVItems.infusedNetherquartzPickaxe, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("netherquartzAxe").get(null)), new ItemStack(RioVItems.infusedNetherquartzAxe, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("netherquartzShovel").get(null)), new ItemStack(RioVItems.infusedNetherquartzShovel, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("netherquartzSword").get(null)), new ItemStack(RioVItems.infusedNetherquartzSword, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("fusewoodPickaxe").get(null)), new ItemStack(RioVItems.infusedFusewoodPickaxe, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("fusewoodAxe").get(null)), new ItemStack(RioVItems.infusedFusewoodAxe, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("fusewoodShovel").get(null)), new ItemStack(RioVItems.infusedFusewoodShovel, 1));
				this.addAltarRecipe(((Item)clNContent.getDeclaredField("fusewoodSword").get(null)), new ItemStack(RioVItems.infusedFusewoodSword, 1));
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
