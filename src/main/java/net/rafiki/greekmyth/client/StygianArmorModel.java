package net.rafiki.greekmyth.client;

import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.item.custom.StygianArmor;
import net.rafiki.greekmyth.item.custom.WingedSandalsOfHermesItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.model.GeoModel;

public class StygianArmorModel extends GeoModel<StygianArmor> {
    @Override
    public ResourceLocation getModelResource(StygianArmor animatable) {
        return new ResourceLocation(GreekMyth.MOD_ID, "geo/stygian_iron_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(StygianArmor animatable) {
        return new ResourceLocation(GreekMyth.MOD_ID, "textures/models/armor/stygian_iron_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(StygianArmor animatable) {
        return new ResourceLocation(GreekMyth.MOD_ID, "animations/no_animation.animation.json");
    }
}
