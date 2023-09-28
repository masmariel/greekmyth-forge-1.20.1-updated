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

public class HelmOfDarknessItem extends ArmorItem {
    private static final List<MobEffectInstance> HELM_OF_DARKNESS_EFFECTS = Arrays.asList(
            new MobEffectInstance(MobEffects.INVISIBILITY, 20, 0, false, false, true),
            new MobEffectInstance(MobEffects.BAD_OMEN, 20, 0, false, false, true)
    );

    public HelmOfDarknessItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if (!level.isClientSide()) {
            if (hasHelmetOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private boolean hasHelmetOn(Player player) {
        ItemStack helmet = player.getInventory().getArmor(3);
        return !helmet.isEmpty();
    }

    private void evaluateArmorEffects(Player player) {
        for (MobEffectInstance effect : HELM_OF_DARKNESS_EFFECTS) {
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
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.helm_of_darkness_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.helm_of_darkness"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
