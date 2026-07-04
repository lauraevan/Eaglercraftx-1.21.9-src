
# Eagler Context Redacted Diff
# Copyright (c) 2026 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  2 : 8  @  2

+ import java.util.List;
+ import java.util.Map;
+ import net.lax1dude.eaglercraft.v1_8.opticlient.ItemMace;
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

> INSERT  470 : 665  @  470

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
+ 		registerItemBlock(Blocks.chiseled_tuff_bricks);
+ 		registerItemBlock(Blocks.budding_amethyst);
+ 		registerItemBlock(Blocks.ancient_debris);
+ 		registerItemBlock(Blocks.polished_basalt);
+ 		registerItemBlock(Blocks.magma_block);
+ 		registerItemBlock(Blocks.dark_prismarine);
+ 		registerItemBlock(Blocks.pale_moss_block);
+ 		registerItemBlock(Blocks.reinforced_deepslate);
+ 		registerItemBlock(Blocks.coarse_dirt);
+ 		registerItemBlock(Blocks.wet_sponge);
+ 		registerItemBlock(Blocks.target);
+ 		registerItemBlock(Blocks.note_block);
+ 		registerItemBlock(Blocks.podzol);
+ 		registerItemBlock(Blocks.dried_kelp_block);
+ 		registerItemBlock(Blocks.mangrove_roots);
+ 		registerItemBlock(Blocks.muddy_mangrove_roots);
+ 		registerItemBlock(Blocks.lodestone);
+ 		registerItemBlock(Blocks.chiseled_quartz_block);
+ 		registerItemBlock(Blocks.stone_bricks);
+ 		registerItemBlock(Blocks.mossy_stone_bricks);
+ 		registerItemBlock(Blocks.cracked_stone_bricks);
+ 		registerItemBlock(Blocks.chiseled_stone_bricks);
+ 		registerItemBlock(Blocks.andesite);
+ 		registerItemBlock(Blocks.diorite);
+ 		registerItemBlock(Blocks.granite);
+ 		registerItemBlock(Blocks.polished_andesite);
+ 		registerItemBlock(Blocks.polished_diorite);
+ 		registerItemBlock(Blocks.polished_granite);
+ 		registerItemBlock(Blocks.terracotta);
+ 		registerItemBlock(Blocks.white_terracotta);
+ 		registerItemBlock(Blocks.orange_terracotta);
+ 		registerItemBlock(Blocks.magenta_terracotta);
+ 		registerItemBlock(Blocks.light_blue_terracotta);
+ 		registerItemBlock(Blocks.yellow_terracotta);
+ 		registerItemBlock(Blocks.lime_terracotta);
+ 		registerItemBlock(Blocks.pink_terracotta);
+ 		registerItemBlock(Blocks.gray_terracotta);
+ 		registerItemBlock(Blocks.light_gray_terracotta);
+ 		registerItemBlock(Blocks.cyan_terracotta);
+ 		registerItemBlock(Blocks.purple_terracotta);
+ 		registerItemBlock(Blocks.blue_terracotta);
+ 		registerItemBlock(Blocks.brown_terracotta);
+ 		registerItemBlock(Blocks.green_terracotta);
+ 		registerItemBlock(Blocks.red_terracotta);
+ 		registerItemBlock(Blocks.black_terracotta);
+ 		registerItemBlock(Blocks.stripped_oak_log);
+ 		registerItemBlock(Blocks.stripped_spruce_log);
+ 		registerItemBlock(Blocks.stripped_birch_log);
+ 		registerItemBlock(Blocks.stripped_jungle_log);
+ 		registerItemBlock(Blocks.stripped_acacia_log);
+ 		registerItemBlock(Blocks.stripped_dark_oak_log);
+ 		registerItemBlock(Blocks.stripped_mangrove_log);
+ 		registerItemBlock(Blocks.stripped_cherry_log);
+ 		registerItemBlock(Blocks.stripped_crimson_stem);
+ 		registerItemBlock(Blocks.stripped_warped_stem);
+ 		registerItemBlock(Blocks.stripped_bamboo_block);
+ 		registerItemBlock(Blocks.crimson_nylium);
+ 		registerItemBlock(Blocks.warped_nylium);
+ 		registerItemBlock(Blocks.melon);
+ 		registerItemBlock(Blocks.carved_pumpkin);
+ 		registerItemBlock(Blocks.jack_o_lantern);
+ 		registerItemBlock(Blocks.cut_sandstone);
+ 		registerItemBlock(Blocks.chiseled_sandstone);
+ 		registerItemBlock(Blocks.red_sand);
+ 		registerItemBlock(Blocks.chiseled_bookshelf_empty);
+ 

> INSERT  52 : 79  @  52

+ 		registerItem(432, (String) "raw_copper",
+ 				(new Item()).setUnlocalizedName("rawCopper").setCreativeTab(CreativeTabs.tabMaterials));
+ 		registerItem(433, (String) "copper_ingot",
+ 				(new Item()).setUnlocalizedName("ingotCopper").setCreativeTab(CreativeTabs.tabMaterials));
+ 		registerItem(434, (String) "netherite_scrap",
+ 				(new Item()).setUnlocalizedName("netheriteScrap").setCreativeTab(CreativeTabs.tabMaterials));
+ 		registerItem(435, (String) "netherite_ingot",
+ 				(new Item()).setUnlocalizedName("netheriteIngot").setCreativeTab(CreativeTabs.tabMaterials));
+ 		registerItem(436, (String) "netherite_sword",
+ 				(new ItemSword(Item.ToolMaterial.NETHERITE)).setUnlocalizedName("swordNetherite"));
+ 		registerItem(437, (String) "netherite_shovel",
+ 				(new ItemSpade(Item.ToolMaterial.NETHERITE)).setUnlocalizedName("shovelNetherite"));
+ 		registerItem(438, (String) "netherite_pickaxe",
+ 				(new ItemPickaxe(Item.ToolMaterial.NETHERITE)).setUnlocalizedName("pickaxeNetherite"));
+ 		registerItem(439, (String) "netherite_axe",
+ 				(new ItemAxe(Item.ToolMaterial.NETHERITE)).setUnlocalizedName("hatchetNetherite"));
+ 		registerItem(440, (String) "netherite_hoe",
+ 				(new ItemHoe(Item.ToolMaterial.NETHERITE)).setUnlocalizedName("hoeNetherite"));
+ 		registerItem(441, (String) "mace", (new ItemMace(Item.ToolMaterial.NETHERITE)).setUnlocalizedName("mace"));
+ 		registerItem(442, (String) "netherite_helmet",
+ 				(new ItemArmor(ItemArmor.ArmorMaterial.NETHERITE, 3, 0)).setUnlocalizedName("helmetNetherite"));
+ 		registerItem(443, (String) "netherite_chestplate",
+ 				(new ItemArmor(ItemArmor.ArmorMaterial.NETHERITE, 3, 1)).setUnlocalizedName("chestplateNetherite"));
+ 		registerItem(444, (String) "netherite_leggings",
+ 				(new ItemArmor(ItemArmor.ArmorMaterial.NETHERITE, 3, 2)).setUnlocalizedName("leggingsNetherite"));
+ 		registerItem(445, (String) "netherite_boots",
+ 				(new ItemArmor(ItemArmor.ArmorMaterial.NETHERITE, 3, 3)).setUnlocalizedName("bootsNetherite"));

> CHANGE  318 : 319  @  318 : 319

~ 		EMERALD(3, 1561, 8.0F, 3.0F, 10), GOLD(0, 32, 12.0F, 0.0F, 22), NETHERITE(4, 2031, 9.0F, 4.0F, 15);

> CHANGE  40 : 43  @  40 : 41

~ 									: (this == IRON ? Items.iron_ingot
~ 											: (this == EMERALD ? Items.diamond
~ 													: (this == NETHERITE ? Items.netherite_ingot : null)))));

> INSERT  2 : 10  @  2

+ 
+ 	public float getHeldItemBrightnessEagler(ItemStack itemStack) {
+ 		return 0.0f;
+ 	}
+ 
+ 	public boolean shouldUseOnTouchEagler(ItemStack itemStack) {
+ 		return getItemUseAction(itemStack) != EnumAction.NONE;
+ 	}

> EOF
