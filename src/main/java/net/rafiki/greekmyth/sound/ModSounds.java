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


    private static final RegistryObject<SoundEvent> registerSoundEvents(String name){
        ResourceLocation id = new ResourceLocation(GreekMyth.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
