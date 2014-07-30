package sheenrox82.RioV.src.api.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

public class EntityBossCore extends EntityMob implements IBossDisplayData
{
	public boolean isDeadBody = false;
	
	public EntityBossCore(World par1World)
	{
		super(par1World);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
	}
	
	@Override
	public boolean canDespawn()
	{
		return false;
	}
	
	@Override
	public void onDeath(DamageSource par1DamageSource)
	{
		super.onDeath(par1DamageSource);
		this.isDeadBody = true;
	}
}
