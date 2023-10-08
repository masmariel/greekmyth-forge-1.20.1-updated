package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.WingedSandalsOfHermesItem;

public class WingedSandalsOfHermesModel extends GeoModel<WingedSandalsOfHermesItem> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/winged_sandals_of_hermes.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/winged_sandals_of_hermes.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/winged_sandals_of_hermes.animation.json");

    @Override
    public ResourceLocation getModelResource(WingedSandalsOfHermesItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(WingedSandalsOfHermesItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(WingedSandalsOfHermesItem object) {
        return this.animation;
    }
}
