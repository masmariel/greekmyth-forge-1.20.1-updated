package net.rafiki.greekmyth.entity.client;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.rafiki.greekmyth.entity.animations.CyclopsAnimationDefinition;
import net.rafiki.greekmyth.entity.animations.MedusaAnimationDefinitions;
import net.rafiki.greekmyth.entity.custom.CyclopsEntity;
import net.rafiki.greekmyth.entity.custom.MedusaEntity;

public class CyclopsModel<T extends CyclopsEntity> extends HierarchicalModel<T> {
	private final ModelPart cyclops;
	private final ModelPart head;

	public CyclopsModel(ModelPart root) {
		this.cyclops = root.getChild("cyclops");
		this.head = cyclops.getChild("head");
	}
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cyclops = partdefinition.addOrReplaceChild("cyclops", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = cyclops.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -64.0F, -5.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = cyclops.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(48, 32).addBox(0.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -48.0F, 3.0F));

		PartDefinition left_arm = cyclops.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 64).addBox(-8.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -48.0F, 3.0F));

		PartDefinition left_leg = cyclops.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(64, 0).addBox(-8.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 3.0F));

		PartDefinition right_leg = cyclops.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(32, 64).addBox(0.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 3.0F));

		PartDefinition body = cyclops.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 32).addBox(-8.0F, -48.0F, -1.0F, 16.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(CyclopsEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	this.root().getAllParts().forEach(ModelPart::resetPose);
	this.animateWalk(CyclopsAnimationDefinition.CYCLOPS_WALK,limbSwing,limbSwingAmount, 2f, 2.5f);
	this.animate(entity.idleAnimationState, CyclopsAnimationDefinition.CYCLOPS_IDLE,ageInTicks, 1f);
	this.animate(entity.attackAnimationState, CyclopsAnimationDefinition.CYCLOPS_ATTACK, ageInTicks, 1f);

	this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

	}
	private void applyHeadRotation(CyclopsEntity pEntity, float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		//pNetHeadYaw = Mth.clamp(pNetHeadYaw, -1f, 1f);
		//pHeadPitch = Mth.clamp(pHeadPitch, -1.0F, 1.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);




	}


	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		cyclops.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return cyclops;
	}
}