package net.rafiki.greekmyth.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.rafiki.greekmyth.enchantment.ModEnchantments;
import org.jetbrains.annotations.NotNull;

public class ThrownMasterBoltEntity extends ThrownTrident {
    private Level level;

    public ThrownMasterBoltEntity(EntityType<? extends ThrownTrident> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ThrownMasterBoltEntity(Level pLevel, LivingEntity pOwner, ItemStack pStack) {
        super(pLevel, pOwner, pStack);
    }


    @Override
    protected void onHit(@NotNull HitResult hitResult) {
        super.onHit(hitResult);
        if (hitResult.getType() == HitResult.Type.ENTITY) {
            Entity hitEntity = ((EntityHitResult)hitResult).getEntity();
            if (hitEntity instanceof LivingEntity target) {
                int level = EnchantmentHelper.getItemEnchantmentLevel(ModEnchantments.WRATH_OF_ZEUS.get(), this.getPickupItem());
                if (level > 0 && !this.level.isClientSide) {
                    BlockPos pos = target.blockPosition();
                    for (int i = 0; i < level; i++) {
                        EntityType.LIGHTNING_BOLT.spawn((ServerLevel) this.level, (ItemStack) null, null, pos,
                                MobSpawnType.TRIGGERED, true, true);
                    }
                }
            }
        }
    }

}