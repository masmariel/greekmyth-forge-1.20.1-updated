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
                        output.accept(ModItems.NECTAR.get());
                        output.accept(ModItems.GORGONS_BLOOD.get());

                        //FUEL
                        output.accept(ModItems.FORGE_COAL.get());

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

                        //HORSE ARMOR
                        output.accept(ModItems.STYGIAN_IRON_HORSE_ARMOR.get());
                        output.accept(ModItems.ADAMANTINE_HORSE_ARMOR.get());
                        output.accept(ModItems.IMPERIAL_GOLD_HORSE_ARMOR.get());
                        output.accept(ModItems.CELESTIAL_BRONZE_HORSE_ARMOR.get());
                        output.accept(ModItems.BRONZE_HORSE_ARMOR.get());

                        //OTHER
                        output.accept(ModItems.SOUNDS_OF_THE_ANGELS.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> COURSE_TAB_2 = CREATIVE_MODE_TABS.register("course_tab_2",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TRIDENT_OF_POSEIDON.get()))
                    .title(Component.translatable("creativetab.course_tab_2"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(ModItems.LYRE_OF_APOLLO.get());
                        output.accept(ModItems.SWORD_OF_ARES.get());
                        output.accept(ModItems.WINGED_SANDALS_OF_HERMES.get());
                        output.accept(ModItems.HELM_OF_DARKNESS.get());
                        output.accept(ModItems.TRIDENT_OF_POSEIDON.get());
                        output.accept(ModItems.BIDENT_OF_HADES.get());
                        output.accept(ModItems.JAR_OF_SOULS.get());
                        output.accept(ModItems.HIDE_OF_THE_NEMEAN_LION.get());
                        output.accept(ModItems.GOLDEN_FLEECE.get());
                        output.accept(ModItems.CADUCEUS.get());
                        output.accept(ModItems.SCYTHE_OF_KRONUS.get());
                        output.accept(ModItems.HARPE_OF_PERSEUS.get());
                        output.accept(ModItems.LABRYS.get());
                        output.accept(ModItems.THRYSUS.get());
                        output.accept(ModItems.SPEAR_OF_ACHILLES.get());
                        output.accept(ModItems.SPEAR_OF_ATHENA.get());
                        output.accept(ModItems.CESTUS_OF_APHRODITE.get());
                        output.accept(ModItems.GIRDLE_OF_HIPPOLYTA.get());
                        output.accept(ModItems.TRIDENT_OF_OCEANUS.get());
                        output.accept(ModItems.SWORD_OF_ATALANTA.get());
                        output.accept(ModItems.CLAW_OF_THE_NEMEAN_LION.get());
                        output.accept(ModItems.TUSK_OF_THE_ERYMANTHIAN_BOAR.get());
                        output.accept(ModItems.AMULET_OF_HECATE.get());
                        output.accept(ModItems.NECKLACE_OF_HARMONIA.get());
                        output.accept(ModItems.CROWN_OF_DIONYSUS.get());
                        output.accept(ModItems.SPEAR_OF_DIOMEDES.get());
                        output.accept(ModItems.SWORD_OF_DAMASEN.get());
                        output.accept(ModItems.TUSK_OF_THE_CALYDONIAN_BOAR.get());
                        output.accept(ModItems.TRIDENT_OF_TRITON.get());
                        output.accept(ModItems.CHALICE_OF_NYX.get());
                        output.accept(ModItems.HAMMER_OF_HEPHAESTUS.get());
                        output.accept(ModItems.LOTUS_STAFF_OF_PERSOPHONE.get());
                        output.accept(ModItems.MEDALLION_OF_PERSEUS.get());
                        output.accept(ModItems.FLUTE_OF_PAN.get());
                        output.accept(ModItems.THE_MASTER_BOLT.get());
                        output.accept(ModItems.CORNUCOPIA.get());
                        output.accept(ModItems.LYRE_OF_ORPHEUS.get());
                        output.accept(ModItems.DRUM_OF_CYBELE.get());
                        output.accept(ModItems.RATTLE_OF_CYBELE.get());
                        output.accept(ModItems.WHISTLE_OF_TANTALUS.get());
                        output.accept(ModItems.AXE_OF_PERDIX.get());
                        output.accept(ModItems.POUCH_OF_AEOLUS.get());
                        output.accept(ModItems.CROWN_OF_DEUCALION.get());
                        output.accept(ModItems.WREATH_OF_NIKE.get());
                        output.accept(ModItems.BROKEN_WINGED_SANDALS.get());
                        output.accept(ModItems.EMPERORS_CROWN.get());
                        output.accept(ModItems.WINGS_OF_ICARUS.get());
                        output.accept(ModItems.DRAKON_BONE_WINGS.get());
                        output.accept(ModItems.AOLUS.get());
                        output.accept(ModItems.LYRE_OF_AMPHION.get());
                        output.accept(ModItems.RING_OF_GYGES.get());
                        output.accept(ModItems.TRUMPET_OF_PHEME.get());
                        output.accept(ModItems.CONCH_OF_TRITON.get());
                        output.accept(ModItems.HEAD_OF_MEDUSA.get());

                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
