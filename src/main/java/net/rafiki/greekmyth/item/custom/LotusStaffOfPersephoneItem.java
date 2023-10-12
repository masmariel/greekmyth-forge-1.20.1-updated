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
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.rafiki.greekmyth.client.HarpeOfPerseusRenderer;
import net.rafiki.greekmyth.client.LotusStaffOfPersephoneRenderer;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LotusStaffOfPersephoneItem extends Item implements GeoItem {
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);
    private final AnimatableInstanceCache cache = AzureLibUtil.createInstanceCache(this);
    private static final int COOLDOWN_TICKS = 120 * 20;
    public LotusStaffOfPersephoneItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private LotusStaffOfPersephoneRenderer renderer = null;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if (renderer == null)
                    return new LotusStaffOfPersephoneRenderer();
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
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (!world.isClientSide()) {
            if (getDurability(itemstack) >= 1) {
                long currentTime = world.getGameTime();
                if (player.getCooldowns().isOnCooldown(this)) {
                    return InteractionResultHolder.pass(itemstack);
                }

                double radius = 10.0D;
                List<Player> players = world.getEntitiesOfClass(Player.class, new AABB(
                        player.getX() - radius, player.getY() - radius, player.getZ() - radius,
                        player.getX() + radius, player.getY() + radius, player.getZ() + radius));

                for (Player nearbyPlayer : players) {
                        nearbyPlayer.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 500, 1, false, true, false));
                }

                player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);
                decreaseDurability(itemstack, 1);

                if (world instanceof ServerLevel) {
                    ServerLevel serverWorld = (ServerLevel) world;
                    ParticleOptions particle = ParticleTypes.CHERRY_LEAVES;
                    spawnParticles(serverWorld, player, particle, radius);
                }

                return InteractionResultHolder.success(itemstack);
            }
        }
        return InteractionResultHolder.pass(itemstack);
    }

    private void spawnParticles(ServerLevel serverWorld, Player player, ParticleOptions particle, double radius) {
        new Thread(() -> {
            try {
                for (int i = 0; i < 50; i++) {
                    Thread.sleep(40);

                    for (double x = -radius; x <= radius; x += 1.0D) {
                        for (double z = -radius; z <= radius; z += 1.0D) {
                            if (x * x + z * z <= radius * radius) {
                                serverWorld.sendParticles(particle,
                                        player.getX() + x,
                                        player.getY(),
                                        player.getZ() + z,
                                        1,
                                        0.0D,
                                        0.0D,
                                        0.0D,
                                        0.0D);
                            }
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.lotus_staff_of_persephone_shift"));
        } else if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.lotus_staff_of_persephone_ctrl"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.lotus_staff_of_persephone"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }


    private int getDurability(ItemStack stack) {
        return stack.getMaxDamage() - stack.getDamageValue();
    }

    private void decreaseDurability(ItemStack stack, int amount) {
        stack.setDamageValue(stack.getDamageValue() + amount);
    }
}
