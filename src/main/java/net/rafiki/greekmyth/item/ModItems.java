package net.rafiki.greekmyth.item;

import net.minecraft.commands.arguments.item.ItemParser;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.item.custom.FuelItem;
import net.rafiki.greekmyth.item.custom.LyreOfApolloItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GreekMyth.MOD_ID);

    //INGOT
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_INGOT = ITEMS.register("celestial_bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_INGOT = ITEMS.register("imperial_gold_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_INGOT = ITEMS.register("stygian_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE = ITEMS.register("adamantine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ADAMANTINE = ITEMS.register("raw_adamantine",
            () -> new Item(new Item.Properties()));

   //ESSENCE
    public static final RegistryObject<Item> GODLY_ESSENCE = ITEMS.register("godly_essence",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ESSENCE_OF_TARTARUS = ITEMS.register("essence_of_tartarus",
            () -> new Item(new Item.Properties()));

    //CUSTOM
    public static final RegistryObject<Item> LYRE_OF_APOLLO = ITEMS.register("lyre_of_apollo",
            () -> new LyreOfApolloItem(new Item.Properties()));

    //FUEL
    public static final RegistryObject<Item> FORGE_COAL = ITEMS.register("forge_coal",
            () -> new FuelItem(new Item.Properties(), 3200));

    //FOOD
    public static final RegistryObject<Item> AMBROSIA = ITEMS.register("ambrosia",
            () -> new Item(new Item.Properties().food(ModFoodProperties.AMBROSIA)));

    //TOOLS
        //STYGIAN IRON
    public static final RegistryObject<Item> STYGIAN_IRON_SWORD = ITEMS.register("stygian_iron_sword",
            () -> new SwordItem(ModToolTiers.STYGIAN_IRON, 2, 3, new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_PICKAXE = ITEMS.register("stygian_iron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STYGIAN_IRON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_SHOVEL = ITEMS.register("stygian_iron_shovel",
            () -> new ShovelItem(ModToolTiers.STYGIAN_IRON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_AXE = ITEMS.register("stygian_iron_axe",
            () -> new AxeItem(ModToolTiers.STYGIAN_IRON, 1, 2, new Item.Properties()));

        //ADAMANTINE
    public static final RegistryObject<Item> ADAMANTINE_SWORD = ITEMS.register("adamantine_sword",
            () -> new SwordItem(ModToolTiers.ADAMANTINE, 2, 3, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE_PICKAXE = ITEMS.register("adamantine_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ADAMANTINE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE_SHOVEL = ITEMS.register("adamantine_shovel",
            () -> new ShovelItem(ModToolTiers.ADAMANTINE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE_AXE = ITEMS.register("adamantine_axe",
            () -> new AxeItem(ModToolTiers.ADAMANTINE, 1, 2, new Item.Properties()));

        //IMPERIAL GOLD
    public static final RegistryObject<Item> IMPERIAL_GOLD_SWORD = ITEMS.register("imperial_gold_sword",
                () -> new SwordItem(ModToolTiers.IMPERIAL_GOLD, 2, 3, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_PICKAXE = ITEMS.register("imperial_gold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.IMPERIAL_GOLD, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_SHOVEL = ITEMS.register("imperial_gold_shovel",
            () -> new ShovelItem(ModToolTiers.IMPERIAL_GOLD, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_AXE = ITEMS.register("imperial_gold_axe",
            () -> new AxeItem(ModToolTiers.IMPERIAL_GOLD, 1, 2, new Item.Properties()));


        //CELESTIAL BRONZE
    public static final RegistryObject<Item> CELESTIAL_BRONZE_SWORD = ITEMS.register("celestial_bronze_sword",
                () -> new SwordItem(ModToolTiers.CELESTIAL_BRONZE, 2, 3, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_PICKAXE = ITEMS.register("celestial_bronze_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CELESTIAL_BRONZE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_SHOVEL = ITEMS.register("celestial_bronze_shovel",
            () -> new ShovelItem(ModToolTiers.CELESTIAL_BRONZE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_AXE = ITEMS.register("celestial_bronze_axe",
            () -> new AxeItem(ModToolTiers.CELESTIAL_BRONZE, 1, 2, new Item.Properties()));

        //BRONZE
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
                () -> new SwordItem(ModToolTiers.BRONZE, 2, 3, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRONZE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ModToolTiers.BRONZE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(ModToolTiers.BRONZE, 1, 2, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
