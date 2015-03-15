package sheenrox82.RioV.src.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.util.StatCollector;

public class EnchantmentConfusion extends Enchantment{
	public EnchantmentConfusion(int par1, int par2){
		super(par1, par2, EnumEnchantmentType.weapon);
		this.setName("Confusion");
	}
	
	@Override
	public int getMinEnchantability(int par1){
		return 10 + 20 * (par1 - 1);
	}
	
	@Override
	public int getMaxEnchantability(int par1){
		return super.getMinEnchantability(par1) + 50;
	}
	
	@Override
	public int getMaxLevel(){
		return 2;
	}
	
	@Override
	public String getTranslatedName(int par1){
		String enchantmentName = "Confusion";
		return enchantmentName + " " + StatCollector.translateToLocal("enchantment.level." + par1);
	}
}
