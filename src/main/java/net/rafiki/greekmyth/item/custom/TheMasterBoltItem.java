package net.rafiki.greekmyth.item.custom;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.rafiki.greekmyth.enchantment.ModEnchantments;
import net.rafiki.greekmyth.entity.ThrownMasterBoltEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public class TheMasterBoltItem extends TridentItem {
    private static final UUID ATTACK_DAMAGE_MODIFIER_UUID = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
    private final double attackDamage;
    public TheMasterBoltItem(Properties properties, double attackDamage) {
        super(properties);
        this.attackDamage = attackDamage;
    }

    @Override
    public void inventoryTick(@NotNull ItemStack pStack, @NotNull Level pLevel, @NotNull Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);

        if (pEntity instanceof Player player) {
            boolean hasMainHand = player.getMainHandItem() == pStack;
            boolean hasOffhand = player.getOffhandItem() == pStack;

            if (hasMainHand || hasOffhand) {
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 0, false, true, false));
            }
        }
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> attributeModifiers = HashMultimap.create();
        if (equipmentSlot == EquipmentSlot.MAINHAND) {
            attributeModifiers.putAll(super.getAttributeModifiers(equipmentSlot, stack));
            attributeModifiers.removeAll(Attributes.ATTACK_DAMAGE);
            attributeModifiers.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ATTACK_DAMAGE_MODIFIER_UUID, "Weapon modifier", this.attackDamage, AttributeModifier.Operation.ADDITION));
        }
        return attributeModifiers;
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.the_master_bolt_shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.the_master_bolt"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    @Override
    public void releaseUsing(@NotNull ItemStack stack, Level worldIn, @NotNull LivingEntity playerIn, int timeLeft) {
        if (!worldIn.isClientSide && timeLeft >= 10) {
            if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.LOYALTY, stack) == 0) {
                stack.enchant(Enchantments.LOYALTY, 3);
            }
            if (EnchantmentHelper.getItemEnchantmentLevel(ModEnchantments.WRATH_OF_ZEUS.get(), stack) == 0) {
                stack.enchant(ModEnchantments.WRATH_OF_ZEUS.get(), 3);
            }
            super.releaseUsing(stack, worldIn, playerIn, timeLeft);
        }
    }

    protected ThrownTrident newProjectile(LivingEntity shooter, Level world, ItemStack stack) {
        return new ThrownMasterBoltEntity(world, shooter, stack);
    }
}
