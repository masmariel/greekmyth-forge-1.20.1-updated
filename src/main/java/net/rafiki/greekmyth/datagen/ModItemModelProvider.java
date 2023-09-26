package net.rafiki.greekmyth.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.block.ModBlocks;
import net.rafiki.greekmyth.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GreekMyth.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //ORES & INGOTS
        simpleItem(ModItems.ADAMANTINE);
        simpleItem(ModItems.RAW_ADAMANTINE);
        simpleItem(ModItems.BRONZE_INGOT);
        simpleItem(ModItems.CELESTIAL_BRONZE_INGOT);
        simpleItem(ModItems.IMPERIAL_GOLD_INGOT);
        simpleItem(ModItems.STYGIAN_IRON_INGOT);

        //ESSENCE
        simpleItem(ModItems.ESSENCE_OF_TARTARUS);
        simpleItem(ModItems.GODLY_ESSENCE);

        //FOOD
        simpleItem(ModItems.AMBROSIA);

        //FUEL
        simpleItem(ModItems.FORGE_COAL);

        //CUSTOM ITEMS
        simpleItem(ModItems.LYRE_OF_APOLLO);

        //BUTTON
        buttonItem(ModBlocks.ADAMANTINE_BUTTON, ModBlocks.ADAMANTINE_BLOCK);

    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(GreekMyth.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return  withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
            new ResourceLocation(GreekMyth.MOD_ID, "item/" + item.getId().getPath()));
    }
}
