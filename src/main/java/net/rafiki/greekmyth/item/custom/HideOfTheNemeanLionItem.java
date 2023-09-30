package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class HideOfTheNemeanLionItem extends ArmorItem {

    private static final List<MobEffectInstance> HIDE_OF_THE_NEMEAN_LION_EFFECTS = Arrays.asList(
            new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 0, false, false, false)
    );

    public HideOfTheNemeanLionItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        if (!pLevel.isClientSide && pSlotId == 2 && pEntity instanceof Player) {
            Player player = (Player) pEntity;

            for (MobEffectInstance effect : HIDE_OF_THE_NEMEAN_LION_EFFECTS) {
                MobEffectInstance currentEffect = player.getEffect(effect.getEffect());

                if (currentEffect == null || currentEffect.getDuration() <= 100) {
                    player.addEffect(new MobEffectInstance(effect.getEffect(), 200, 0, false, false, false));
                }
            }
        }

        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.hide_of_the_nemean_lion_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.hide_of_the_nemean_lion"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

}
