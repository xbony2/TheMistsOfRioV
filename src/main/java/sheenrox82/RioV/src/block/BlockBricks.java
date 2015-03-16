package sheenrox82.RioV.src.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBricks extends Block{
	public static final String[] BRICK_LIST = new String[] {"amethyst", "onyx", "blindonite", "dragon", "vravinite", "aleris", "jaavik", "nironite",
			"drakiuz"};
	private IIcon[] iconArray;
	
	public BlockBricks(){
		super(Material.rock);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(RioVAPI.getInstance().tab);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta){
		return this.iconArray[meta];
	}
	
	@Override
	public int damageDropped(int meta){
		return meta;
	}
	
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	public void getSubBlocks(Item item, CreativeTabs creativetabs, List list){
		for(int i = 0; i < BRICK_LIST.length; ++i){
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister register){
		this.iconArray = new IIcon[BRICK_LIST.length];
		
		for(int i = 0; i < this.iconArray.length; ++i)
			this.iconArray[i] = register.registerIcon(Util.MOD_ID + ":" + BRICK_LIST[i] + "Bricks");
	}
}
