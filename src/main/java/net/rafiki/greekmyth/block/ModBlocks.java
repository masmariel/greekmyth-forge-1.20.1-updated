package net.rafiki.greekmyth.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.block.custom.SoundBlock;
import net.rafiki.greekmyth.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GreekMyth.MOD_ID);

    /*
    Example of manual properties input:
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
     */

    //BLOCKS
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> CELESTIAL_BRONZE_BLOCK = registerBlock("celestial_bronze_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> IMPERIAL_GOLD_BLOCK = registerBlock("imperial_gold_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> STYGIAN_IRON_BLOCK = registerBlock("stygian_iron_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> ADAMANTINE_BLOCK = registerBlock("adamantine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));


    //ORES
    public static final RegistryObject<Block> ADAMANTINE_ORE = registerBlock("adamantine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> NETHER_ADAMANTINE_ORE = registerBlock("nether_adamantine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> END_STONE_ADAMANTINE_ORE = registerBlock("end_stone_adamantine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_ADAMANTINE_ORE = registerBlock("deepslate_adamantine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));


    //STAIRS & SLABS
    public static final RegistryObject<Block> ADAMANTINE_STAIRS = registerBlock("adamantine_stairs",
            () -> new StairBlock(() -> ModBlocks.ADAMANTINE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIORITE_STAIRS).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ADAMANTINE_SLAB = registerBlock("adamantine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE_SLAB).sound(SoundType.METAL)));

    //BUTTONS & PRESSURE PLATES
    public static final RegistryObject<Block> ADAMANTINE_PRESSURE_PLATE = registerBlock("adamantine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE)
                    .sound(SoundType.METAL), BlockSetType.IRON));
    public static final RegistryObject<Block> ADAMANTINE_BUTTON = registerBlock("adamantine_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE_SLAB)
                    .sound(SoundType.METAL), BlockSetType.IRON, 10, false));

    //FENCES & WALLS
    public static final RegistryObject<Block> ADAMANTINE_FENCE = registerBlock("adamantine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> ADAMANTINE_FENCE_GATE = registerBlock("adamantine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> ADAMANTINE_WALL = registerBlock("adamantine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    //DOORS & TRAPDOORS
    public static final RegistryObject<Block> ADAMANTINE_DOOR = registerBlock("adamantine_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), BlockSetType.IRON));
    public static final RegistryObject<Block> ADAMANTINE_TRAP_DOOR = registerBlock("adamantine_trap_door",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), BlockSetType.IRON));

    //EXAMPLE BLOCKS
    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)));



    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
