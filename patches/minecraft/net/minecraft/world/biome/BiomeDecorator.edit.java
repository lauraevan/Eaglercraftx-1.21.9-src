
# Eagler Context Redacted Diff
# Copyright (c) 2026 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 3  @  2 : 3

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;

> DELETE  6  @  6 : 7

> INSERT  17 : 18  @  17

+ 

> CHANGE  1 : 2  @  1 : 2

~ 	protected EaglercraftRandom randomGenerator;

> INSERT  12 : 13  @  12

+ 	protected WorldGenerator copperGen;

> CHANGE  26 : 27  @  26 : 27

~ 	public void decorate(World worldIn, EaglercraftRandom random, BiomeGenBase parBiomeGenBase, BlockPos parBlockPos) {

> INSERT  27 : 28  @  27

+ 			this.copperGen = new WorldGenMinable(Blocks.copper_ore.getDefaultState(), 10);

> INSERT  273 : 274  @  273

+ 		this.genStandardOre1(6, this.copperGen, 0, 96);

> EOF
