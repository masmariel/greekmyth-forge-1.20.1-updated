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
                        ModItems.ADAMANTINE_BOOTS.get()
                );

    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
