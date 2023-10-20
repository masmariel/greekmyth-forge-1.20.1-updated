package net.rafiki.greekmyth.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.entity.custom.CalydonianBoarEntity;
import net.rafiki.greekmyth.entity.layers.ModModelLayers;

public class CalydonianBoarRenderer extends MobRenderer<CalydonianBoarEntity, CalydonianBoarModel<CalydonianBoarEntity>> {
    private static final ResourceLocation CALYDONIAN_BOAR_LOCATION = new ResourceLocation(GreekMyth.MOD_ID,"textures/entity/calydonian_boar.png");
    public CalydonianBoarRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new CalydonianBoarModel<>(pContext.bakeLayer(ModModelLayers.CALYDONIAN_BOAR_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(CalydonianBoarEntity pEntity) {
        return CALYDONIAN_BOAR_LOCATION;
    }
}
