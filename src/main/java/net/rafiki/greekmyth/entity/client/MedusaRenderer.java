package net.rafiki.greekmyth.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.entity.custom.MedusaEntity;
import net.rafiki.greekmyth.entity.layers.ModModelLayers;

public class MedusaRenderer extends MobRenderer<MedusaEntity, MedusaModel<MedusaEntity>> {
    private static final ResourceLocation MEDUSA_LOCATION = new ResourceLocation(GreekMyth.MOD_ID,"textures/entity/medusa.png");
    public MedusaRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new MedusaModel<>(pContext.bakeLayer(ModModelLayers.MEDUSA_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(MedusaEntity pEntity) {
        return MEDUSA_LOCATION;
    }
}
