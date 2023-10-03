package net.rafiki.greekmyth.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.rafiki.greekmyth.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LyreOfApolloItem extends Item {
    private boolean isPlaying = false;

    public LyreOfApolloItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        if (!world.isClientSide()) {
            if (!isMusicPlaying()) {
                toggleMusic(world, context.getPlayer());
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
            SoundEvent customSound = ModSounds.LYRE_OF_APOLLO_MELODY.get();
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
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.lyre_of_apollo_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.lyre_of_apollo"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
