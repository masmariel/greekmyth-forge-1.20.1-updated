package net.rafiki.greekmyth.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GreekMyth.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("course_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GODLY_ESSENCE.get()))
                    .title(Component.translatable("creativetab.course_tab"))
                    .displayItems((displayParameters, output) -> {

                        //INGOTS & ORES
                        output.accept(ModItems.BRONZE_INGOT.get());
                        output.accept(ModItems.CELESTIAL_BRONZE_INGOT.get());
                        output.accept(ModItems.IMPERIAL_GOLD_INGOT.get());
                        output.accept(ModItems.STYGIAN_IRON_INGOT.get());
                        output.accept(ModItems.ADAMANTINE.get());
                        output.accept(ModItems.RAW_ADAMANTINE.get());

                        //ESSENCE
                        output.accept(ModItems.GODLY_ESSENCE.get());
                        output.accept(ModItems.ESSENCE_OF_TARTARUS.get());

                        //BLOCKS
                        output.accept(ModBlocks.BRONZE_BLOCK.get());
                        output.accept(ModBlocks.CELESTIAL_BRONZE_BLOCK.get());
                        output.accept(ModBlocks.IMPERIAL_GOLD_BLOCK.get());
                        output.accept(ModBlocks.STYGIAN_IRON_BLOCK.get());
                        output.accept(ModBlocks.ADAMANTINE_BLOCK.get());
                        output.accept(ModBlocks.ADAMANTINE_SLAB.get());
                        output.accept(ModBlocks.ADAMANTINE_STAIRS.get());
                        output.accept(ModBlocks.ADAMANTINE_ORE.get());
                        output.accept(ModBlocks.ADAMANTINE_BUTTON.get());
                        output.accept(ModBlocks.ADAMANTINE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.NETHER_ADAMANTINE_ORE.get());
                        output.accept(ModBlocks.END_STONE_ADAMANTINE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_ADAMANTINE_ORE.get());
                        output.accept(ModBlocks.SOUND_BLOCK.get());

                        //FOODS
                        output.accept(ModItems.AMBROSIA.get());

                        //FUEL
                        output.accept(ModItems.FORGE_COAL.get());

                        //OTHER ITEMS
                        output.accept(ModItems.LYRE_OF_APOLLO.get());

                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
