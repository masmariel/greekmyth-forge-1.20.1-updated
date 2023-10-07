package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ChaliceOfNyxItem extends Item {
    private static final int COOLDOWN_TICKS = 70 * 20;
    public ChaliceOfNyxItem(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack stack = pPlayer.getItemInHand(pUsedHand);
        if (!pPlayer.getCooldowns().isOnCooldown(this)) {
            pPlayer.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 200, 0, false, true, false));
            stack.hurtAndBreak(1, pPlayer, (player1) -> {
                player1.broadcastBreakEvent(pUsedHand);
            });
            pPlayer.getCooldowns().addCooldown(this, COOLDOWN_TICKS);
            return InteractionResultHolder.success(stack);
        }
        return InteractionResultHolder.pass(stack);
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.chalice_of_nyx_shift"));
        } else if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.chalice_of_nyx_ctrl"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.chalice_of_nyx"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
