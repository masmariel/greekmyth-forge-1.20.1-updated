package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.rafiki.greekmyth.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FluteOfPanItem extends Item {
    private boolean isPlaying = false;
    private int COOLDOWN_TICKS = 120 * 20;

    public FluteOfPanItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (!world.isClientSide()) {
            if (!isMusicPlaying() && !player.getCooldowns().isOnCooldown(this)) {
                toggleMusic(world, player);
                player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);

                double radius = 10.0D;

                List<Player> players = world.getEntitiesOfClass(Player.class, new AABB(
                        player.getX() - radius, player.getY() - radius, player.getZ() - radius,
                        player.getX() + radius, player.getY() + radius, player.getZ() + radius));

                for (Player nearbyPlayer : players) {
                    nearbyPlayer.addEffect(new MobEffectInstance(MobEffects.LUCK, 600, 2, false, true, false));
                }

                if (world instanceof ServerLevel) {
                    ServerLevel serverWorld = (ServerLevel) world;
                    ParticleOptions particle = ParticleTypes.HAPPY_VILLAGER;
                    spawnParticles(serverWorld, player, particle, radius);
                }
            }
        }
        return InteractionResultHolder.success(itemstack);
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
    public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected) {
        if (!world.isClientSide()) {
            if (isPlaying && !((Player) entity).getCooldowns().isOnCooldown(this)) {
                isPlaying = false;
            }
        }
        super.inventoryTick(stack, world, entity, itemSlot, isSelected);
    }


    private void toggleMusic(Level world, @Nullable LivingEntity entity) {
        if (isPlaying) {
        } else {
            playCustomSound(world, entity);
        }
        isPlaying = !isPlaying;
    }

    private void playCustomSound(Level world, @Nullable LivingEntity entity) {
        if (entity != null) {
            SoundEvent customSound = ModSounds.FLUTE_OF_PAN.get();
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), customSound, entity.getSoundSource(), 1.0F, 1.0F);
        }
    }


    private boolean isMusicPlaying() {
        return isPlaying;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.flute_of_pan_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.flute_of_pan"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}

