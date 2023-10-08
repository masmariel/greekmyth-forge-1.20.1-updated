package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.StygianArmor;


public class StygianArmorModel extends GeoModel<StygianArmor> {

    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/stygian_iron_armor.geo.json");
    // Textures must be stored in assets/<modid>/textures/models/armor with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/stygian_iron_armor.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(StygianArmor object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(StygianArmor object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(StygianArmor object) {
        return this.animation;
    }
}
