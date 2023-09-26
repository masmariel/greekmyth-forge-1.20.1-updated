package net.rafiki.greekmyth.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.block.ModBlocks;
import net.rafiki.greekmyth.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, GreekMyth.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        /* EXAMPLE
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUES)
                .add(ModBlocks.ADAMANTINE_ORE.get()).addTag(Tags.Blocks.ORES);
        */

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(ModBlocks.ADAMANTINE_BLOCK.get(),
                    ModBlocks.BRONZE_BLOCK.get(),
                    ModBlocks.CELESTIAL_BRONZE_BLOCK.get(),
                    ModBlocks.IMPERIAL_GOLD_BLOCK.get(),
                    ModBlocks.STYGIAN_IRON_BLOCK.get(),
                    ModBlocks.ADAMANTINE_ORE.get(),
                    ModBlocks.END_STONE_ADAMANTINE_ORE.get(),
                    ModBlocks.NETHER_ADAMANTINE_ORE.get(),
                    ModBlocks.DEEPSLATE_ADAMANTINE_ORE.get(),
                    ModBlocks.SOUND_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.ADAMANTINE_ORE.get(),
                    ModBlocks.END_STONE_ADAMANTINE_ORE.get(),
                    ModBlocks.NETHER_ADAMANTINE_ORE.get(),
                    ModBlocks.DEEPSLATE_ADAMANTINE_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.ADAMANTINE_BLOCK.get(),
                    ModBlocks.BRONZE_BLOCK.get(),
                    ModBlocks.CELESTIAL_BRONZE_BLOCK.get(),
                    ModBlocks.IMPERIAL_GOLD_BLOCK.get(),
                    ModBlocks.STYGIAN_IRON_BLOCK.get());


    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
