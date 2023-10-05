package net.rafiki.greekmyth.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.item.custom.*;

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
            () -> new LyreOfApolloItem(new Item.Properties().rarity(Rarity.RARE).stacksTo(1)));
    public static final RegistryObject<Item> SWORD_OF_ARES = ITEMS.register("sword_of_ares",
            () -> new SwordOfAresItem(ModToolTiers.HALF_BASE_SWORD, 7, -3.4f,new Item.Properties().durability(325).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> WINGED_SANDALS_OF_HERMES = ITEMS.register("winged_sandals_of_hermes",
            () -> new WingedSandalsOfHermesItem(ModArmorMaterials.WINGED_SANDALS_OF_HERMES, ArmorItem.Type.BOOTS, new Item.Properties().defaultDurability(100).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> HELM_OF_DARKNESS = ITEMS.register("helm_of_darkness",
            () -> new HelmOfDarknessItem(ModArmorMaterials.HELM_OF_DARKNESS, ArmorItem.Type.HELMET, new Item.Properties().defaultDurability(300).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> TRIDENT_OF_POSEIDON = ITEMS.register("trident_of_poseidon",
            () -> new TridentOfPoseidonItem(new Item.Properties().defaultDurability(400).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> BIDENT_OF_HADES = ITEMS.register("bident_of_hades",
            () -> new BidentOfHadesItem(new Item.Properties().defaultDurability(400).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> HIDE_OF_THE_NEMEAN_LION = ITEMS.register("hide_of_the_nemean_lion",
            () -> new HideOfTheNemeanLionItem(ModArmorMaterials.HIDE_OF_THE_NEMEAN_LION, ArmorItem.Type.CHESTPLATE, new Item.Properties().defaultDurability(650).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> GOLDEN_FLEECE = ITEMS.register("golden_fleece",
            () -> new GoldenFleeceItem(new Item.Properties().defaultDurability(220).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> CADUCEUS = ITEMS.register("caduceus",
            () -> new CaduceusItem(new Item.Properties().defaultDurability(150).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> SCYTHE_OF_KRONUS = ITEMS.register("scythe_of_kronus",
            () -> new ScytheOfKronusItem(ModToolTiers.BASE_SWORD, 9, -3f,new Item.Properties().durability(350).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> HARPE_OF_PERSEUS = ITEMS.register("harpe_of_perseus",
            () -> new HarpeOfPerseusItem(ModToolTiers.BASE_SWORD, 7, -2.2f,new Item.Properties().durability(450).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> LABRYS = ITEMS.register("labrys",
            () -> new LabrysItem(ModToolTiers.BASE_SWORD, 11, -3.8f,new Item.Properties().durability(400).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> THRYSUS = ITEMS.register("thrysus",
            () -> new ThrysusItem(new Item.Properties().defaultDurability(150).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> SPEAR_OF_ATHENA = ITEMS.register("spear_of_athena",
            () -> new SpearOfAthenaItem(new Item.Properties().defaultDurability(375).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> SPEAR_OF_ACHILLES = ITEMS.register("spear_of_achilles",
            () -> new SpearOfAchillesItem(new Item.Properties().defaultDurability(300).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> TRIDENT_OF_OCEANUS = ITEMS.register("trident_of_oceanus",
            () -> new TridentOfOceanusItem(new Item.Properties().defaultDurability(400).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> CESTUS_OF_APHRODITE = ITEMS.register("cestus_of_aphrodite",
            () -> new CestusOfAphroditeItem(ModArmorMaterials.CESTUS_OF_APHRODITE, ArmorItem.Type.LEGGINGS, new Item.Properties().defaultDurability(200).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> GIRDLE_OF_HIPPOLYTA = ITEMS.register("girdle_of_hippolyta",
            () -> new GirdleOfHippolytaItem(ModArmorMaterials.GIRDLE_OF_HIPPOLYTA, ArmorItem.Type.LEGGINGS, new Item.Properties().defaultDurability(200).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> SWORD_OF_ATALANTA = ITEMS.register("sword_of_atalanta",
            () -> new SwordOfAtalantaItem(ModToolTiers.HALF_BASE_SWORD, 6, -1.8f,new Item.Properties().durability(400).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> SPEAR_OF_DIOMEDES = ITEMS.register("spear_of_diomedes",
            () -> new SpearOfDiomedesItem(new Item.Properties().defaultDurability(300).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> CLAW_OF_THE_NEMEAN_LION = ITEMS.register("claw_of_the_nemean_lion",
            () -> new ClawOfTheNemeanLionItem(ModToolTiers.BASE_SWORD, 2, 0f, new Item.Properties().defaultDurability(400).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> TUSK_OF_THE_ERYMANTHIAN_BOAR = ITEMS.register("tusk_of_the_erymanthian_boar",
            () -> new TuskOfTheErymanthianBoarItem(ModToolTiers.BASE_SWORD, 3, -2.8f, new Item.Properties().defaultDurability(350).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> NECKLACE_OF_HARMONIA = ITEMS.register("necklace_of_harmonia",
            () -> new NecklaceOfHarmoniaItem(new Item.Properties().rarity(Rarity.RARE).setNoRepair().stacksTo(1)));
    public static final RegistryObject<Item> AMULET_OF_HECATE = ITEMS.register("amulet_of_hecate",
            () -> new AmuletOfHecateItem(new Item.Properties().rarity(Rarity.RARE).setNoRepair().stacksTo(1)));
    public static final RegistryObject<Item> CROWN_OF_DIONYSUS = ITEMS.register("crown_of_dionysus",
            () -> new CrownOfDionysusItem(ModArmorMaterials.CROWN_OF_DIONYSUS, ArmorItem.Type.HELMET, new Item.Properties().defaultDurability(250).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> TRIDENT_OF_TRITON = ITEMS.register("trident_of_triton",
            () -> new TridentOfTritonItem(new Item.Properties().defaultDurability(350).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> SWORD_OF_DAMASEN = ITEMS.register("sword_of_damasen",
            () -> new SwordOfDamasenItem(ModToolTiers.BASE_SWORD, 7, -2.4f, new Item.Properties().defaultDurability(350).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> TUSK_OF_THE_CALYDONIAN_BOAR = ITEMS.register("tusk_of_the_calydonian_boar",
            () -> new TuskOfTheCalydonianBoarItem(ModToolTiers.BASE_SWORD, 3, -2.8f, new Item.Properties().defaultDurability(350).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> MEDALLION_OF_PERSEUS = ITEMS.register("medallion_of_perseus",
            () -> new MedallionOfPerseusItem(new Item.Properties().rarity(Rarity.RARE).setNoRepair().stacksTo(1)));
    public static final RegistryObject<Item> HAMMER_OF_HEPHAESTUS = ITEMS.register("hammer_of_hephaestus",
            () -> new HammerOfHephaestusItem(ModToolTiers.BASE_SWORD, 9, -3.6f, new Item.Properties().defaultDurability(1200).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> LOTUS_STAFF_OF_PERSOPHONE = ITEMS.register("lotus_staff_of_persephone",
            () -> new LotusStaffOfPersephoneItem(new Item.Properties().defaultDurability(150).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> FLUTE_OF_PAN = ITEMS.register("flute_of_pan",
            () -> new FluteOfPanItem(new Item.Properties().defaultDurability(200).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> CHALICE_OF_NYX = ITEMS.register("chalice_of_nyx",
            () -> new ChalaceOfNyxItem(new Item.Properties().defaultDurability(175).rarity(Rarity.RARE).setNoRepair()));

    //FUEL
    public static final RegistryObject<Item> FORGE_COAL = ITEMS.register("forge_coal",
            () -> new FuelItem(new Item.Properties(), 3200));

    //FOOD
    public static final RegistryObject<Item> AMBROSIA = ITEMS.register("ambrosia",
            () -> new Item(new Item.Properties().food(ModFoodProperties.AMBROSIA)));

    //TOOLS
        //STYGIAN IRON
    public static final RegistryObject<Item> STYGIAN_IRON_SWORD = ITEMS.register("stygian_iron_sword",
            () -> new SwordItem(ModToolTiers.STYGIAN_IRON, 2, -2.4f,new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_PICKAXE = ITEMS.register("stygian_iron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STYGIAN_IRON, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_SHOVEL = ITEMS.register("stygian_iron_shovel",
            () -> new ShovelItem(ModToolTiers.STYGIAN_IRON, 0.5f, -3, new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_AXE = ITEMS.register("stygian_iron_axe",
            () -> new AxeItem(ModToolTiers.STYGIAN_IRON, 4, -3, new Item.Properties()));

        //ADAMANTINE
    public static final RegistryObject<Item> ADAMANTINE_SWORD = ITEMS.register("adamantine_sword",
            () -> new SwordItem(ModToolTiers.ADAMANTINE, 4, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE_PICKAXE = ITEMS.register("adamantine_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ADAMANTINE, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE_SHOVEL = ITEMS.register("adamantine_shovel",
            () -> new ShovelItem(ModToolTiers.ADAMANTINE, 1.5f, -3, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE_AXE = ITEMS.register("adamantine_axe",
            () -> new AxeItem(ModToolTiers.ADAMANTINE, 5, -3, new Item.Properties()));

        //IMPERIAL GOLD
    public static final RegistryObject<Item> IMPERIAL_GOLD_SWORD = ITEMS.register("imperial_gold_sword",
                () -> new SwordItem(ModToolTiers.IMPERIAL_GOLD, 2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_PICKAXE = ITEMS.register("imperial_gold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.IMPERIAL_GOLD, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_SHOVEL = ITEMS.register("imperial_gold_shovel",
            () -> new ShovelItem(ModToolTiers.IMPERIAL_GOLD, 0.5f, -3, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_AXE = ITEMS.register("imperial_gold_axe",
            () -> new AxeItem(ModToolTiers.IMPERIAL_GOLD, 4, -3, new Item.Properties()));


        //CELESTIAL BRONZE
    public static final RegistryObject<Item> CELESTIAL_BRONZE_SWORD = ITEMS.register("celestial_bronze_sword",
                () -> new SwordItem(ModToolTiers.CELESTIAL_BRONZE, 2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_PICKAXE = ITEMS.register("celestial_bronze_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CELESTIAL_BRONZE, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_SHOVEL = ITEMS.register("celestial_bronze_shovel",
            () -> new ShovelItem(ModToolTiers.CELESTIAL_BRONZE, 0f, -3, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_AXE = ITEMS.register("celestial_bronze_axe",
            () -> new AxeItem(ModToolTiers.CELESTIAL_BRONZE, 5, -3, new Item.Properties()));

        //BRONZE
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
                () -> new SwordItem(ModToolTiers.BRONZE, 2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRONZE, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ModToolTiers.BRONZE, 1.5f, -3, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(ModToolTiers.BRONZE, 5f, -3, new Item.Properties()));

    //ARMOR
        //STYGIAN IRON
    public static final RegistryObject<Item> STYGIAN_IRON_HELMET = ITEMS.register("stygian_iron_helmet",
            () -> new ArmorItem(ModArmorMaterials.STYGIAN_IRON, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_CHESTPLATE = ITEMS.register("stygian_iron_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STYGIAN_IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_LEGGINGS = ITEMS.register("stygian_iron_leggings",
            () -> new ArmorItem(ModArmorMaterials.STYGIAN_IRON, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_BOOTS = ITEMS.register("stygian_iron_boots",
            () -> new ArmorItem(ModArmorMaterials.STYGIAN_IRON, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_HORSE_ARMOR = ITEMS.register("stygian_iron_horse_armor",
            () -> new HorseArmorItem(15, new ResourceLocation(GreekMyth.MOD_ID, "textures/entity/horse/armor/horse_armor_stygian_iron.png"), new Item.Properties().stacksTo(1)));

        //ADAMANTINE
    public static final RegistryObject<Item> ADAMANTINE_HELMET = ITEMS.register("adamantine_helmet",
                () -> new ModArmorItem(ModArmorMaterials.ADAMANTINE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE_CHESTPLATE = ITEMS.register("adamantine_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.ADAMANTINE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE_LEGGINGS = ITEMS.register("adamantine_leggings",
            () -> new ModArmorItem(ModArmorMaterials.ADAMANTINE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE_BOOTS = ITEMS.register("adamantine_boots",
            () -> new ModArmorItem(ModArmorMaterials.ADAMANTINE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE_HORSE_ARMOR = ITEMS.register("adamantine_horse_armor",
            () -> new HorseArmorItem(13, new ResourceLocation(GreekMyth.MOD_ID, "textures/entity/horse/armor/horse_armor_adamantine.png"), new Item.Properties().stacksTo(1)));

        //IMPERIAL_GOLD
    public static final RegistryObject<Item> IMPERIAL_GOLD_HELMET = ITEMS.register("imperial_gold_helmet",
                () -> new ArmorItem(ModArmorMaterials.IMPERIAL_GOLD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_CHESTPLATE = ITEMS.register("imperial_gold_chestplate",
            () -> new ArmorItem(ModArmorMaterials.IMPERIAL_GOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_LEGGINGS = ITEMS.register("imperial_gold_leggings",
            () -> new ArmorItem(ModArmorMaterials.IMPERIAL_GOLD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_BOOTS = ITEMS.register("imperial_gold_boots",
            () -> new ArmorItem(ModArmorMaterials.IMPERIAL_GOLD, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_HORSE_ARMOR = ITEMS.register("imperial_gold_horse_armor",
            () -> new HorseArmorItem(9, new ResourceLocation(GreekMyth.MOD_ID, "textures/entity/horse/armor/horse_armor_imperial_gold.png"), new Item.Properties().stacksTo(1)));


        //CELESTIAL BRONZE
    public static final RegistryObject<Item> CELESTIAL_BRONZE_HELMET = ITEMS.register("celestial_bronze_helmet",
                () -> new ArmorItem(ModArmorMaterials.CELESTIAL_BRONZE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_CHESTPLATE = ITEMS.register("celestial_bronze_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CELESTIAL_BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_LEGGINGS = ITEMS.register("celestial_bronze_leggings",
            () -> new ArmorItem(ModArmorMaterials.CELESTIAL_BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_BOOTS = ITEMS.register("celestial_bronze_boots",
            () -> new ArmorItem(ModArmorMaterials.CELESTIAL_BRONZE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_HORSE_ARMOR = ITEMS.register("celestial_bronze_horse_armor",
            () -> new HorseArmorItem(7, new ResourceLocation(GreekMyth.MOD_ID, "textures/entity/horse/armor/horse_armor_celestial_bronze.png"), new Item.Properties().stacksTo(1)));

        //BRONZE
    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet",
                () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings",
            () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots",
            () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor",
            () -> new HorseArmorItem(6, new ResourceLocation(GreekMyth.MOD_ID, "textures/entity/horse/armor/horse_armor_bronze.png"), new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
