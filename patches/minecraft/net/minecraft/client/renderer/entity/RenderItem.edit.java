
# Eagler Context Redacted Diff
# Copyright (c) 2026 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  4 : 11  @  4

+ 
+ import net.lax1dude.eaglercraft.v1_8.opengl.GlStateManager;
+ import net.lax1dude.eaglercraft.v1_8.opengl.WorldRenderer;
+ import net.lax1dude.eaglercraft.v1_8.opengl.ext.deferred.DeferredStateManager;
+ import net.lax1dude.eaglercraft.v1_8.opengl.ext.deferred.EaglerDeferredPipeline;
+ import net.lax1dude.eaglercraft.v1_8.opengl.ext.deferred.ShadersRenderPassFuture;
+ import net.lax1dude.eaglercraft.v1_8.vector.Matrix4f;

> DELETE  21  @  21 : 22

> DELETE  3  @  3 : 4

> INSERT  21 : 22  @  21

+ import net.minecraft.item.ItemBlock;

> INSERT  5 : 6  @  5

+ import net.minecraft.util.EnumWorldBlockLayer;

> INSERT  3 : 5  @  3

+ import net.optifine.Config;
+ import net.optifine.CustomItems;

> INSERT  8 : 9  @  8

+ 	private ModelResourceLocation modelLocation = null;

> CHANGE  35 : 36  @  35 : 36

~ 	public void renderModel(IBakedModel model, int color) {

> CHANGE  8 : 11  @  8 : 9

~ 		EnumFacing[] facings = EnumFacing._VALUES;
~ 		for (int i = 0; i < facings.length; ++i) {
~ 			EnumFacing enumfacing = facings[i];

> CHANGE  7 : 12  @  7 : 8

~ 	public static float renderPosX = 0.0f;
~ 	public static float renderPosY = 0.0f;
~ 	public static float renderPosZ = 0.0f;
~ 
~ 	public void renderItem(ItemStack stack, IBakedModel model_) {

> CHANGE  3 : 4  @  3 : 4

~ 			if (model_.isBuiltInRenderer()) {

> CHANGE  7 : 9  @  7 : 10

~ 				if (Config.isCustomItems()) {
~ 					model_ = CustomItems.getCustomItemModel(stack, model_, this.modelLocation, false);

> INSERT  1 : 74  @  1

+ 				final IBakedModel model = model_;
+ 
+ 				if (DeferredStateManager.isInDeferredPass() && isTransparentItem(stack)) {
+ 					if (DeferredStateManager.forwardCallbackHandler != null) {
+ 						final Matrix4f mat = new Matrix4f(GlStateManager.getModelViewReference());
+ 						final float lx = GlStateManager.getTexCoordX(1), ly = GlStateManager.getTexCoordY(1);
+ 						DeferredStateManager.forwardCallbackHandler.push(new ShadersRenderPassFuture(renderPosX,
+ 								renderPosY, renderPosZ, EaglerDeferredPipeline.instance.getPartialTicks()) {
+ 							@Override
+ 							public void draw(PassType pass) {
+ 								if (pass == PassType.MAIN) {
+ 									DeferredStateManager.reportForwardRenderObjectPosition2(x, y, z);
+ 								}
+ 								EntityRenderer.enableLightmapStatic();
+ 								GlStateManager.pushMatrix();
+ 								GlStateManager.loadMatrix(mat);
+ 								GlStateManager.texCoords2DDirect(1, lx, ly);
+ 								Minecraft.getMinecraft().getTextureManager()
+ 										.bindTexture(TextureMap.locationBlocksTexture);
+ 								RenderItem.this.renderModel(model, stack);
+ 								if (pass != PassType.SHADOW && stack.hasEffect()) {
+ 									GlStateManager.color(1.5F, 0.5F, 1.5F, 1.0F);
+ 									DeferredStateManager.setDefaultMaterialConstants();
+ 									DeferredStateManager.setRoughnessConstant(0.05f);
+ 									DeferredStateManager.setMetalnessConstant(0.01f);
+ 									GlStateManager.blendFunc(768, 1);
+ 									renderEffect(model, stack);
+ 									DeferredStateManager.setHDRTranslucentPassBlendFunc();
+ 								}
+ 								GlStateManager.popMatrix();
+ 								EntityRenderer.disableLightmapStatic();
+ 								GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
+ 							}
+ 						});
+ 					}
+ 				} else {
+ 					this.renderModel(model, stack);
+ 					if (stack.hasEffect()) {
+ 						if (DeferredStateManager.isInDeferredPass()) {
+ 							if (DeferredStateManager.forwardCallbackHandler != null
+ 									&& !DeferredStateManager.isEnableShadowRender()) {
+ 								final Matrix4f mat = new Matrix4f(GlStateManager.getModelViewReference());
+ 								final float lx = GlStateManager.getTexCoordX(1), ly = GlStateManager.getTexCoordY(1);
+ 								DeferredStateManager.forwardCallbackHandler.push(new ShadersRenderPassFuture(renderPosX,
+ 										renderPosY, renderPosZ, EaglerDeferredPipeline.instance.getPartialTicks()) {
+ 									@Override
+ 									public void draw(PassType pass) {
+ 										if (pass == PassType.MAIN) {
+ 											DeferredStateManager.reportForwardRenderObjectPosition2(x, y, z);
+ 										}
+ 										EntityRenderer.enableLightmapStatic();
+ 										GlStateManager.color(1.5F, 0.5F, 1.5F, 1.0F);
+ 										DeferredStateManager.setDefaultMaterialConstants();
+ 										DeferredStateManager.setRoughnessConstant(0.05f);
+ 										DeferredStateManager.setMetalnessConstant(0.01f);
+ 										GlStateManager.pushMatrix();
+ 										GlStateManager.loadMatrix(mat);
+ 										GlStateManager.texCoords2DDirect(1, lx, ly);
+ 										GlStateManager.tryBlendFuncSeparate(GL_ONE, GL_ONE, GL_ZERO, GL_ONE);
+ 										renderEffect(model, stack);
+ 										DeferredStateManager.setHDRTranslucentPassBlendFunc();
+ 										GlStateManager.popMatrix();
+ 										EntityRenderer.disableLightmapStatic();
+ 										GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
+ 									}
+ 								});
+ 							}
+ 						} else {
+ 							GlStateManager.blendFunc(768, 1);
+ 							this.renderEffect(model, stack);
+ 						}
+ 					}
+ 				}

> CHANGE  6 : 15  @  6 : 7

~ 	private static boolean isTransparentItem(ItemStack stack) {
~ 		Item itm = stack.getItem();
~ 		return itm instanceof ItemBlock
~ 				&& ((ItemBlock) itm).getBlock().getBlockLayer() == EnumWorldBlockLayer.TRANSLUCENT;
~ 	}
~ 
~ 	private void renderEffect(IBakedModel model, ItemStack stack) {
~ 		if (Config.isCustomItems() && (CustomItems.renderCustomEffect(this, stack, model) || !CustomItems.isUseGlint()))
~ 			return;

> DELETE  3  @  3 : 4

> INSERT  104 : 105  @  104

+ 					this.modelLocation = modelresourcelocation;

> INSERT  4 : 5  @  4

+ 			this.modelLocation = null;

> INSERT  15 : 16  @  15

+ 		// boolean flag = DeferredStateManager.isEnableShadowRender();

> INSERT  1 : 2  @  1

+ 			// GlStateManager.cullFace(flag ? GL_BACK : GL_FRONT);

> INSERT  4 : 5  @  4

+ 		// GlStateManager.cullFace(flag ? GL_FRONT : GL_BACK);

> INSERT  301 : 528  @  301

+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.BLACK.getMetadata(), "black_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.BLUE.getMetadata(), "blue_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.BROWN.getMetadata(), "brown_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.CYAN.getMetadata(), "cyan_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.GRAY.getMetadata(), "gray_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.GREEN.getMetadata(), "green_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.LIGHT_BLUE.getMetadata(), "light_blue_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.LIME.getMetadata(), "lime_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.MAGENTA.getMetadata(), "magenta_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.ORANGE.getMetadata(), "orange_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.PINK.getMetadata(), "pink_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.PURPLE.getMetadata(), "purple_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.RED.getMetadata(), "red_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.SILVER.getMetadata(), "silver_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.WHITE.getMetadata(), "white_concrete");
+ 		this.registerBlock(Blocks.concrete, EnumDyeColor.YELLOW.getMetadata(), "yellow_concrete");
+ 		this.registerBlock(Blocks.smooth_stone, "smooth_stone");
+ 		this.registerBlock(Blocks.blackstone, "blackstone");
+ 		this.registerBlock(Blocks.polished_blackstone, "polished_blackstone");
+ 		this.registerBlock(Blocks.polished_blackstone_bricks, "polished_blackstone_bricks");
+ 		this.registerBlock(Blocks.cobbled_deepslate, "cobbled_deepslate");
+ 		this.registerBlock(Blocks.polished_deepslate, "polished_deepslate");
+ 		this.registerBlock(Blocks.deepslate_bricks, "deepslate_bricks");
+ 		this.registerBlock(Blocks.deepslate_tiles, "deepslate_tiles");
+ 		this.registerBlock(Blocks.end_stone_bricks, "end_stone_bricks");
+ 		this.registerBlock(Blocks.quartz_bricks, "quartz_bricks");
+ 		this.registerBlock(Blocks.crying_obsidian, "crying_obsidian");
+ 		this.registerBlock(Blocks.purpur_block, "purpur_block");
+ 		this.registerBlock(Blocks.amethyst_block, "amethyst_block");
+ 		this.registerBlock(Blocks.calcite, "calcite");
+ 		this.registerBlock(Blocks.tuff, "tuff");
+ 		this.registerBlock(Blocks.tuff_bricks, "tuff_bricks");
+ 		this.registerBlock(Blocks.polished_tuff, "polished_tuff");
+ 		this.registerBlock(Blocks.dripstone_block, "dripstone_block");
+ 		this.registerBlock(Blocks.moss_block, "moss_block");
+ 		this.registerBlock(Blocks.mud, "mud");
+ 		this.registerBlock(Blocks.packed_mud, "packed_mud");
+ 		this.registerBlock(Blocks.mud_bricks, "mud_bricks");
+ 		this.registerBlock(Blocks.smooth_basalt, "smooth_basalt");
+ 		this.registerBlock(Blocks.netherite_block, "netherite_block");
+ 		this.registerBlock(Blocks.raw_iron_block, "raw_iron_block");
+ 		this.registerBlock(Blocks.raw_copper_block, "raw_copper_block");
+ 		this.registerBlock(Blocks.raw_gold_block, "raw_gold_block");
+ 		this.registerBlock(Blocks.copper_block, "copper_block");
+ 		this.registerBlock(Blocks.exposed_copper, "exposed_copper");
+ 		this.registerBlock(Blocks.weathered_copper, "weathered_copper");
+ 		this.registerBlock(Blocks.oxidized_copper, "oxidized_copper");
+ 		this.registerBlock(Blocks.chiseled_copper, "chiseled_copper");
+ 		this.registerBlock(Blocks.cut_copper, "cut_copper");
+ 		this.registerBlock(Blocks.exposed_cut_copper, "exposed_cut_copper");
+ 		this.registerBlock(Blocks.weathered_cut_copper, "weathered_cut_copper");
+ 		this.registerBlock(Blocks.oxidized_cut_copper, "oxidized_cut_copper");
+ 		this.registerBlock(Blocks.honeycomb_block, "honeycomb_block");
+ 		this.registerBlock(Blocks.nether_wart_block, "nether_wart_block");
+ 		this.registerBlock(Blocks.warped_wart_block, "warped_wart_block");
+ 		this.registerBlock(Blocks.shroomlight, "shroomlight");
+ 		this.registerBlock(Blocks.soul_soil, "soul_soil");
+ 		this.registerBlock(Blocks.gilded_blackstone, "gilded_blackstone");
+ 		this.registerBlock(Blocks.chiseled_polished_blackstone, "chiseled_polished_blackstone");
+ 		this.registerBlock(Blocks.cracked_polished_blackstone_bricks, "cracked_polished_blackstone_bricks");
+ 		this.registerBlock(Blocks.chiseled_deepslate, "chiseled_deepslate");
+ 		this.registerBlock(Blocks.cracked_deepslate_bricks, "cracked_deepslate_bricks");
+ 		this.registerBlock(Blocks.cracked_deepslate_tiles, "cracked_deepslate_tiles");
+ 		this.registerBlock(Blocks.chiseled_nether_bricks, "chiseled_nether_bricks");
+ 		this.registerBlock(Blocks.cracked_nether_bricks, "cracked_nether_bricks");
+ 		this.registerBlock(Blocks.red_nether_bricks, "red_nether_bricks");
+ 		this.registerBlock(Blocks.blue_ice, "blue_ice");
+ 		this.registerBlock(Blocks.sculk, "sculk");
+ 		this.registerBlock(Blocks.crimson_planks, "crimson_planks");
+ 		this.registerBlock(Blocks.warped_planks, "warped_planks");
+ 		this.registerBlock(Blocks.mangrove_planks, "mangrove_planks");
+ 		this.registerBlock(Blocks.cherry_planks, "cherry_planks");
+ 		this.registerBlock(Blocks.bamboo_planks, "bamboo_planks");
+ 		this.registerBlock(Blocks.pale_oak_planks, "pale_oak_planks");
+ 		this.registerBlock(Blocks.resin_block, "resin_block");
+ 		this.registerBlock(Blocks.resin_bricks, "resin_bricks");
+ 		this.registerBlock(Blocks.chiseled_resin_bricks, "chiseled_resin_bricks");
+ 		this.registerBlock(Blocks.prismarine_bricks, "prismarine_bricks");
+ 		this.registerBlock(Blocks.deepslate, "deepslate");
+ 		this.registerBlock(Blocks.basalt, "basalt");
+ 		this.registerBlock(Blocks.crimson_stem, "crimson_stem");
+ 		this.registerBlock(Blocks.warped_stem, "warped_stem");
+ 		this.registerBlock(Blocks.mangrove_log, "mangrove_log");
+ 		this.registerBlock(Blocks.cherry_log, "cherry_log");
+ 		this.registerBlock(Blocks.purpur_pillar, "purpur_pillar");
+ 		this.registerBlock(Blocks.ochre_froglight, "ochre_froglight");
+ 		this.registerBlock(Blocks.verdant_froglight, "verdant_froglight");
+ 		this.registerBlock(Blocks.pearlescent_froglight, "pearlescent_froglight");
+ 		this.registerBlock(Blocks.bone_block, "bone_block");
+ 		this.registerBlock(Blocks.bamboo_block, "bamboo_block");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.BLACK.getMetadata(), "black_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.BLUE.getMetadata(), "blue_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.BROWN.getMetadata(), "brown_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.CYAN.getMetadata(), "cyan_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.GRAY.getMetadata(), "gray_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.GREEN.getMetadata(), "green_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.LIGHT_BLUE.getMetadata(), "light_blue_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.LIME.getMetadata(), "lime_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.MAGENTA.getMetadata(), "magenta_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.ORANGE.getMetadata(), "orange_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.PINK.getMetadata(), "pink_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.PURPLE.getMetadata(), "purple_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.RED.getMetadata(), "red_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.SILVER.getMetadata(), "silver_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.WHITE.getMetadata(), "white_concrete_powder");
+ 		this.registerBlock(Blocks.concrete_powder, EnumDyeColor.YELLOW.getMetadata(), "yellow_concrete_powder");
+ 		this.registerBlock(Blocks.copper_ore, "copper_ore");
+ 		this.registerBlock(Blocks.deepslate_copper_ore, "deepslate_copper_ore");
+ 		this.registerBlock(Blocks.deepslate_coal_ore, "deepslate_coal_ore");
+ 		this.registerBlock(Blocks.deepslate_iron_ore, "deepslate_iron_ore");
+ 		this.registerBlock(Blocks.deepslate_gold_ore, "deepslate_gold_ore");
+ 		this.registerBlock(Blocks.deepslate_diamond_ore, "deepslate_diamond_ore");
+ 		this.registerBlock(Blocks.deepslate_redstone_ore, "deepslate_redstone_ore");
+ 		this.registerBlock(Blocks.deepslate_lapis_ore, "deepslate_lapis_ore");
+ 		this.registerBlock(Blocks.deepslate_emerald_ore, "deepslate_emerald_ore");
+ 		this.registerBlock(Blocks.chiseled_tuff, "chiseled_tuff");
+ 		this.registerBlock(Blocks.exposed_chiseled_copper, "exposed_chiseled_copper");
+ 		this.registerBlock(Blocks.weathered_chiseled_copper, "weathered_chiseled_copper");
+ 		this.registerBlock(Blocks.oxidized_chiseled_copper, "oxidized_chiseled_copper");
+ 		this.registerBlock(Blocks.copper_grate, "copper_grate");
+ 		this.registerBlock(Blocks.exposed_copper_grate, "exposed_copper_grate");
+ 		this.registerBlock(Blocks.weathered_copper_grate, "weathered_copper_grate");
+ 		this.registerBlock(Blocks.oxidized_copper_grate, "oxidized_copper_grate");
+ 		this.registerBlock(Blocks.copper_bulb, "copper_bulb");
+ 		this.registerBlock(Blocks.exposed_copper_bulb, "exposed_copper_bulb");
+ 		this.registerBlock(Blocks.weathered_copper_bulb, "weathered_copper_bulb");
+ 		this.registerBlock(Blocks.oxidized_copper_bulb, "oxidized_copper_bulb");
+ 		this.registerBlock(Blocks.white_glazed_terracotta, "white_glazed_terracotta");
+ 		this.registerBlock(Blocks.orange_glazed_terracotta, "orange_glazed_terracotta");
+ 		this.registerBlock(Blocks.magenta_glazed_terracotta, "magenta_glazed_terracotta");
+ 		this.registerBlock(Blocks.light_blue_glazed_terracotta, "light_blue_glazed_terracotta");
+ 		this.registerBlock(Blocks.yellow_glazed_terracotta, "yellow_glazed_terracotta");
+ 		this.registerBlock(Blocks.lime_glazed_terracotta, "lime_glazed_terracotta");
+ 		this.registerBlock(Blocks.pink_glazed_terracotta, "pink_glazed_terracotta");
+ 		this.registerBlock(Blocks.gray_glazed_terracotta, "gray_glazed_terracotta");
+ 		this.registerBlock(Blocks.light_gray_glazed_terracotta, "light_gray_glazed_terracotta");
+ 		this.registerBlock(Blocks.cyan_glazed_terracotta, "cyan_glazed_terracotta");
+ 		this.registerBlock(Blocks.purple_glazed_terracotta, "purple_glazed_terracotta");
+ 		this.registerBlock(Blocks.blue_glazed_terracotta, "blue_glazed_terracotta");
+ 		this.registerBlock(Blocks.brown_glazed_terracotta, "brown_glazed_terracotta");
+ 		this.registerBlock(Blocks.green_glazed_terracotta, "green_glazed_terracotta");
+ 		this.registerBlock(Blocks.red_glazed_terracotta, "red_glazed_terracotta");
+ 		this.registerBlock(Blocks.black_glazed_terracotta, "black_glazed_terracotta");
+ 		this.registerBlock(Blocks.tube_coral_block, "tube_coral_block");
+ 		this.registerBlock(Blocks.dead_tube_coral_block, "dead_tube_coral_block");
+ 		this.registerBlock(Blocks.brain_coral_block, "brain_coral_block");
+ 		this.registerBlock(Blocks.dead_brain_coral_block, "dead_brain_coral_block");
+ 		this.registerBlock(Blocks.bubble_coral_block, "bubble_coral_block");
+ 		this.registerBlock(Blocks.dead_bubble_coral_block, "dead_bubble_coral_block");
+ 		this.registerBlock(Blocks.fire_coral_block, "fire_coral_block");
+ 		this.registerBlock(Blocks.dead_fire_coral_block, "dead_fire_coral_block");
+ 		this.registerBlock(Blocks.horn_coral_block, "horn_coral_block");
+ 		this.registerBlock(Blocks.dead_horn_coral_block, "dead_horn_coral_block");
+ 		this.registerBlock(Blocks.nether_gold_ore, "nether_gold_ore");
+ 		this.registerBlock(Blocks.bamboo_mosaic, "bamboo_mosaic");
+ 		this.registerBlock(Blocks.chiseled_red_sandstone, "chiseled_red_sandstone");
+ 		this.registerBlock(Blocks.cut_red_sandstone, "cut_red_sandstone");
+ 		this.registerBlock(Blocks.rooted_dirt, "rooted_dirt");
+ 		this.registerBlock(Blocks.chiseled_tuff_bricks, "chiseled_tuff_bricks");
+ 		this.registerBlock(Blocks.budding_amethyst, "budding_amethyst");
+ 		this.registerBlock(Blocks.ancient_debris, "ancient_debris");
+ 		this.registerBlock(Blocks.polished_basalt, "polished_basalt");
+ 		this.registerBlock(Blocks.magma_block, "magma_block");
+ 		this.registerBlock(Blocks.dark_prismarine, "dark_prismarine");
+ 		this.registerBlock(Blocks.pale_moss_block, "pale_moss_block");
+ 		this.registerBlock(Blocks.reinforced_deepslate, "reinforced_deepslate");
+ 		this.registerBlock(Blocks.coarse_dirt, "coarse_dirt");
+ 		this.registerBlock(Blocks.wet_sponge, "wet_sponge");
+ 		this.registerBlock(Blocks.target, "target");
+ 		this.registerBlock(Blocks.note_block, "note_block");
+ 		this.registerBlock(Blocks.podzol, "podzol");
+ 		this.registerBlock(Blocks.dried_kelp_block, "dried_kelp_block");
+ 		this.registerBlock(Blocks.mangrove_roots, "mangrove_roots");
+ 		this.registerBlock(Blocks.muddy_mangrove_roots, "muddy_mangrove_roots");
+ 		this.registerBlock(Blocks.lodestone, "lodestone");
+ 		this.registerBlock(Blocks.chiseled_quartz_block, "chiseled_quartz_block");
+ 		this.registerBlock(Blocks.stone_bricks, "stone_bricks");
+ 		this.registerBlock(Blocks.mossy_stone_bricks, "mossy_stone_bricks");
+ 		this.registerBlock(Blocks.cracked_stone_bricks, "cracked_stone_bricks");
+ 		this.registerBlock(Blocks.chiseled_stone_bricks, "chiseled_stone_bricks");
+ 		this.registerBlock(Blocks.andesite, "andesite");
+ 		this.registerBlock(Blocks.diorite, "diorite");
+ 		this.registerBlock(Blocks.granite, "granite");
+ 		this.registerBlock(Blocks.polished_andesite, "polished_andesite");
+ 		this.registerBlock(Blocks.polished_diorite, "polished_diorite");
+ 		this.registerBlock(Blocks.polished_granite, "polished_granite");
+ 		this.registerBlock(Blocks.terracotta, "terracotta");
+ 		this.registerBlock(Blocks.white_terracotta, "white_terracotta");
+ 		this.registerBlock(Blocks.orange_terracotta, "orange_terracotta");
+ 		this.registerBlock(Blocks.magenta_terracotta, "magenta_terracotta");
+ 		this.registerBlock(Blocks.light_blue_terracotta, "light_blue_terracotta");
+ 		this.registerBlock(Blocks.yellow_terracotta, "yellow_terracotta");
+ 		this.registerBlock(Blocks.lime_terracotta, "lime_terracotta");
+ 		this.registerBlock(Blocks.pink_terracotta, "pink_terracotta");
+ 		this.registerBlock(Blocks.gray_terracotta, "gray_terracotta");
+ 		this.registerBlock(Blocks.light_gray_terracotta, "light_gray_terracotta");
+ 		this.registerBlock(Blocks.cyan_terracotta, "cyan_terracotta");
+ 		this.registerBlock(Blocks.purple_terracotta, "purple_terracotta");
+ 		this.registerBlock(Blocks.blue_terracotta, "blue_terracotta");
+ 		this.registerBlock(Blocks.brown_terracotta, "brown_terracotta");
+ 		this.registerBlock(Blocks.green_terracotta, "green_terracotta");
+ 		this.registerBlock(Blocks.red_terracotta, "red_terracotta");
+ 		this.registerBlock(Blocks.black_terracotta, "black_terracotta");
+ 		this.registerBlock(Blocks.stripped_oak_log, "stripped_oak_log");
+ 		this.registerBlock(Blocks.stripped_spruce_log, "stripped_spruce_log");
+ 		this.registerBlock(Blocks.stripped_birch_log, "stripped_birch_log");
+ 		this.registerBlock(Blocks.stripped_jungle_log, "stripped_jungle_log");
+ 		this.registerBlock(Blocks.stripped_acacia_log, "stripped_acacia_log");
+ 		this.registerBlock(Blocks.stripped_dark_oak_log, "stripped_dark_oak_log");
+ 		this.registerBlock(Blocks.stripped_mangrove_log, "stripped_mangrove_log");
+ 		this.registerBlock(Blocks.stripped_cherry_log, "stripped_cherry_log");
+ 		this.registerBlock(Blocks.stripped_crimson_stem, "stripped_crimson_stem");
+ 		this.registerBlock(Blocks.stripped_warped_stem, "stripped_warped_stem");
+ 		this.registerBlock(Blocks.stripped_bamboo_block, "stripped_bamboo_block");
+ 		this.registerBlock(Blocks.crimson_nylium, "crimson_nylium");
+ 		this.registerBlock(Blocks.warped_nylium, "warped_nylium");
+ 		this.registerBlock(Blocks.melon, "melon");
+ 		this.registerBlock(Blocks.carved_pumpkin, "carved_pumpkin");
+ 		this.registerBlock(Blocks.jack_o_lantern, "jack_o_lantern");
+ 		this.registerBlock(Blocks.cut_sandstone, "cut_sandstone");
+ 		this.registerBlock(Blocks.chiseled_sandstone, "chiseled_sandstone");
+ 		this.registerBlock(Blocks.red_sand, "red_sand");
+ 		this.registerBlock(Blocks.chiseled_bookshelf_empty, "chiseled_bookshelf_empty");
+ 		this.registerBlock(Blocks.smooth_quartz, "smooth_quartz");
+ 		this.registerBlock(Blocks.bricks, "bricks");
+ 		this.registerBlock(Blocks.polished_tuff_bricks, "polished_tuff_bricks");
+ 

> INSERT  174 : 189  @  174

+ 		this.registerItem(Items.raw_copper, "raw_copper");
+ 		this.registerItem(Items.copper_ingot, "copper_ingot");
+ 		this.registerItem(Items.netherite_scrap, "netherite_scrap");
+ 		this.registerItem(Items.netherite_ingot, "netherite_ingot");
+ 		this.registerItem(Items.netherite_sword, "netherite_sword");
+ 		this.registerItem(Items.netherite_shovel, "netherite_shovel");
+ 		this.registerItem(Items.netherite_pickaxe, "netherite_pickaxe");
+ 		this.registerItem(Items.netherite_axe, "netherite_axe");
+ 		this.registerItem(Items.netherite_hoe, "netherite_hoe");
+ 		this.registerItem(Items.mace, "mace");
+ 		this.registerItem(Items.netherite_helmet, "netherite_helmet");
+ 		this.registerItem(Items.netherite_chestplate, "netherite_chestplate");
+ 		this.registerItem(Items.netherite_leggings, "netherite_leggings");
+ 		this.registerItem(Items.netherite_boots, "netherite_boots");
+ 		this.registerItem(Items.elytra, "elytra");

> EOF
