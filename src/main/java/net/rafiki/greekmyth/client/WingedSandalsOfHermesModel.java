package net.rafiki.greekmyth.client;

import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.item.custom.WingedSandalsOfHermesItem;
import software.bernie.geckolib.model.GeoModel;

public class WingedSandalsOfHermesModel extends GeoModel<WingedSandalsOfHermesItem> {
    @Override
    public ResourceLocation getModelResource(WingedSandalsOfHermesItem animatable) {
        return new ResourceLocation(GreekMyth.MOD_ID, "geo/winged_sandals_of_hermes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WingedSandalsOfHermesItem animatable) {
        return new ResourceLocation(GreekMyth.MOD_ID, "textures/models/armor/winged_sandals_of_hermes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WingedSandalsOfHermesItem animatable) {
        return new ResourceLocation(GreekMyth.MOD_ID, "animations/winged_sandals_of_hermes.animation.json");
    }
}
