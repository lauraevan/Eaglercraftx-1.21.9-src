
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

> INSERT  470 : 483  @  470

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

> INSERT  414 : 422  @  414

+ 
+ 	public float getHeldItemBrightnessEagler(ItemStack itemStack) {
+ 		return 0.0f;
+ 	}
+ 
+ 	public boolean shouldUseOnTouchEagler(ItemStack itemStack) {
+ 		return getItemUseAction(itemStack) != EnumAction.NONE;
+ 	}

> EOF
