package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.SwordOfAresItem;

public class SwordOfAresModel extends GeoModel<SwordOfAresItem> {
    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/sword_of_ares.geo.json");
    // Textures must be stored in assets/<modid>/textures with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/item/sword_of_ares.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(SwordOfAresItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(SwordOfAresItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(SwordOfAresItem object) {
        return this.animation;
    }
}
