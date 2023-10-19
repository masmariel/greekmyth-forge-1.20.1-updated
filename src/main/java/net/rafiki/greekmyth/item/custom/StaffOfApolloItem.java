package net.rafiki.greekmyth.item.custom;

import mod.azure.azurelib.animatable.GeoItem;
import mod.azure.azurelib.animatable.client.RenderProvider;
import mod.azure.azurelib.core.animatable.instance.AnimatableInstanceCache;
import mod.azure.azurelib.core.animation.AnimatableManager;
import mod.azure.azurelib.core.animation.AnimationController;
import mod.azure.azurelib.core.animation.RawAnimation;
import mod.azure.azurelib.core.object.PlayState;
import mod.azure.azurelib.util.AzureLibUtil;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.rafiki.greekmyth.client.ChaliceOfNyxRenderer;
import net.rafiki.greekmyth.client.StaffOfApolloRenderer;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class StaffOfApolloItem extends Item implements GeoItem {
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);
    private final AnimatableInstanceCache cache = AzureLibUtil.createInstanceCache(this);

    public StaffOfApolloItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private StaffOfApolloRenderer renderer = null;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if (renderer == null)
                    return new StaffOfApolloRenderer();
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

    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controllerName",
                event ->
                {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.idle"));
                }));
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.staff_of_apollo_shift"));
        } else if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.staff_of_apollo_ctrl"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.staff_of_apollo"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
