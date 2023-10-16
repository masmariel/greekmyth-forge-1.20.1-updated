package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.rafiki.greekmyth.item.custom.AolusItem;
import net.rafiki.greekmyth.item.custom.BowOfErosItem;

public class BowOfErosModel extends GeoModel<BowOfErosItem> {
    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/bow_of_eros.geo.json");
    // Textures must be stored in assets/<modid>/textures with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/item/bow_of_eros.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(BowOfErosItem object) {
            return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(BowOfErosItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(BowOfErosItem object) {
        return this.animation;
    }
}
