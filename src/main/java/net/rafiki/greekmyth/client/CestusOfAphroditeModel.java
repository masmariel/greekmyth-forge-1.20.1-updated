package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.CestusOfAphroditeItem;
import net.rafiki.greekmyth.item.custom.GirdleOfHippolytaItem;

public class CestusOfAphroditeModel extends GeoModel<CestusOfAphroditeItem> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/cestus_of_aphrodite.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/cestus_of_aphrodite.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(CestusOfAphroditeItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(CestusOfAphroditeItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(CestusOfAphroditeItem object) {
        return this.animation;
    }
}
