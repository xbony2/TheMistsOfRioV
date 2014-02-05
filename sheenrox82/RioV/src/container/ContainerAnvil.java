package sheenrox82.RioV.src.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.world.World;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.recipe.AnvilCraftingManager;

public class ContainerAnvil extends Container
{

	public InventoryCrafting craftMatrix = new InventoryCrafting(this, 5, 5);
	public IInventory craftResult = new InventoryCraftResult();
	private World worldObj;
	private int posX;
	private int posY;
	private int posZ;

	public ContainerAnvil(InventoryPlayer inventoryplayer, World world, int x, int y, int z)
	{
		worldObj = world;
		posX = x;
		posY = y;
		posZ = z;
		this.addSlotToContainer(new SlotCrafting(inventoryplayer.player, craftMatrix, craftResult, 0, 129, 44));

		for(int l = 0; l < 4; l++)
		{
			for(int k1 = 0; k1 < 3; k1++)
			{
				this.addSlotToContainer(new Slot(craftMatrix, k1 + l * 5, 44 + k1 * 18, 8 + l * 18));
			}

		}

		for(int i1 = 0; i1 < 3; i1++)
		{
			for(int l1 = 0; l1 < 9; l1++)
			{
				this.addSlotToContainer(new Slot(inventoryplayer, l1 + i1 * 9 + 9, 8 + l1 * 18, 97 + i1 * 18));
			}
		}

		for(int j1 = 0; j1 < 9; j1++)
		{
			this.addSlotToContainer(new Slot(inventoryplayer, j1, 8 + j1 * 18, 155));
		}

		onCraftMatrixChanged(craftMatrix);
	}

	public void onCraftMatrixChanged(IInventory iinventory)
	{
		craftResult.setInventorySlotContents(0, AnvilCraftingManager.getInstance().findMatchingRecipe(craftMatrix, worldObj));
	}

	public void onContainerClosed(EntityPlayer entityplayer)
	{
		super.onContainerClosed(entityplayer);

		if (!this.worldObj.isRemote)
		{
			for (int i = 0; i < 12; ++i)
			{
				ItemStack itemstack = this.craftMatrix.getStackInSlotOnClosing(i);

				if (itemstack != null)
				{
					entityplayer.dropPlayerItemWithRandomChoice(itemstack, false);
				}
			}
		}

	}

	public boolean canInteractWith(EntityPlayer par1EntityPlayer)
	{    
		return true;
	}

	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	{
		super.transferStackInSlot(par1EntityPlayer, par2);
		ItemStack itemstack = null;
		Slot slot = (Slot)inventorySlots.get(par2);

		ItemStack itemstack1 = slot.getStack();
		itemstack = itemstack1.copy();
		if(par2 == 0)
		{
			if(!mergeItemStack(itemstack1, 10, 46, true))
			{
				return null;
			}
		} else
			if(par2 >= 10 && par2 < 37)
			{
				if(!mergeItemStack(itemstack1, 37, 46, false))
				{
					return null;
				}
			} else
				if(par2 >= 37 && par2 < 46)
				{
					if(!mergeItemStack(itemstack1, 10, 37, false))
					{
						return null;
					}
				} else
					if(!mergeItemStack(itemstack1, 10, 46, false))
					{
						return null;
					}
		if(itemstack1.stackSize == 0)
		{
			slot.putStack(null);
		} else
		{
			slot.onSlotChanged();
		}
		if(itemstack1.stackSize != itemstack.stackSize)
		{
			slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
		} else
		{
			return null;
		}
		return itemstack;
	}
}