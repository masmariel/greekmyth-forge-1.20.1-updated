package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.HelmOfDarknessItem;
import net.rafiki.greekmyth.item.custom.WreathOfNikeItem;

public class WreathOfNikeModel extends GeoModel<WreathOfNikeItem> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/wreath_of_nike.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/wreath_of_nike.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(WreathOfNikeItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(WreathOfNikeItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(WreathOfNikeItem object) {
        return this.animation;
    }
}
