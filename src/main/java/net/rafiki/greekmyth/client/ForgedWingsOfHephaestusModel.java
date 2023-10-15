package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.DrakonBoneWingsItem;
import net.rafiki.greekmyth.item.custom.ForgedWingsOfHephaestusItem;

public class ForgedWingsOfHephaestusModel extends GeoModel<ForgedWingsOfHephaestusItem> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/forged_wings_of_hephaestus.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/forged_wings_of_hephaestus.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/forged_wings_of_hephaestus.animation.json");

    @Override
    public ResourceLocation getModelResource(ForgedWingsOfHephaestusItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(ForgedWingsOfHephaestusItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(ForgedWingsOfHephaestusItem object) {
        return this.animation;
    }
}
