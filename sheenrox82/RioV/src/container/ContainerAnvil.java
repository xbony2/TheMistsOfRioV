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

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				addSlotToContainer(new Slot(craftMatrix, j + i * 5, 42 + j * 18, 17 + i * 18));
			}
		}

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				addSlotToContainer(new Slot(inventoryplayer, j + i * 9 + 9, 8 + j * 18, 102 + i * 18));
			}
		}

		for (int i = 0; i < 9; i++)
		{
			addSlotToContainer(new Slot(inventoryplayer, i, 8 + i * 18, 160));
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
		if(worldObj.isRemote)
		{
			return;
		}
		for(int i = 0; i < 12; i++)
		{
			ItemStack itemstack = craftMatrix.getStackInSlot(i);
			if(itemstack != null)
			{
				entityplayer.dropPlayerItemWithRandomChoice(itemstack, false);
			}
		}

	}

	public boolean canInteractWith(EntityPlayer par1EntityPlayer)
    {
        return this.worldObj.func_147439_a(this.posX, this.posY, this.posZ) != RioVBlocks.anvil ? false : par1EntityPlayer.getDistanceSq((double)this.posX + 0.5D, (double)this.posY + 0.5D, (double)this.posZ + 0.5D) <= 64.0D;
    }

	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	{
		ItemStack itemstack = null;
		Slot slot = (Slot)inventorySlots.get(par2);
		if(slot != null && slot.getHasStack())
		{
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
		}
		return itemstack;
	}
}