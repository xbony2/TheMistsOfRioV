package sheenrox82.RioV.src.tileentity;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.recipe.InfuserRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityInfuser extends TileEntity implements IInventory
{
    private ItemStack[] infuserStacks = new ItemStack[3];
    public int altarBurnTime = 0;
    public int currentItemBurnTime = 0;
    public int altarCookTime = 0;
    private String field_145958_o;

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return this.infuserStacks.length;
    }

    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int par1)
    {
        return this.infuserStacks[par1];
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack decrStackSize(int par1, int par2)
    {
        if (this.infuserStacks[par1] != null)
        {
            ItemStack itemstack;

            if (this.infuserStacks[par1].stackSize <= par2)
            {
                itemstack = this.infuserStacks[par1];
                this.infuserStacks[par1] = null;
                return itemstack;
            }
            else
            {
                itemstack = this.infuserStacks[par1].splitStack(par2);

                if (this.infuserStacks[par1].stackSize == 0)
                {
                    this.infuserStacks[par1] = null;
                }

                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }

    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int par1)
    {
        if (this.infuserStacks[par1] != null)
        {
            ItemStack itemstack = this.infuserStacks[par1];
            this.infuserStacks[par1] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
    {
        this.infuserStacks[par1] = par2ItemStack;

        if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit())
        {
            par2ItemStack.stackSize = this.getInventoryStackLimit();
        }
    }

    public String func_145825_b()
    {
        return this.func_145818_k_() ? this.field_145958_o : "container.furnace";
    }

    public boolean func_145818_k_()
    {
        return this.field_145958_o != null && this.field_145958_o.length() > 0;
    }

    public void func_145951_a(String p_145951_1_)
    {
        this.field_145958_o = p_145951_1_;
    }

    public void func_145839_a(NBTTagCompound p_145839_1_)
    {
        super.func_145839_a(p_145839_1_);
        NBTTagList nbttaglist = p_145839_1_.func_150295_c("Items", 10);
        this.infuserStacks = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound1 = nbttaglist.func_150305_b(i);
            byte b0 = nbttagcompound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.infuserStacks.length)
            {
                this.infuserStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        this.altarBurnTime = p_145839_1_.getShort("BurnTime");
        this.altarCookTime = p_145839_1_.getShort("CookTime");
        this.currentItemBurnTime = func_145952_a(this.infuserStacks[1]);

        if (p_145839_1_.func_150297_b("CustomName", 8))
        {
            this.field_145958_o = p_145839_1_.getString("CustomName");
        }
    }

    public void func_145841_b(NBTTagCompound p_145841_1_)
    {
        super.func_145841_b(p_145841_1_);
        p_145841_1_.setShort("BurnTime", (short)this.altarBurnTime);
        p_145841_1_.setShort("CookTime", (short)this.altarCookTime);
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < this.infuserStacks.length; ++i)
        {
            if (this.infuserStacks[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.infuserStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        p_145841_1_.setTag("Items", nbttaglist);

        if (this.func_145818_k_())
        {
            p_145841_1_.setString("CustomName", this.field_145958_o);
        }
    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't
     * this more of a set than a get?*
     */
    public int getInventoryStackLimit()
    {
        return 64;
    }

    @SideOnly(Side.CLIENT)
    public int func_145953_d()
    {
        return this.altarCookTime;
    }

    @SideOnly(Side.CLIENT)
    public int func_145955_e(int p_145955_1_)
    {
        if (this.currentItemBurnTime == 0)
        {
            this.currentItemBurnTime = 200;
        }

        return this.altarBurnTime * p_145955_1_ / this.currentItemBurnTime;
    }

    public boolean func_145950_i()
    {
        return this.altarBurnTime > 0;
    }

    public void func_145845_h()
    {
    	boolean var1 = this.altarBurnTime > 0;
        boolean var2 = false;

        if (this.altarBurnTime > 0)
        {
            --this.altarBurnTime;
        }

        if (!this.field_145850_b.isRemote)
        {
            if (this.altarBurnTime == 0 && this.func_145948_k())
            {
                this.currentItemBurnTime = this.altarBurnTime = func_145952_a(this.infuserStacks[1]);

                if (this.altarBurnTime > 0)
                {
                    var2 = true;

                    if (this.infuserStacks[1] != null)
                    {
                        --this.infuserStacks[1].stackSize;

                        if (this.infuserStacks[1].stackSize == 0)
                        {
                            this.infuserStacks[1] = this.infuserStacks[1].getItem().getContainerItem(infuserStacks[1]);
                        }
                    }
                }
            }

            if (this.func_145950_i() && this.func_145948_k())
            {
                ++this.altarCookTime;

                if (this.altarCookTime == 2)
                {
                    this.altarCookTime = 0;
                    this.func_145949_j();
                    var2 = true;
                }
            }
            else
            {
                this.altarCookTime = 0;
            }
        }

        if (var2)
        {
            this.onInventoryChanged();
        }

    }

    private boolean func_145948_k()
    {
        if (this.infuserStacks[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack itemstack = InfuserRecipes.getInfuser().getResult(this.infuserStacks[0]);
            if (itemstack == null) return false;
            if (this.infuserStacks[2] == null) return true;
            if (!this.infuserStacks[2].isItemEqual(itemstack)) return false;
            int result = infuserStacks[2].stackSize + itemstack.stackSize;
            return result < getInventoryStackLimit() && result <= this.infuserStacks[2].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
    }

    public void func_145949_j()
    {
        if (this.func_145948_k())
        {
            ItemStack itemstack = InfuserRecipes.getInfuser().getResult(this.infuserStacks[0]);

            if (this.infuserStacks[2] == null)
            {
                this.infuserStacks[2] = itemstack.copy();
            }
            else if (this.infuserStacks[2].getItem() == itemstack.getItem())
            {
                this.infuserStacks[2].stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
            }

            --this.infuserStacks[0].stackSize;

            if (this.infuserStacks[0].stackSize <= 0)
            {
                this.infuserStacks[0] = null;
            }
        }
    }

    public static int func_145952_a(ItemStack p_145952_0_)
    {
        if (p_145952_0_ == null)
        {
            return 0;
        }
        else
        {
            Item item = p_145952_0_.getItem();

            if (item instanceof ItemBlock && Block.func_149634_a(item) != Blocks.air)
            {
               
            }

            if (item == RioVItems.orb) return 2;
            return GameRegistry.getFuelValue(p_145952_0_);
        }
    }

    public static boolean func_145954_b(ItemStack p_145954_0_)
    {
        return func_145952_a(p_145954_0_) > 0;
    }

    /**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer)
    {
        return this.field_145850_b.func_147438_o(this.field_145851_c, this.field_145848_d, this.field_145849_e) != this ? false : par1EntityPlayer.getDistanceSq((double)this.field_145851_c + 0.5D, (double)this.field_145848_d + 0.5D, (double)this.field_145849_e + 0.5D) <= 64.0D;
    }

    public void openChest() {}

    public void closeChest() {}

    /**
     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot.
     */
    public boolean isItemValidForSlot(int par1, ItemStack par2ItemStack)
    {
        return par1 == 2 ? false : (par1 == 1 ? func_145954_b(par2ItemStack) : true);
    }

    public boolean canInsertItem(int par1, ItemStack par2ItemStack, int par3)
    {
        return this.isItemValidForSlot(par1, par2ItemStack);
    }
}
