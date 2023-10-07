package net.rafiki.greekmyth.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

import java.util.UUID;

public class BerserkEffect extends MobEffect {
    protected BerserkEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        AttributeInstance attackDamage = pLivingEntity.getAttribute(Attributes.ATTACK_DAMAGE);
        AttributeInstance attackSpeed = pLivingEntity.getAttribute(Attributes.ATTACK_SPEED);

        UUID attackDamageModifierId = UUID.fromString("0fb52f0a-28de-41e0-8a6d-1433f9db10e9");
        if (attackDamage != null && attackDamage.getModifier(attackDamageModifierId) == null) {
            attackDamage.addTransientModifier(new AttributeModifier(attackDamageModifierId, "Berserk attack damage", 4f, AttributeModifier.Operation.ADDITION));
        }

        UUID attackSpeedModifierId = UUID.fromString("b1d016ec-94f0-43dc-a5cb-925dfbc4f08b");
        if (attackSpeed != null && attackSpeed.getModifier(attackSpeedModifierId) == null) {
            attackSpeed.addTransientModifier(new AttributeModifier(attackSpeedModifierId, "Berserk attack speed", 2f, AttributeModifier.Operation.MULTIPLY_TOTAL));
        }
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributes, int amplifier) {
        super.removeAttributeModifiers(entity, attributes, amplifier);

        AttributeInstance attackDamage = entity.getAttribute(Attributes.ATTACK_DAMAGE);
        AttributeInstance attackSpeed = entity.getAttribute(Attributes.ATTACK_SPEED);

        if (attackDamage != null) {
            attackDamage.removeModifier(UUID.fromString("0fb52f0a-28de-41e0-8a6d-1433f9db10e9"));
        }

        if (attackSpeed != null) {
            attackSpeed.removeModifier(UUID.fromString("b1d016ec-94f0-43dc-a5cb-925dfbc4f08b"));
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
