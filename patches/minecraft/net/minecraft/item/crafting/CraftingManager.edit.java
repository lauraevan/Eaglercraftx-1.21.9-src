
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

> CHANGE  83 : 85  @  83 : 84

~ 		for (int i = 0; i < recipeComponents.length; ++i) {
~ 			Object object = recipeComponents[i];

> CHANGE  22 : 24  @  22 : 23

~ 		for (int i = 0, l = this.recipes.size(); i < l; ++i) {
~ 			IRecipe irecipe = this.recipes.get(i);

> CHANGE  9 : 11  @  9 : 10

~ 		for (int i = 0, l = this.recipes.size(); i < l; ++i) {
~ 			IRecipe irecipe = this.recipes.get(i);

> EOF
