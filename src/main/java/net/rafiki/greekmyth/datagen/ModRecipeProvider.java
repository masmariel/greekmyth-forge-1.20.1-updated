package net.rafiki.greekmyth.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;
import net.rafiki.greekmyth.GreekMyth;
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ADAMANTINE_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.ADAMANTINE_BLOCK.get())
                .unlockedBy("has_adamantine_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ADAMANTINE_BLOCK.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ADAMANTINE_SLAB.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AAA")
                .define('A', ModBlocks.ADAMANTINE_BLOCK.get())
                .unlockedBy("has_adamantine_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ADAMANTINE_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ADAMANTINE.get(), 9)
                .requires(ModBlocks.ADAMANTINE_BLOCK.get())
                .unlockedBy("has_adamantine_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ADAMANTINE_BLOCK.get()).build()))
                .save(pWriter);

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(),RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get(),
                "greekmyth:bronze_ingot", null, "greekmyth:bronze_block", null );
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.CELESTIAL_BRONZE_INGOT.get(), RecipeCategory.MISC, ModBlocks.CELESTIAL_BRONZE_BLOCK.get(),
                "greekmyth:celestial_bronze_ingot", null, "greekmyth:celestial_bronze_block", null );
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.IMPERIAL_GOLD_INGOT.get(), RecipeCategory.MISC, ModBlocks.IMPERIAL_GOLD_BLOCK.get(),
                "greekmyth:imperial_gold_ingot", null, "greekmyth:imperial_gold_block", null );
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.STYGIAN_IRON_INGOT.get(), RecipeCategory.MISC, ModBlocks.STYGIAN_IRON_BLOCK.get(),
                "greekmyth:stygian_iron_ingot", null, "greekmyth:stygian_iron_block", null );

        swordRecipe(pWriter, RecipeCategory.COMBAT, ModItems.STYGIAN_IRON_SWORD.get(), ModItems.STYGIAN_IRON_INGOT.get());
        swordRecipe(pWriter, RecipeCategory.COMBAT, ModItems.ADAMANTINE_SWORD.get(), ModItems.ADAMANTINE.get());
        swordRecipe(pWriter, RecipeCategory.COMBAT, ModItems.IMPERIAL_GOLD_SWORD.get(), ModItems.IMPERIAL_GOLD_INGOT.get());
        swordRecipe(pWriter, RecipeCategory.COMBAT, ModItems.CELESTIAL_BRONZE_SWORD.get(), ModItems.CELESTIAL_BRONZE_INGOT.get());
        swordRecipe(pWriter, RecipeCategory.COMBAT, ModItems.BRONZE_SWORD.get(), ModItems.BRONZE_INGOT.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, ModItems.STYGIAN_IRON_PICKAXE.get(), ModItems.STYGIAN_IRON_INGOT.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, ModItems.ADAMANTINE_PICKAXE.get(), ModItems.ADAMANTINE.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, ModItems.IMPERIAL_GOLD_PICKAXE .get(), ModItems.IMPERIAL_GOLD_INGOT.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, ModItems.CELESTIAL_BRONZE_PICKAXE.get(), ModItems.CELESTIAL_BRONZE_INGOT.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, ModItems.BRONZE_PICKAXE.get(), ModItems.BRONZE_INGOT.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, ModItems.STYGIAN_IRON_AXE.get(), ModItems.STYGIAN_IRON_INGOT.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, ModItems.ADAMANTINE_AXE.get(), ModItems.ADAMANTINE.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, ModItems.IMPERIAL_GOLD_AXE .get(), ModItems.IMPERIAL_GOLD_INGOT.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, ModItems.CELESTIAL_BRONZE_AXE.get(), ModItems.CELESTIAL_BRONZE_INGOT.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, ModItems.BRONZE_AXE.get(), ModItems.BRONZE_INGOT.get());
        shovelRecipe(pWriter, RecipeCategory.TOOLS, ModItems.STYGIAN_IRON_SHOVEL.get(), ModItems.STYGIAN_IRON_INGOT.get());
        shovelRecipe(pWriter, RecipeCategory.TOOLS, ModItems.ADAMANTINE_SHOVEL.get(), ModItems.ADAMANTINE.get());
        shovelRecipe(pWriter, RecipeCategory.TOOLS, ModItems.IMPERIAL_GOLD_SHOVEL .get(), ModItems.IMPERIAL_GOLD_INGOT.get());
        shovelRecipe(pWriter, RecipeCategory.TOOLS, ModItems.CELESTIAL_BRONZE_SHOVEL.get(), ModItems.CELESTIAL_BRONZE_INGOT.get());
        shovelRecipe(pWriter, RecipeCategory.TOOLS, ModItems.BRONZE_SHOVEL.get(), ModItems.BRONZE_INGOT.get());

        helmetRecipe(pWriter, RecipeCategory.COMBAT, ModItems.STYGIAN_IRON_HELMET.get(), ModItems.STYGIAN_IRON_INGOT.get());
        helmetRecipe(pWriter, RecipeCategory.COMBAT, ModItems.ADAMANTINE_HELMET.get(), ModItems.ADAMANTINE.get());
        helmetRecipe(pWriter, RecipeCategory.COMBAT, ModItems.IMPERIAL_GOLD_HELMET.get(), ModItems.IMPERIAL_GOLD_INGOT.get());
        helmetRecipe(pWriter, RecipeCategory.COMBAT, ModItems.CELESTIAL_BRONZE_HELMET.get(), ModItems.CELESTIAL_BRONZE_INGOT.get());
        helmetRecipe(pWriter, RecipeCategory.COMBAT, ModItems.BRONZE_HELMET.get(), ModItems.BRONZE_INGOT.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, ModItems.STYGIAN_IRON_CHESTPLATE.get(), ModItems.STYGIAN_IRON_INGOT.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, ModItems.ADAMANTINE_CHESTPLATE.get(), ModItems.ADAMANTINE.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, ModItems.IMPERIAL_GOLD_CHESTPLATE.get(), ModItems.IMPERIAL_GOLD_INGOT.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, ModItems.CELESTIAL_BRONZE_CHESTPLATE.get(), ModItems.CELESTIAL_BRONZE_INGOT.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, ModItems.BRONZE_CHESTPLATE.get(), ModItems.BRONZE_INGOT.get());
        leggingsRecipe(pWriter, RecipeCategory.COMBAT, ModItems.STYGIAN_IRON_LEGGINGS.get(), ModItems.STYGIAN_IRON_INGOT.get());
        leggingsRecipe(pWriter, RecipeCategory.COMBAT, ModItems.ADAMANTINE_LEGGINGS.get(), ModItems.ADAMANTINE.get());
        leggingsRecipe(pWriter, RecipeCategory.COMBAT, ModItems.IMPERIAL_GOLD_LEGGINGS.get(), ModItems.IMPERIAL_GOLD_INGOT.get());
        leggingsRecipe(pWriter, RecipeCategory.COMBAT, ModItems.CELESTIAL_BRONZE_LEGGINGS.get(), ModItems.CELESTIAL_BRONZE_INGOT.get());
        leggingsRecipe(pWriter, RecipeCategory.COMBAT, ModItems.BRONZE_LEGGINGS.get(), ModItems.BRONZE_INGOT.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, ModItems.STYGIAN_IRON_BOOTS.get(), ModItems.STYGIAN_IRON_INGOT.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, ModItems.ADAMANTINE_BOOTS.get(), ModItems.ADAMANTINE.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, ModItems.IMPERIAL_GOLD_BOOTS.get(), ModItems.IMPERIAL_GOLD_INGOT.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, ModItems.CELESTIAL_BRONZE_BOOTS.get(), ModItems.CELESTIAL_BRONZE_INGOT.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, ModItems.BRONZE_BOOTS.get(), ModItems.BRONZE_INGOT.get());

        oreSmelting(pWriter, ADAMANTINE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTINE.get(), 0.25f, 200, "adamantine");
        oreBlasting(pWriter, ADAMANTINE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTINE.get(), 0.4f, 100, "adamantine");


    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                    pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, GreekMyth.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

    protected void swordRecipe(Consumer<FinishedRecipe> pWriter, RecipeCategory recipeCategory, ItemLike createItem, ItemLike material) {
        ShapedRecipeBuilder.shaped(recipeCategory, createItem)
                .pattern(" H ")
                .pattern(" H ")
                .pattern(" S ")
                .define('H', material)
                .define('S', Items.STICK)
                .unlockedBy("has_handle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(material).build()))
                .save(pWriter);
    }

    protected void pickaxeRecipe(Consumer<FinishedRecipe> pWriter, RecipeCategory recipeCategory, ItemLike createItem, ItemLike material) {
        ShapedRecipeBuilder.shaped(recipeCategory, createItem)
                .pattern("HHH")
                .pattern(" S ")
                .pattern(" S ")
                .define('H', material)
                .define('S', Items.STICK)
                .unlockedBy("has_handle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(material).build()))
                .save(pWriter);
    }

    protected void shovelRecipe(Consumer<FinishedRecipe> pWriter, RecipeCategory recipeCategory, ItemLike createItem, ItemLike material) {
        ShapedRecipeBuilder.shaped(recipeCategory, createItem)
                .pattern(" H ")
                .pattern(" S ")
                .pattern(" S ")
                .define('H', material)
                .define('S', Items.STICK)
                .unlockedBy("has_handle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(material).build()))
                .save(pWriter);
    }

    protected void axeRecipe(Consumer<FinishedRecipe> pWriter, RecipeCategory recipeCategory, ItemLike createItem, ItemLike material) {
        ShapedRecipeBuilder.shaped(recipeCategory, createItem)
                .pattern("HH ")
                .pattern("HS ")
                .pattern(" S ")
                .define('H', material)
                .define('S', Items.STICK)
                .unlockedBy("has_handle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(material).build()))
                .save(pWriter);
    }

    protected void helmetRecipe(Consumer<FinishedRecipe> pWriter, RecipeCategory recipeCategory, ItemLike createItem, ItemLike material) {
        ShapedRecipeBuilder.shaped(recipeCategory, createItem)
                .pattern("HHH")
                .pattern("H H")
                .pattern("   ")
                .define('H', material)
                .unlockedBy("has_handle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(material).build()))
                .save(pWriter);
    }

    protected void chestplateRecipe(Consumer<FinishedRecipe> pWriter, RecipeCategory recipeCategory, ItemLike createItem, ItemLike material) {
        ShapedRecipeBuilder.shaped(recipeCategory, createItem)
                .pattern("H H")
                .pattern("HHH")
                .pattern("HHH")
                .define('H', material)
                .unlockedBy("has_handle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(material).build()))
                .save(pWriter);
    }

    protected void leggingsRecipe(Consumer<FinishedRecipe> pWriter, RecipeCategory recipeCategory, ItemLike createItem, ItemLike material) {
        ShapedRecipeBuilder.shaped(recipeCategory, createItem)
                .pattern("HHH")
                .pattern("H H")
                .pattern("H H")
                .define('H', material)
                .unlockedBy("has_handle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(material).build()))
                .save(pWriter);
    }

    protected void bootsRecipe(Consumer<FinishedRecipe> pWriter, RecipeCategory recipeCategory, ItemLike createItem, ItemLike material) {
        ShapedRecipeBuilder.shaped(recipeCategory, createItem)
                .pattern("   ")
                .pattern("HHH")
                .pattern("H H")
                .define('H', material)
                .unlockedBy("has_handle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(material).build()))
                .save(pWriter);
    }

}
