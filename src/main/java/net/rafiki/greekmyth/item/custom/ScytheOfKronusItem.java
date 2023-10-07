package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ScytheOfKronusItem extends SwordItem {
    private static final int COOLDOWN_TICKS = 100 * 20;
    public ScytheOfKronusItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (!world.isClientSide()) {
            if (itemstack.getDamageValue() < itemstack.getMaxDamage() - 1) {
                long currentTime = world.getGameTime();
                if (player.getCooldowns().isOnCooldown(this)) {
                    return InteractionResultHolder.pass(itemstack);
                }

                double radius = 5.0D;
                List<LivingEntity> entities = world.getEntitiesOfClass(LivingEntity.class, new AABB(
                        player.getX() - radius, player.getY() - radius, player.getZ() - radius,
                        player.getX() + radius, player.getY() + radius, player.getZ() + radius));

                for (LivingEntity nearbyEntity : entities) {
                    if (!(nearbyEntity instanceof Player) && !nearbyEntity.equals(player)) {
                        nearbyEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 4, false, true, false));
                    }
                }

                player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);
                itemstack.hurtAndBreak(1, player, (p_220045_0_) -> {
                    p_220045_0_.broadcastBreakEvent(hand);
                });

                if (world instanceof ServerLevel) {
                    ServerLevel serverWorld = (ServerLevel) world;
                    ParticleOptions particle = ParticleTypes.SCULK_CHARGE_POP;
                    spawnParticles(serverWorld, player, particle, radius);
                }

                return InteractionResultHolder.success(itemstack);
            }
        }
        return InteractionResultHolder.pass(itemstack);
    }



    private void spawnParticles(ServerLevel serverWorld, Player player, ParticleOptions particle, double radius) {
        new Thread(() -> {
            try {
                for (int i = 0; i < 60; i++) {
                    Thread.sleep(50);

                    for (double x = -radius; x <= radius; x += 1.0D) {
                        for (double z = -radius; z <= radius; z += 1.0D) {
                            if (x * x + z * z <= radius * radius) {
                                serverWorld.sendParticles(particle,
                                        player.getX() + x,
                                        player.getY(),
                                        player.getZ() + z,
                                        1,
                                        0.0D,
                                        0.0D,
                                        0.0D,
                                        0.0D);
                            }
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity livingEntity){
            livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 0), player);
        }

        return super.onLeftClickEntity(stack, player, entity);
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.scythe_of_kronus_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.scythe_of_kronus"));
        }if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.scythe_of_kronus_ctrl"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
