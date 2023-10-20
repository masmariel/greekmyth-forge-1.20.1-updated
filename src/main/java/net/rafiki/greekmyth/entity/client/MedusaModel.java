package net.rafiki.greekmyth.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.rafiki.greekmyth.entity.animations.MedusaAnimationDefinitions;
import net.rafiki.greekmyth.entity.custom.MedusaEntity;

public class MedusaModel<T extends MedusaEntity> extends HierarchicalModel<T> {
	private final ModelPart medusa;
	private final ModelPart head;

	public MedusaModel(ModelPart root) {
		this.medusa = root.getChild("medusa");
		this.head = medusa.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition medusa = partdefinition.addOrReplaceChild("medusa", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = medusa.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, -3.0F));

		PartDefinition snakehair1 = head.addOrReplaceChild("snakehair1", CubeListBuilder.create(), PartPose.offset(2.0F, -7.0F, 1.0F));

		PartDefinition cube_r1 = snakehair1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 76).addBox(-1.2323F, -5.5386F, -0.7996F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.0F, 0.1309F, 0.0F, 0.9163F));

		PartDefinition snakehead1 = head.addOrReplaceChild("snakehead1", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(74, 62).addBox(-1.0F, 0.0F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -10.0F, 0.0F));

		PartDefinition snakehair2 = head.addOrReplaceChild("snakehair2", CubeListBuilder.create(), PartPose.offset(-3.0F, -7.0F, 0.0F));

		PartDefinition cube_r2 = snakehair2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 76).addBox(22.0F, -27.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 31.0F, 3.0F, 0.1309F, 0.0F, -0.9163F));

		PartDefinition snakehead2 = head.addOrReplaceChild("snakehead2", CubeListBuilder.create().texOffs(71, 37).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 70).addBox(-1.0F, 0.0F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -10.0F, 0.0F));

		PartDefinition snakehair3 = head.addOrReplaceChild("snakehair3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r3 = snakehair3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(72, 26).addBox(22.0F, -28.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2192F, 31.2262F, 3.0F, 0.1309F, 0.0F, -0.9163F));

		PartDefinition snakehead3 = head.addOrReplaceChild("snakehead3", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0F, -6.0F, -1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r4 = snakehead3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 67).addBox(-9.0F, -36.0F, -7.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(70, 54).addBox(-9.0F, -37.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6863F, 35.905F, 4.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition snakehair4 = head.addOrReplaceChild("snakehair4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r5 = snakehair4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 11).addBox(-24.0F, -28.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2192F, 31.2262F, 3.0F, 0.1309F, 0.0F, 0.9163F));

		PartDefinition snakehead4 = head.addOrReplaceChild("snakehead4", CubeListBuilder.create().texOffs(62, 70).addBox(-1.069F, -1.0189F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(71, 0).addBox(-1.069F, -0.0189F, -9.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition snakehair5 = head.addOrReplaceChild("snakehair5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -6.0F, 2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r6 = snakehair5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 75).addBox(-24.0F, -28.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1431F, 31.6089F, 3.0F, 0.1309F, 0.0F, 0.9163F));

		PartDefinition snakehead5 = head.addOrReplaceChild("snakehead5", CubeListBuilder.create().texOffs(70, 46).addBox(-0.9971F, -0.6299F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(36, 65).addBox(-0.9971F, 0.3701F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -8.0F, 2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition snakehair6 = head.addOrReplaceChild("snakehair6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -6.0F, 2.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r7 = snakehair6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 73).addBox(22.0F, -28.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1431F, 31.6089F, 3.0F, 0.1309F, 0.0F, -0.9163F));

		PartDefinition snakehead6 = head.addOrReplaceChild("snakehead6", CubeListBuilder.create().texOffs(52, 68).addBox(-1.0029F, -0.6299F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(62, 26).addBox(-1.0029F, 0.3701F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 2.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition snakehair7 = head.addOrReplaceChild("snakehair7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -2.0F, 1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r8 = snakehair7.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 73).addBox(22.0F, -28.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1431F, 31.6089F, 3.0F, 0.1309F, 0.0F, -0.9163F));

		PartDefinition snakehead7 = head.addOrReplaceChild("snakehead7", CubeListBuilder.create().texOffs(10, 67).addBox(-1.0029F, -0.6299F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(62, 11).addBox(-1.0029F, 0.3701F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -3.0F, 1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition snakehair8 = head.addOrReplaceChild("snakehair8", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -2.0F, 1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r9 = snakehair8.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 73).addBox(-24.0F, -28.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1431F, 31.6089F, 3.0F, 0.1309F, 0.0F, 0.9163F));

		PartDefinition snakehead8 = head.addOrReplaceChild("snakehead8", CubeListBuilder.create().texOffs(42, 65).addBox(-0.9971F, -0.6299F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(12, 56).addBox(-0.9971F, 0.3701F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -3.0F, 1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition snakehair9 = head.addOrReplaceChild("snakehair9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -7.0F, -1.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r10 = snakehair9.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 31).addBox(-12.0F, -35.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.366F, 26.3468F, 4.0F, 0.1309F, 0.0F, 0.9163F));

		PartDefinition snakehead9 = head.addOrReplaceChild("snakehead9", CubeListBuilder.create().texOffs(26, 65).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(55, 27).addBox(-1.0F, 0.0F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -12.0F, -1.0F));

		PartDefinition snakehair10 = head.addOrReplaceChild("snakehair10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -7.0F, -1.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition cube_r11 = snakehair10.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 16).addBox(-12.0F, -35.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.9214F, 25.9906F, 4.0F, 0.1309F, 0.0F, 0.9163F));

		PartDefinition snakehead10 = head.addOrReplaceChild("snakehead10", CubeListBuilder.create().texOffs(64, 62).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(48, 26).addBox(-1.0F, 0.0F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -12.0F, -1.0F));

		PartDefinition snakehair11 = head.addOrReplaceChild("snakehair11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.0F, 1.0F, 0.0F, 0.0F, -1.0036F));

		PartDefinition cube_r12 = snakehair11.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -35.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.0928F, 26.8519F, 4.0F, 0.1309F, 0.0F, 0.9163F));

		PartDefinition snakehead11 = head.addOrReplaceChild("snakehead11", CubeListBuilder.create().texOffs(16, 59).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-1.0F, 0.0F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -13.0F, 1.0F));

		PartDefinition upperbodyMain = medusa.addOrReplaceChild("upperbodyMain", CubeListBuilder.create(), PartPose.offset(2.0F, -33.0F, -5.0F));

		PartDefinition body = upperbodyMain.addOrReplaceChild("body", CubeListBuilder.create().texOffs(80, 1).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(79, 17).addBox(1.0F, -9.0F, -4.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(79, 17).addBox(-3.0F, -9.0F, -4.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(80, 23).addBox(-3.0F, -10.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(80, 23).addBox(1.0F, -10.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 78).addBox(-4.0F, -9.0F, -3.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 78).addBox(0.0F, -9.0F, -3.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 21.0F, 2.0F));

		PartDefinition rightarm = upperbodyMain.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 9.0F, 2.0F));

		PartDefinition leftarm = upperbodyMain.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(54, 52).addBox(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 9.0F, 2.0F));

		PartDefinition tail13end = medusa.addOrReplaceChild("tail13end", CubeListBuilder.create().texOffs(76, 76).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 53.0F));

		PartDefinition tail12 = medusa.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(48, 11).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 51.0F));

		PartDefinition tail11 = medusa.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 48.0F));

		PartDefinition tail10 = medusa.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(50, 44).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 44.0F));

		PartDefinition tail9 = medusa.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(49, 15).addBox(-4.0F, -2.0F, -1.0F, 8.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 39.0F));

		PartDefinition tail8 = medusa.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(48, 0).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 32.0F));

		PartDefinition tail7 = medusa.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(25, 37).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 26.0F));

		PartDefinition tail6 = medusa.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 44).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 20.0F));

		PartDefinition tail5 = medusa.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(24, 8).addBox(-3.2168F, -3.0F, 0.0513F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -3.0F, 13.0F));

		PartDefinition tail4 = medusa.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(24, 23).addBox(-4.0F, -3.0F, -1.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 7.0F));

		PartDefinition tail3 = medusa.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -6.0F, -1.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition tail2 = medusa.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r13 = tail2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 31).addBox(-4.0F, -3.0F, -7.2679F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition tail1waist = medusa.addOrReplaceChild("tail1waist", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, -4.0F));

		PartDefinition cube_r14 = tail1waist.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(52, 33).addBox(-4.0F, -5.8009F, -1.8452F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(MedusaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(MedusaAnimationDefinitions.MEDUSA_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(entity.idleAnimationState, MedusaAnimationDefinitions.MEDUSA_IDLE, ageInTicks, 1f);
	}

	private void applyHeadRotation(MedusaEntity pEntity, float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		medusa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return medusa;
	}
}