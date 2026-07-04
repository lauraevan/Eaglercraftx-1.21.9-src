
# Eagler Context Redacted Diff
# Copyright (c) 2026 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  2 : 6  @  2

+ import net.lax1dude.eaglercraft.v1_8.opticlient.BlockColoredFalling;
+ import net.lax1dude.eaglercraft.v1_8.opticlient.BlockCopper;
+ import net.lax1dude.eaglercraft.v1_8.opticlient.BlockOpticlientOre;
+ 

> CHANGE  1 : 4  @  1 : 133

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

> INSERT  439 : 674  @  439

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
+ 		// Opticlient: 1.21 block batch 2
+ 		registerBlock(211, (String) "amethyst_block",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(1.5F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("amethyst_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(212, (String) "calcite", (new Block(Material.rock)).setHardness(0.75F).setResistance(0.75F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("calcite").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(213, (String) "tuff", (new Block(Material.rock)).setHardness(1.5F).setResistance(6.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("tuff").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(214, (String) "tuff_bricks", (new Block(Material.rock)).setHardness(1.5F).setResistance(6.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("tuff_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(215, (String) "polished_tuff",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("polished_tuff").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(216, (String) "dripstone_block",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(1.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("dripstone_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(217, (String) "moss_block", (new Block(Material.grass)).setHardness(0.1F).setResistance(0.1F)
+ 				.setStepSound(soundTypeGrass).setUnlocalizedName("moss_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(218, (String) "mud", (new Block(Material.rock)).setHardness(0.5F).setResistance(0.5F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("mud").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(219, (String) "packed_mud", (new Block(Material.rock)).setHardness(1.0F).setResistance(3.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("packed_mud").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(220, (String) "mud_bricks", (new Block(Material.rock)).setHardness(1.5F).setResistance(3.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("mud_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(221, (String) "smooth_basalt",
+ 				(new Block(Material.rock)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("smooth_basalt").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(222, (String) "netherite_block",
+ 				(new Block(Material.rock)).setHardness(50.0F).setResistance(1200.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("netherite_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(223, (String) "raw_iron_block",
+ 				(new Block(Material.rock)).setHardness(5.0F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("raw_iron_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(224, (String) "raw_copper_block",
+ 				(new Block(Material.rock)).setHardness(5.0F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("raw_copper_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(225, (String) "raw_gold_block",
+ 				(new Block(Material.rock)).setHardness(5.0F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("raw_gold_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(226, (String) "copper_block",
+ 				(new BlockCopper("exposed_copper")).setUnlocalizedName("copper_block"));
+ 		registerBlock(227, (String) "exposed_copper",
+ 				(new BlockCopper("weathered_copper")).setUnlocalizedName("exposed_copper"));
+ 		registerBlock(228, (String) "weathered_copper",
+ 				(new BlockCopper("oxidized_copper")).setUnlocalizedName("weathered_copper"));
+ 		registerBlock(229, (String) "oxidized_copper", (new BlockCopper(null)).setUnlocalizedName("oxidized_copper"));
+ 		registerBlock(230, (String) "chiseled_copper",
+ 				(new Block(Material.rock)).setHardness(3.0F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("chiseled_copper").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(231, (String) "cut_copper", (new Block(Material.rock)).setHardness(3.0F).setResistance(6.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("cut_copper").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(232, (String) "exposed_cut_copper",
+ 				(new Block(Material.rock)).setHardness(3.0F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("exposed_cut_copper").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(233, (String) "weathered_cut_copper",
+ 				(new Block(Material.rock)).setHardness(3.0F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("weathered_cut_copper").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(234, (String) "oxidized_cut_copper",
+ 				(new Block(Material.rock)).setHardness(3.0F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("oxidized_cut_copper").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(235, (String) "honeycomb_block",
+ 				(new Block(Material.wood)).setHardness(0.6F).setResistance(0.6F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("honeycomb_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(236, (String) "nether_wart_block",
+ 				(new Block(Material.wood)).setHardness(1.0F).setResistance(1.0F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("nether_wart_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(237, (String) "warped_wart_block",
+ 				(new Block(Material.wood)).setHardness(1.0F).setResistance(1.0F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("warped_wart_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(238, (String) "shroomlight",
+ 				(new Block(Material.wood)).setHardness(1.0F).setResistance(1.0F).setStepSound(soundTypeWood)
+ 						.setLightLevel(1.0F).setUnlocalizedName("shroomlight").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(239, (String) "soul_soil", (new Block(Material.rock)).setHardness(0.5F).setResistance(0.5F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("soul_soil").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(240, (String) "gilded_blackstone",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("gilded_blackstone").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(241, (String) "chiseled_polished_blackstone",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("chiseled_polished_blackstone").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(242, (String) "cracked_polished_blackstone_bricks",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("cracked_polished_blackstone_bricks")
+ 						.setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(243, (String) "chiseled_deepslate",
+ 				(new Block(Material.rock)).setHardness(3.5F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("chiseled_deepslate").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(244, (String) "cracked_deepslate_bricks",
+ 				(new Block(Material.rock)).setHardness(3.5F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("cracked_deepslate_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(245, (String) "cracked_deepslate_tiles",
+ 				(new Block(Material.rock)).setHardness(3.5F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("cracked_deepslate_tiles").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(246, (String) "chiseled_nether_bricks",
+ 				(new Block(Material.rock)).setHardness(2.0F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("chiseled_nether_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(247, (String) "cracked_nether_bricks",
+ 				(new Block(Material.rock)).setHardness(2.0F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("cracked_nether_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(248, (String) "red_nether_bricks",
+ 				(new Block(Material.rock)).setHardness(2.0F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("red_nether_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(249, (String) "blue_ice", (new Block(Material.rock)).setHardness(2.8F).setResistance(2.8F)
+ 				.setStepSound(soundTypeGlass).setUnlocalizedName("blue_ice").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(250, (String) "sculk", (new Block(Material.rock)).setHardness(0.2F).setResistance(0.2F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("sculk").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(251, (String) "crimson_planks",
+ 				(new Block(Material.wood)).setHardness(2.0F).setResistance(3.0F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("crimson_planks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(252, (String) "warped_planks", (new Block(Material.wood)).setHardness(2.0F).setResistance(3.0F)
+ 				.setStepSound(soundTypeWood).setUnlocalizedName("warped_planks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(253, (String) "mangrove_planks",
+ 				(new Block(Material.wood)).setHardness(2.0F).setResistance(3.0F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("mangrove_planks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(254, (String) "cherry_planks", (new Block(Material.wood)).setHardness(2.0F).setResistance(3.0F)
+ 				.setStepSound(soundTypeWood).setUnlocalizedName("cherry_planks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(255, (String) "bamboo_planks", (new Block(Material.wood)).setHardness(2.0F).setResistance(3.0F)
+ 				.setStepSound(soundTypeWood).setUnlocalizedName("bamboo_planks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(256, (String) "pale_oak_planks",
+ 				(new Block(Material.wood)).setHardness(2.0F).setResistance(3.0F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("pale_oak_planks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(257, (String) "resin_block", (new Block(Material.rock)).setHardness(1.0F).setResistance(1.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("resin_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(258, (String) "resin_bricks", (new Block(Material.rock)).setHardness(1.5F).setResistance(6.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("resin_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(259, (String) "chiseled_resin_bricks",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("chiseled_resin_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(260, (String) "prismarine_bricks",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("prismarine_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(261, (String) "deepslate", (new Block(Material.rock)).setHardness(3.0F).setResistance(6.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("deepslate").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(262, (String) "basalt", (new Block(Material.rock)).setHardness(1.25F).setResistance(4.2F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("basalt").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(264, (String) "crimson_stem", (new Block(Material.wood)).setHardness(2.0F).setResistance(3.0F)
+ 				.setStepSound(soundTypeWood).setUnlocalizedName("crimson_stem").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(265, (String) "warped_stem", (new Block(Material.wood)).setHardness(2.0F).setResistance(3.0F)
+ 				.setStepSound(soundTypeWood).setUnlocalizedName("warped_stem").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(266, (String) "mangrove_log", (new Block(Material.wood)).setHardness(2.0F).setResistance(3.0F)
+ 				.setStepSound(soundTypeWood).setUnlocalizedName("mangrove_log").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(267, (String) "cherry_log", (new Block(Material.wood)).setHardness(2.0F).setResistance(3.0F)
+ 				.setStepSound(soundTypeWood).setUnlocalizedName("cherry_log").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(268, (String) "purpur_pillar",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("purpur_pillar").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(269, (String) "ochre_froglight",
+ 				(new Block(Material.rock)).setHardness(0.3F).setResistance(0.3F).setStepSound(soundTypeStone)
+ 						.setLightLevel(1.0F).setUnlocalizedName("ochre_froglight")
+ 						.setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(270, (String) "verdant_froglight",
+ 				(new Block(Material.rock)).setHardness(0.3F).setResistance(0.3F).setStepSound(soundTypeStone)
+ 						.setLightLevel(1.0F).setUnlocalizedName("verdant_froglight")
+ 						.setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(271, (String) "pearlescent_froglight",
+ 				(new Block(Material.rock)).setHardness(0.3F).setResistance(0.3F).setStepSound(soundTypeStone)
+ 						.setLightLevel(1.0F).setUnlocalizedName("pearlescent_froglight")
+ 						.setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(272, (String) "bone_block", (new Block(Material.rock)).setHardness(2.0F).setResistance(6.0F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("bone_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(273, (String) "bamboo_block", (new Block(Material.wood)).setHardness(2.0F).setResistance(3.0F)
+ 				.setStepSound(soundTypeWood).setUnlocalizedName("bamboo_block").setCreativeTab(CreativeTabs.tabBlock));
+ 
+ 		// Opticlient: falling concrete powder + ores
+ 		registerBlock(274, (String) "concrete_powder",
+ 				(new BlockColoredFalling(Material.sand)).setHardness(0.5F).setStepSound(soundTypeSand)
+ 						.setUnlocalizedName("concretePowder").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(275, (String) "copper_ore",
+ 				(new BlockOpticlientOre("raw_copper", 2, 5, 3.0F, 3.0F)).setUnlocalizedName("copper_ore"));
+ 		registerBlock(276, (String) "deepslate_copper_ore",
+ 				(new BlockOpticlientOre("raw_copper", 2, 5, 4.5F, 3.0F)).setUnlocalizedName("deepslate_copper_ore"));
+ 		registerBlock(277, (String) "deepslate_coal_ore",
+ 				(new Block(Material.rock)).setHardness(4.5F).setResistance(3.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("deepslate_coal_ore").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(278, (String) "deepslate_iron_ore",
+ 				(new Block(Material.rock)).setHardness(4.5F).setResistance(3.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("deepslate_iron_ore").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(279, (String) "deepslate_gold_ore",
+ 				(new Block(Material.rock)).setHardness(4.5F).setResistance(3.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("deepslate_gold_ore").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(280, (String) "deepslate_diamond_ore",
+ 				(new Block(Material.rock)).setHardness(4.5F).setResistance(3.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("deepslate_diamond_ore").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(281, (String) "deepslate_redstone_ore",
+ 				(new Block(Material.rock)).setHardness(4.5F).setResistance(3.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("deepslate_redstone_ore").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(282, (String) "deepslate_lapis_ore",
+ 				(new Block(Material.rock)).setHardness(4.5F).setResistance(3.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("deepslate_lapis_ore").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(283, (String) "deepslate_emerald_ore",
+ 				(new Block(Material.rock)).setHardness(4.5F).setResistance(3.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("deepslate_emerald_ore").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(284, (String) "chiseled_tuff",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6.0F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("chiseled_tuff").setCreativeTab(CreativeTabs.tabBlock));
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
