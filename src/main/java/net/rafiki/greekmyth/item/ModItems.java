package net.rafiki.greekmyth.item;

import net.minecraft.world.item.Item;
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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
