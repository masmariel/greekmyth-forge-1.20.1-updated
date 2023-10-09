package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.CrownOfDeucalionItem;
import net.rafiki.greekmyth.item.custom.EmperorsCrownItem;

public class EmperorsCrownModel extends GeoModel<EmperorsCrownItem> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/emperors_crown.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/emperors_crown.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(EmperorsCrownItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(EmperorsCrownItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(EmperorsCrownItem object) {
        return this.animation;
    }
}
