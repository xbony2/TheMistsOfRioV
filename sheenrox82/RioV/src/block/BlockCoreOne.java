package sheenrox82.RioV.src.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCoreOne extends Block
{
	public IIcon blockIcon;
	
	public BlockCoreOne()
	{
		super(Material.rock);
		this.setCreativeTab(TheMistsOfRioV.getInstance().tab);
	}
	
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		if(this == RioVBlocks.onyxOre)
		{
			return RioVItems.onyx;
		}
		if(this == RioVBlocks.garnetOre)
		{
			return RioVItems.garnet;
		}
		if(this == RioVBlocks.nironiteOre)
		{
			return RioVItems.nironite;
		}
		if(this == RioVBlocks.dragonOre)
		{
			return RioVItems.dragonSoul;
		}
		if(this == RioVBlocks.netherCrystal)
		{
			return RioVItems.burnedQuartz;
		}
		if(this == RioVBlocks.slate)
		{
			return Item.getItemFromBlock(RioVBlocks.slateCobble);
		}
		if(this == RioVBlocks.amethystOre)
		{
			return RioVItems.amethyst;
		}
		if(this == RioVBlocks.blindoniteOre)
		{
			return RioVItems.blindonite;
		}
		if(this == RioVBlocks.vraviniteOre)
		{
			return RioVItems.vravinite;
		}

		if(this == RioVBlocks.drakiuzOre)
		{
			return RioVItems.drakiuz;
		}

		if(this == RioVBlocks.alerisOre)
		{
			return RioVItems.aleris;
		}

		if(this == RioVBlocks.jaavikOre)
		{
			return RioVItems.jaavik;
		}

		return Item.getItemFromBlock(this);
	}

	@Override
	public IIcon getIcon(int par1, int par2)
	{
		return this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.getUnlocalizedName()));
	} 

	@Override
	public int quantityDropped(Random par1Random)
	{
		int var2 = par1Random.nextInt(6);

		if(var2 == 0)
		{
			if(this == RioVBlocks.onyxOre)
			{
				return 2;
			}
			if(this == RioVBlocks.garnetOre)
			{
				return 2;
			}
			if(this == RioVBlocks.nironiteOre)
			{
				return 2;
			}
			if(this == RioVBlocks.dragonOre)
			{
				return 1;
			}
			if(this == RioVBlocks.netherCrystal)
			{
				return 5;
			}
			if(this == RioVBlocks.amethystOre)
			{
				return 2;
			}
			if(this == RioVBlocks.blindoniteOre)
			{
				return 2;
			}
			if(this == RioVBlocks.vraviniteOre)
			{
				return 1;
			}
			if(this == RioVBlocks.drakiuzOre)
			{
				return 2;
			}
			if(this == RioVBlocks.alerisOre)
			{
				return 2;
			}
		}

		if(var2 == 1)
		{

			if(this == RioVBlocks.onyxOre)
			{
				return 3;
			}
			if(this == RioVBlocks.garnetOre)
			{
				return 1;
			}
			if(this == RioVBlocks.nironiteOre)
			{
				return 3;
			}
			if(this == RioVBlocks.dragonOre)
			{
				return 0;
			}
			if(this == RioVBlocks.netherCrystal)
			{
				return 6;
			}
			if(this == RioVBlocks.amethystOre)
			{
				return 3;
			}
			if(this == RioVBlocks.blindoniteOre)
			{
				return 1;
			}
			if(this == RioVBlocks.vraviniteOre)
			{
				return 2;
			}
			if(this == RioVBlocks.drakiuzOre)
			{
				return 1;
			}
			if(this == RioVBlocks.alerisOre)
			{
				return 1;
			}
		}

		if(var2 == 3)
		{

			if(this == RioVBlocks.onyxOre)
			{
				return 0;
			}
			if(this == RioVBlocks.garnetOre)
			{
				return 0;
			}
			if(this == RioVBlocks.nironiteOre)
			{
				return 0;
			}
			if(this == RioVBlocks.dragonOre)
			{
				return 0;
			}
			if(this == RioVBlocks.netherCrystal)
			{
				return 0;
			}
			if(this == RioVBlocks.amethystOre)
			{
				return 0;
			}
			if(this == RioVBlocks.blindoniteOre)
			{
				return 0;
			}
			if(this == RioVBlocks.vraviniteOre)
			{
				return 0;
			}
			if(this == RioVBlocks.drakiuzOre)
			{
				return 0;
			}
			if(this == RioVBlocks.alerisOre)
			{
				return 0;
			}
		}

		if(var2 == 4)
		{
			if(this == RioVBlocks.onyxOre)
			{
				return 2;
			}
			if(this == RioVBlocks.garnetOre)
			{
				return 0;
			}
			if(this == RioVBlocks.nironiteOre)
			{
				return 2;
			}
			if(this == RioVBlocks.dragonOre)
			{
				return 0;
			}
			if(this == RioVBlocks.netherCrystal)
			{
				return 5;
			}
			if(this == RioVBlocks.amethystOre)
			{
				return 2;
			}
			if(this == RioVBlocks.blindoniteOre)
			{
				return 0;
			}
			if(this == RioVBlocks.vraviniteOre)
			{
				return 1;
			}
			if(this == RioVBlocks.drakiuzOre)
			{
				return 0;
			}
			if(this == RioVBlocks.alerisOre)
			{
				return 1;
			}
		}

		if(var2 == 5)
		{
			if(this == RioVBlocks.onyxOre)
			{
				return 4;
			}
			if(this == RioVBlocks.garnetOre)
			{
				return 2;
			}
			if(this == RioVBlocks.nironiteOre)
			{
				return 4;
			}
			if(this == RioVBlocks.dragonOre)
			{
				return 2;
			}
			if(this == RioVBlocks.netherCrystal)
			{
				return 7;
			}
			if(this == RioVBlocks.amethystOre)
			{
				return 4;
			}
			if(this == RioVBlocks.blindoniteOre)
			{
				return 2;
			}
			if(this == RioVBlocks.vraviniteOre)
			{
				return 3;
			}
			if(this == RioVBlocks.drakiuzOre)
			{
				return 2;
			}
			if(this == RioVBlocks.alerisOre)
			{
				return 3;
			}
		}

		return 1;
	}
}
