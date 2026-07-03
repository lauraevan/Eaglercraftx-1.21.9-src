
# Eagler Context Redacted Diff
# Copyright (c) 2026 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  3 : 6  @  3 : 135

~ 
~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
~ 

> INSERT  27 : 28  @  27

+ import net.minecraft.world.EnumSkyBlock;

> CHANGE  327 : 328  @  327 : 328

~ 	public void randomTick(World world, BlockPos blockpos, IBlockState iblockstate, EaglercraftRandom random) {

> CHANGE  3 : 4  @  3 : 4

~ 	public void updateTick(World var1, BlockPos var2, IBlockState var3, EaglercraftRandom var4) {

> CHANGE  2 : 3  @  2 : 3

~ 	public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, EaglercraftRandom rand) {

> CHANGE  18 : 19  @  18 : 19

~ 	public int quantityDropped(EaglercraftRandom random) {

> CHANGE  3 : 4  @  3 : 4

~ 	public Item getItemDropped(IBlockState var1, EaglercraftRandom var2, int var3) {

> DELETE  26  @  26 : 27

> DELETE  25  @  25 : 26

> CHANGE  251 : 252  @  251 : 252

~ 	public int quantityDroppedWithBonus(int fortune, EaglercraftRandom random) {

> INSERT  136 : 137  @  136

+ 		bootstrapStates();

> INSERT  439 : 478  @  439

+ 
+ 		// Opticlient: modern building blocks backported from 1.21
+ 		registerBlock(198, (String) "concrete", (new BlockColored(Material.rock)).setHardness(1.8F).setResistance(9.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("concrete").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(199, (String) "smooth_stone", (new Block(Material.rock)).setHardness(2.0F).setResistance(10.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("smooth_stone").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(200, (String) "blackstone", (new Block(Material.rock)).setHardness(1.5F).setResistance(10.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("blackstone").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(201, (String) "polished_blackstone",
+ 				(new Block(Material.rock)).setHardness(2.0F).setResistance(10.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("polished_blackstone").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(202, (String) "polished_blackstone_bricks",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(10.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("polished_blackstone_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(203, (String) "cobbled_deepslate",
+ 				(new Block(Material.rock)).setHardness(3.5F).setResistance(10.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("cobbled_deepslate").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(204, (String) "polished_deepslate",
+ 				(new Block(Material.rock)).setHardness(3.5F).setResistance(10.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("polished_deepslate").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(205, (String) "deepslate_bricks",
+ 				(new Block(Material.rock)).setHardness(3.5F).setResistance(10.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("deepslate_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(206, (String) "deepslate_tiles",
+ 				(new Block(Material.rock)).setHardness(3.5F).setResistance(10.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("deepslate_tiles").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(207, (String) "end_stone_bricks",
+ 				(new Block(Material.rock)).setHardness(3.0F).setResistance(9.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("end_stone_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(208, (String) "quartz_bricks",
+ 				(new Block(Material.rock)).setHardness(0.8F).setResistance(4.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("quartz_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(209, (String) "crying_obsidian",
+ 				(new Block(Material.rock)).setHardness(50.0F).setResistance(2000.0F).setStepSound(soundTypeStone)
+ 						.setLightLevel(0.66F).setUnlocalizedName("crying_obsidian")
+ 						.setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(210, (String) "purpur_block", (new Block(Material.rock)).setHardness(1.5F).setResistance(10.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("purpur_block").setCreativeTab(CreativeTabs.tabBlock));
+ 

> INSERT  29 : 69  @  29

+ 	public static void bootstrapStates() {
+ 		BlockBed.bootstrapStates();
+ 		BlockDirt.bootstrapStates();
+ 		BlockDoor.bootstrapStates();
+ 		BlockDoublePlant.bootstrapStates();
+ 		BlockFlowerPot.bootstrapStates();
+ 		BlockHugeMushroom.bootstrapStates();
+ 		BlockLever.bootstrapStates();
+ 		BlockLog.bootstrapStates();
+ 		BlockNewLeaf.bootstrapStates();
+ 		BlockNewLog.bootstrapStates();
+ 		BlockOldLeaf.bootstrapStates();
+ 		BlockOldLog.bootstrapStates();
+ 		BlockPistonExtension.bootstrapStates();
+ 		BlockPistonMoving.bootstrapStates();
+ 		BlockPlanks.bootstrapStates();
+ 		BlockPrismarine.bootstrapStates();
+ 		BlockQuartz.bootstrapStates();
+ 		BlockRail.bootstrapStates();
+ 		BlockRailDetector.bootstrapStates();
+ 		BlockRailPowered.bootstrapStates();
+ 		BlockRedSandstone.bootstrapStates();
+ 		BlockRedstoneComparator.bootstrapStates();
+ 		BlockRedstoneWire.bootstrapStates();
+ 		BlockSand.bootstrapStates();
+ 		BlockSandStone.bootstrapStates();
+ 		BlockSapling.bootstrapStates();
+ 		BlockSilverfish.bootstrapStates();
+ 		BlockSlab.bootstrapStates();
+ 		BlockStairs.bootstrapStates();
+ 		BlockStone.bootstrapStates();
+ 		BlockStoneBrick.bootstrapStates();
+ 		BlockStoneSlab.bootstrapStates();
+ 		BlockStoneSlabNew.bootstrapStates();
+ 		BlockTallGrass.bootstrapStates();
+ 		BlockTrapDoor.bootstrapStates();
+ 		BlockWall.bootstrapStates();
+ 		BlockWoodSlab.bootstrapStates();
+ 	}
+ 

> INSERT  43 : 85  @  43

+ 
+ 	public boolean eaglerShadersShouldRenderGlassHighlights() {
+ 		return false;
+ 	}
+ 
+ 	public int alfheim$getLightFor(final IBlockState blockState, final IBlockAccess blockAccess,
+ 			final EnumSkyBlock lightType, final BlockPos blockPos) {
+ 		int lightLevel = blockAccess.getLightFor(lightType, blockPos);
+ 
+ 		if (lightLevel == 15)
+ 			return lightLevel;
+ 
+ 		if (!getUseNeighborBrightness())
+ 			return lightLevel;
+ 
+ 		BlockPos tmp = new BlockPos();
+ 		EnumFacing[] facings = EnumFacing._VALUES;
+ 		for (int i = 0, l = facings.length; i < l; ++i) {
+ 			EnumFacing facing = facings[i];
+ 			if (alfheim$useNeighborBrightness(blockState, facing, blockAccess, blockPos)) {
+ 				int opacity = 0;
+ 				final int neighborLightLevel = blockAccess.getLightFor(lightType,
+ 						blockPos.offsetEvenFaster(facing, tmp));
+ 
+ 				if (opacity == 0
+ 						&& (lightType != EnumSkyBlock.SKY || neighborLightLevel != EnumSkyBlock.SKY.defaultLightValue))
+ 					opacity = 1;
+ 
+ 				lightLevel = Math.max(lightLevel, neighborLightLevel - opacity);
+ 
+ 				if (lightLevel == 15)
+ 					return lightLevel;
+ 			}
+ 		}
+ 
+ 		return lightLevel;
+ 	}
+ 
+ 	public boolean alfheim$useNeighborBrightness(final IBlockState blockState, final EnumFacing facing,
+ 			final IBlockAccess blockAccess, final BlockPos blockPos) {
+ 		return facing == EnumFacing.UP;
+ 	}

> EOF
