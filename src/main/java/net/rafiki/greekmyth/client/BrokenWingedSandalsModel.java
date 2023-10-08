package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.BrokenWingedSandalsItem;
import net.rafiki.greekmyth.item.custom.WingedSandalsOfHermesItem;

public class BrokenWingedSandalsModel extends GeoModel<BrokenWingedSandalsItem> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/broken_winged_sandals.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/broken_winged_sandals.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/winged_sandals_of_hermes.animation.json");

    @Override
    public ResourceLocation getModelResource(BrokenWingedSandalsItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(BrokenWingedSandalsItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(BrokenWingedSandalsItem object) {
        return this.animation;
    }
}
