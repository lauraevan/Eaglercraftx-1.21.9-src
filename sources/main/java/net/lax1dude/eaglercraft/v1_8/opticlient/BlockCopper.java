package net.lax1dude.eaglercraft.v1_8.opticlient;

import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

/**
 * A copper block that slowly oxidizes over time, advancing to the next
 * weathering stage on random ticks (copper -> exposed -> weathered ->
 * oxidized). The final oxidized stage passes a null nextStage and never
 * ticks. Mirrors Minecraft's random-tick oxidation approach.
 */
public class BlockCopper extends Block {

	private final String nextStage;

	public BlockCopper(String nextStage) {
		super(Material.iron);
		this.nextStage = nextStage;
		this.setHardness(3.0F);
		this.setResistance(6.0F);
		this.setStepSound(Block.soundTypeMetal);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setTickRandomly(nextStage != null);
	}

	public void updateTick(World world, BlockPos pos, IBlockState state, EaglercraftRandom rand) {
		if (this.nextStage == null || world.isRemote) {
			return;
		}
		// slow weathering: a small chance per random tick to advance a stage
		if (rand.nextInt(1200) == 0) {
			Block next = Block.getBlockFromName(this.nextStage);
			if (next != null) {
				world.setBlockState(pos, next.getDefaultState(), 2);
			}
		}
	}
}
