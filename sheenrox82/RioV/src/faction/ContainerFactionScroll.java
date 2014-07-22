package sheenrox82.RioV.src.faction;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerFactionScroll extends Container 
{
	public ContainerFactionScroll(InventoryPlayer inventoryPlayer) 
	{

	}

	@Override
	public boolean canInteractWith(EntityPlayer var1) 
	{
		return true;
	}

	@Override
	public void onContainerClosed(EntityPlayer player) 
	{
		super.onContainerClosed(player);
	}
}