package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.SpearOfAthenaItem;

public class SpearOfAthenaModel extends GeoModel<SpearOfAthenaItem> {
    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/spear_of_athena.geo.json");
    // Textures must be stored in assets/<modid>/textures with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/item/spear_of_athena.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(SpearOfAthenaItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(SpearOfAthenaItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(SpearOfAthenaItem object) {
        return this.animation;
    }
}
