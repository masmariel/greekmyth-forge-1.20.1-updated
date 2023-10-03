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
    private static final int MAX_DURABILITY = 150;

    public CaduceusItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        Level world = context.getLevel();
        BlockPos targetPos = context.getClickedPos();

        if (player != null && context.getHand() == InteractionHand.MAIN_HAND) {
            ItemStack caduceusStack = player.getItemInHand(context.getHand());
            int durability = getDurability(caduceusStack);

            if (durability > 0) {
                List<Entity> entities = world.getEntities(null, new net.minecraft.world.phys.AABB(targetPos));

                for (Entity entity : entities) {
                    if (entity instanceof LivingEntity) {
                        LivingEntity targetEntity = (LivingEntity) entity;

                        if (!player.getCooldowns().isOnCooldown(this)) {
                            targetEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 0));
                            targetEntity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 1));

                            player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);

                            decreaseDurability(caduceusStack, 1);

                            return InteractionResult.SUCCESS;
                        }
                    }
                }
            }
        }

        return super.useOn(context);
    }

    private int getDurability(ItemStack stack) {
        return MAX_DURABILITY - stack.getDamageValue();
    }

    private void decreaseDurability(ItemStack stack, int amount) {
        stack.setDamageValue(stack.getDamageValue() + amount);
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
