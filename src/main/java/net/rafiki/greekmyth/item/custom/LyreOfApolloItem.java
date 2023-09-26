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
import net.rafiki.greekmyth.sound.ModSounds; // Import your custom sound events class
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LyreOfApolloItem extends Item {
    private boolean isPlaying = false; // Flag to track if music is currently playing

    public LyreOfApolloItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        if (!world.isClientSide()) {
            toggleMusic(world, context.getPlayer());
        }
        return InteractionResult.SUCCESS;
    }

    private void toggleMusic(Level world, @Nullable LivingEntity entity) {
        if (isPlaying) {
            stopMusic();
        } else {
            playCustomSound(world, entity); // Play your custom sound
        }
        isPlaying = !isPlaying; // Toggle the music on and off
    }

    private void playCustomSound(Level world, @Nullable LivingEntity entity) {
        if (entity != null) {
            // Play your custom sound event at the entity's location.
            SoundEvent customSound = ModSounds.LYRE_OF_APOLLO_MELODY.get(); // Use the correct reference
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), customSound, entity.getSoundSource(), 1.0F, 1.0F);
        }
    }

    private void stopMusic() {
        // Stop the music by playing a silent sound or using your mod's audio system.
        // For example, you can play a silent sound event to stop the music:
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
