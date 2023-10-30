package net.rafiki.greekmyth.event;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.entity.ModEntities;
import net.rafiki.greekmyth.entity.client.CalydonianBoarModel;
import net.rafiki.greekmyth.entity.client.CyclopsModel;
import net.rafiki.greekmyth.entity.client.ErymanthianBoarModel;
import net.rafiki.greekmyth.entity.client.MedusaModel;
import net.rafiki.greekmyth.entity.custom.CalydonianBoarEntity;
import net.rafiki.greekmyth.entity.custom.CyclopsEntity;
import net.rafiki.greekmyth.entity.custom.ErymanthianBoarEntity;
import net.rafiki.greekmyth.entity.custom.MedusaEntity;
import net.rafiki.greekmyth.entity.layers.ModModelLayers;

@Mod.EventBusSubscriber(modid = GreekMyth.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.ERYMANTHIAN_BOAR_LAYER, ErymanthianBoarModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CALYDONIAN_BOAR_LAYER, CalydonianBoarModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.MEDUSA_LAYER, MedusaModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CYCLOPS_LAYER, CyclopsModel::createBodyLayer);

    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.ERYMANTHIAN_BOAR.get(), ErymanthianBoarEntity.createAttributes().build());
        event.put(ModEntities.CALYDONIAN_BOAR.get(), CalydonianBoarEntity.createAttributes().build());
        event.put(ModEntities.MEDUSA.get(), MedusaEntity.createAttributes().build());
        event.put(ModEntities.CYCLOPS.get(), CyclopsEntity.createAttributes().build());
    }

}
