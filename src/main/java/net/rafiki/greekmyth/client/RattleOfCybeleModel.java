package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.RattleOfCybeleItem;

public class RattleOfCybeleModel extends GeoModel<RattleOfCybeleItem> {
    // Models must be stored in assets/<modid>/geo with subfolders supported inside the geo folder
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/rattle_of_cybele.geo.json");
    // Textures must be stored in assets/<modid>/textures with subfolders supported inside the textures folder
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/item/rattle_of_cybele.png");
    // Animations must be stored in assets/<modid>/animations with subfolders supported inside the animations folder
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(RattleOfCybeleItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(RattleOfCybeleItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(RattleOfCybeleItem object) {
        return this.animation;
    }
}
