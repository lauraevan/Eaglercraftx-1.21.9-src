package net.lax1dude.eaglercraft.v1_8.opticlient;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

/**
 * A gravity-affected block with 16 dye-color subtypes, used for concrete
 * powder. Combines Minecraft's BlockFalling behavior with the color
 * metadata handling from BlockColored, and hardens into concrete of the
 * matching color when it comes into contact with water (as in 1.13+).
 */
public class BlockColoredFalling extends BlockFalling {

	public static final PropertyEnum<EnumDyeColor> COLOR = PropertyEnum.<EnumDyeColor>create("color",
			EnumDyeColor.class);

	public BlockColoredFalling(Material materialIn) {
		super(materialIn);
		this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR, EnumDyeColor.WHITE));
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public int damageDropped(IBlockState state) {
		return ((EnumDyeColor) state.getValue(COLOR)).getMetadata();
	}

	public void getSubBlocks(Item item, CreativeTabs tab, List<ItemStack> list) {
		EnumDyeColor[] colors = EnumDyeColor.META_LOOKUP;
		for (int i = 0; i < colors.length; ++i) {
			list.add(new ItemStack(item, 1, colors[i].getMetadata()));
		}
	}

	public MapColor getMapColor(IBlockState state) {
		return ((EnumDyeColor) state.getValue(COLOR)).getMapColor();
	}

	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(COLOR, EnumDyeColor.byMetadata(meta));
	}

	public int getMetaFromState(IBlockState state) {
		return ((EnumDyeColor) state.getValue(COLOR)).getMetadata();
	}

	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { COLOR });
	}

	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		super.onBlockAdded(world, pos, state);
		this.tryHarden(world, pos, state);
	}

	public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block neighbor) {
		super.onNeighborBlockChange(world, pos, state, neighbor);
		this.tryHarden(world, pos, state);
	}

	private void tryHarden(World world, BlockPos pos, IBlockState state) {
		if (world.isRemote) {
			return;
		}
		for (int i = 0; i < EnumFacing._VALUES.length; ++i) {
			if (world.getBlockState(pos.offset(EnumFacing._VALUES[i])).getBlock().getMaterial() == Material.water) {
				int meta = ((EnumDyeColor) state.getValue(COLOR)).getMetadata();
				world.setBlockState(pos, Blocks.concrete.getStateFromMeta(meta), 3);
				return;
			}
		}
	}
}
