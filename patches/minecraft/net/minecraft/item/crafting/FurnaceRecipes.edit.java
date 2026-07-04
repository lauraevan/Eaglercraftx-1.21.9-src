
# Eagler Context Redacted Diff
# Copyright (c) 2026 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 3

> INSERT  2 : 8  @  2

+ 
+ import com.carrotsearch.hppc.ObjectFloatHashMap;
+ import com.carrotsearch.hppc.ObjectFloatMap;
+ import com.carrotsearch.hppc.cursors.ObjectFloatCursor;
+ import com.google.common.collect.Maps;
+ 

> CHANGE  10 : 11  @  10 : 11

~ 	private static FurnaceRecipes smeltingBase;

> CHANGE  1 : 2  @  1 : 2

~ 	private ObjectFloatMap<ItemStack> experienceList = new ObjectFloatHashMap<>();

> INSERT  2 : 5  @  2

+ 		if (smeltingBase == null) {
+ 			smeltingBase = new FurnaceRecipes();
+ 		}

> INSERT  5 : 14  @  5

+ 		this.addSmelting(Items.raw_copper, new ItemStack(Items.copper_ingot), 0.7F);
+ 		this.addSmeltingRecipeForBlock(Blocks.copper_ore, new ItemStack(Items.copper_ingot), 0.7F);
+ 		this.addSmeltingRecipeForBlock(Blocks.deepslate_copper_ore, new ItemStack(Items.copper_ingot), 0.7F);
+ 		// Opticlient: smelting for new blocks
+ 		this.addSmeltingRecipe(new ItemStack(Blocks.stone_bricks), new ItemStack(Blocks.cracked_stone_bricks), 0.1F);
+ 		this.addSmeltingRecipeForBlock(Blocks.deepslate_gold_ore, new ItemStack(Items.gold_ingot), 1.0F);
+ 		this.addSmeltingRecipeForBlock(Blocks.deepslate_redstone_ore, new ItemStack(Items.redstone), 0.7F);
+ 		this.addSmeltingRecipeForBlock(Blocks.deepslate_lapis_ore, new ItemStack(Items.dye, 1, 4), 0.2F);
+ 		this.addSmeltingRecipeForBlock(Blocks.deepslate_emerald_ore, new ItemStack(Items.emerald), 1.0F);

> CHANGE  22 : 25  @  22 : 23

~ 		ItemFishFood.FishType[] types = ItemFishFood.FishType.values();
~ 		for (int i = 0; i < types.length; ++i) {
~ 			ItemFishFood.FishType itemfishfood$fishtype = types[i];

> CHANGE  23 : 24  @  23 : 24

~ 		this.experienceList.put(stack, experience);

> CHANGE  22 : 25  @  22 : 25

~ 		for (ObjectFloatCursor<ItemStack> entry : this.experienceList) {
~ 			if (this.compareItemStacks(stack, entry.key)) {
~ 				return entry.value;

> EOF
