package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.BidentOfHadesItem;
import net.rafiki.greekmyth.item.custom.TridentOfOceanusItem;
import net.rafiki.greekmyth.item.custom.TridentOfPoseidonItem;

public class TridentOfOceanusModel extends GeoModel<TridentOfOceanusItem> {
    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/trident_of_oceanus.geo.json");
    // Textures must be stored in assets/<modid>/textures with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/item/trident_of_oceanus.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(TridentOfOceanusItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(TridentOfOceanusItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(TridentOfOceanusItem object) {
        return this.animation;
    }
}
