package net.rafiki.greekmyth.item.custom;

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
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.rafiki.greekmyth.client.ThrysusRenderer;
import net.rafiki.greekmyth.client.TridentOfPoseidonRenderer;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ThrysusItem extends Item implements GeoItem {
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);
    private final AnimatableInstanceCache cache = AzureLibUtil.createInstanceCache(this);
    private static final int COOLDOWN_TICKS = 60 * 20;

    public ThrysusItem(Properties pProperties) {
        super(pProperties);
        int defaultDurability = 150;
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private ThrysusRenderer renderer = null;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if (renderer == null)
                    return new ThrysusRenderer();
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
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity livingEntity) {
            if (!player.getCooldowns().isOnCooldown(this)) {
                livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 219, 1), player);
                stack.hurtAndBreak(1, player, (player1) -> {
                    player1.broadcastBreakEvent(player.getUsedItemHand());
                });
                player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);
                return true;
            }
        }
        return false;
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.thrysus_shift"));
        } else if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.thrysus_ctrl"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.thrysus"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
