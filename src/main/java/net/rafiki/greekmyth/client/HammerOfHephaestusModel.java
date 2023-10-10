package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.CaduceusItem;
import net.rafiki.greekmyth.item.custom.HammerOfHephaestusItem;

public class HammerOfHephaestusModel extends GeoModel<HammerOfHephaestusItem> {
    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/hammer_of_hephaestus.geo.json");
    // Textures must be stored in assets/<modid>/textures with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/item/hammer_of_hephaestus.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(HammerOfHephaestusItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(HammerOfHephaestusItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(HammerOfHephaestusItem object) {
        return this.animation;
    }
}
