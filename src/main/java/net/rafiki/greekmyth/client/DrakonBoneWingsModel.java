package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.item.custom.BrokenWingedSandalsItem;
import net.rafiki.greekmyth.item.custom.DrakonBoneWingsItem;
import net.rafiki.greekmyth.item.custom.WingedSandalsOfHermesItem;

public class DrakonBoneWingsModel extends GeoModel<DrakonBoneWingsItem> {
    private static final ResourceLocation model = new ResourceLocation("greekmyth", "geo/drakon_bone_wings.geo.json");
    private static final ResourceLocation texture = new ResourceLocation("greekmyth", "textures/models/armor/drakon_bone_wings.png");
    private static final ResourceLocation animation = new ResourceLocation("greekmyth", "animations/drakon_bone_wings.animation.json");

    @Override
    public ResourceLocation getModelResource(DrakonBoneWingsItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(DrakonBoneWingsItem object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(DrakonBoneWingsItem object) {
        return this.animation;
    }
}
