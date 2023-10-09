package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ThrysusItem extends Item {

    private static final int COOLDOWN_TICKS = 60 * 20;

    public ThrysusItem(Properties pProperties) {
        super(pProperties);
        int defaultDurability = 150;
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity livingEntity) {
            if (!player.getCooldowns().isOnCooldown(this)) {
                livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 219, 1), player);
                stack.hurtAndBreak(1, player, (player1) -> {
                    player1.broadcastBreakEvent(player.getUsedItemHand());
                });
                player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);
                return true;
            }
        }
        return false;
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.thrysus_shift"));
        } else if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.thrysus_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.thrysus"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
