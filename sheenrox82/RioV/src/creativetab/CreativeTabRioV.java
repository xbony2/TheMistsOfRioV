package sheenrox82.RioV.src.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sheenrox82.RioV.src.content.RioVBlocks;

public final class CreativeTabRioV extends CreativeTabs
{
	public CreativeTabRioV(String label)
	{
		super(label);
	}

	@Override
	public Item getTabIconItem()
	{
		return Item.func_150898_a(RioVBlocks.infuser);
	}
}
