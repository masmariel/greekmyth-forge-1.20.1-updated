package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.BrokenWingedSandalsItem;
import net.rafiki.greekmyth.item.custom.CrownOfDeucalionItem;

public class CrownOfDeucalionModel extends GeoModel<CrownOfDeucalionItem> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/crown_of_deucalion.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/crown_of_deucalion.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/armor.animation.json");

    @Override
    public ResourceLocation getModelResource(CrownOfDeucalionItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(CrownOfDeucalionItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(CrownOfDeucalionItem object) {
        return this.animation;
    }
}
