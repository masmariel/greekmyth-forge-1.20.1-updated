package net.rafiki.greekmyth.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.rafiki.greekmyth.block.ModBlocks;
import net.rafiki.greekmyth.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        //BLOCKS
        this.dropSelf(ModBlocks.ADAMANTINE_BLOCK.get());
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.CELESTIAL_BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.IMPERIAL_GOLD_BLOCK.get());
        this.dropSelf(ModBlocks.STYGIAN_IRON_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());

        //ORES
        this.add(ModBlocks.ADAMANTINE_ORE.get(),
                block -> createOreDrop(ModBlocks.ADAMANTINE_ORE.get(), ModItems.RAW_ADAMANTINE.get()));
        this.add(ModBlocks.NETHER_ADAMANTINE_ORE.get(),
                block -> createOreDrop(ModBlocks.NETHER_ADAMANTINE_ORE.get(), ModItems.RAW_ADAMANTINE.get()));
        this.add(ModBlocks.DEEPSLATE_ADAMANTINE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ADAMANTINE_ORE.get(), ModItems.RAW_ADAMANTINE.get()));
        this.add(ModBlocks.END_STONE_ADAMANTINE_ORE.get(),
                block -> createOreDrop(ModBlocks.END_STONE_ADAMANTINE_ORE.get(), ModItems.RAW_ADAMANTINE.get()));

        //STAIRS
        this.dropSelf(ModBlocks.ADAMANTINE_STAIRS.get());

        //SLABS
        this.add(ModBlocks.ADAMANTINE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ADAMANTINE_SLAB.get()));

        //BUTTON & PRESSURE PLATE
        this.dropSelf(ModBlocks.ADAMANTINE_BUTTON.get());
        this.dropSelf(ModBlocks.ADAMANTINE_PRESSURE_PLATE.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
