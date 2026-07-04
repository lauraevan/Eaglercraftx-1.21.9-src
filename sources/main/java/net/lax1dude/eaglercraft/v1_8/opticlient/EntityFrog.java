package net.lax1dude.eaglercraft.v1_8.opticlient;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

/**
 * The Frog: a small passive amphibian that wanders, swims, panics when
 * hurt, and is tempted by slimeballs (frogs eat slimes). It hops along
 * the ground instead of walking, giving it a distinctive gait. Spawns
 * naturally in swamp biomes.
 */
public class EntityFrog extends EntityAnimal {

	public EntityFrog(World worldIn) {
		super(worldIn);
		this.setSize(0.5F, 0.5F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.4D));
		this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(3, new EntityAITempt(this, 1.1D, Items.slime_ball, false));
		this.tasks.addTask(4, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
	}

	/**
	 * Hop instead of walk: while on the ground and moving, periodically
	 * add a small upward impulse so the frog visibly bounces along.
	 */
	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (this.onGround && !this.worldObj.isRemote) {
			double speedSq = this.motionX * this.motionX + this.motionZ * this.motionZ;
			if (speedSq > 0.0025D && this.rand.nextInt(6) == 0) {
				this.motionY = 0.42D;
				this.isAirBorne = true;
			}
		}
	}

	public EntityAgeable createChild(EntityAgeable parent) {
		return new EntityFrog(this.worldObj);
	}

	public boolean isBreedingItem(net.minecraft.item.ItemStack stack) {
		return stack != null && stack.getItem() == Items.slime_ball;
	}

	protected Item getDropItem() {
		return null;
	}

	protected float getSoundVolume() {
		return 0.4F;
	}
}
