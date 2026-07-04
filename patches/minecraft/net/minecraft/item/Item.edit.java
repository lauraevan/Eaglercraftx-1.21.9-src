
# Eagler Context Redacted Diff
# Copyright (c) 2026 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  2 : 7  @  2

+ import java.util.List;
+ import java.util.Map;
+ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
+ import net.lax1dude.eaglercraft.v1_8.EaglercraftUUID;
+ 

> CHANGE  4 : 5  @  4 : 8

~ 

> DELETE  23  @  23 : 91

> CHANGE  16 : 18  @  16 : 17

~ 	protected static final EaglercraftUUID itemModifierUUID = EaglercraftUUID
~ 			.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");

> CHANGE  1 : 2  @  1 : 2

~ 	protected static EaglercraftRandom itemRand = new EaglercraftRandom();

> INSERT  470 : 600  @  470

+ 		registerItemBlock(Blocks.concrete, (new ItemCloth(Blocks.concrete)).setUnlocalizedName("concrete"));
+ 		registerItemBlock(Blocks.smooth_stone);
+ 		registerItemBlock(Blocks.blackstone);
+ 		registerItemBlock(Blocks.polished_blackstone);
+ 		registerItemBlock(Blocks.polished_blackstone_bricks);
+ 		registerItemBlock(Blocks.cobbled_deepslate);
+ 		registerItemBlock(Blocks.polished_deepslate);
+ 		registerItemBlock(Blocks.deepslate_bricks);
+ 		registerItemBlock(Blocks.deepslate_tiles);
+ 		registerItemBlock(Blocks.end_stone_bricks);
+ 		registerItemBlock(Blocks.quartz_bricks);
+ 		registerItemBlock(Blocks.crying_obsidian);
+ 		registerItemBlock(Blocks.purpur_block);
+ 		registerItemBlock(Blocks.amethyst_block);
+ 		registerItemBlock(Blocks.calcite);
+ 		registerItemBlock(Blocks.tuff);
+ 		registerItemBlock(Blocks.tuff_bricks);
+ 		registerItemBlock(Blocks.polished_tuff);
+ 		registerItemBlock(Blocks.dripstone_block);
+ 		registerItemBlock(Blocks.moss_block);
+ 		registerItemBlock(Blocks.mud);
+ 		registerItemBlock(Blocks.packed_mud);
+ 		registerItemBlock(Blocks.mud_bricks);
+ 		registerItemBlock(Blocks.smooth_basalt);
+ 		registerItemBlock(Blocks.netherite_block);
+ 		registerItemBlock(Blocks.raw_iron_block);
+ 		registerItemBlock(Blocks.raw_copper_block);
+ 		registerItemBlock(Blocks.raw_gold_block);
+ 		registerItemBlock(Blocks.copper_block);
+ 		registerItemBlock(Blocks.exposed_copper);
+ 		registerItemBlock(Blocks.weathered_copper);
+ 		registerItemBlock(Blocks.oxidized_copper);
+ 		registerItemBlock(Blocks.chiseled_copper);
+ 		registerItemBlock(Blocks.cut_copper);
+ 		registerItemBlock(Blocks.exposed_cut_copper);
+ 		registerItemBlock(Blocks.weathered_cut_copper);
+ 		registerItemBlock(Blocks.oxidized_cut_copper);
+ 		registerItemBlock(Blocks.honeycomb_block);
+ 		registerItemBlock(Blocks.nether_wart_block);
+ 		registerItemBlock(Blocks.warped_wart_block);
+ 		registerItemBlock(Blocks.shroomlight);
+ 		registerItemBlock(Blocks.soul_soil);
+ 		registerItemBlock(Blocks.gilded_blackstone);
+ 		registerItemBlock(Blocks.chiseled_polished_blackstone);
+ 		registerItemBlock(Blocks.cracked_polished_blackstone_bricks);
+ 		registerItemBlock(Blocks.chiseled_deepslate);
+ 		registerItemBlock(Blocks.cracked_deepslate_bricks);
+ 		registerItemBlock(Blocks.cracked_deepslate_tiles);
+ 		registerItemBlock(Blocks.chiseled_nether_bricks);
+ 		registerItemBlock(Blocks.cracked_nether_bricks);
+ 		registerItemBlock(Blocks.red_nether_bricks);
+ 		registerItemBlock(Blocks.blue_ice);
+ 		registerItemBlock(Blocks.sculk);
+ 		registerItemBlock(Blocks.crimson_planks);
+ 		registerItemBlock(Blocks.warped_planks);
+ 		registerItemBlock(Blocks.mangrove_planks);
+ 		registerItemBlock(Blocks.cherry_planks);
+ 		registerItemBlock(Blocks.bamboo_planks);
+ 		registerItemBlock(Blocks.pale_oak_planks);
+ 		registerItemBlock(Blocks.resin_block);
+ 		registerItemBlock(Blocks.resin_bricks);
+ 		registerItemBlock(Blocks.chiseled_resin_bricks);
+ 		registerItemBlock(Blocks.prismarine_bricks);
+ 		registerItemBlock(Blocks.deepslate);
+ 		registerItemBlock(Blocks.basalt);
+ 		registerItemBlock(Blocks.crimson_stem);
+ 		registerItemBlock(Blocks.warped_stem);
+ 		registerItemBlock(Blocks.mangrove_log);
+ 		registerItemBlock(Blocks.cherry_log);
+ 		registerItemBlock(Blocks.purpur_pillar);
+ 		registerItemBlock(Blocks.ochre_froglight);
+ 		registerItemBlock(Blocks.verdant_froglight);
+ 		registerItemBlock(Blocks.pearlescent_froglight);
+ 		registerItemBlock(Blocks.bone_block);
+ 		registerItemBlock(Blocks.bamboo_block);
+ 		registerItemBlock(Blocks.concrete_powder,
+ 				(new ItemCloth(Blocks.concrete_powder)).setUnlocalizedName("concretePowder"));
+ 		registerItemBlock(Blocks.copper_ore);
+ 		registerItemBlock(Blocks.deepslate_copper_ore);
+ 		registerItemBlock(Blocks.deepslate_coal_ore);
+ 		registerItemBlock(Blocks.deepslate_iron_ore);
+ 		registerItemBlock(Blocks.deepslate_gold_ore);
+ 		registerItemBlock(Blocks.deepslate_diamond_ore);
+ 		registerItemBlock(Blocks.deepslate_redstone_ore);
+ 		registerItemBlock(Blocks.deepslate_lapis_ore);
+ 		registerItemBlock(Blocks.deepslate_emerald_ore);
+ 		registerItemBlock(Blocks.chiseled_tuff);
+ 		registerItemBlock(Blocks.exposed_chiseled_copper);
+ 		registerItemBlock(Blocks.weathered_chiseled_copper);
+ 		registerItemBlock(Blocks.oxidized_chiseled_copper);
+ 		registerItemBlock(Blocks.copper_grate);
+ 		registerItemBlock(Blocks.exposed_copper_grate);
+ 		registerItemBlock(Blocks.weathered_copper_grate);
+ 		registerItemBlock(Blocks.oxidized_copper_grate);
+ 		registerItemBlock(Blocks.copper_bulb);
+ 		registerItemBlock(Blocks.exposed_copper_bulb);
+ 		registerItemBlock(Blocks.weathered_copper_bulb);
+ 		registerItemBlock(Blocks.oxidized_copper_bulb);
+ 		registerItemBlock(Blocks.white_glazed_terracotta);
+ 		registerItemBlock(Blocks.orange_glazed_terracotta);
+ 		registerItemBlock(Blocks.magenta_glazed_terracotta);
+ 		registerItemBlock(Blocks.light_blue_glazed_terracotta);
+ 		registerItemBlock(Blocks.yellow_glazed_terracotta);
+ 		registerItemBlock(Blocks.lime_glazed_terracotta);
+ 		registerItemBlock(Blocks.pink_glazed_terracotta);
+ 		registerItemBlock(Blocks.gray_glazed_terracotta);
+ 		registerItemBlock(Blocks.light_gray_glazed_terracotta);
+ 		registerItemBlock(Blocks.cyan_glazed_terracotta);
+ 		registerItemBlock(Blocks.purple_glazed_terracotta);
+ 		registerItemBlock(Blocks.blue_glazed_terracotta);
+ 		registerItemBlock(Blocks.brown_glazed_terracotta);
+ 		registerItemBlock(Blocks.green_glazed_terracotta);
+ 		registerItemBlock(Blocks.red_glazed_terracotta);
+ 		registerItemBlock(Blocks.black_glazed_terracotta);
+ 		registerItemBlock(Blocks.tube_coral_block);
+ 		registerItemBlock(Blocks.dead_tube_coral_block);
+ 		registerItemBlock(Blocks.brain_coral_block);
+ 		registerItemBlock(Blocks.dead_brain_coral_block);
+ 		registerItemBlock(Blocks.bubble_coral_block);
+ 		registerItemBlock(Blocks.dead_bubble_coral_block);
+ 		registerItemBlock(Blocks.fire_coral_block);
+ 		registerItemBlock(Blocks.dead_fire_coral_block);
+ 		registerItemBlock(Blocks.horn_coral_block);
+ 		registerItemBlock(Blocks.dead_horn_coral_block);
+ 		registerItemBlock(Blocks.nether_gold_ore);
+ 		registerItemBlock(Blocks.bamboo_mosaic);
+ 		registerItemBlock(Blocks.chiseled_red_sandstone);
+ 		registerItemBlock(Blocks.cut_red_sandstone);
+ 		registerItemBlock(Blocks.rooted_dirt);
+ 

> INSERT  52 : 56  @  52

+ 		registerItem(432, (String) "raw_copper",
+ 				(new Item()).setUnlocalizedName("rawCopper").setCreativeTab(CreativeTabs.tabMaterials));
+ 		registerItem(433, (String) "copper_ingot",
+ 				(new Item()).setUnlocalizedName("ingotCopper").setCreativeTab(CreativeTabs.tabMaterials));

> INSERT  362 : 370  @  362

+ 
+ 	public float getHeldItemBrightnessEagler(ItemStack itemStack) {
+ 		return 0.0f;
+ 	}
+ 
+ 	public boolean shouldUseOnTouchEagler(ItemStack itemStack) {
+ 		return getItemUseAction(itemStack) != EnumAction.NONE;
+ 	}

> EOF
