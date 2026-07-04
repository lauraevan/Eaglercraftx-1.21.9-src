
# Eagler Context Redacted Diff
# Copyright (c) 2026 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 3

> INSERT  1 : 4  @  1

+ 
+ import com.google.common.base.Predicates;
+ 

> DELETE  9  @  9 : 11

> CHANGE  151 : 152  @  151 : 152

~ 		DIAMOND("diamond", 33, new int[] { 3, 8, 6, 3 }, 10), NETHERITE("netherite", 37, new int[] { 3, 8, 6, 3 }, 15);

> CHANGE  29 : 32  @  29 : 30

~ 									: (this == IRON ? Items.iron_ingot
~ 											: (this == DIAMOND ? Items.diamond
~ 													: (this == NETHERITE ? Items.netherite_ingot : null)))));

> EOF
