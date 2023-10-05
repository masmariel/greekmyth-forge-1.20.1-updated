package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
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

public class LotusStaffOfPersephoneItem extends Item {
    private static final List<MobEffectInstance> LOTUS_STAFF_OF_PERSEPHONE_EFFECTS = Arrays.asList(
            new MobEffectInstance(MobEffects.ABSORPTION, 400, 0, false, false, false)
    );
    private static final int COOLDOWN_TICKS = 80 * 20;

    public LotusStaffOfPersephoneItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();

        if (!level.isClientSide) {
            Player player = pContext.getPlayer();

            if (player != null) {
                if (getDurability(pContext.getItemInHand()) >= 1) {
                    long currentTime = level.getGameTime();

                    if (player.getCooldowns().isOnCooldown(this)) {
                        return InteractionResult.PASS;
                    }

                    for (MobEffectInstance effect : LOTUS_STAFF_OF_PERSEPHONE_EFFECTS) {
                        MobEffectInstance currentEffect = player.getEffect(effect.getEffect());

                        if (currentEffect == null || currentEffect.getDuration() <= 100) {
                            player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 400, 1, false, false, false));

                            player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);

                            decreaseDurability(pContext.getItemInHand(), 1);
                        }
                    }
                }
            }
        }

        return InteractionResult.SUCCESS;
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.lotus_staff_of_persephone_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.lotus_staff_of_persephone"));
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
