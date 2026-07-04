package net.lax1dude.eaglercraft.v1_8.opticlient;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * The Copper Golem: a small copper automaton with a boxy head, button and stubby limbs.
 * Geometry converted from Mojang's official copper model (Bedrock geometry),
 * mapped into 1.8 ModelRenderer space (feet at y=24, Y inverted).
 */
public class ModelCopperGolem extends ModelBase {
	private final ModelRenderer root;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelCopperGolem() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.root = new ModelRenderer(this, 0, 0);
		this.root.setRotationPoint(1F, 24F, 0F);

		this.body = new ModelRenderer(this, 0, 15);
		this.body.addBox(-4F, -6F, -3F, 8, 6, 6);
		this.body.setRotationPoint(-1F, -5F, 0F);
		this.root.addChild(this.body);

		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-4F, -5F, -5F, 8, 5, 10);
		this.head.setTextureOffset(56, 0);
		this.head.addBox(-1F, -2F, -6F, 2, 3, 2);
		this.head.setTextureOffset(37, 8);
		this.head.addBox(-1F, -9F, -1F, 2, 4, 2);
		this.head.setTextureOffset(37, 0);
		this.head.addBox(-2F, -13F, -2F, 4, 4, 4);
		this.head.setRotationPoint(0F, -6F, 0F);
		this.body.addChild(this.head);

		this.right_arm = new ModelRenderer(this, 36, 16);
		this.right_arm.addBox(-3F, -1F, -2F, 3, 10, 4);
		this.right_arm.setRotationPoint(-4F, -6F, 0F);
		this.body.addChild(this.right_arm);

		this.left_arm = new ModelRenderer(this, 50, 16);
		this.left_arm.addBox(0F, -1F, -2F, 3, 10, 4);
		this.left_arm.setRotationPoint(4F, -6F, 0F);
		this.body.addChild(this.left_arm);

		this.right_leg = new ModelRenderer(this, 0, 27);
		this.right_leg.addBox(-1.9F, 0F, -1.99F, 4, 5, 4);
		this.right_leg.setRotationPoint(-3F, -5F, 0F);
		this.root.addChild(this.right_leg);

		this.left_leg = new ModelRenderer(this, 16, 27);
		this.left_leg.addBox(-2.1F, 0F, -2F, 4, 5, 4);
		this.left_leg.setRotationPoint(1F, -5F, 0F);
		this.root.addChild(this.left_leg);
	}

	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
		this.root.render(scale);
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale, Entity entity) {
		this.head.rotateAngleY = netHeadYaw * 0.017453292F;
		this.head.rotateAngleX = headPitch * 0.017453292F;
		float swing = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.right_leg.rotateAngleX = swing;
		this.left_leg.rotateAngleX = -swing;
		this.right_arm.rotateAngleX = -swing * 0.5F;
		this.left_arm.rotateAngleX = swing * 0.5F;
	}
}
