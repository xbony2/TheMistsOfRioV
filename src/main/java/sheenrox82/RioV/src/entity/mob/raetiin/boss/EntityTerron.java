package sheenrox82.RioV.src.entity.mob.raetiin.boss;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import sheenrox82.RioV.src.api.base.RioVAPI;
import sheenrox82.RioV.src.api.entity.EntityBossCore;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.content.Sounds;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityAdv;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityAltruEssence;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityAngel;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityGalokin;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityOrc;
import sheenrox82.RioV.src.entity.mob.jaerin.EntityWoodElf;
import sheenrox82.RioV.src.entity.mob.jaerin.boss.EntityAltru;
import sheenrox82.RioV.src.entity.mob.jaerin.boss.EntityTiTun;
import sheenrox82.RioV.src.entity.mob.jaerin.boss.EntityWoodElfKing;

public class EntityTerron extends EntityBossCore{
	public EntityTerron(World par1World){
		super(par1World);
		this.setSize(1F, 3.8F);
		this.experienceValue = 70;
		isImmuneToFire = false;
		this.getNavigator().setCanSwim(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIWander(this, 0.56D));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityAltruEssence.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityAdv.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityAngel.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityGalokin.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityOrc.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityWoodElf.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityAltru.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityTiTun.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityWoodElfKing.class, 0, true));
		
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityCreeper.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityCaveSpider.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityEnderman.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityGiantZombie.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntitySilverfish.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityWitch.class, 0, true));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
		tasks.addTask(4, new EntityAIAttackOnCollide(this, 0.56D, true));
	}
	
	@Override
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(900.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.62D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(14.0D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
	}
	
	@Override
	public void onDeath(DamageSource par1DamageSource){
		super.onDeath(par1DamageSource);
		
		if(this.worldObj.isRemote){
			RioVAPI.getInstance().getUtil().sendMessageToAll("Terron: *Grroowwwwwwwwwlllll*");
			RioVAPI.getInstance().getUtil().sendMessageToAll("Terron was killed!");
		}
	}
	
	@Override
	public void dropFewItems(boolean par1, int par2){
		this.dropItem(RioVItems.agonite, 3);
	}
	
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound){
		super.writeEntityToNBT(par1NBTTagCompound);
	}
	
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound){
		super.readEntityFromNBT(par1NBTTagCompound);
	}
	
	@Override
	protected boolean isAIEnabled(){
		return true;
	}
	
	@Override
	protected String getLivingSound(){
		return Sounds.growl.getPrefixedName();
	}
}
