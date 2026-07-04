package net.lax1dude.eaglercraft.v1_8.opticlient;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * A large humanoid Warden model (original Opticlient geometry): a bulky
 * torso with a glowing chest, a heavy head, long dangling arms, and thick
 * legs. Arms and legs swing with limb movement. Designed for a 64x64
 * texture that is mostly dark teal so UV alignment is forgiving; the cyan
 * chest and eye glow are painted into fixed regions.
 */
public class ModelWarden extends ModelBase {

	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer armLeft;
	private final ModelRenderer armRight;
	private final ModelRenderer legLeft;
	private final ModelRenderer legRight;

	public ModelWarden() {
		this.textureWidth = 64;
		this.textureHeight = 64;

		this.body = new ModelRenderer(this, 0, 0);
		this.body.addBox(-6.0F, -16.0F, -4.0F, 12, 16, 8);
		this.body.setRotationPoint(0.0F, 8.0F, 0.0F);

		this.head = new ModelRenderer(this, 0, 24);
		this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
		this.head.setRotationPoint(0.0F, -8.0F, 0.0F);
		this.body.addChild(this.head);

		this.armRight = new ModelRenderer(this, 40, 0);
		this.armRight.addBox(-4.0F, -2.0F, -3.0F, 5, 22, 6);
		this.armRight.setRotationPoint(-8.0F, -6.0F, 0.0F);
		this.body.addChild(this.armRight);

		this.armLeft = new ModelRenderer(this, 40, 28);
		this.armLeft.addBox(-1.0F, -2.0F, -3.0F, 5, 22, 6);
		this.armLeft.setRotationPoint(8.0F, -6.0F, 0.0F);
		this.body.addChild(this.armLeft);

		this.legRight = new ModelRenderer(this, 0, 40);
		this.legRight.addBox(-3.0F, 0.0F, -3.0F, 6, 16, 6);
		this.legRight.setRotationPoint(-3.0F, 8.0F, 0.0F);

		this.legLeft = new ModelRenderer(this, 24, 40);
		this.legLeft.addBox(-3.0F, 0.0F, -3.0F, 6, 16, 6);
		this.legLeft.setRotationPoint(3.0F, 8.0F, 0.0F);
	}

	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale, Entity entityIn) {
		this.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
		this.body.render(scale);
		this.legRight.render(scale);
		this.legLeft.render(scale);
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale, Entity entity) {
		this.head.rotateAngleY = netHeadYaw * 0.017453292F;
		this.head.rotateAngleX = headPitch * 0.017453292F;
		float sway = MathHelper.cos(ageInTicks * 0.08F) * 0.06F;
		this.body.rotateAngleZ = sway;
		float swing = MathHelper.cos(limbSwing * 0.5F) * 1.2F * limbSwingAmount;
		this.legRight.rotateAngleX = swing;
		this.legLeft.rotateAngleX = -swing;
		this.armRight.rotateAngleX = -swing * 0.6F;
		this.armLeft.rotateAngleX = swing * 0.6F;
		this.armRight.rotateAngleZ = 0.1F + sway;
		this.armLeft.rotateAngleZ = -0.1F + sway;
	}
}
