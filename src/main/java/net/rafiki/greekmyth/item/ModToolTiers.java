package net.rafiki.greekmyth.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.util.ModTags;

import java.util.List;

    public class ModToolTiers {
        public static final Tier STYGIAN_IRON = TierSortingRegistry.registerTier(
                new ForgeTier(5, 2100, 9f, 4.5f, 17,
                        ModTags.Blocks.NEEDS_STYGIAN_IRON_TOOL, () -> Ingredient.of(ModItems.STYGIAN_IRON_INGOT.get())),
                new ResourceLocation(GreekMyth.MOD_ID, "stygian_iron"), List.of(Tiers.NETHERITE), List.of());
        public static final Tier ADAMANTINE = TierSortingRegistry.registerTier(
                new ForgeTier(4, 1700, 8f, 3.5f, 12,
                        ModTags.Blocks.NEEDS_ADAMANTINE_TOOL, () -> Ingredient.of(ModItems.ADAMANTINE.get())),
                new ResourceLocation(GreekMyth.MOD_ID, "adamantine"), List.of(Tiers.DIAMOND), List.of());
        public static final Tier IMPERIAL_GOLD = TierSortingRegistry.registerTier(
                new ForgeTier(1, 50, 12.5f, 2.75f, 26,
                        ModTags.Blocks.NEEDS_IMPERIAL_GOLD_TOOL, () -> Ingredient.of(ModItems.IMPERIAL_GOLD_INGOT.get())),
                new ResourceLocation(GreekMyth.MOD_ID, "imperial_gold"), List.of(Tiers.IRON), List.of());
        public static final Tier CELESTIAL_BRONZE = TierSortingRegistry.registerTier(
                new ForgeTier(3, 450, 7f, 2.5f, 15,
                        ModTags.Blocks.NEEDS_CELESTIAL_BRONZE_TOOL, () -> Ingredient.of(ModItems.CELESTIAL_BRONZE_INGOT.get())),
                new ResourceLocation(GreekMyth.MOD_ID, "celestial_bronze"), List.of(Tiers.IRON), List.of());
        public static final Tier BRONZE = TierSortingRegistry.registerTier(
                new ForgeTier(2, 300, 6f, 2.25f, 15,
                        ModTags.Blocks.NEEDS_BRONZE_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
                new ResourceLocation(GreekMyth.MOD_ID, "bronze"), List.of(Tiers.IRON), List.of());
    }

