package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.CelestialArmor;

public class CelestialBronzeRenderer extends GeoArmorRenderer<CelestialArmor> {
    public CelestialBronzeRenderer() {
        super(new CelestialBronzeModel());
    }
}