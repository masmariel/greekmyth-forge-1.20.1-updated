package net.rafiki.greekmyth.item.custom;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import mod.azure.azurelib.animatable.GeoItem;
import mod.azure.azurelib.animatable.client.RenderProvider;
import mod.azure.azurelib.core.animatable.instance.AnimatableInstanceCache;
import mod.azure.azurelib.core.animation.AnimatableManager;
import mod.azure.azurelib.core.animation.AnimationController;
import mod.azure.azurelib.core.object.PlayState;
import mod.azure.azurelib.util.AzureLibUtil;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.level.Level;
import net.rafiki.greekmyth.client.AxeOfPerdixRenderer;
import net.rafiki.greekmyth.client.BidentOfHadesRenderer;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BidentOfHadesItem extends TridentItem implements GeoItem {
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);
    private final AnimatableInstanceCache cache = AzureLibUtil.createInstanceCache(this);
    private static final UUID ATTACK_DAMAGE_MODIFIER_UUID = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
    private final double attackDamage;
    public BidentOfHadesItem(Properties properties, double attackDamage) {
        super(properties);
        this.attackDamage = attackDamage;
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private BidentOfHadesRenderer renderer = null;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if (renderer == null)
                    return new BidentOfHadesRenderer();
                return this.renderer;
            }
        });
    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return renderProvider;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controllerName",
                event -> PlayState.CONTINUE));
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

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity livingEntity){
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 60, 1), player);
        }

        return super.onLeftClickEntity(stack, player, entity);
    }

    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);

        if (pEntity instanceof Player) {
            Player player = (Player) pEntity;
            boolean hasMainHand = player.getMainHandItem() == pStack;
            boolean hasOffhand = player.getOffhandItem().getItem() instanceof JarOfSoulsItem;

            if ((hasMainHand || hasOffhand) && !hasOffhand) {
                player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 219, 1, false, true, false));
            }
        }
    }
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.bident_of_hades_shift"));
        } else if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.bident_of_hades_ctrl"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.bident_of_hades"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
