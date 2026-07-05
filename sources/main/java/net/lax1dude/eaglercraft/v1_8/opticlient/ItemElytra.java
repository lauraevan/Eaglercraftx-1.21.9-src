package net.lax1dude.eaglercraft.v1_8.opticlient;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * The Elytra: a pair of wings worn in the chest slot that lets the player
 * glide. It is registered as chest armour (so it occupies the chest slot and
 * reuses an existing armour layer to avoid a missing worn texture); the glide
 * physics live in EntityPlayer.onLivingUpdate.
 */
public class ItemElytra extends ItemArmor {

	public ItemElytra() {
		super(ItemArmor.ArmorMaterial.NETHERITE, 3, 1);
		this.setMaxDamage(432);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("elytra");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

	/** True if the given entity is wearing an elytra in its chest slot. */
	public static boolean isWearing(EntityLivingBase entity) {
		ItemStack chest = entity.getEquipmentInSlot(3);
		return chest != null && chest.getItem() instanceof ItemElytra;
	}
}
