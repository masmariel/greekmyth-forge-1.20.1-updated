package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.GirdleOfHippolytaItem;

public class GirdleOfHippolytaModel extends GeoModel<GirdleOfHippolytaItem> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/girdle_of_hippolyta.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/girdle_of_hippolyta.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(GirdleOfHippolytaItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(GirdleOfHippolytaItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(GirdleOfHippolytaItem object) {
        return this.animation;
    }
}
