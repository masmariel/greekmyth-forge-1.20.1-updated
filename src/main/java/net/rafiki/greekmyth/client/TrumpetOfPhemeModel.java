package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.AolusItem;
import net.rafiki.greekmyth.item.custom.TrumpetOfPhemeItem;

public class TrumpetOfPhemeModel extends GeoModel<TrumpetOfPhemeItem> {
    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/trumpet_of_pheme.geo.json");
    // Textures must be stored in assets/<modid>/textures with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/item/trumpet_of_pheme.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(TrumpetOfPhemeItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(TrumpetOfPhemeItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(TrumpetOfPhemeItem object) {
        return this.animation;
    }
}
