package net.rafiki.greekmyth.client;

import net.minecraft.resources.ResourceLocation;
import net.rafiki.greekmyth.GreekMyth;
import net.rafiki.greekmyth.item.custom.WingedSandalsOfHermesItem;
import software.bernie.example.item.GeckoArmorItem;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class WingedSandalsOfHermesRenderer extends GeoArmorRenderer<WingedSandalsOfHermesItem> {
    public WingedSandalsOfHermesRenderer() {
        super(new WingedSandalsOfHermesModel());
    }
}
