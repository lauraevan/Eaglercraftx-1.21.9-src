
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

> INSERT  301 : 392  @  301

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
+ 

> EOF
