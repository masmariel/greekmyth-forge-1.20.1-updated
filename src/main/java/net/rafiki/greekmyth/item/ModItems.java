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
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ESSENCE_OF_TARTARUS = ITEMS.register("essence_of_tartarus",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    //CUSTOM
    public static final RegistryObject<Item> LYRE_OF_APOLLO = ITEMS.register("lyre_of_apollo",
            () -> new LyreOfApolloItem(new Item.Properties().rarity(Rarity.RARE).defaultDurability(125)));
    public static final RegistryObject<Item> SWORD_OF_ARES = ITEMS.register("sword_of_ares",
            () -> new SwordOfAresItem(ModToolTiers.HALF_BASE_SWORD, 7, -3.4f,new Item.Properties().durability(325).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> WINGED_SANDALS_OF_HERMES = ITEMS.register("winged_sandals_of_hermes",
            () -> new WingedSandalsOfHermesItem(ModArmorMaterials.WINGED_SANDALS_OF_HERMES, ArmorItem.Type.BOOTS, new Item.Properties().defaultDurability(100).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> HELM_OF_DARKNESS = ITEMS.register("helm_of_darkness",
            () -> new HelmOfDarknessItem(ModArmorMaterials.HELM_OF_DARKNESS, ArmorItem.Type.HELMET, new Item.Properties().defaultDurability(300).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> TRIDENT_OF_POSEIDON = ITEMS.register("trident_of_poseidon",
            () -> new TridentOfPoseidonItem(new Item.Properties().defaultDurability(400).rarity(Rarity.EPIC).setNoRepair(),10.5));
    public static final RegistryObject<Item> BIDENT_OF_HADES = ITEMS.register("bident_of_hades",
            () -> new BidentOfHadesItem(new Item.Properties().defaultDurability(400).rarity(Rarity.EPIC).setNoRepair(), 10));
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
            () -> new LabrysItem(ModToolTiers.BASE_SWORD, 15, -3.8f,new Item.Properties().durability(400).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> THRYSUS = ITEMS.register("thrysus",
            () -> new ThrysusItem(new Item.Properties().defaultDurability(150).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> SPEAR_OF_ATHENA = ITEMS.register("spear_of_athena",
            () -> new SpearOfAthenaItem(new Item.Properties().defaultDurability(375).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> SPEAR_OF_ACHILLES = ITEMS.register("spear_of_achilles",
            () -> new SpearOfAchillesItem(new Item.Properties().defaultDurability(300).rarity(Rarity.RARE).setNoRepair(),8.5));
    public static final RegistryObject<Item> TRIDENT_OF_OCEANUS = ITEMS.register("trident_of_oceanus",
            () -> new TridentOfOceanusItem(new Item.Properties().defaultDurability(400).rarity(Rarity.EPIC).setNoRepair(),9.5));
    public static final RegistryObject<Item> CESTUS_OF_APHRODITE = ITEMS.register("cestus_of_aphrodite",
            () -> new CestusOfAphroditeItem(ModArmorMaterials.CESTUS_OF_APHRODITE, ArmorItem.Type.LEGGINGS, new Item.Properties().defaultDurability(200).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> GIRDLE_OF_HIPPOLYTA = ITEMS.register("girdle_of_hippolyta",
            () -> new GirdleOfHippolytaItem(ModArmorMaterials.GIRDLE_OF_HIPPOLYTA, ArmorItem.Type.LEGGINGS, new Item.Properties().defaultDurability(200).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> SWORD_OF_ATALANTA = ITEMS.register("sword_of_atalanta",
            () -> new SwordOfAtalantaItem(ModToolTiers.HALF_BASE_SWORD, 6, -1.8f,new Item.Properties().durability(400).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> SPEAR_OF_DIOMEDES = ITEMS.register("spear_of_diomedes",
            () -> new SpearOfDiomedesItem(new Item.Properties().defaultDurability(300).rarity(Rarity.RARE).setNoRepair(), 8));
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
            () -> new TridentOfTritonItem(new Item.Properties().defaultDurability(350).rarity(Rarity.EPIC).setNoRepair(),9.5));
    public static final RegistryObject<Item> SWORD_OF_DAMASEN = ITEMS.register("sword_of_damasen",
            () -> new SwordOfDamasenItem(ModToolTiers.BASE_SWORD, 7, -2.4f, new Item.Properties().defaultDurability(350).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> TUSK_OF_THE_CALYDONIAN_BOAR = ITEMS.register("tusk_of_the_calydonian_boar",
            () -> new TuskOfTheCalydonianBoarItem(ModToolTiers.BASE_SWORD, 3, -2.8f, new Item.Properties().defaultDurability(350).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> MEDALLION_OF_PERSEUS = ITEMS.register("medallion_of_perseus",
            () -> new MedallionOfPerseusItem(new Item.Properties().rarity(Rarity.RARE).setNoRepair().stacksTo(1)));
    public static final RegistryObject<Item> HAMMER_OF_HEPHAESTUS = ITEMS.register("hammer_of_hephaestus",
            () -> new HammerOfHephaestusItem(ModToolTiers.BASE_SWORD, 9, -3.6f, new Item.Properties().defaultDurability(1200).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> LOTUS_STAFF_OF_PERSOPHONE = ITEMS.register("lotus_staff_of_persephone",
            () -> new LotusStaffOfPersephoneItem(new Item.Properties().defaultDurability(150).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> FLUTE_OF_PAN = ITEMS.register("flute_of_pan",
            () -> new FluteOfPanItem(new Item.Properties().defaultDurability(125).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> CHALICE_OF_NYX = ITEMS.register("chalice_of_nyx",
            () -> new ChaliceOfNyxItem(new Item.Properties().defaultDurability(175).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> THE_MASTER_BOLT = ITEMS.register("the_master_bolt",
            () -> new TheMasterBoltItem(new Item.Properties().defaultDurability(500).rarity(Rarity.EPIC).setNoRepair(),0));
    public static final RegistryObject<Item> CORNUCOPIA = ITEMS.register("cornucopia",
            () -> new CornucopiaItem(new Item.Properties().defaultDurability(300).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> LYRE_OF_ORPHEUS = ITEMS.register("lyre_of_orpheus",
            () -> new LyreOfOrpheusItem(new Item.Properties().rarity(Rarity.RARE).defaultDurability(125)));
    public static final RegistryObject<Item> DRUM_OF_CYBELE = ITEMS.register("drum_of_cybele",
            () -> new DrumOfCybeleItem(new Item.Properties().rarity(Rarity.RARE).defaultDurability(125)));
    public static final RegistryObject<Item> RATTLE_OF_CYBELE = ITEMS.register("rattle_of_cybele",
            () -> new RattleOfCybeleItem(new Item.Properties().rarity(Rarity.RARE).defaultDurability(125)));
    public static final RegistryObject<Item> WHISTLE_OF_TANTALUS = ITEMS.register("whistle_of_tantalus",
            () -> new WhistleOfTantalusItem(new Item.Properties().rarity(Rarity.RARE).defaultDurability(125)));
    public static final RegistryObject<Item> AXE_OF_PERDIX = ITEMS.register("axe_of_perdix",
            () -> new AxeOfPerdixItem(ModToolTiers.BASE_SWORD, 7, -3.0f, new Item.Properties().defaultDurability(375).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> POUCH_OF_AEOLUS = ITEMS.register("pouch_of_aeolus",
            () -> new PouchOfAeolusItem(new Item.Properties().rarity(Rarity.RARE).defaultDurability(200)));
    public static final RegistryObject<Item> CROWN_OF_DEUCALION = ITEMS.register("crown_of_deucalion",
            () -> new CrownOfDeucalionItem(ModArmorMaterials.CROWN_OF_DEUCALION, ArmorItem.Type.HELMET, new Item.Properties().defaultDurability(275).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> WREATH_OF_NIKE = ITEMS.register("wreath_of_nike",
            () -> new WreathOfNikeItem(ModArmorMaterials.WREATH_OF_NIKE, ArmorItem.Type.HELMET, new Item.Properties().defaultDurability(200).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> BROKEN_WINGED_SANDALS = ITEMS.register("broken_winged_sandals",
            () -> new BrokenWingedSandalsItem(ModArmorMaterials.BROKEN_WINGED_SANDALS, ArmorItem.Type.BOOTS, new Item.Properties().defaultDurability(250).rarity(Rarity.RARE).setNoRepair()));
    public static final RegistryObject<Item> EMPERORS_CROWN = ITEMS.register("emperors_crown",
            () -> new EmperorsCrownItem(ModArmorMaterials.EMPERORS_CROWN, ArmorItem.Type.HELMET, new Item.Properties().defaultDurability(225).rarity(Rarity.EPIC).setNoRepair()));
    public static final RegistryObject<Item> WINGS_OF_ICARUS = ITEMS.register("wings_of_icarus",
            () -> new WingsOfIcarusItem(new Item.Properties().rarity(Rarity.EPIC).defaultDurability(475)));
    public static final RegistryObject<Item> DRAKON_BONE_WINGS = ITEMS.register("drakon_bone_wings",
            () -> new DrakonBoneWingsItem(new Item.Properties().rarity(Rarity.EPIC).defaultDurability(550)));
    public static final RegistryObject<Item> AOLUS = ITEMS.register("aolus",
            () -> new AolusItem(new Item.Properties().rarity(Rarity.RARE).defaultDurability(125)));
    public static final RegistryObject<Item> LYRE_OF_AMPHION = ITEMS.register("lyre_of_amphion",
            () -> new LyreOfAmphionItem(new Item.Properties().rarity(Rarity.EPIC).defaultDurability(125)));
    public static final RegistryObject<Item> SOUNDS_OF_THE_ANGELS = ITEMS.register("sounds_of_the_angels",
            () -> new SoundsOfTheAngelsItem(new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> CONCH_OF_TRITON = ITEMS.register("conch_of_triton",
            () -> new ConchOfTritonItem(new Item.Properties().rarity(Rarity.RARE).defaultDurability(125)));
    public static final RegistryObject<Item> TRUMPET_OF_PHEME = ITEMS.register("trumpet_of_pheme",
            () -> new TrumpetOfPhemeItem(new Item.Properties().rarity(Rarity.RARE).defaultDurability(125)));
    public static final RegistryObject<Item> RING_OF_GYGES = ITEMS.register("ring_of_gyges",
            () -> new RingOfGygesItem(new Item.Properties().rarity(Rarity.RARE).setNoRepair().stacksTo(1)));
    public static final RegistryObject<Item> HEAD_OF_MEDUSA = ITEMS.register("head_of_medusa",
            () -> new HeadOfMedusaItem(new Item.Properties().rarity(Rarity.EPIC).defaultDurability(125)));
    public static final RegistryObject<Item> JAR_OF_SOULS = ITEMS.register("jar_of_souls",
            () -> new JarOfSoulsItem(new Item.Properties().rarity(Rarity.RARE).setNoRepair().stacksTo(1)));


    //FUEL
    public static final RegistryObject<Item> FORGE_COAL = ITEMS.register("forge_coal",
            () -> new FuelItem(new Item.Properties().rarity(Rarity.UNCOMMON), 3200));

    //FOOD
    public static final RegistryObject<Item> AMBROSIA = ITEMS.register("ambrosia",
            () -> new AmbrosiaItem(new Item.Properties().food(ModFoodProperties.AMBROSIA).stacksTo(8).rarity(Rarity.RARE)));
 public static final RegistryObject<Item> NECTAR = ITEMS.register("nectar",
         () -> new NectarItem(new Item.Properties().food(ModFoodProperties.NECTAR).stacksTo(32).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GORGONS_BLOOD = ITEMS.register("gorgons_blood",
         () -> new GorgonsBloodItem(new Item.Properties().food(ModFoodProperties.GORGONS_BLOOD).stacksTo(16).rarity(Rarity.UNCOMMON)));

    //TOOLS
        //STYGIAN IRON
    public static final RegistryObject<Item> STYGIAN_IRON_SWORD = ITEMS.register("stygian_iron_sword",
            () -> new SwordItem(ModToolTiers.STYGIAN_IRON, 3, -2.4f,new Item.Properties()));
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
            () -> new StygianArmor(ModArmorMaterials.STYGIAN_IRON, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_CHESTPLATE = ITEMS.register("stygian_iron_chestplate",
            () -> new StygianArmor(ModArmorMaterials.STYGIAN_IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_LEGGINGS = ITEMS.register("stygian_iron_leggings",
            () -> new StygianArmor(ModArmorMaterials.STYGIAN_IRON, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> STYGIAN_IRON_BOOTS = ITEMS.register("stygian_iron_boots",
            () -> new StygianArmor(ModArmorMaterials.STYGIAN_IRON, ArmorItem.Type.BOOTS, new Item.Properties()));
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
                () -> new ImperialArmor(ModArmorMaterials.IMPERIAL_GOLD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_CHESTPLATE = ITEMS.register("imperial_gold_chestplate",
            () -> new ImperialArmor(ModArmorMaterials.IMPERIAL_GOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_LEGGINGS = ITEMS.register("imperial_gold_leggings",
            () -> new ImperialArmor(ModArmorMaterials.IMPERIAL_GOLD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_BOOTS = ITEMS.register("imperial_gold_boots",
            () -> new ImperialArmor(ModArmorMaterials.IMPERIAL_GOLD, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> IMPERIAL_GOLD_HORSE_ARMOR = ITEMS.register("imperial_gold_horse_armor",
            () -> new HorseArmorItem(9, new ResourceLocation(GreekMyth.MOD_ID, "textures/entity/horse/armor/horse_armor_imperial_gold.png"), new Item.Properties().stacksTo(1)));


        //CELESTIAL BRONZE
    public static final RegistryObject<Item> CELESTIAL_BRONZE_HELMET = ITEMS.register("celestial_bronze_helmet",
                () -> new CelestialArmor(ModArmorMaterials.CELESTIAL_BRONZE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_CHESTPLATE = ITEMS.register("celestial_bronze_chestplate",
            () -> new CelestialArmor(ModArmorMaterials.CELESTIAL_BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_LEGGINGS = ITEMS.register("celestial_bronze_leggings",
            () -> new CelestialArmor(ModArmorMaterials.CELESTIAL_BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_BOOTS = ITEMS.register("celestial_bronze_boots",
            () -> new CelestialArmor(ModArmorMaterials.CELESTIAL_BRONZE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_BRONZE_HORSE_ARMOR = ITEMS.register("celestial_bronze_horse_armor",
            () -> new HorseArmorItem(7, new ResourceLocation(GreekMyth.MOD_ID, "textures/entity/horse/armor/horse_armor_celestial_bronze.png"), new Item.Properties().stacksTo(1)));

        //BRONZE
    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet",
                () -> new BronzeArmor(ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate",
            () -> new BronzeArmor(ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings",
            () -> new BronzeArmor(ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots",
            () -> new BronzeArmor(ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor",
            () -> new HorseArmorItem(6, new ResourceLocation(GreekMyth.MOD_ID, "textures/entity/horse/armor/horse_armor_bronze.png"), new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
