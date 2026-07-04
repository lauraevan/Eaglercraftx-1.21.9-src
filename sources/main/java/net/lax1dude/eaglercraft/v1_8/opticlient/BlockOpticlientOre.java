package net.lax1dude.eaglercraft.v1_8.opticlient;

import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * An ore block that drops a named item (e.g. copper_ore drops raw_copper)
 * in a configurable quantity, following Minecraft's ore-drop pattern.
 */
public class BlockOpticlientOre extends Block {

	private final String dropName;
	private final int minDrop;
	private final int maxDrop;

	public BlockOpticlientOre(String dropName, int minDrop, int maxDrop, float hardness, float resistance) {
		super(Material.rock);
		this.dropName = dropName;
		this.minDrop = minDrop;
		this.maxDrop = maxDrop;
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public Item getItemDropped(IBlockState state, EaglercraftRandom rand, int fortune) {
		Item item = Item.getByNameOrId(this.dropName);
		return item != null ? item : Item.getItemFromBlock(this);
	}

	public int quantityDropped(EaglercraftRandom random) {
		if (this.maxDrop <= this.minDrop) {
			return this.minDrop;
		}
		return this.minDrop + random.nextInt(this.maxDrop - this.minDrop + 1);
	}

	public int quantityDroppedWithBonus(int fortune, EaglercraftRandom random) {
		if (fortune > 0) {
			int i = random.nextInt(fortune + 2) - 1;
			if (i < 0) {
				i = 0;
			}
			return this.quantityDropped(random) * (i + 1);
		}
		return this.quantityDropped(random);
	}
}
