package sheenrox82.RioV.src.entity.mob.jaerin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.entity.EntityMobDeadBody;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
import sheenrox82.RioV.src.content.Sounds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityWoodElf extends EntityMobDeadBody implements IRangedAttackMob
{
	private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 0.25F, 20, 60, 15.0F);
	private EntityAIAttackOnCollide aiAttackOnCollide = new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.31F, false);

	public EntityWoodElf(World par1World)
	{
		super(par1World);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIWander(this,  0.56D));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));

		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.setCurrentItemOrArmor(0, new ItemStack(Items.bow));
		this.fallDistance = 0.0f;
		if (par1World != null && !par1World.isRemote)
		{
			this.setCombatTask();
		}
	}

	@Override
	protected void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(16, new Byte((byte)0));
		this.dataWatcher.addObject(13, new Byte((byte)0));
	}

	@Override
	protected boolean isValidLightLevel()
	{
		return true;
	}

	@Override
	public boolean isAIEnabled()
	{
		return true;
	}

	@Override
	public boolean attackEntityAsMob(Entity par1Entity)
	{
		if (super.attackEntityAsMob(par1Entity))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();
	}

	@Override
	public void onDeath(DamageSource par1DamageSource)
	{
		super.onDeath(par1DamageSource);
	}

	@Override
	protected void dropFewItems(boolean par1, int par2)
	{
		int var1 = this.rand.nextInt(8);

		if (var1 == 0)
		{
		}
		if (var1 == 1)
		{
		}
		if (var1 == 2)
		{
		}
		if (var1 == 3)
		{

		}
		if (var1 == 4)
		{
		}
		if (var1 == 5)
		{
		}
		if (var1 == 6)
		{
		}
		if (var1 == 7)
		{
		}
	}

	public void setCombatTask()
	{
		this.tasks.removeTask(this.aiAttackOnCollide);
		this.tasks.removeTask(this.aiArrowAttack);
		ItemStack itemstack = this.getHeldItem();

		if (itemstack != null && itemstack.getItem() == Items.bow)
		{
			this.tasks.addTask(4, this.aiArrowAttack);
		}
		else
		{
			this.tasks.addTask(4, this.aiAttackOnCollide);
		}
	}

	@Override
	public void setCurrentItemOrArmor(int par1, ItemStack par2ItemStack)
	{
		super.setCurrentItemOrArmor(par1, par2ItemStack);

		if (!this.worldObj.isRemote && par1 == 0)
		{
			this.setCombatTask();
		}
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase entitylivingbase, float par2)
	{
		EntityArrow entityarrow = new EntityArrow(this.worldObj, this, entitylivingbase, 1.6F, (float)(14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
		int i = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, this.getHeldItem());
		int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, this.getHeldItem());
		entityarrow.setDamage((double)(par2 * 2.0F) + this.rand.nextGaussian() * 0.25D + (double)((float)this.worldObj.difficultySetting.getDifficultyId() * 0.11F));

		if (i > 0)
		{
			entityarrow.setDamage(entityarrow.getDamage() + (double)i * 0.5D + 0.5D);
		}

		if (j > 0)
		{
			entityarrow.setKnockbackStrength(j);
		}

		this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		this.worldObj.spawnEntityInWorld(entityarrow);

	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.62D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	protected String getLivingSound()
	{
		if(RioVAPI.getInstance().getUtil().getConfigBool("allowBreathing") == true)
		{
			return Sounds.exhale.getPrefixedName();
		}
		
		return null;
	}
	
	@Override
	protected String getHurtSound()
	{
		return Sounds.pain.getPrefixedName();
	}
	
	@Override
	public boolean interact(EntityPlayer par1EntityPlayer)
    {
		par1EntityPlayer.playSound(Sounds.hello.getPrefixedName(), 1, 1);
		
		if(!this.worldObj.isRemote)
			par1EntityPlayer.addChatMessage(RioVAPIUtil.addChatMessage(EnumChatFormatting.WHITE, "Hello to you too, " + par1EntityPlayer.getDisplayName() + "!"));
		return true;
    }
}
