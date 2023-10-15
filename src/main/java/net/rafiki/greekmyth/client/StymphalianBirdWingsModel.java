package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.BrokenWingedSandalsItem;
import net.rafiki.greekmyth.item.custom.StymphalianBirdWingsItem;

public class StymphalianBirdWingsModel extends GeoModel<StymphalianBirdWingsItem> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/stymphalian_bird_wings.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/stymphalian_bird_wings.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/stymphalian_bird_wings.animation.json");

    @Override
    public ResourceLocation getModelResource(StymphalianBirdWingsItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(StymphalianBirdWingsItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(StymphalianBirdWingsItem object) {
        return this.animation;
    }
}
