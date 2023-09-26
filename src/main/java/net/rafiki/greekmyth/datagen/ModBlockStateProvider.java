package net.rafiki.greekmyth.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GreekMyth.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //BLOCKS
        blockWithItem(ModBlocks.ADAMANTINE_BLOCK);
        blockWithItem(ModBlocks.BRONZE_BLOCK);
        blockWithItem(ModBlocks.CELESTIAL_BRONZE_BLOCK);
        blockWithItem(ModBlocks.IMPERIAL_GOLD_BLOCK);
        blockWithItem(ModBlocks.STYGIAN_IRON_BLOCK);

        //ORES
        blockWithItem(ModBlocks.ADAMANTINE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ADAMANTINE_ORE);
        blockWithItem(ModBlocks.NETHER_ADAMANTINE_ORE);
        blockWithItem(ModBlocks.END_STONE_ADAMANTINE_ORE);

        //CUSTOM BLOCKS
        blockWithItem(ModBlocks.SOUND_BLOCK);

        //STAIRS & SLABS
        stairsBlock((StairBlock) ModBlocks.ADAMANTINE_STAIRS.get(), blockTexture(ModBlocks.ADAMANTINE_BLOCK.get()));
        blockItem(ModBlocks.ADAMANTINE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.ADAMANTINE_SLAB.get()), blockTexture(ModBlocks.ADAMANTINE_BLOCK.get()), blockTexture(ModBlocks.ADAMANTINE_BLOCK.get()));
        blockItem(ModBlocks.ADAMANTINE_SLAB);

        //BUTTON & PRESSURE PLATE
        buttonBlock((ButtonBlock) ModBlocks.ADAMANTINE_BUTTON.get(), blockTexture(ModBlocks.ADAMANTINE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.ADAMANTINE_PRESSURE_PLATE.get(),blockTexture(ModBlocks.ADAMANTINE_BLOCK.get()));
        blockItem(ModBlocks.ADAMANTINE_PRESSURE_PLATE);


    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
     simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("greekmyth:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
