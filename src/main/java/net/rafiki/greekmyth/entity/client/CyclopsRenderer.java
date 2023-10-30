package net.rafiki.greekmyth.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.entity.custom.CyclopsEntity;
import net.rafiki.greekmyth.entity.custom.MedusaEntity;
import net.rafiki.greekmyth.entity.layers.ModModelLayers;

public class CyclopsRenderer extends MobRenderer<CyclopsEntity, CyclopsModel<CyclopsEntity>> {
    private static final ResourceLocation CYCLOPS_LOCATION = new ResourceLocation(GreekMyth.MOD_ID,"textures/entity/cyclops_texture.png");
    public CyclopsRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new CyclopsModel<>(pContext.bakeLayer(ModModelLayers.CYCLOPS_LAYER)), 1f);
    }
    @Override
    public ResourceLocation getTextureLocation(CyclopsEntity pEntity) {
        return CYCLOPS_LOCATION;
    }
}
