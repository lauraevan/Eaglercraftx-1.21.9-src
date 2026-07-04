
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

> INSERT  439 : 993  @  439

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
+ 		// Opticlient: batch 4 - copper family, glazed terracotta, coral, more
+ 		registerBlock(285, (String) "exposed_chiseled_copper",
+ 				(new Block(Material.rock)).setHardness(3F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("exposed_chiseled_copper").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(286, (String) "weathered_chiseled_copper",
+ 				(new Block(Material.rock)).setHardness(3F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("weathered_chiseled_copper").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(287, (String) "oxidized_chiseled_copper",
+ 				(new Block(Material.rock)).setHardness(3F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("oxidized_chiseled_copper").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(288, (String) "copper_grate", (new Block(Material.rock)).setHardness(3F).setResistance(6F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("copper_grate").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(289, (String) "exposed_copper_grate",
+ 				(new Block(Material.rock)).setHardness(3F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("exposed_copper_grate").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(290, (String) "weathered_copper_grate",
+ 				(new Block(Material.rock)).setHardness(3F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("weathered_copper_grate").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(291, (String) "oxidized_copper_grate",
+ 				(new Block(Material.rock)).setHardness(3F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("oxidized_copper_grate").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(292, (String) "copper_bulb",
+ 				(new Block(Material.rock)).setHardness(3F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setLightLevel(1.0F).setUnlocalizedName("copper_bulb").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(293, (String) "exposed_copper_bulb",
+ 				(new Block(Material.rock)).setHardness(3F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setLightLevel(1.0F).setUnlocalizedName("exposed_copper_bulb")
+ 						.setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(294, (String) "weathered_copper_bulb",
+ 				(new Block(Material.rock)).setHardness(3F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setLightLevel(1.0F).setUnlocalizedName("weathered_copper_bulb")
+ 						.setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(295, (String) "oxidized_copper_bulb",
+ 				(new Block(Material.rock)).setHardness(3F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setLightLevel(1.0F).setUnlocalizedName("oxidized_copper_bulb")
+ 						.setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(296, (String) "white_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("white_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(297, (String) "orange_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("orange_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(298, (String) "magenta_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("magenta_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(299, (String) "light_blue_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("light_blue_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(300, (String) "yellow_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("yellow_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(301, (String) "lime_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("lime_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(302, (String) "pink_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("pink_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(303, (String) "gray_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("gray_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(304, (String) "light_gray_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("light_gray_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(305, (String) "cyan_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("cyan_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(306, (String) "purple_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("purple_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(307, (String) "blue_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("blue_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(308, (String) "brown_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("brown_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(309, (String) "green_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("green_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(310, (String) "red_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("red_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(311, (String) "black_glazed_terracotta",
+ 				(new Block(Material.rock)).setHardness(1.4F).setResistance(7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("black_glazed_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(312, (String) "tube_coral_block",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("tube_coral_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(313, (String) "dead_tube_coral_block",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("dead_tube_coral_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(314, (String) "brain_coral_block",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("brain_coral_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(315, (String) "dead_brain_coral_block",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("dead_brain_coral_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(316, (String) "bubble_coral_block",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("bubble_coral_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(317, (String) "dead_bubble_coral_block",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("dead_bubble_coral_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(318, (String) "fire_coral_block",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("fire_coral_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(319, (String) "dead_fire_coral_block",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("dead_fire_coral_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(320, (String) "horn_coral_block",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("horn_coral_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(321, (String) "dead_horn_coral_block",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("dead_horn_coral_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(322, (String) "nether_gold_ore",
+ 				(new Block(Material.rock)).setHardness(3F).setResistance(3F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("nether_gold_ore").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(323, (String) "bamboo_mosaic",
+ 				(new Block(Material.rock)).setHardness(2F).setResistance(3F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("bamboo_mosaic").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(324, (String) "chiseled_red_sandstone",
+ 				(new Block(Material.rock)).setHardness(0.8F).setResistance(0.8F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("chiseled_red_sandstone").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(325, (String) "cut_red_sandstone",
+ 				(new Block(Material.rock)).setHardness(0.8F).setResistance(0.8F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("cut_red_sandstone").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(326, (String) "rooted_dirt", (new Block(Material.rock)).setHardness(0.5F).setResistance(0.5F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("rooted_dirt").setCreativeTab(CreativeTabs.tabBlock));
+ 
+ 		// Opticlient: batch 5 - deepslate ores, caves&cliffs stone, nether, ice,
+ 		// columns
+ 		registerBlock(327, (String) "chiseled_tuff_bricks",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("chiseled_tuff_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(328, (String) "budding_amethyst",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(1.5F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("budding_amethyst").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(329, (String) "ancient_debris",
+ 				(new Block(Material.iron)).setHardness(30F).setResistance(1200F).setStepSound(soundTypeMetal)
+ 						.setUnlocalizedName("ancient_debris").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(330, (String) "polished_basalt",
+ 				(new Block(Material.rock)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("polished_basalt").setCreativeTab(CreativeTabs.tabBlock));
+ 
+ 		// Opticlient: batch 6 - natural cubes, stone family, terracotta family
+ 		registerBlock(331, (String) "magma_block",
+ 				(new Block(Material.rock)).setHardness(0.5F).setResistance(0.5F).setStepSound(soundTypeStone)
+ 						.setLightLevel(0.2F).setUnlocalizedName("magma_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(332, (String) "dark_prismarine",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("dark_prismarine").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(333, (String) "pale_moss_block",
+ 				(new Block(Material.rock)).setHardness(0.1F).setResistance(0.1F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("pale_moss_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(334, (String) "reinforced_deepslate",
+ 				(new Block(Material.rock)).setHardness(55F).setResistance(1200F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("reinforced_deepslate").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(335, (String) "coarse_dirt", (new Block(Material.rock)).setHardness(0.5F).setResistance(0.5F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("coarse_dirt").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(336, (String) "wet_sponge", (new Block(Material.rock)).setHardness(0.6F).setResistance(0.6F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("wet_sponge").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(337, (String) "target", (new Block(Material.rock)).setHardness(0.5F).setResistance(0.5F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("target").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(338, (String) "note_block", (new Block(Material.wood)).setHardness(0.8F).setResistance(0.8F)
+ 				.setStepSound(soundTypeWood).setUnlocalizedName("note_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(339, (String) "podzol", (new Block(Material.rock)).setHardness(0.5F).setResistance(0.5F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("podzol").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(340, (String) "dried_kelp_block",
+ 				(new Block(Material.rock)).setHardness(0.5F).setResistance(0.5F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("dried_kelp_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(341, (String) "mangrove_roots",
+ 				(new Block(Material.wood)).setHardness(0.7F).setResistance(0.7F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("mangrove_roots").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(342, (String) "muddy_mangrove_roots",
+ 				(new Block(Material.rock)).setHardness(0.7F).setResistance(0.7F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("muddy_mangrove_roots").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(343, (String) "lodestone", (new Block(Material.iron)).setHardness(3.5F).setResistance(3.5F)
+ 				.setStepSound(soundTypeMetal).setUnlocalizedName("lodestone").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(344, (String) "chiseled_quartz_block",
+ 				(new Block(Material.rock)).setHardness(0.8F).setResistance(0.8F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("chiseled_quartz_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(345, (String) "stone_bricks", (new Block(Material.rock)).setHardness(1.5F).setResistance(6F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("stone_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(346, (String) "mossy_stone_bricks",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("mossy_stone_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(347, (String) "cracked_stone_bricks",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("cracked_stone_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(348, (String) "chiseled_stone_bricks",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("chiseled_stone_bricks").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(349, (String) "andesite", (new Block(Material.rock)).setHardness(1.5F).setResistance(6F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("andesite").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(350, (String) "diorite", (new Block(Material.rock)).setHardness(1.5F).setResistance(6F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("diorite").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(351, (String) "granite", (new Block(Material.rock)).setHardness(1.5F).setResistance(6F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("granite").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(352, (String) "polished_andesite",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("polished_andesite").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(353, (String) "polished_diorite",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("polished_diorite").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(354, (String) "polished_granite",
+ 				(new Block(Material.rock)).setHardness(1.5F).setResistance(6F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("polished_granite").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(355, (String) "terracotta", (new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F)
+ 				.setStepSound(soundTypeStone).setUnlocalizedName("terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(356, (String) "white_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("white_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(357, (String) "orange_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("orange_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(358, (String) "magenta_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("magenta_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(359, (String) "light_blue_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("light_blue_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(360, (String) "yellow_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("yellow_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(361, (String) "lime_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("lime_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(362, (String) "pink_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("pink_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(363, (String) "gray_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("gray_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(364, (String) "light_gray_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("light_gray_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(365, (String) "cyan_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("cyan_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(366, (String) "purple_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("purple_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(367, (String) "blue_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("blue_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(368, (String) "brown_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("brown_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(369, (String) "green_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("green_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(370, (String) "red_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("red_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(371, (String) "black_terracotta",
+ 				(new Block(Material.clay)).setHardness(1.25F).setResistance(4.2F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("black_terracotta").setCreativeTab(CreativeTabs.tabBlock));
+ 
+ 		// Opticlient: batch 7 - stripped logs, nylium, gourds, sandstone
+ 		registerBlock(372, (String) "stripped_oak_log",
+ 				(new Block(Material.wood)).setHardness(2F).setResistance(3F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("stripped_oak_log").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(373, (String) "stripped_spruce_log",
+ 				(new Block(Material.wood)).setHardness(2F).setResistance(3F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("stripped_spruce_log").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(374, (String) "stripped_birch_log",
+ 				(new Block(Material.wood)).setHardness(2F).setResistance(3F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("stripped_birch_log").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(375, (String) "stripped_jungle_log",
+ 				(new Block(Material.wood)).setHardness(2F).setResistance(3F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("stripped_jungle_log").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(376, (String) "stripped_acacia_log",
+ 				(new Block(Material.wood)).setHardness(2F).setResistance(3F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("stripped_acacia_log").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(377, (String) "stripped_dark_oak_log",
+ 				(new Block(Material.wood)).setHardness(2F).setResistance(3F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("stripped_dark_oak_log").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(378, (String) "stripped_mangrove_log",
+ 				(new Block(Material.wood)).setHardness(2F).setResistance(3F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("stripped_mangrove_log").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(379, (String) "stripped_cherry_log",
+ 				(new Block(Material.wood)).setHardness(2F).setResistance(3F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("stripped_cherry_log").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(380, (String) "stripped_crimson_stem",
+ 				(new Block(Material.wood)).setHardness(2F).setResistance(3F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("stripped_crimson_stem").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(381, (String) "stripped_warped_stem",
+ 				(new Block(Material.wood)).setHardness(2F).setResistance(3F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("stripped_warped_stem").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(382, (String) "stripped_bamboo_block",
+ 				(new Block(Material.wood)).setHardness(2F).setResistance(3F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("stripped_bamboo_block").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(383, (String) "crimson_nylium",
+ 				(new Block(Material.rock)).setHardness(0.4F).setResistance(0.4F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("crimson_nylium").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(384, (String) "warped_nylium",
+ 				(new Block(Material.rock)).setHardness(0.4F).setResistance(0.4F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("warped_nylium").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(385, (String) "melon", (new Block(Material.gourd)).setHardness(1F).setResistance(1F)
+ 				.setStepSound(soundTypeWood).setUnlocalizedName("melon").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(386, (String) "carved_pumpkin",
+ 				(new Block(Material.gourd)).setHardness(1F).setResistance(1F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("carved_pumpkin").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(387, (String) "jack_o_lantern",
+ 				(new Block(Material.gourd)).setHardness(1F).setResistance(1F).setStepSound(soundTypeWood)
+ 						.setLightLevel(1.0F).setUnlocalizedName("jack_o_lantern")
+ 						.setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(388, (String) "cut_sandstone",
+ 				(new Block(Material.rock)).setHardness(0.8F).setResistance(0.8F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("cut_sandstone").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(389, (String) "chiseled_sandstone",
+ 				(new Block(Material.rock)).setHardness(0.8F).setResistance(0.8F).setStepSound(soundTypeStone)
+ 						.setUnlocalizedName("chiseled_sandstone").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(390, (String) "red_sand", (new Block(Material.sand)).setHardness(0.5F).setResistance(0.5F)
+ 				.setStepSound(soundTypeSand).setUnlocalizedName("red_sand").setCreativeTab(CreativeTabs.tabBlock));
+ 		registerBlock(391, (String) "chiseled_bookshelf_empty",
+ 				(new Block(Material.wood)).setHardness(1.5F).setResistance(1.5F).setStepSound(soundTypeWood)
+ 						.setUnlocalizedName("chiseled_bookshelf_empty").setCreativeTab(CreativeTabs.tabBlock));
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
