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
                        output.accept(ModBlocks.ADAMANTINE_WALL.get());
                        output.accept(ModBlocks.ADAMANTINE_FENCE.get());
                        output.accept(ModBlocks.ADAMANTINE_FENCE_GATE.get());
                        output.accept(ModBlocks.ADAMANTINE_DOOR.get());
                        output.accept(ModBlocks.ADAMANTINE_TRAP_DOOR.get());
                        output.accept(ModBlocks.NETHER_ADAMANTINE_ORE.get());
                        output.accept(ModBlocks.END_STONE_ADAMANTINE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_ADAMANTINE_ORE.get());
                        output.accept(ModBlocks.SOUND_BLOCK.get());

                        //FOODS
                        output.accept(ModItems.AMBROSIA.get());

                        //FUEL
                        output.accept(ModItems.FORGE_COAL.get());

                        //CUSTOM
                        output.accept(ModItems.LYRE_OF_APOLLO.get());
                        output.accept(ModItems.SWORD_OF_ARES.get());
                        output.accept(ModItems.WINGED_SANDALS_OF_HERMES.get());

                        //TOOLS
                        output.accept(ModItems.STYGIAN_IRON_SWORD.get());
                        output.accept(ModItems.STYGIAN_IRON_PICKAXE.get());
                        output.accept(ModItems.STYGIAN_IRON_SHOVEL.get());
                        output.accept(ModItems.STYGIAN_IRON_AXE.get());
                        output.accept(ModItems.ADAMANTINE_SWORD.get());
                        output.accept(ModItems.ADAMANTINE_PICKAXE.get());
                        output.accept(ModItems.ADAMANTINE_SHOVEL.get());
                        output.accept(ModItems.ADAMANTINE_AXE.get());
                        output.accept(ModItems.IMPERIAL_GOLD_SWORD.get());
                        output.accept(ModItems.IMPERIAL_GOLD_PICKAXE.get());
                        output.accept(ModItems.IMPERIAL_GOLD_SHOVEL.get());
                        output.accept(ModItems.IMPERIAL_GOLD_AXE.get());
                        output.accept(ModItems.CELESTIAL_BRONZE_SWORD.get());
                        output.accept(ModItems.CELESTIAL_BRONZE_PICKAXE.get());
                        output.accept(ModItems.CELESTIAL_BRONZE_SHOVEL.get());
                        output.accept(ModItems.CELESTIAL_BRONZE_AXE.get());
                        output.accept(ModItems.BRONZE_SWORD.get());
                        output.accept(ModItems.BRONZE_PICKAXE.get());
                        output.accept(ModItems.BRONZE_SHOVEL.get());
                        output.accept(ModItems.BRONZE_AXE.get());

                        //ARMOR
                        output.accept(ModItems.STYGIAN_IRON_HELMET.get());
                        output.accept(ModItems.STYGIAN_IRON_CHESTPLATE.get());
                        output.accept(ModItems.STYGIAN_IRON_LEGGINGS.get());
                        output.accept(ModItems.STYGIAN_IRON_BOOTS.get());
                        output.accept(ModItems.ADAMANTINE_HELMET.get());
                        output.accept(ModItems.ADAMANTINE_CHESTPLATE.get());
                        output.accept(ModItems.ADAMANTINE_LEGGINGS.get());
                        output.accept(ModItems.ADAMANTINE_BOOTS.get());
                        output.accept(ModItems.IMPERIAL_GOLD_HELMET.get());
                        output.accept(ModItems.IMPERIAL_GOLD_CHESTPLATE.get());
                        output.accept(ModItems.IMPERIAL_GOLD_LEGGINGS.get());
                        output.accept(ModItems.IMPERIAL_GOLD_BOOTS.get());
                        output.accept(ModItems.CELESTIAL_BRONZE_HELMET.get());
                        output.accept(ModItems.CELESTIAL_BRONZE_CHESTPLATE.get());
                        output.accept(ModItems.CELESTIAL_BRONZE_LEGGINGS.get());
                        output.accept(ModItems.CELESTIAL_BRONZE_BOOTS.get());
                        output.accept(ModItems.BRONZE_HELMET.get());
                        output.accept(ModItems.BRONZE_CHESTPLATE.get());
                        output.accept(ModItems.BRONZE_LEGGINGS.get());
                        output.accept(ModItems.BRONZE_BOOTS.get());

                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
