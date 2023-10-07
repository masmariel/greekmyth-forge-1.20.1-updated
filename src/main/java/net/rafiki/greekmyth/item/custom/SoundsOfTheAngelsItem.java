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

public class SoundsOfTheAngelsItem extends Item {
    private boolean isPlaying = false;

    public SoundsOfTheAngelsItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (!world.isClientSide()) {
            if (!isMusicPlaying() && !player.getCooldowns().isOnCooldown(this)) {
                toggleMusic(world, player);
            }
        }
        return InteractionResultHolder.success(itemstack);
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
            SoundEvent customSound = ModSounds.GODLY_VOCALS.get();
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), customSound, entity.getSoundSource(), 1.0F, 1.0F);
        }
    }

    private boolean isMusicPlaying() {
        return isPlaying;
    }
}

