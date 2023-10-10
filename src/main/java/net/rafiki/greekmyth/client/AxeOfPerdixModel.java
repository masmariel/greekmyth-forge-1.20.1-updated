package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.AxeItem;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.CaduceusItem;

public class AxeOfPerdixModel extends GeoModel<AxeOfPerdixItem> {
    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/axe_of_perdix.geo.json");
    // Textures must be stored in assets/<modid>/textures with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/item/axe_of_perdix.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(AxeOfPerdixItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(AxeOfPerdixItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(AxeOfPerdixItem object) {
        return this.animation;
    }
}
