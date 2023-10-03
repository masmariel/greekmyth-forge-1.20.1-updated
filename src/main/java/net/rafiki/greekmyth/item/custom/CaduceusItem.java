package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.rafiki.greekmyth.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CaduceusItem extends Item {
    private static final int COOLDOWN_TICKS = 50 * 20;

    public CaduceusItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity livingEntity){
            if (!player.getCooldowns().isOnCooldown(this)) {
                livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), player);
                livingEntity.heal(6.0F);
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
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.caduceus_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.caduceus"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

}