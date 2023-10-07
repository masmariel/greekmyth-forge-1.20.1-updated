package net.rafiki.greekmyth.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rafiki.greekmyth.GreekMyth;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GreekMyth.MOD_ID);

    public static final RegistryObject<SoundEvent> LYRE_OF_APOLLO_MELODY = registerSoundEvents("lyre_of_apollo_melody");
    public static final RegistryObject<SoundEvent> MASON = registerSoundEvents("mason");
    public static final RegistryObject<SoundEvent> GINGER = registerSoundEvents("ginger");
    public static final RegistryObject<SoundEvent> BEN = registerSoundEvents("ben");
    public static final RegistryObject<SoundEvent> FLUTE_OF_PAN = registerSoundEvents("flute_of_pan");
    public static final RegistryObject<SoundEvent> LYRE_OF_ORPHEUS_MELODY = registerSoundEvents("lyre_of_orpheus_melody");
    public static final RegistryObject<SoundEvent> DRUM_OF_CYBELE = registerSoundEvents("drum_of_cybele");
    public static final RegistryObject<SoundEvent> RATTLE_OF_CYBELE = registerSoundEvents("rattle_of_cybele");
    public static final RegistryObject<SoundEvent> WHISTLE_OF_TANTALUS = registerSoundEvents("whistle_of_tantalus");
    public static final RegistryObject<SoundEvent> AOLUS = registerSoundEvents("aolus");
    public static final RegistryObject<SoundEvent> LYRE_OF_AMPHION_MELODY = registerSoundEvents("lyre_of_amphion_melody");
    public static final RegistryObject<SoundEvent> GODLY_VOCALS = registerSoundEvents("godly_vocals");
    public static final RegistryObject<SoundEvent> TRUMPET_OF_PHEME = registerSoundEvents("trumpet_of_pheme");
    public static final RegistryObject<SoundEvent> CONCH_OF_TRITON = registerSoundEvents("conch_of_triton");
    public static final RegistryObject<SoundEvent> BERSERK = registerSoundEvents("berserk");


    private static RegistryObject<SoundEvent> registerSoundEvents(String name){
        ResourceLocation id = new ResourceLocation(GreekMyth.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
