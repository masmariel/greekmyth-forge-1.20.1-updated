package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.BronzeArmor;

public class BronzeArmorModel extends GeoModel<BronzeArmor> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/bronze_armor.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/bronze_armor.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(BronzeArmor object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(BronzeArmor object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(BronzeArmor object) {
        return this.animation;
    }
}
