package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.ScytheOfKronusItem;

public class ScytheOfKronusModel extends GeoModel<ScytheOfKronusItem> {
    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/scythe_of_kronus.geo.json");
    // Textures must be stored in assets/<modid>/textures with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/item/scythe_of_kronus.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/scythe_of_kronus.animation.json");

    @Override
    public ResourceLocation getModelResource(ScytheOfKronusItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(ScytheOfKronusItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(ScytheOfKronusItem object) {
        return this.animation;
    }
}
