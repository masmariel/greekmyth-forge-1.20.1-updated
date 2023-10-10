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
        simpleItem(ModItems.GORGONS_BLOOD);
        simpleItem(ModItems.NECTAR);

        //FUEL
        simpleItem(ModItems.FORGE_COAL);

        //CUSTOM ITEMS
        simpleItem(ModItems.LYRE_OF_APOLLO);
        handheldItem(ModItems.TRIDENT_OF_POSEIDON);
        handheldItem(ModItems.BIDENT_OF_HADES);
        simpleItem(ModItems.WINGED_SANDALS_OF_HERMES);
        simpleItem(ModItems.HELM_OF_DARKNESS);
        simpleItem(ModItems.HIDE_OF_THE_NEMEAN_LION);
        simpleItem(ModItems.GOLDEN_FLEECE);
        handheldItem(ModItems.SCYTHE_OF_KRONUS);
        handheldItem(ModItems.HARPE_OF_PERSEUS);
        handheldItem(ModItems.LABRYS);
        handheldItem(ModItems.THRYSUS);
        handheldItem(ModItems.SPEAR_OF_ATHENA);
        handheldItem(ModItems.SPEAR_OF_ACHILLES);
        handheldItem(ModItems.TRIDENT_OF_OCEANUS);
        simpleItem(ModItems.CESTUS_OF_APHRODITE);
        simpleItem(ModItems.GIRDLE_OF_HIPPOLYTA);
        handheldItem(ModItems.SWORD_OF_ATALANTA);
        handheldItem(ModItems.CLAW_OF_THE_NEMEAN_LION);
        handheldItem(ModItems.TUSK_OF_THE_ERYMANTHIAN_BOAR);
        simpleItem(ModItems.CROWN_OF_DIONYSUS);
        simpleItem(ModItems.AMULET_OF_HECATE);
        simpleItem(ModItems.NECKLACE_OF_HARMONIA);
        handheldItem(ModItems.SPEAR_OF_DIOMEDES);
        handheldItem(ModItems.SWORD_OF_DAMASEN);
        handheldItem(ModItems.TRIDENT_OF_TRITON);
        handheldItem(ModItems.TUSK_OF_THE_CALYDONIAN_BOAR);
        simpleItem(ModItems.FLUTE_OF_PAN);
        simpleItem(ModItems.CHALICE_OF_NYX);
        simpleItem(ModItems.MEDALLION_OF_PERSEUS);
        handheldItem(ModItems.LOTUS_STAFF_OF_PERSOPHONE);
        handheldItem(ModItems.THE_MASTER_BOLT);
        simpleItem(ModItems.CORNUCOPIA);
        simpleItem(ModItems.LYRE_OF_ORPHEUS);
        simpleItem(ModItems.DRUM_OF_CYBELE);
        simpleItem(ModItems.RATTLE_OF_CYBELE);
        simpleItem(ModItems.WHISTLE_OF_TANTALUS);
        handheldItem(ModItems.AXE_OF_PERDIX);
        simpleItem(ModItems.POUCH_OF_AEOLUS);
        simpleItem(ModItems.CROWN_OF_DEUCALION);
        simpleItem(ModItems.WREATH_OF_NIKE);
        simpleItem(ModItems.BROKEN_WINGED_SANDALS);
        simpleItem(ModItems.EMPERORS_CROWN);
        simpleItem(ModItems.WINGS_OF_ICARUS);
        simpleItem(ModItems.DRAKON_BONE_WINGS);
        simpleItem(ModItems.AOLUS);
        simpleItem(ModItems.LYRE_OF_AMPHION);
        simpleItem(ModItems.RING_OF_GYGES);
        simpleItem(ModItems.CONCH_OF_TRITON);
        simpleItem(ModItems.TRUMPET_OF_PHEME);
        simpleItem(ModItems.HEAD_OF_MEDUSA);
        simpleItem(ModItems.JAR_OF_SOULS);

        //OTHER
        simpleItem(ModItems.SOUNDS_OF_THE_ANGELS);

        //SPECIAL
        buttonItem(ModBlocks.ADAMANTINE_BUTTON, ModBlocks.ADAMANTINE_BLOCK);
        fenceItem(ModBlocks.ADAMANTINE_FENCE, ModBlocks.ADAMANTINE_BLOCK);
        wallItem(ModBlocks.ADAMANTINE_WALL, ModBlocks.ADAMANTINE_BLOCK);
        simpleBlockItem(ModBlocks.ADAMANTINE_DOOR);

        //TOOLS
        handheldItem(ModItems.STYGIAN_IRON_SWORD);
        handheldItem(ModItems.STYGIAN_IRON_PICKAXE);
        handheldItem(ModItems.STYGIAN_IRON_SHOVEL);
        handheldItem(ModItems.STYGIAN_IRON_AXE);
        handheldItem(ModItems.ADAMANTINE_SWORD);
        handheldItem(ModItems.ADAMANTINE_PICKAXE);
        handheldItem(ModItems.ADAMANTINE_SHOVEL);
        handheldItem(ModItems.ADAMANTINE_AXE);
        handheldItem(ModItems.IMPERIAL_GOLD_SWORD);
        handheldItem(ModItems.IMPERIAL_GOLD_PICKAXE);
        handheldItem(ModItems.IMPERIAL_GOLD_SHOVEL);
        handheldItem(ModItems.IMPERIAL_GOLD_AXE);
        handheldItem(ModItems.CELESTIAL_BRONZE_SWORD);
        handheldItem(ModItems.CELESTIAL_BRONZE_PICKAXE);
        handheldItem(ModItems.CELESTIAL_BRONZE_SHOVEL);
        handheldItem(ModItems.CELESTIAL_BRONZE_AXE);
        handheldItem(ModItems.BRONZE_SWORD);
        handheldItem(ModItems.BRONZE_PICKAXE);
        handheldItem(ModItems.BRONZE_SHOVEL);
        handheldItem(ModItems.BRONZE_AXE);

        //HORSE ARMOR
        simpleItem(ModItems.STYGIAN_IRON_HORSE_ARMOR);
        simpleItem(ModItems.ADAMANTINE_HORSE_ARMOR);
        simpleItem(ModItems.IMPERIAL_GOLD_HORSE_ARMOR);
        simpleItem(ModItems.CELESTIAL_BRONZE_HORSE_ARMOR);
        simpleItem(ModItems.BRONZE_HORSE_ARMOR);

    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(GreekMyth.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(GreekMyth.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(GreekMyth.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(GreekMyth.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(GreekMyth.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return  withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
            new ResourceLocation(GreekMyth.MOD_ID, "item/" + item.getId().getPath()));
    }
}
