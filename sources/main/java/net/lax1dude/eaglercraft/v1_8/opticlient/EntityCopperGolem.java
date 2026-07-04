package net.lax1dude.eaglercraft.v1_8.opticlient;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * The Copper Golem: a small, friendly constructed golem built from copper.
 * It wanders, watches nearby players and, like real copper, slowly oxidizes
 * over time (a purely cosmetic timer here). It is passive and never attacks.
 */
public class EntityCopperGolem extends EntityGolem {

	/** 0 = unoxidized, 1 = exposed, 2 = weathered, 3 = oxidized (cosmetic). */
	private int oxidationStage = 0;
	private int oxidationTimer = 0;

	public EntityCopperGolem(World worldIn) {
		super(worldIn);
		this.setSize(0.7F, 1.0F);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIWander(this, 0.7D));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(4, new EntityAILookIdle(this));
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	}

	public int getOxidationStage() {
		return this.oxidationStage;
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (!this.worldObj.isRemote && this.oxidationStage < 3) {
			if (++this.oxidationTimer >= 18000) {
				this.oxidationTimer = 0;
				++this.oxidationStage;
			}
		}
	}

	protected boolean canDespawn() {
		return false;
	}
}
