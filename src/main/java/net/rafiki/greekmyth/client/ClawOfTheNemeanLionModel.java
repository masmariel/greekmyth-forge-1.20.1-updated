package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.ClawOfTheNemeanLionItem;

public class ClawOfTheNemeanLionModel extends GeoModel<ClawOfTheNemeanLionItem> {
    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/claw_of_the_nemean_lion.geo.json");
    // Textures must be stored in assets/<modid>/textures with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/item/claw_of_the_nemean_lion.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(ClawOfTheNemeanLionItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(ClawOfTheNemeanLionItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(ClawOfTheNemeanLionItem object) {
        return this.animation;
    }
}
