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

public class HelmOfDarknessItem extends ArmorItem {
    private static final List<MobEffectInstance> HELM_OF_DARKNESS_EFFECTS = Arrays.asList(
            new MobEffectInstance(MobEffects.INVISIBILITY, 200, 0, false, false, false),
            new MobEffectInstance(MobEffects.BAD_OMEN, 200, 0, false, false, false)
    );

    public HelmOfDarknessItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        if (!pLevel.isClientSide && pSlotId == 3 && pEntity instanceof Player) {
            Player player = (Player) pEntity;

            for (MobEffectInstance effect : HELM_OF_DARKNESS_EFFECTS) {
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
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.helm_of_darkness_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.helm_of_darkness"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
