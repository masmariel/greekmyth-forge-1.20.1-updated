package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SpearOfDiomedesItem extends TridentItem {
    public SpearOfDiomedesItem(Properties pProperties) {
        super(pProperties);
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.spear_of_diomedes_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.spear_of_diomedes"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
