package net.rafiki.greekmyth.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
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
    public static final RegistryObject<MobEffect> BERSERK = MOB_EFFECTS.register("berserk",
            () -> new BerserkEffect(MobEffectCategory.BENEFICIAL, 0xc30010)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE, "0fb52f0a-28de-41e0-8a6d-1433f9db10e9", 4f, AttributeModifier.Operation.ADDITION)
                    .addAttributeModifier(Attributes.ATTACK_SPEED, "b1d016ec-94f0-43dc-a5cb-925dfbc4f08b", 2f, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static final RegistryObject<MobEffect> STONE_GAZE = MOB_EFFECTS.register("stone_gaze",
            () -> new StoneGazeEffect(MobEffectCategory.HARMFUL, 0x767676)
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED, "73782702-2884-4834-9eb0-4d3fca714740", -10, AttributeModifier.Operation.ADDITION));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
