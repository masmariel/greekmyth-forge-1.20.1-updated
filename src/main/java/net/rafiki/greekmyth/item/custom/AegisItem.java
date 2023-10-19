package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.rafiki.greekmyth.effect.ModEffects;

import javax.annotation.Nullable;
import java.util.List;

public class AegisItem extends ShieldItem {

    public AegisItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void onUseTick(Level world, LivingEntity player, ItemStack stack, int count) {
        if (player instanceof Player) {
            Player entityplayer = (Player) player;
            if (entityplayer.isBlocking()) {
                double radius = 7.0D;
                List<LivingEntity> list = world.getEntitiesOfClass(LivingEntity.class, new AABB(
                        player.getX() - radius, player.getY() - radius, player.getZ() - radius,
                        player.getX() + radius, player.getY() + radius, player.getZ() + radius));
                Vec3 lookVec = player.getLookAngle();
                for (LivingEntity livingentity : list) {
                    if (livingentity instanceof Player) {
                        continue;
                    }
                    Vec3 dirVec = livingentity.position().subtract(player.position()).normalize();
                    double dotProduct = lookVec.dot(dirVec);
                    if (dotProduct > Math.cos(Math.toRadians(45))) {
                        livingentity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2, false, true, false));
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel serverWorld = (ServerLevel) world;
                    ParticleOptions particle = ParticleTypes.GLOW_SQUID_INK;
                    spawnParticles(serverWorld, entityplayer, particle, radius);
                }
                if (count % 60 == 0) {
                    stack.hurtAndBreak(1, entityplayer, (p_220045_0_) -> {
                        p_220045_0_.broadcastBreakEvent(entityplayer.getUsedItemHand());
                    });
                }
            }
        }
    }

    private void spawnParticles(ServerLevel serverWorld, Player player, ParticleOptions particle, double radius) {
        new Thread(() -> {
            try {
                Vec3 lookVec = player.getLookAngle();
                for (int i = 0; i < 20; i++) {
                    Thread.sleep(10);

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
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.aegis_shift"));
        } else if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.aegis_ctrl"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.aegis"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

}

