package net.rafiki.greekmyth.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class WrathOfZeusEnchantment extends Enchantment {
    protected WrathOfZeusEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        spawnLightning(pAttacker, pTarget, pLevel);
        super.doPostAttack(pAttacker, pTarget, pLevel);
    }

    @Override
    public void doPostHurt(LivingEntity user, Entity attacker, int level) {
        spawnLightning(user, attacker, level);
        super.doPostHurt(user, attacker, level);
    }

    private void spawnLightning(LivingEntity user, Entity target, int enchantmentLevel) {
        if (!user.level().isClientSide) {

            ServerLevel serverLevel = ((ServerLevel) user.level());
            BlockPos position = target.blockPosition();

            for (int i = 0; i < enchantmentLevel; i++) {
                EntityType.LIGHTNING_BOLT.spawn(serverLevel, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);
            }
        }
    }

    public boolean isAllowedOnBooks() {
        return false;
    }

    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return false;
    }

    public boolean isTreasureOnly() {
        return false;
    }

    public boolean isCurse() {
        return false;
    }

    public boolean isTradeable() {
        return false;
    }

    public boolean isDiscoverable() {
        return false;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
