package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class GoldenFleeceItem extends Item {
    private static final List<MobEffectInstance> GOLDEN_FLEECE_EFFECTS = Arrays.asList(
            new MobEffectInstance(MobEffects.REGENERATION, 200, 0, false, true, false)
    );
    private static final int COOLDOWN_TICKS = 60 * 20;
    public GoldenFleeceItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (!world.isClientSide()) {
            if (getDurability(itemstack) >= 1) {
                long currentTime = world.getGameTime();
                if (player.getCooldowns().isOnCooldown(this)) {
                    return InteractionResultHolder.pass(itemstack);
                }
                for (MobEffectInstance effect : GOLDEN_FLEECE_EFFECTS) {
                    MobEffectInstance currentEffect = player.getEffect(effect.getEffect());
                    if (currentEffect == null || currentEffect.getDuration() <= 100) {
                        player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 0, false, true, false));
                        player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);
                        decreaseDurability(itemstack, 1);
                    }
                }
                return InteractionResultHolder.success(itemstack);
            }
        }
        return InteractionResultHolder.pass(itemstack);
    }


    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.golden_fleece_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.golden_fleece"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    private int getDurability(ItemStack stack) {
        return stack.getMaxDamage() - stack.getDamageValue();
    }

    private void decreaseDurability(ItemStack stack, int amount) {
        stack.setDamageValue(stack.getDamageValue() + amount);
    }
}
