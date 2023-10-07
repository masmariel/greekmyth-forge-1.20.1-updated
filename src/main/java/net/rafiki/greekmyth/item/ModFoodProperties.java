package net.rafiki.greekmyth.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.rafiki.greekmyth.effect.ModEffects;

public class ModFoodProperties {
    public static final FoodProperties AMBROSIA = new FoodProperties.Builder().nutrition(10).saturationMod(14)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 200, 1, false, true, false), 0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1, false, true, false), 0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 1, false, true, false), 0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 10, 1, false, true, false), 1)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 300, 0, false, true, false), 1)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 100, 1, false, true, false), 0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 200, 0, false, true, false), 0.5f)
            .build();

    public static final FoodProperties GORGONS_BLOOD = new FoodProperties.Builder().nutrition(0).saturationMod(0)
            .effect(() -> new MobEffectInstance(ModEffects.POISON_RESISTANCE.get(), 400, 0, false, true, false), 1)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 100, 1, false, true, false), 0.5f)
            .build();

    public static final FoodProperties NECTAR = new FoodProperties.Builder().nutrition(0).saturationMod(0)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0, false, true, false), 0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 0, false, true, false), 0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 300, 0, false, true, false), 0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0, false, true, false), 0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 300, 0, false, true, false), 0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 300, 0, false, true, false), 1)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 100, 1, false, true, false), 0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 200, 0, false, true, false), 0.5f)
            .build();
}
