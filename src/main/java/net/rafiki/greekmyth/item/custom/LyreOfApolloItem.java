package net.rafiki.greekmyth.item.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.Vec3;
import net.rafiki.greekmyth.sound.ModSounds; // Import your custom sound events class


public class LyreOfApolloItem extends Item {
    private boolean isPlaying = false; // Flag to track if music is currently playing

    public LyreOfApolloItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult onItemUseFirst(ItemStack stack, UseOnContext context) {
        Level world = context.getLevel();
        if (!world.isClientSide) {
            if (isRightClick(context)) {
                toggleMusic(world, context.getPlayer());
            }
        }
        return InteractionResult.SUCCESS;
    }

    private boolean isRightClick(UseOnContext context) {
        // Check if it's a right-click based on the click location
        Vec3 clickLocation = context.getClickLocation();
        Direction direction = context.getClickedFace();

        // You can adjust the conditions here based on where you want the right-click to be detected.
        // This example checks if the player clicked on the top face of a block.
        return clickLocation != null && direction != null && direction == Direction.UP;
    }

    private void toggleMusic(Level world, LivingEntity entity) {
        if (isPlaying) {
            stopMusic();
        } else {
            playCustomSound(world, entity); // Play your custom sound
        }
        isPlaying = !isPlaying; // Toggle the music on and off
    }

    private void playCustomSound(Level world, LivingEntity entity) {
        // Play your custom sound event at the entity's location.
        SoundEvent customSound = ModSounds.LYRE_OF_APOLLO_MELODY.get(); // Use the correct reference
        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), customSound, entity.getSoundSource(), 1.0F, 1.0F);
    }

    private void stopMusic() {
        // Stop the music by playing a silent sound or using your mod's audio system.
        // For example, you can play a silent sound event to stop the music:
    }
}