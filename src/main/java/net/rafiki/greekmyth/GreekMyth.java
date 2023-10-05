package net.rafiki.greekmyth;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.rafiki.greekmyth.block.ModBlocks;
import net.rafiki.greekmyth.enchantment.ModEnchantments;
import net.rafiki.greekmyth.item.ModCreativeModeTabs;
import net.rafiki.greekmyth.item.ModItems;
import net.rafiki.greekmyth.sound.ModSounds;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GreekMyth.MOD_ID)
public class GreekMyth
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "greekmyth";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public GreekMyth()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Register all in ModCreativeModeTabs class
        ModCreativeModeTabs.register(modEventBus);

        //Register mod items in ModItems class
        ModItems.register(modEventBus);

        //Register mod blocks in ModBlocks class
        ModBlocks.register(modEventBus);

        //Register mod enchantments in ModEnchantments class
        ModEnchantments.register(modEventBus);

        //Register sounds in ModSounds class
        ModSounds.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
