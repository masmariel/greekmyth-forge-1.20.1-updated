package net.rafiki.greekmyth.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties AMBROSIA = new FoodProperties.Builder().nutrition(10).saturationMod(14)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 2), 1)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 300), 1)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 300, 0), 1)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 100, 1), 1)
            .build();
}
