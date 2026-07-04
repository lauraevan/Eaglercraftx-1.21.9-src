package net.lax1dude.eaglercraft.v1_8.opticlient;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * Renderer for the Frog, using the Opticlient frog model and texture.
 */
public class RenderFrog extends RenderLiving<EntityFrog> {

	private static final ResourceLocation FROG_TEX = new ResourceLocation("textures/entity/frog.png");

	public RenderFrog(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelFrog(), 0.3F);
	}

	protected ResourceLocation getEntityTexture(EntityFrog frog) {
		return FROG_TEX;
	}
}
