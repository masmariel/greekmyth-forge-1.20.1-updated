package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.CrownOfDeucalionItem;
import net.rafiki.greekmyth.item.custom.CrownOfDionysusItem;

public class CrownOfDionysusModel extends GeoModel<CrownOfDionysusItem> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/crown_of_dionysus.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/crown_of_dionysus.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(CrownOfDionysusItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(CrownOfDionysusItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(CrownOfDionysusItem object) {
        return this.animation;
    }
}
