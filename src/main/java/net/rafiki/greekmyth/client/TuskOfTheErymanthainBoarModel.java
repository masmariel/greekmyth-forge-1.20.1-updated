package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.TuskOfTheErymanthianBoarItem;

public class TuskOfTheErymanthainBoarModel extends GeoModel<TuskOfTheErymanthianBoarItem> {
    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/tusk_of_the_erymanthian_boar.geo.json");
    // Textures must be stored in assets/<modid>/textures with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/item/tusk_of_the_erymanthian_boar.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(TuskOfTheErymanthianBoarItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(TuskOfTheErymanthianBoarItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(TuskOfTheErymanthianBoarItem object) {
        return this.animation;
    }
}
