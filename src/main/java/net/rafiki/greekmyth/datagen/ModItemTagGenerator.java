package net.rafiki.greekmyth.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, GreekMyth.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //Add Item Tags Here
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ADAMANTINE_HELMET.get(),
                        ModItems.ADAMANTINE_CHESTPLATE.get(),
                        ModItems.ADAMANTINE_LEGGINGS.get(),
                        ModItems.ADAMANTINE_BOOTS.get(),
                        //ModItems.STYGIAN_IRON_HELMET.get(),
                        //ModItems.STYGIAN_IRON_CHESTPLATE.get(),
                        //ModItems.STYGIAN_IRON_LEGGINGS.get(),
                        //ModItems.STYGIAN_IRON_BOOTS.get(),
                        ModItems.IMPERIAL_GOLD_HELMET.get(),
                        ModItems.IMPERIAL_GOLD_CHESTPLATE.get(),
                        ModItems.IMPERIAL_GOLD_LEGGINGS.get(),
                        ModItems.IMPERIAL_GOLD_BOOTS.get(),
                        ModItems.CELESTIAL_BRONZE_HELMET.get(),
                        ModItems.CELESTIAL_BRONZE_CHESTPLATE.get(),
                        ModItems.CELESTIAL_BRONZE_LEGGINGS.get(),
                        ModItems.CELESTIAL_BRONZE_BOOTS.get()
                        //ModItems.BRONZE_HELMET.get(),
                        //ModItems.BRONZE_CHESTPLATE.get(),
                        //ModItems.BRONZE_LEGGINGS.get(),
                        //ModItems.BRONZE_BOOTS.get()
                );

    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
