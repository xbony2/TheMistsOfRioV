package sheenrox82.RioV.src.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFactionScroll extends Item
{
	public static int guiID = 50;
	
	public ItemFactionScroll()
	{
		super();
		this.setMaxDamage(0);
		this.setCreativeTab(RioVAPI.getInstance().tab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(RioVAPI.mod_id + ":" + RioVAPIUtil.getName(this.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("Choose a Faction");
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		par3EntityPlayer.openGui(TheMistsOfRioV.getInstance(), guiID, par2World, 0, 0, 0);

		return par1ItemStack;
	}
}
