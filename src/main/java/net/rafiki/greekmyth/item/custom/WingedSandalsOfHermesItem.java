package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class WingedSandalsOfHermesItem extends ArmorItem {
    private static final List<MobEffectInstance> WINGED_SANDALS_OF_HERMES_EFFECTS = Arrays.asList(
            new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, false, false, true),
            new MobEffectInstance(MobEffects.JUMP, 20, 4, false, false, true),
            new MobEffectInstance(MobEffects.SLOW_FALLING, 20, 0, false, false, true)
    );

    public WingedSandalsOfHermesItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if (!level.isClientSide()) {
            if (hasBootsOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private boolean hasBootsOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        return !boots.isEmpty();
    }

    private void evaluateArmorEffects(Player player) {
        for (MobEffectInstance effect : WINGED_SANDALS_OF_HERMES_EFFECTS) {
            addEffectToPlayer(player, effect);
        }
    }

    private void addEffectToPlayer(Player player, MobEffectInstance effect) {
        boolean hasPlayerEffect = player.hasEffect(effect.getEffect());

        if (!hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(effect));
        }
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.winged_sandals_of_hermes_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.winged_sandals_of_hermes_ares"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
