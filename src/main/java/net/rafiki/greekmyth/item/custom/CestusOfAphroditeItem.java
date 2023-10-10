package net.rafiki.greekmyth.item.custom;

import mod.azure.azurelib.animatable.GeoItem;
import mod.azure.azurelib.animatable.client.RenderProvider;
import mod.azure.azurelib.core.animatable.instance.AnimatableInstanceCache;
import mod.azure.azurelib.core.animation.AnimatableManager;
import mod.azure.azurelib.core.animation.AnimationController;
import mod.azure.azurelib.core.animation.RawAnimation;
import mod.azure.azurelib.util.AzureLibUtil;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.rafiki.greekmyth.client.CestusOfAphroditeRenderer;
import net.rafiki.greekmyth.client.GirdleOfHippolytaRenderer;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CestusOfAphroditeItem extends ArmorItem implements GeoItem {
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);
    private final AnimatableInstanceCache cache = AzureLibUtil.createInstanceCache(this);
    public CestusOfAphroditeItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private CestusOfAphroditeRenderer renderer = null;

            @Override
            public HumanoidModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<LivingEntity> original) {
                if (renderer == null)
                    renderer = new CestusOfAphroditeRenderer();
                renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                return this.renderer;
            }
        });
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controllerName", 0, event ->
        {
            return event.setAndContinue(RawAnimation.begin().thenLoop("animation.idle"));
        }));
    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return renderProvider;
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        Player player = (Player) pEntity;
        if (!pLevel.isClientSide && player.getInventory().armor.get(1) == pStack && pEntity instanceof Player) {
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 219, 0, false, true, false));
        }
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.cestus_of_aphrodite_shift"));
        } else if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.cestus_of_aphrodite_ctrl"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.cestus_of_aphrodite"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
