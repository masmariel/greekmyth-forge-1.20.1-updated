package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class BidentOfHadesItem extends TridentItem {

    private static final List<MobEffectInstance> BIDENT_OF_HADES_EFFECTS = Arrays.asList(
            new MobEffectInstance(MobEffects.HUNGER, 200, 1, false, false, false)
    );

    public BidentOfHadesItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity livingEntity){
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 60, 1), player);
        }

        return super.onLeftClickEntity(stack, player, entity);
    }

    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);

        if (pEntity instanceof Player) {
            Player player = (Player) pEntity;
            boolean hasMainHand = player.getMainHandItem() == pStack;
            boolean hasOffhand = player.getOffhandItem() == pStack;

            if (hasMainHand || hasOffhand) {
                player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 200, 1, false, false, false));

            }
        }
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.bident_of_hades_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.bident_of_hades"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

}
