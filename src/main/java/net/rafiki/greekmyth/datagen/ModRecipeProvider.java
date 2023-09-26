package net.rafiki.greekmyth.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.rafiki.greekmyth.block.ModBlocks;
import net.rafiki.greekmyth.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private List<ItemLike> ADAMANTINE_SMELTABLES = List.of(ModItems.RAW_ADAMANTINE.get(), ModBlocks.ADAMANTINE_ORE.get(),
            ModBlocks.NETHER_ADAMANTINE_ORE.get(), ModBlocks.END_STONE_ADAMANTINE_ORE.get(), ModBlocks.DEEPSLATE_ADAMANTINE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ADAMANTINE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ADAMANTINE.get())
                .unlockedBy("has_adamantine", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADAMANTINE.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ADAMANTINE.get(), 9)
                .requires(ModBlocks.ADAMANTINE_BLOCK.get())
                .unlockedBy("has_adamantine_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ADAMANTINE_BLOCK.get()).build()))
                .save(pWriter);

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.CELESTIAL_BRONZE_INGOT.get(), RecipeCategory.MISC, ModBlocks.CELESTIAL_BRONZE_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.IMPERIAL_GOLD_INGOT.get(), RecipeCategory.MISC, ModBlocks.IMPERIAL_GOLD_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.STYGIAN_IRON_INGOT.get(), RecipeCategory.MISC, ModBlocks.STYGIAN_IRON_BLOCK.get());

        oreSmelting(pWriter, ADAMANTINE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTINE.get(), 0.25f, 200, "adamantine");
        oreBlasting(pWriter, ADAMANTINE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTINE.get(), 0.4f, 100, "adamantine");

    }
}
