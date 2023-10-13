package net.rafiki.greekmyth.item.custom;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import mod.azure.azurelib.animatable.GeoItem;
import mod.azure.azurelib.animatable.client.RenderProvider;
import mod.azure.azurelib.core.animatable.instance.AnimatableInstanceCache;
import mod.azure.azurelib.core.animation.AnimatableManager;
import mod.azure.azurelib.core.animation.AnimationController;
import mod.azure.azurelib.core.animation.RawAnimation;
import mod.azure.azurelib.core.object.PlayState;
import mod.azure.azurelib.util.AzureLibUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.rafiki.greekmyth.client.AolusRenderer;
import net.rafiki.greekmyth.client.DrakonBoneWingsRenderer;
import net.rafiki.greekmyth.client.WingsOfIcarusRenderer;
import net.rafiki.greekmyth.item.ModItems;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.caelus.api.CaelusApi;

import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class WingsOfIcarusItem extends ArmorItem implements GeoItem {
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);
    private final AnimatableInstanceCache cache = AzureLibUtil.createInstanceCache(this);

    public WingsOfIcarusItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private WingsOfIcarusRenderer renderer = null;

            @Override
            public HumanoidModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<LivingEntity> original) {
                if (renderer == null)
                    renderer = new WingsOfIcarusRenderer();
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
        controllers.add(new AnimationController<>(this, "controllerName", 0, event -> {
            Player player = Minecraft.getInstance().player;
            if (player != null && player.isFallFlying() && isPlayerWearingItem(player)) {
                return event.setAndContinue(RawAnimation.begin().thenLoop("animation.flying"));
            } else {
                return event.setAndContinue(RawAnimation.begin().thenLoop("animation.idle"));
            }
        }));
    }

    private boolean isPlayerWearingItem(Player player) {
        return player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.WINGS_OF_ICARUS.get();
    }


    @Override
    public Supplier<Object> getRenderProvider() {
        return renderProvider;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> attributeModifiers = HashMultimap.create();
        attributeModifiers.putAll(super.getAttributeModifiers(equipmentSlot, stack));
        if (equipmentSlot == EquipmentSlot.CHEST) {
            attributeModifiers.put(CaelusApi.getInstance().getFlightAttribute(), new AttributeModifier(UUID.randomUUID(), "Elytra flight", 1.0, AttributeModifier.Operation.ADDITION));
        }
        return attributeModifiers;
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.wings_of_icarus_shift"));
        } else if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.wings_of_icarus_ctrl"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.wings_of_icarus"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
