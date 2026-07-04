package net.lax1dude.eaglercraft.v1_8.opticlient;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * A compact box-shaped Copper Golem (original Opticlient geometry): a cubic
 * copper body, a small head with an antenna-like top, stubby arms and short
 * legs. Arms and legs swing with movement. UVs are kept inside a 64x64 sheet
 * and the copper-orange texture is forgiving of small misalignment.
 */
public class ModelCopperGolem extends ModelBase {

	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer antenna;
	private final ModelRenderer armLeft;
	private final ModelRenderer armRight;
	private final ModelRenderer legLeft;
	private final ModelRenderer legRight;

	public ModelCopperGolem() {
		this.textureWidth = 64;
		this.textureHeight = 64;

		this.body = new ModelRenderer(this, 0, 0);
		this.body.addBox(-4.0F, -8.0F, -3.0F, 8, 8, 6);
		this.body.setRotationPoint(0.0F, 16.0F, 0.0F);

		this.head = new ModelRenderer(this, 0, 16);
		this.head.addBox(-3.0F, -6.0F, -3.0F, 6, 6, 6);
		this.head.setRotationPoint(0.0F, -8.0F, 0.0F);
		this.body.addChild(this.head);

		this.antenna = new ModelRenderer(this, 24, 16);
		this.antenna.addBox(-1.0F, -9.0F, -1.0F, 2, 3, 2);
		this.antenna.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.head.addChild(this.antenna);

		this.armRight = new ModelRenderer(this, 28, 0);
		this.armRight.addBox(-2.0F, 0.0F, -2.0F, 2, 8, 4);
		this.armRight.setRotationPoint(-4.0F, -7.0F, 0.0F);
		this.body.addChild(this.armRight);

		this.armLeft = new ModelRenderer(this, 40, 0);
		this.armLeft.addBox(0.0F, 0.0F, -2.0F, 2, 8, 4);
		this.armLeft.setRotationPoint(4.0F, -7.0F, 0.0F);
		this.body.addChild(this.armLeft);

		this.legRight = new ModelRenderer(this, 0, 30);
		this.legRight.addBox(-2.0F, 0.0F, -2.0F, 3, 4, 4);
		this.legRight.setRotationPoint(-2.0F, 16.0F, 0.0F);

		this.legLeft = new ModelRenderer(this, 16, 30);
		this.legLeft.addBox(-1.0F, 0.0F, -2.0F, 3, 4, 4);
		this.legLeft.setRotationPoint(2.0F, 16.0F, 0.0F);
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
		float swing = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.legRight.rotateAngleX = swing;
		this.legLeft.rotateAngleX = -swing;
		this.armRight.rotateAngleX = -swing * 0.5F;
		this.armLeft.rotateAngleX = swing * 0.5F;
		this.antenna.rotateAngleZ = MathHelper.cos(ageInTicks * 0.1F) * 0.15F;
	}
}
