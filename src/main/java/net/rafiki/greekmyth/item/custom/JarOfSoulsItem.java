package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.rafiki.greekmyth.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class JarOfSoulsItem extends Item {
    public JarOfSoulsItem(Properties pProperties) {
        super(pProperties);
    }

    public void inventoryTick(ItemStack stack, Level world, LivingEntity entity, int itemSlot, boolean isSelected) {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            ItemStack mainHandItem = player.getMainHandItem();
            ItemStack offHandItem = player.getOffhandItem();

            if (!world.isClientSide) {
                if (offHandItem.getItem() == this && mainHandItem.getItem() == ModItems.BIDENT_OF_HADES.get()) {
                    if (player.hasEffect(MobEffects.HUNGER)) {
                        player.removeEffect(MobEffects.HUNGER);
                    }
                }
            }
        }
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.jar_of_souls_shift"));
        } else if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.jar_of_souls_ctrl"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.jar_of_souls"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
