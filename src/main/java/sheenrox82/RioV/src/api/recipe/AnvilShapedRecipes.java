package sheenrox82.RioV.src.api.recipe;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class AnvilShapedRecipes implements IRecipe{
	public final int recipeWidth;
	public final int recipeHeight;
	public final ItemStack[] recipeItems;
	private ItemStack recipeOutput;
	public final Item recipeOutputItemID;
	private boolean field_92101_f = false;
	
	public AnvilShapedRecipes(int par1, int par2, ItemStack[] par3ArrayOfItemStack, ItemStack par4ItemStack){
		this.recipeOutputItemID = par4ItemStack.getItem();
		this.recipeWidth = par1;
		this.recipeHeight = par2;
		this.recipeItems = par3ArrayOfItemStack;
		this.recipeOutput = par4ItemStack;
	}
	
	@Override
	public ItemStack getRecipeOutput(){
		return this.recipeOutput;
	}
	
	@Override
	public boolean matches(InventoryCrafting par1InventoryCrafting, World par2World){
		for(int i = 0; i <= 5 - this.recipeWidth; ++i){
			for(int j = 0; j <= 5 - this.recipeHeight; ++j){
				if(this.checkMatch(par1InventoryCrafting, i, j, true)){
					return true;
				}
				
				if(this.checkMatch(par1InventoryCrafting, i, j, false)){
					return true;
				}
			}
		}
		
		return false;
	}
	
	private boolean checkMatch(InventoryCrafting par1InventoryCrafting, int par2, int par3, boolean par4){
		for(int k = 0; k < 5; ++k){
			for(int l = 0; l < 5; ++l){
				int i1 = k - par2;
				int j1 = l - par3;
				ItemStack itemstack = null;
				
				if(i1 >= 0 && j1 >= 0 && i1 < this.recipeWidth && j1 < this.recipeHeight){
					if(par4){
						itemstack = this.recipeItems[this.recipeWidth - i1 - 1 + j1 * this.recipeWidth];
					}else{
						itemstack = this.recipeItems[i1 + j1 * this.recipeWidth];
					}
				}
				
				ItemStack itemstack1 = par1InventoryCrafting.getStackInRowAndColumn(k, l);
				
				if(itemstack1 != null || itemstack != null){
					if(itemstack1 == null && itemstack != null || itemstack1 != null && itemstack == null){
						return false;
					}
					
					if(itemstack.getItem() != itemstack1.getItem()){
						return false;
					}
					
					if(itemstack.getItemDamage() != 32767 && itemstack.getItemDamage() != itemstack1.getItemDamage()){
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	@Override
	public ItemStack getCraftingResult(InventoryCrafting par1InventoryCrafting){
		ItemStack itemstack = this.getRecipeOutput().copy();
		
		if(this.field_92101_f){
			for(int i = 0; i < par1InventoryCrafting.getSizeInventory(); ++i){
				ItemStack itemstack1 = par1InventoryCrafting.getStackInSlot(i);
				
				if(itemstack1 != null && itemstack1.hasTagCompound()){
					itemstack.setTagCompound((NBTTagCompound) itemstack1.stackTagCompound.copy());
				}
			}
		}
		
		return itemstack;
	}
	
	@Override
	public int getRecipeSize(){
		return this.recipeWidth * this.recipeHeight;
	}
}
