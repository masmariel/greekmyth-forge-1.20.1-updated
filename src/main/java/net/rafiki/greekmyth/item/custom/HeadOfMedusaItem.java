package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.rafiki.greekmyth.effect.ModEffects;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class HeadOfMedusaItem extends Item {
    private static final int COOLDOWN_TICKS = 150 * 20;
    public HeadOfMedusaItem(Properties pProperties) {
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

                double radius = 10.0D;
                List<LivingEntity> entities = world.getEntitiesOfClass(LivingEntity.class, new AABB(
                        player.getX() - radius, player.getY() - radius, player.getZ() - radius,
                        player.getX() + radius, player.getY() + radius, player.getZ() + radius));

                Vec3 lookVec = player.getLookAngle();
                for (LivingEntity entity : entities) {
                    if (entity.equals(player)) continue;

                    Vec3 dirVec = entity.position().subtract(player.position()).normalize();
                    double dotProduct = lookVec.dot(dirVec);

                    if (dotProduct > Math.cos(Math.toRadians(45))) {
                        entity.addEffect(new MobEffectInstance(ModEffects.STONE_GAZE.get(), 100, 0, false, true, false));
                    }
                }

                player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);
                decreaseDurability(itemstack, 1);

                if (world instanceof ServerLevel) {
                    ServerLevel serverWorld = (ServerLevel) world;
                    ParticleOptions particle = ParticleTypes.GLOW_SQUID_INK;
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
                Vec3 lookVec = player.getLookAngle();
                for (int i = 0; i < 60; i++) {
                    Thread.sleep(50);

                    for (double x = -radius; x <= radius; x += 1.0D) {
                        for (double z = -radius; z <= radius; z += 1.0D) {
                            if (x * x + z * z <= radius * radius) {
                                Vec3 dirVec = new Vec3(x, 0, z).normalize();
                                double dotProduct = lookVec.dot(dirVec);

                                if (dotProduct > Math.cos(Math.toRadians(45))) {
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
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }



    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.head_of_medusa_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.head_of_medusa"));
        }if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.head_of_medusa_ctrl"));
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
