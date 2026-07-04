package net.lax1dude.eaglercraft.v1_8.opticlient;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * Renderer for the Warden, using the Opticlient warden model and texture.
 */
public class RenderWarden extends RenderLiving<EntityWarden> {

	private static final ResourceLocation WARDEN_TEX = new ResourceLocation("textures/entity/warden.png");

	public RenderWarden(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelWarden(), 0.9F);
	}

	protected ResourceLocation getEntityTexture(EntityWarden warden) {
		return WARDEN_TEX;
	}
}
