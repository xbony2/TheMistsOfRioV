package sheenrox82.RioV.src.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RioVItem extends Item
{
	public RioVItem()
	{
		super();
		this.setMaxDamage(0);
		this.setCreativeTab(TheMistsOfRioV.getInstance().tab);
	}

	@Override
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		if(par1ItemStack.getItem().equals(RioVItems.orb))
		{
			return true;
		}

		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.getUnlocalizedName()));
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
		if(par1ItemStack.getItem().equals(RioVItems.amethyst))par3List.add("A gem to show wealth and power");
		if(par1ItemStack.getItem().equals(RioVItems.onyx))par3List.add("A dark mass");
		if(par1ItemStack.getItem().equals(RioVItems.vravinite))par3List.add("A crystal to show confidence");
		if(par1ItemStack.getItem().equals(RioVItems.aleris))par3List.add("A gem to show defence and strategies");
    }
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if(par1ItemStack.getItem().equals(RioVItems.heart))
		{
			par3EntityPlayer.heal(2);			
			par3EntityPlayer.inventory.consumeInventoryItem(RioVItems.heart);
		}
		
		return par1ItemStack;
	}
}
