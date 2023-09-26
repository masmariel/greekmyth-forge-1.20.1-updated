package net.rafiki.greekmyth.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.rafiki.greekmyth.GreekMyth;

public class ModTags {
    public static class Items{
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(GreekMyth.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks{
        /* Example
            public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        */

        public static final TagKey<Block> NEEDS_STYGIAN_IRON_TOOL = tag("needs_stygian_iron_tool");
        public static final TagKey<Block> NEEDS_ADAMANTINE_TOOL = tag("needs_adamantine_tool");
        public static final TagKey<Block> NEEDS_IMPERIAL_GOLD_TOOL = tag("needs_imperial_gold_tool");
        public static final TagKey<Block> NEEDS_CELESTIAL_BRONZE_TOOL = tag("needs_celestial_bronze_tool");
        public static final TagKey<Block> NEEDS_BRONZE_TOOL = tag("needs_bronze_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(GreekMyth.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
