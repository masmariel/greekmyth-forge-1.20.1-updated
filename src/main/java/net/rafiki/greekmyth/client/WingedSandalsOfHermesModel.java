package net.rafiki.greekmyth.client;

import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.GreekMyth;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class WingedSandalsOfHermesModel extends GeoModel {
    @Override
    public ResourceLocation getModelResource(GeoAnimatable animatable) {
        return new ResourceLocation(GreekMyth.MOD_ID, "geo/winged_sandals_of_hermes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GeoAnimatable animatable) {
        return new ResourceLocation(GreekMyth.MOD_ID, "textures/models/armor/winged_sandals_of_hermes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GeoAnimatable animatable) {
        return new ResourceLocation(GreekMyth.MOD_ID, "animations/winged_sandals_of_hermes.animation.json");
    }
}
