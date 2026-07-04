package net.lax1dude.eaglercraft.v1_8.opticlient;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * A small, squat frog model (original Opticlient geometry): a flat body,
 * a wide head with two raised eyes, and four short legs. Legs animate
 * with the entity's limb swing for a hopping gait. Designed for a 64x32
 * texture where the whole sheet is frog-green so UV alignment is forgiving.
 */
public class ModelFrog extends ModelBase {

	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer eyeLeft;
	private final ModelRenderer eyeRight;
	private final ModelRenderer legBackLeft;
	private final ModelRenderer legBackRight;
	private final ModelRenderer legFrontLeft;
	private final ModelRenderer legFrontRight;

	public ModelFrog() {
		this.textureWidth = 64;
		this.textureHeight = 32;

		this.body = new ModelRenderer(this, 0, 0);
		this.body.addBox(-3.0F, -2.0F, -3.0F, 6, 3, 6);
		this.body.setRotationPoint(0.0F, 21.0F, 1.0F);

		this.head = new ModelRenderer(this, 0, 16);
		this.head.addBox(-2.5F, -2.0F, -3.0F, 5, 2, 3);
		this.head.setRotationPoint(0.0F, 21.0F, -2.0F);

		this.eyeLeft = new ModelRenderer(this, 34, 0);
		this.eyeLeft.addBox(0.5F, -3.0F, -2.0F, 2, 1, 2);
		this.eyeLeft.setRotationPoint(0.0F, 21.0F, -2.0F);

		this.eyeRight = new ModelRenderer(this, 34, 4);
		this.eyeRight.addBox(-2.5F, -3.0F, -2.0F, 2, 1, 2);
		this.eyeRight.setRotationPoint(0.0F, 21.0F, -2.0F);

		this.legBackLeft = new ModelRenderer(this, 0, 26);
		this.legBackLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2);
		this.legBackLeft.setRotationPoint(2.5F, 22.0F, 3.0F);

		this.legBackRight = new ModelRenderer(this, 8, 26);
		this.legBackRight.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2);
		this.legBackRight.setRotationPoint(-2.5F, 22.0F, 3.0F);

		this.legFrontLeft = new ModelRenderer(this, 16, 26);
		this.legFrontLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2);
		this.legFrontLeft.setRotationPoint(2.5F, 22.0F, -2.0F);

		this.legFrontRight = new ModelRenderer(this, 24, 26);
		this.legFrontRight.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2);
		this.legFrontRight.setRotationPoint(-2.5F, 22.0F, -2.0F);
	}

	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale, Entity entityIn) {
		this.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
		this.body.render(scale);
		this.head.render(scale);
		this.eyeLeft.render(scale);
		this.eyeRight.render(scale);
		this.legBackLeft.render(scale);
		this.legBackRight.render(scale);
		this.legFrontLeft.render(scale);
		this.legFrontRight.render(scale);
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale, Entity entity) {
		// gentle idle bob of the body and head
		float bob = MathHelper.cos(ageInTicks * 0.1F) * 0.05F;
		this.body.rotateAngleX = bob;
		this.head.rotateAngleX = bob + headPitch * 0.017453292F;
		this.head.rotateAngleY = netHeadYaw * 0.017453292F;
		this.eyeLeft.rotateAngleX = this.eyeRight.rotateAngleX = this.head.rotateAngleX;
		this.eyeLeft.rotateAngleY = this.eyeRight.rotateAngleY = this.head.rotateAngleY;
		// legs kick with limb swing for a hopping look
		float kick = MathHelper.cos(limbSwing * 0.6F) * 1.0F * limbSwingAmount;
		this.legBackLeft.rotateAngleX = -kick;
		this.legBackRight.rotateAngleX = -kick;
		this.legFrontLeft.rotateAngleX = kick;
		this.legFrontRight.rotateAngleX = kick;
	}
}
