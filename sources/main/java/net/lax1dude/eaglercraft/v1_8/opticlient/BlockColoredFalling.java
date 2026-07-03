package net.lax1dude.eaglercraft.v1_8.opticlient;

import java.util.List;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * A gravity-affected block with 16 dye-color subtypes, used for concrete
 * powder. Combines Minecraft's BlockFalling behavior with the color
 * metadata handling from BlockColored.
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
}
