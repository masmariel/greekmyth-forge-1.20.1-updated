package net.rafiki.greekmyth.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.entity.custom.CalydonianBoarEntity;
import net.rafiki.greekmyth.entity.custom.ErymanthianBoarEntity;
import net.rafiki.greekmyth.entity.custom.MedusaEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GreekMyth.MOD_ID);

    public static final RegistryObject<EntityType<MedusaEntity>> MEDUSA =
            ENTITY_TYPES.register("medusa", () -> EntityType.Builder.of(MedusaEntity::new, MobCategory.MONSTER)
                    .sized(1.5f, 3f).build("medusa"));
    public static final RegistryObject<EntityType<CalydonianBoarEntity>> CALYDONIAN_BOAR =
            ENTITY_TYPES.register("calydonian_boar", () -> EntityType.Builder.of(CalydonianBoarEntity::new, MobCategory.CREATURE)
                    .sized(4f, 2.25f).build("calydonian_boar"));
    public static final RegistryObject<EntityType<ErymanthianBoarEntity>> ERYMANTHIAN_BOAR =
            ENTITY_TYPES.register("erymanthian_boar", () -> EntityType.Builder.of(ErymanthianBoarEntity::new, MobCategory.CREATURE)
                    .sized(4f, 2.25f).build("erymanthian_boar"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
