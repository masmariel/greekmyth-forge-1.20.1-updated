package net.rafiki.greekmyth.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rafiki.greekmyth.GreekMyth;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, GreekMyth.MOD_ID);

    public static final RegistryObject<MobEffect> POISON_RESISTANCE = MOB_EFFECTS.register("poison_resistance",
            () -> new PoisonResistanceEffect(MobEffectCategory.BENEFICIAL, 0x36ebab));
    public static final RegistryObject<MobEffect> BLEEDING = MOB_EFFECTS.register("bleeding",
            () -> new BleedingEffect(MobEffectCategory.HARMFUL, 0x7c0a02));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
