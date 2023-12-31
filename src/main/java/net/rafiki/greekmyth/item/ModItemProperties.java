package net.rafiki.greekmyth.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItemProperties {
    public static void addCustomItemProperties() {

        ItemProperties.register(ModItems.SHIELD_OF_ARES.get(), new ResourceLocation("blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });
        ItemProperties.register(ModItems.AEGIS.get(), new ResourceLocation("blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });
        ItemProperties.register(ModItems.SHIELD_OF_APOLLO.get(), new ResourceLocation("blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.BIDENT_OF_HADES.get(), new ResourceLocation("throwing"), (p_234996_, p_234997_, p_234998_, p_234999_) -> {
            return p_234998_ != null && p_234998_.isUsingItem() && p_234998_.getUseItem() == p_234996_ ? 1.0F : 0.0F;
        });
        ItemProperties.register(ModItems.TRIDENT_OF_OCEANUS.get(), new ResourceLocation("throwing"), (p_234996_, p_234997_, p_234998_, p_234999_) -> {
            return p_234998_ != null && p_234998_.isUsingItem() && p_234998_.getUseItem() == p_234996_ ? 1.0F : 0.0F;
        });
        ItemProperties.register(ModItems.TRIDENT_OF_POSEIDON.get(), new ResourceLocation("throwing"), (p_234996_, p_234997_, p_234998_, p_234999_) -> {
            return p_234998_ != null && p_234998_.isUsingItem() && p_234998_.getUseItem() == p_234996_ ? 1.0F : 0.0F;
        });
        ItemProperties.register(ModItems.TRIDENT_OF_TRITON.get(), new ResourceLocation("throwing"), (p_234996_, p_234997_, p_234998_, p_234999_) -> {
            return p_234998_ != null && p_234998_.isUsingItem() && p_234998_.getUseItem() == p_234996_ ? 1.0F : 0.0F;
        });
        ItemProperties.register(ModItems.SPEAR_OF_DIOMEDES.get(), new ResourceLocation("throwing"), (p_234996_, p_234997_, p_234998_, p_234999_) -> {
            return p_234998_ != null && p_234998_.isUsingItem() && p_234998_.getUseItem() == p_234996_ ? 1.0F : 0.0F;
        });
        ItemProperties.register(ModItems.SPEAR_OF_ACHILLES.get(), new ResourceLocation("throwing"), (p_234996_, p_234997_, p_234998_, p_234999_) -> {
            return p_234998_ != null && p_234998_.isUsingItem() && p_234998_.getUseItem() == p_234996_ ? 1.0F : 0.0F;
        });
        ItemProperties.register(ModItems.SPEAR_OF_ATHENA.get(), new ResourceLocation("throwing"), (p_234996_, p_234997_, p_234998_, p_234999_) -> {
            return p_234998_ != null && p_234998_.isUsingItem() && p_234998_.getUseItem() == p_234996_ ? 1.0F : 0.0F;
        });
        ItemProperties.register(ModItems.THE_MASTER_BOLT.get(), new ResourceLocation("throwing"), (p_234996_, p_234997_, p_234998_, p_234999_) -> {
            return p_234998_ != null && p_234998_.isUsingItem() && p_234998_.getUseItem() == p_234996_ ? 1.0F : 0.0F;
        });

        makeBow(ModItems.BOW_OF_EROS.get());
        makeBowHalfSpeed(ModItems.BOW_OF_APOLLO.get());
        makeBow(ModItems.BOW_OF_HERCULES.get());
    }

    private static void makeBow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
            if (p_174637_ == null) {
                return 0.0F;
            } else {
                return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(item, new ResourceLocation("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
            return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
        });
    }

    private static void makeBowHalfSpeed(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
            if (p_174637_ == null) {
                return 0.0F;
            } else {
                float progress = p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 10.0F;
                return Math.min(progress * 4, 4.0F);
            }
        });
        ItemProperties.register(item, new ResourceLocation("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
            return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
        });
    }
}