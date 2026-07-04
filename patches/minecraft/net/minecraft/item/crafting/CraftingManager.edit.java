
# Eagler Context Redacted Diff
# Copyright (c) 2026 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 4

> INSERT  5 : 9  @  5

+ 
+ import com.google.common.collect.Lists;
+ import com.google.common.collect.Maps;
+ 

> DELETE  12  @  12 : 29

> CHANGE  3 : 4  @  3 : 4

~ 	private static CraftingManager instance;

> INSERT  3 : 6  @  3

+ 		if (instance == null) {
+ 			instance = new CraftingManager();
+ 		}

> INSERT  299 : 305  @  299

+ 		this.addRecipe(new ItemStack(Blocks.copper_block, 1),
+ 				new Object[] { "###", "###", "###", Character.valueOf('#'), Items.copper_ingot });
+ 		this.addRecipe(new ItemStack(Blocks.raw_copper_block, 1),
+ 				new Object[] { "###", "###", "###", Character.valueOf('#'), Items.raw_copper });
+ 		this.addRecipe(new ItemStack(Items.copper_ingot, 9),
+ 				new Object[] { "#", Character.valueOf('#'), Blocks.copper_block });

> INSERT  16 : 82  @  16

+ 
+ 		// Opticlient: recipes for new blocks (real Minecraft obtaining methods)
+ 		this.addRecipe(new ItemStack(Blocks.stone_bricks, 4),
+ 				new Object[] { "##", "##", Character.valueOf('#'), Blocks.stone });
+ 		this.addRecipe(new ItemStack(Blocks.chiseled_stone_bricks, 4),
+ 				new Object[] { "##", "##", Character.valueOf('#'), Blocks.stone_bricks });
+ 		this.addShapelessRecipe(new ItemStack(Blocks.mossy_stone_bricks),
+ 				new Object[] { Blocks.stone_bricks, Blocks.vine });
+ 		this.addRecipe(new ItemStack(Blocks.diorite, 2), new Object[] { "#q", "q#", Character.valueOf('#'),
+ 				Blocks.cobblestone, Character.valueOf('q'), Items.quartz });
+ 		this.addShapelessRecipe(new ItemStack(Blocks.andesite, 2), new Object[] { Blocks.diorite, Blocks.cobblestone });
+ 		this.addShapelessRecipe(new ItemStack(Blocks.granite), new Object[] { Blocks.diorite, Items.quartz });
+ 		this.addRecipe(new ItemStack(Blocks.polished_andesite, 4),
+ 				new Object[] { "##", "##", Character.valueOf('#'), Blocks.andesite });
+ 		this.addRecipe(new ItemStack(Blocks.polished_diorite, 4),
+ 				new Object[] { "##", "##", Character.valueOf('#'), Blocks.diorite });
+ 		this.addRecipe(new ItemStack(Blocks.polished_granite, 4),
+ 				new Object[] { "##", "##", Character.valueOf('#'), Blocks.granite });
+ 		this.addRecipe(new ItemStack(Blocks.polished_basalt, 4),
+ 				new Object[] { "##", "##", Character.valueOf('#'), Blocks.basalt });
+ 		this.addRecipe(new ItemStack(Blocks.coarse_dirt, 4), new Object[] { "DG", "GD", Character.valueOf('D'),
+ 				Blocks.dirt, Character.valueOf('G'), Blocks.gravel });
+ 		this.addRecipe(new ItemStack(Blocks.magma_block),
+ 				new Object[] { "##", "##", Character.valueOf('#'), Items.magma_cream });
+ 		this.addRecipe(new ItemStack(Blocks.note_block), new Object[] { "###", "#r#", "###", Character.valueOf('#'),
+ 				Blocks.planks, Character.valueOf('r'), Items.redstone });
+ 		this.addRecipe(new ItemStack(Blocks.target), new Object[] { " r ", "rhr", " r ", Character.valueOf('r'),
+ 				Items.redstone, Character.valueOf('h'), Blocks.hay_block });
+ 		this.addRecipe(new ItemStack(Blocks.dark_prismarine),
+ 				new Object[] { "###", "#d#", "###", Character.valueOf('#'), Items.prismarine_shard,
+ 						Character.valueOf('d'), new ItemStack(Items.dye, 1, 0) });
+ 		this.addRecipe(new ItemStack(Blocks.chiseled_quartz_block),
+ 				new Object[] { "#", "#", Character.valueOf('#'), Blocks.quartz_block });
+ 		this.addShapelessRecipe(new ItemStack(Blocks.terracotta), new Object[] { Blocks.hardened_clay });
+ 		this.addRecipe(new ItemStack(Blocks.white_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 15) });
+ 		this.addRecipe(new ItemStack(Blocks.orange_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 14) });
+ 		this.addRecipe(new ItemStack(Blocks.magenta_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 13) });
+ 		this.addRecipe(new ItemStack(Blocks.light_blue_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 12) });
+ 		this.addRecipe(new ItemStack(Blocks.yellow_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 11) });
+ 		this.addRecipe(new ItemStack(Blocks.lime_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 10) });
+ 		this.addRecipe(new ItemStack(Blocks.pink_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 9) });
+ 		this.addRecipe(new ItemStack(Blocks.gray_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 8) });
+ 		this.addRecipe(new ItemStack(Blocks.light_gray_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 7) });
+ 		this.addRecipe(new ItemStack(Blocks.cyan_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 6) });
+ 		this.addRecipe(new ItemStack(Blocks.purple_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 5) });
+ 		this.addRecipe(new ItemStack(Blocks.blue_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 4) });
+ 		this.addRecipe(new ItemStack(Blocks.brown_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 3) });
+ 		this.addRecipe(new ItemStack(Blocks.green_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 2) });
+ 		this.addRecipe(new ItemStack(Blocks.red_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 1) });
+ 		this.addRecipe(new ItemStack(Blocks.black_terracotta, 8), new Object[] { "###", "#d#", "###",
+ 				Character.valueOf('#'), Blocks.terracotta, Character.valueOf('d'), new ItemStack(Items.dye, 1, 0) });

> CHANGE  67 : 69  @  67 : 68

~ 		for (int i = 0; i < recipeComponents.length; ++i) {
~ 			Object object = recipeComponents[i];

> CHANGE  22 : 24  @  22 : 23

~ 		for (int i = 0, l = this.recipes.size(); i < l; ++i) {
~ 			IRecipe irecipe = this.recipes.get(i);

> CHANGE  9 : 11  @  9 : 10

~ 		for (int i = 0, l = this.recipes.size(); i < l; ++i) {
~ 			IRecipe irecipe = this.recipes.get(i);

> EOF
