package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.rafiki.greekmyth.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FluteOfPanItem extends Item {
    private boolean isPlaying = false;
    private int cooldown = 80 * 20;
    public FluteOfPanItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        if (!world.isClientSide()) {
            if (!isMusicPlaying() && !context.getPlayer().getCooldowns().isOnCooldown(this)) {
                toggleMusic(world, context.getPlayer());
                context.getPlayer().getCooldowns().addCooldown(this, cooldown);
                context.getPlayer().addEffect(new MobEffectInstance(MobEffects.LUCK, 400, 0, false, false, false));
            }
        }
        return InteractionResult.SUCCESS;
    }

    private void toggleMusic(Level world, @Nullable LivingEntity entity) {
        if (isPlaying) {
            stopMusic(world);
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

    private void stopMusic(Level world) {

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
