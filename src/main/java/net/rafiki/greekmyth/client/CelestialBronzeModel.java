package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.BronzeArmor;
import net.rafiki.greekmyth.item.custom.CelestialArmor;

public class CelestialBronzeModel extends GeoModel<CelestialArmor> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/celestial_bronze_armor.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/celestial_bronze_armor.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(CelestialArmor object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(CelestialArmor object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(CelestialArmor object) {
        return this.animation;
    }

}
