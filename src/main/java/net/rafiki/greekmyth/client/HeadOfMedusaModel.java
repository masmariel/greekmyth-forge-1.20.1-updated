package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.HeadOfMedusaItem;

public class HeadOfMedusaModel extends GeoModel<HeadOfMedusaItem> {
    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/head_of_medusa.geo.json");
    // Textures must be stored in assets/<modid>/textures with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/item/head_of_medusa.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/head_of_medusa.animation.json");

    @Override
    public ResourceLocation getModelResource(HeadOfMedusaItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(HeadOfMedusaItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(HeadOfMedusaItem object) {
        return this.animation;
    }
}
