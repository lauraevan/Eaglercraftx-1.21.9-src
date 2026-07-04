
# Eagler Context Redacted Diff
# Copyright (c) 2026 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  3 : 4  @  3 : 4

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;

> DELETE  15  @  15 : 21

> INSERT  4 : 5  @  4

+ import net.lax1dude.eaglercraft.v1_8.opticlient.MapGenAncientCity;

> CHANGE  5 : 6  @  5 : 6

~ 	private EaglercraftRandom rand;

> CHANGE  15 : 23  @  15 : 22

~ 	private MapGenBase caveGenerator;
~ 	private MapGenStronghold strongholdGenerator;
~ 	private MapGenVillage villageGenerator;
~ 	private MapGenMineshaft mineshaftGenerator;
~ 	private MapGenScatteredFeature scatteredFeatureGenerator;
~ 	private MapGenAncientCity ancientCityGenerator = new MapGenAncientCity();
~ 	private MapGenBase ravineGenerator;
~ 	private StructureOceanMonument oceanMonumentGenerator;

> CHANGE  10 : 20  @  10 : 11

~ 		boolean scramble = !worldIn.getWorldInfo().isOldEaglercraftRandom();
~ 		this.rand = new EaglercraftRandom(parLong1, scramble);
~ 		this.caveGenerator = new MapGenCaves(scramble);
~ 		this.strongholdGenerator = new MapGenStronghold(scramble);
~ 		this.villageGenerator = new MapGenVillage(scramble);
~ 		this.mineshaftGenerator = new MapGenMineshaft(scramble);
~ 		this.scatteredFeatureGenerator = new MapGenScatteredFeature(scramble);
~ 		this.ancientCityGenerator = new MapGenAncientCity();
~ 		this.ravineGenerator = new MapGenRavine(scramble);
~ 		this.oceanMonumentGenerator = new StructureOceanMonument(scramble);

> INSERT  135 : 139  @  135

+ 		if (this.mapFeaturesEnabled) {
+ 			this.ancientCityGenerator.generate(this, this.worldObj, i, j, chunkprimer);
+ 		}
+ 

> INSERT  152 : 156  @  152

+ 		if (this.mapFeaturesEnabled) {
+ 			this.ancientCityGenerator.generateStructure(this.worldObj, this.rand, chunkcoordintpair);
+ 		}
+ 

> INSERT  134 : 138  @  134

+ 
+ 	public Chunk getLoadedChunk(int var1, int var2) {
+ 		return provideChunk(var1, var2);
+ 	}

> EOF
