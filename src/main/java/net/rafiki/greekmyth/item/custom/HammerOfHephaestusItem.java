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
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.rafiki.greekmyth.client.CaduceusRenderer;
import net.rafiki.greekmyth.client.HammerOfHephaestusRenderer;
import net.rafiki.greekmyth.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class HammerOfHephaestusItem extends SwordItem implements GeoItem {
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);
    private final AnimatableInstanceCache cache = AzureLibUtil.createInstanceCache(this);
    private static final int COOLDOWN_TICKS = 110 * 20;
    public HammerOfHephaestusItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private HammerOfHephaestusRenderer renderer = null;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if (renderer == null)
                    return new HammerOfHephaestusRenderer();
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
            if (itemstack.getDamageValue() < itemstack.getMaxDamage() - 1) {
                long currentTime = world.getGameTime();
                if (player.getCooldowns().isOnCooldown(this)) {
                    return InteractionResultHolder.pass(itemstack);
                }

                double radius = 10.0D;
                List<LivingEntity> entities = world.getEntitiesOfClass(LivingEntity.class, new AABB(
                        player.getX() - radius, player.getY() - radius, player.getZ() - radius,
                        player.getX() + radius, player.getY() + radius, player.getZ() + radius));

                Vec3 lookVec = player.getLookAngle();
                for (LivingEntity nearbyEntity : entities) {
                    if (!(nearbyEntity instanceof Player) && !nearbyEntity.equals(player)) {
                        Vec3 dirVec = nearbyEntity.position().subtract(player.position()).normalize();
                        double dotProduct = lookVec.dot(dirVec);

                        if (dotProduct > Math.cos(Math.toRadians(45))) {
                            nearbyEntity.addEffect(new MobEffectInstance(MobEffects.HARM, 10, 1, false, true, false));
                        }
                    }
                }

                player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);
                itemstack.hurtAndBreak(1, player, (p_220045_0_) -> {
                    p_220045_0_.broadcastBreakEvent(hand);
                });

                if (world instanceof ServerLevel) {
                    ServerLevel serverWorld = (ServerLevel) world;
                    ParticleOptions particle = ParticleTypes.SWEEP_ATTACK;
                    spawnParticles(serverWorld, player, particle, radius);
                    world.playSound(null, player.blockPosition(), ModSounds.HAMMER_OF_HEPHAESTUS.get(), SoundSource.PLAYERS, 0.1F, 1.0F);
                }

                return InteractionResultHolder.success(itemstack);
            }
        }
        return InteractionResultHolder.pass(itemstack);
    }

    private void spawnParticles(ServerLevel serverWorld, Player player, ParticleOptions particle, double radius) {
        Vec3 lookVec = player.getLookAngle();
        for (double x = -radius; x <= radius; x += 1.0D) {
            for (double z = -radius; z <= radius; z += 1.0D) {
                if (x * x + z * z <= radius * radius) {
                    Vec3 dirVec = new Vec3(x, 0, z).normalize();
                    double dotProduct = lookVec.dot(dirVec);

                    if (dotProduct > Math.cos(Math.toRadians(45))) {
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
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity livingEntity){
            livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 1), player);
        }
        return super.onLeftClickEntity(stack, player, entity);
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.hammer_of_hephaestus_shift"));
        } else if (Screen.hasControlDown()){
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.hammer_of_hephaestus_ctrl"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.greekmyth.hammer_of_hephaestus"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
