package net.rafiki.greekmyth.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.entity.custom.ErymanthianBoarEntity;
import net.rafiki.greekmyth.entity.layers.ModModelLayers;

public class ErymanthianBoarRenderer extends MobRenderer<ErymanthianBoarEntity, ErymanthianBoarModel<ErymanthianBoarEntity>> {
    private static final ResourceLocation ERYMANTHIAN_BOAR_LOCATION = new ResourceLocation(GreekMyth.MOD_ID,"textures/entity/erymanthian_boar.png");
    public ErymanthianBoarRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ErymanthianBoarModel<>(pContext.bakeLayer(ModModelLayers.ERYMANTHIAN_BOAR_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(ErymanthianBoarEntity pEntity) {
        return ERYMANTHIAN_BOAR_LOCATION;
    }
}
