package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CornucopiaItem extends Item {
    public CornucopiaItem(Properties settings) {
        super(settings.defaultDurability(300).food(new FoodProperties.Builder().nutrition(12).saturationMod(10).build()));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (player.canEat(false)) {
            player.startUsingItem(hand);
            return InteractionResultHolder.success(itemStack);
        } else {
            return InteractionResultHolder.fail(itemStack);
        }
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity user) {
        if (user instanceof Player) {
            Player player = (Player) user;
            player.getCooldowns().addCooldown(this, 60 * 20);
            stack.hurtAndBreak(1, user, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(user.getUsedItemHand());
            });
            if (!world.isClientSide && this.getFoodProperties() != null && player.canEat(false)) {
                player.getFoodData().eat(this.getFoodProperties().getNutrition(), this.getFoodProperties().getSaturationModifier());
            }
        }
        return stack;
    }




    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.cornucopia_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.cornucopia"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
