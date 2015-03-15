package sheenrox82.RioV.src.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import sheenrox82.RioV.src.api.base.RioVAPI;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDirt extends Block{
	public BlockDirt(){
		super(Material.grass);
		this.setStepSound(Block.soundTypeGrass);
		this.setCreativeTab(RioVAPI.getInstance().tab);
	}
	
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3){
		return Item.getItemFromBlock(this);
	}
	
	@Override
	public IIcon getIcon(int par1, int par2){
		return this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister par1IconRegister){
		blockIcon = par1IconRegister.registerIcon(RioVAPI.getInstance().getUtil().mod_id + ":"
				+ RioVAPI.getInstance().getUtil().getName(this.getUnlocalizedName()));
	}
	
	@Override
	public int quantityDropped(Random par1Random){
		return 1;
	}
}
