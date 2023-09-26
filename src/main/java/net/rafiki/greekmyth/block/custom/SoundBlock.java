package net.rafiki.greekmyth.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.rafiki.greekmyth.sound.ModSounds;

public class SoundBlock extends Block {
    public SoundBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pLevel.isClientSide && pHand == InteractionHand.MAIN_HAND) {
          if (pPlayer.isCrouching()) {
              pLevel.playSound(null, pPos, ModSounds.BEN.get(), SoundSource.BLOCKS, 1, 1);
              return InteractionResult.SUCCESS;
          } else {
              pLevel.playSound(null, pPos, ModSounds.MASON.get(), SoundSource.BLOCKS, 1, 1);
              return InteractionResult.CONSUME;
          }
        }

        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        pLevel.playSound(pEntity, pPos, ModSounds.GINGER.get(), SoundSource.BLOCKS, 1, 1);
        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
