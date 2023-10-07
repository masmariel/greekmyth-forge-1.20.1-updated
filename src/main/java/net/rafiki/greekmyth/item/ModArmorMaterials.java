package net.rafiki.greekmyth.item;

import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.fml.common.Mod;
import net.rafiki.greekmyth.GreekMyth;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    WINGED_SANDALS_OF_HERMES("winged_sandals_of_hermes", 15, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266656_) -> {
        p_266656_.put(ArmorItem.Type.BOOTS, 2);
        p_266656_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266656_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_266656_.put(ArmorItem.Type.HELMET, 2);
    }), 2, SoundEvents.ARMOR_EQUIP_LEATHER, 1.0F, 0.1F, () -> Ingredient.of(ModItems.WINGED_SANDALS_OF_HERMES.get())),

    BROKEN_WINGED_SANDALS("broken_winged_sandals", 15, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266656_) -> {
        p_266656_.put(ArmorItem.Type.BOOTS, 1);
        p_266656_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266656_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_266656_.put(ArmorItem.Type.HELMET, 2);
    }), 2, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.of(ModItems.BROKEN_WINGED_SANDALS.get())),

    CROWN_OF_DEUCALION("crown_of_deucalion", 30, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266656_) -> {
        p_266656_.put(ArmorItem.Type.BOOTS, 2);
        p_266656_.put(ArmorItem.Type.LEGGINGS, 2);
        p_266656_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_266656_.put(ArmorItem.Type.HELMET, 1);
    }), 2, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ModItems.CROWN_OF_DEUCALION.get())),

    EMPERORS_CROWN("emperors_crown", 30, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266656_) -> {
        p_266656_.put(ArmorItem.Type.BOOTS, 2);
        p_266656_.put(ArmorItem.Type.LEGGINGS, 2);
        p_266656_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_266656_.put(ArmorItem.Type.HELMET, 1);
    }), 2, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ModItems.EMPERORS_CROWN.get())),

    WREATH_OF_NIKE("wreath_of_nike", 30, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266656_) -> {
        p_266656_.put(ArmorItem.Type.BOOTS, 2);
        p_266656_.put(ArmorItem.Type.LEGGINGS, 2);
        p_266656_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_266656_.put(ArmorItem.Type.HELMET, 0);
    }), 2, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(ModItems.WREATH_OF_NIKE.get())),

    CESTUS_OF_APHRODITE("cestus_of_aphrodite", 30, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266656_) -> {
        p_266656_.put(ArmorItem.Type.BOOTS, 2);
        p_266656_.put(ArmorItem.Type.LEGGINGS, 2);
        p_266656_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_266656_.put(ArmorItem.Type.HELMET, 2);
    }), 2, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.of(ModItems.CESTUS_OF_APHRODITE.get())),

    CROWN_OF_DIONYSUS("crown_of_dionysus", 30, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266656_) -> {
        p_266656_.put(ArmorItem.Type.BOOTS, 2);
        p_266656_.put(ArmorItem.Type.LEGGINGS, 2);
        p_266656_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_266656_.put(ArmorItem.Type.HELMET, 1);
    }), 2, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(ModItems.CROWN_OF_DIONYSUS.get())),

    GIRDLE_OF_HIPPOLYTA("girdle_of_hippolyta", 30, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266656_) -> {
        p_266656_.put(ArmorItem.Type.BOOTS, 2);
        p_266656_.put(ArmorItem.Type.LEGGINGS, 3);
        p_266656_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_266656_.put(ArmorItem.Type.HELMET, 2);
    }), 2, SoundEvents.ARMOR_EQUIP_LEATHER, 0.5F, 0.1F, () -> Ingredient.of(ModItems.GIRDLE_OF_HIPPOLYTA.get())),

    HIDE_OF_THE_NEMEAN_LION("hide_of_the_nemean_lion", 30, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266656_) -> {
        p_266656_.put(ArmorItem.Type.BOOTS, 2);
        p_266656_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266656_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_266656_.put(ArmorItem.Type.HELMET, 2);
    }), 2, SoundEvents.ARMOR_EQUIP_LEATHER, 6.0F, 0.3F, () -> Ingredient.of(ModItems.HIDE_OF_THE_NEMEAN_LION.get())),

    HELM_OF_DARKNESS("helm_of_darkness", 18, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266656_) -> {
        p_266656_.put(ArmorItem.Type.BOOTS, 2);
        p_266656_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266656_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_266656_.put(ArmorItem.Type.HELMET, 2);
    }), 2, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.1F, () -> Ingredient.of(ModItems.HELM_OF_DARKNESS.get())),

    STYGIAN_IRON("stygian_iron", 40, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266655_) -> {
        p_266655_.put(ArmorItem.Type.BOOTS, 5);
        p_266655_.put(ArmorItem.Type.LEGGINGS, 8);
        p_266655_.put(ArmorItem.Type.CHESTPLATE, 10);
        p_266655_.put(ArmorItem.Type.HELMET, 5);
    }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> Ingredient.of(ModItems.STYGIAN_IRON_INGOT.get())),

    ADAMANTINE("adamantine", 36, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266649_) -> {
        p_266649_.put(ArmorItem.Type.BOOTS, 3);
        p_266649_.put(ArmorItem.Type.LEGGINGS, 6);
        p_266649_.put(ArmorItem.Type.CHESTPLATE, 8);
        p_266649_.put(ArmorItem.Type.HELMET, 3);
    }), 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 3F, 0.0F, () -> Ingredient.of(ModItems.ADAMANTINE.get())),

    IMPERIAL_GOLD("imperial_gold", 10, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266650_) -> {
        p_266650_.put(ArmorItem.Type.BOOTS, 3);
        p_266650_.put(ArmorItem.Type.LEGGINGS, 6);
        p_266650_.put(ArmorItem.Type.CHESTPLATE, 7);
        p_266650_.put(ArmorItem.Type.HELMET, 3);
    }), 25, SoundEvents.ARMOR_EQUIP_GOLD, 1.5F, 0.0F, () -> Ingredient.of(ModItems.IMPERIAL_GOLD_INGOT.get())),

    CELESTIAL_BRONZE("celestial_bronze", 25, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266654_) -> {
        p_266654_.put(ArmorItem.Type.BOOTS, 3);
        p_266654_.put(ArmorItem.Type.LEGGINGS, 6);
        p_266654_.put(ArmorItem.Type.CHESTPLATE, 7);
        p_266654_.put(ArmorItem.Type.HELMET, 3);
    }), 12, SoundEvents.ARMOR_EQUIP_IRON, 1F, 0.0F, () -> Ingredient.of(ModItems.CELESTIAL_BRONZE_INGOT.get())),

    BRONZE("bronze", 22, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266654_) -> {
        p_266654_.put(ArmorItem.Type.BOOTS, 2);
        p_266654_.put(ArmorItem.Type.LEGGINGS, 6);
        p_266654_.put(ArmorItem.Type.CHESTPLATE, 7);
        p_266654_.put(ArmorItem.Type.HELMET, 2);
    }), 9, SoundEvents.ARMOR_EQUIP_IRON, 0.5F, 0.0F, () -> Ingredient.of(ModItems.BRONZE_INGOT.get()));

    public static final StringRepresentable.EnumCodec<ArmorMaterials> CODEC = StringRepresentable.fromEnum(ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionTypeMap,
                      int enchantmentValue, SoundEvent soundEvent, float toughness, float knockbackRes, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionFunctionForType = protectionTypeMap;
        this.enchantmentValue = enchantmentValue;
        this.sound = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackRes;
        this.repairIngredient = repairMaterial;
    }
    public int getDurabilityForType(ArmorItem.Type pType) {
        return HEALTH_FUNCTION_FOR_TYPE.get(pType) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionFunctionForType.get(pType);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return GreekMyth.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String getSerializedName() {
        return this.name;
    }
}