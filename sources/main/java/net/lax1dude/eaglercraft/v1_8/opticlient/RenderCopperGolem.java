package net.lax1dude.eaglercraft.v1_8.opticlient;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * Renderer for the Copper Golem. Picks one of four copper-oxidation textures
 * based on the golem's cosmetic oxidation stage.
 */
public class RenderCopperGolem extends RenderLiving<EntityCopperGolem> {

	private static final ResourceLocation[] TEX = new ResourceLocation[] {
			new ResourceLocation("textures/entity/copper_golem.png"),
			new ResourceLocation("textures/entity/exposed_copper_golem.png"),
			new ResourceLocation("textures/entity/weathered_copper_golem.png"),
			new ResourceLocation("textures/entity/oxidized_copper_golem.png") };

	public RenderCopperGolem(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelCopperGolem(), 0.4F);
	}

	protected ResourceLocation getEntityTexture(EntityCopperGolem golem) {
		int s = golem.getOxidationStage();
		if (s < 0) {
			s = 0;
		}
		if (s > 3) {
			s = 3;
		}
		return TEX[s];
	}
}
