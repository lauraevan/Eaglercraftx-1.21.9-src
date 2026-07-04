package net.lax1dude.eaglercraft.v1_8.opticlient;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

/**
 * The Mace: a heavy two-handed weapon that hits harder than any sword. It
 * reuses the sword's block/harvest behaviour but injects a larger attack
 * damage modifier so a solid blow is devastating.
 */
public class ItemMace extends ItemSword {

	private final float maceDamage;

	public ItemMace(Item.ToolMaterial material) {
		super(material);
		this.maceDamage = 9.0F + material.getDamageVsEntity();
	}

	public Multimap<String, AttributeModifier> getItemAttributeModifiers() {
		Multimap<String, AttributeModifier> multimap = HashMultimap.create();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(),
				new AttributeModifier(itemModifierUUID, "Weapon modifier", (double) this.maceDamage, 0));
		return multimap;
	}
}
