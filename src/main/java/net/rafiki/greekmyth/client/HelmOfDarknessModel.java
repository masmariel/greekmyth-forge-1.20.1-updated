package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.BrokenWingedSandalsItem;
import net.rafiki.greekmyth.item.custom.HelmOfDarknessItem;

public class HelmOfDarknessModel extends GeoModel<HelmOfDarknessItem> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/helm_of_darkness.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/helm_of_darkness.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(HelmOfDarknessItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(HelmOfDarknessItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(HelmOfDarknessItem object) {
        return this.animation;
    }
}
