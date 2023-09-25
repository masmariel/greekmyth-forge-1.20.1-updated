package net.rafiki.greekmyth.item.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.Vec3;

import java.util.Random;

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
            stopMusic(world, entity);
        } else {
            playRandomMusicDisc(world, entity);
        }
        isPlaying = !isPlaying; // Toggle the music on and off
    }

    private void playRandomMusicDisc(Level world, LivingEntity entity) {
        // Create a list of music discs you want to include.
        SoundEvent[] musicDiscs = {
                SoundEvents.MUSIC_DISC_CAT,
                SoundEvents.MUSIC_DISC_BLOCKS,
                SoundEvents.MUSIC_DISC_CHIRP, // Example: Additional music disc
                SoundEvents.MUSIC_DISC_FAR,   // Example: Additional music disc
                // Add more music discs as needed
        };

        // Generate a random index to select a music disc from the list.
        Random random = new Random();
        int randomIndex = random.nextInt(musicDiscs.length);

        // Play the selected music disc at the entity's location.
        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), musicDiscs[randomIndex], entity.getSoundSource(), 1.0F, 1.0F);
    }

    private void stopMusic(Level world, LivingEntity entity) {
        // Stop the music (you may need to implement this depending on your mod's audio system)
        // For example, you could stop the sound associated with the LyreOfApolloItem.
    }
}
